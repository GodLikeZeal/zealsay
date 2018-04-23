package com.zeal.auth.component.mobile;

import com.zeal.auth.feign.UserDao;
import com.zeal.auth.util.UserDetailsImpl;
import com.zeal.zealsay.common.entity.SysUser;
import com.zeal.zealsay.common.entity.UserVo;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
*@description 手机号登录校验逻辑
*@author  zeal
*@date  2018-04-10  15:52
*@version 1.0.0
*/
public class MobileAuthenticationProvider implements AuthenticationProvider {

    private UserDao userDao;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        MobileAuthenticationToken mobileAuthenticationToken = (MobileAuthenticationToken) authentication;
        UserVo userVo = (UserVo) userDao.findUserByMobile((String) mobileAuthenticationToken.getPrincipal()).getData();

        if (userVo == null) {
            throw new UsernameNotFoundException("手机号不存在:" + mobileAuthenticationToken.getPrincipal());
        }

        UserDetailsImpl userDetails = buildUserDeatils(userVo);

        MobileAuthenticationToken authenticationToken = new MobileAuthenticationToken(userDetails, userDetails.getAuthorities());
        authenticationToken.setDetails(mobileAuthenticationToken.getDetails());
        return authenticationToken;
    }

    private UserDetailsImpl buildUserDeatils(UserVo userVo) {
        return new UserDetailsImpl(userVo);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return MobileAuthenticationToken.class.isAssignableFrom(authentication);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
