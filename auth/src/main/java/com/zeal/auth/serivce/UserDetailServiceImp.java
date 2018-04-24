package com.zeal.auth.serivce;



import com.zeal.auth.feign.UserDao;
import com.zeal.auth.util.UserDetailsImpl;
import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.entity.SysUser;
import com.zeal.zealsay.common.entity.UserVo;
import com.zeal.zealsay.common.util.JsonUtils;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;

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
       Result result = userDao.findUserByUsername(username);
        UserVo userVo= null;
        try {
            userVo = JsonUtils.objectMapper.readValue(JsonUtils.objectMapper.writeValueAsString(result.getData()),new TypeReference<UserVo>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new UserDetailsImpl(userVo);
    }
}
