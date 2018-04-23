package com.zeal.gateway.feign;


import com.zeal.gateway.feign.fallback.UserServiceFallback;
import com.zeal.zealsay.common.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
*@description 查询用户信息feign接口
*@author  zeal
*@date  2018-04-23  17:38
*@version 1.0.0
*/
@FeignClient(name = "admin", fallback = UserServiceFallback.class)
public interface UserDao {
    /**
     * 通过用户名查询用户、角色信息
     *
     * @param username 用户名
     * @return UserVo
     */
    @GetMapping("/user/findUserByUsername/{username}")
    Result findUserByUsername(@PathVariable("username") String username);
}
