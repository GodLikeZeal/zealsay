package com.zeal.auth.serivce;


import com.zeal.auth.feign.UserDao;
import com.zeal.auth.util.UserDetailsImpl;
import com.zeal.zealsay.common.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
*@description userDetailService security里面用来查询用户名和密码的
*@author  zeal
*@date  2018-04-10  15:42
*@version 1.0.0
*/
@Service("userDetailsService")
public class UserDetailServiceImp implements UserDetailsService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
//        SysUser userVo = userDao.findUserByUsername(username);
        SysUser userVo = new SysUser();
        userVo.setUsername("zeal");
        userVo.setPassword(passwordEncoder.encode("zeal"));
        userVo.setDelFlag("0");
        return new UserDetailsImpl(userVo);
    }
}
