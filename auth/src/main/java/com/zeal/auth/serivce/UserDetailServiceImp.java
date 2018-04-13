package com.zeal.auth.serivce;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zeal.auth.feign.UserDao;
import com.zeal.auth.util.UserDetailsImpl;
import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
        ObjectMapper mapper =new ObjectMapper();
        SysUser userVo = null;
        try {
            userVo = mapper.readValue((JsonParser) result.getData(), new TypeReference<SysUser>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new UserDetailsImpl(userVo);
    }
}
