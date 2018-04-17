package com.zeal.auth.feign;


import com.zeal.auth.feign.fallback.UserDaoFallbackService;
import com.zeal.zealsay.common.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
*@description 远程用户接口调用
*@author  zeal
*@date  2018-04-16  15:36
*@version 1.0.0
*/
@FeignClient(name = "admin", fallback = UserDaoFallbackService.class)
public interface UserDao {
    /**
     * 通过用户名查询用户、角色信息
     *
     * @param username 用户名
     * @return UserVo
     */
    @GetMapping("/sysUser/findUserByUsername/{username}")
    Result findUserByUsername(@PathVariable("username") String username);

    /**
     * 通过手机号查询用户、角色信息
     *
     * @param mobile 手机号
     * @return UserVo
     */
    @GetMapping("/sysUser/findUserByMobile/{mobile}")
    Result findUserByMobile(@PathVariable("mobile") String mobile);

    /**
     * 根据OpenId查询用户信息
     * @param openId openId
     * @return UserVo
     */
    @GetMapping("/sysUser/findUserByOpenId/{openId}")
    Result findUserByOpenId(@PathVariable("openId") String openId);
}
