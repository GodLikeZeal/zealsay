package com.zeal.gateway.feign;


import com.zeal.gateway.feign.fallback.MenuDaoFallback;
import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.entity.SysMenu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

/**
*@description 获取目录接口
*@author  zeal
*@date  2018-04-23  17:31
*@version 1.0.0
*/
@FeignClient(name = "admin", fallback = MenuDaoFallback.class)
public interface MenuDao {
    /**
     * 通过角色名查询菜单
     *
     * @param role 角色名称
     * @return 菜单列表
     */
    @GetMapping(value = "/sysMenu/findMenuByRole/{role}")
    Result findMenuByRole(@PathVariable("role") String role);
}
