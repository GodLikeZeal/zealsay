/** 
 * Copyright ® 2016-2018 zeal  zhangleifor@163.com.
 * All right reserved. 
 */
package com.zeal.admin.modules.authority.service;

import com.zeal.admin.modules.authority.dao.SysMenuDao;
import com.zeal.zealsay.common.entity.SysMenu;
import org.springframework.stereotype.Service;
import com.zeal.zealsay.common.web.BaseService;

import java.util.Set;


/**
 * sys_menu业务层
 * 
 * @author zeal
 * @date 2018-04-23 16:41:35
 */
@Service
public class SysMenuService extends BaseService<SysMenuDao,SysMenu> {

    /**
    *@description 根据角色名称来查询目录
    *@author  zeal
    *@date  2018-04-24  14:20
    *@version 1.0.0
    */
    public Set<SysMenu> findMenuByRole(String role){
        return dao.findMenuByRole(role);
    }
}