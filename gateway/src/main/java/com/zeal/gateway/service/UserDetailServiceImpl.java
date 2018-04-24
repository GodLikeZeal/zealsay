package com.zeal.gateway.service;


import com.zeal.gateway.feign.UserDao;
import com.zeal.gateway.util.UserDetailsImpl;
import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.entity.SysUser;
import com.zeal.zealsay.common.entity.UserVo;
import com.zeal.zealsay.common.util.JsonUtils;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Serializable;

/**
*@description 获取用户信息相关
*@author  zeal
*@date  2018-04-23  17:34
*@version 1.0.0
*/
@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailsService, Serializable {
    @Autowired
    private UserDao userDao;

    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isBlank(username)) {
            throw new UsernameNotFoundException("用户不存在:" + username);
        }
        Result result = userDao.findUserByUsername(username);
        UserVo userVo = null;
        try {
            userVo = JsonUtils.objectMapper.readValue(JsonUtils.objectMapper.writeValueAsString(result.getData()), new TypeReference<UserVo>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new UserDetailsImpl(userVo);
    }
}
