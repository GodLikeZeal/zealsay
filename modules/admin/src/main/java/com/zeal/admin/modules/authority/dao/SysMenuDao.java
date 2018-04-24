/** 
 * Copyright ® 2016-2018 zeal  1332949188@qq.com.
 * All right reserved. 
 */
package com.zeal.admin.modules.authority.dao;

import com.zeal.zealsay.common.annotation.MyBatisDao;
import com.zeal.zealsay.common.entity.SysMenu;
import com.zeal.zealsay.common.web.BaseDao;

import java.util.Set;

/**
 * sys_menu数据访问接口
 * 
 * @author zeal
 * @date 2018-04-23 16:41:35
 */
@MyBatisDao
public interface SysMenuDao extends BaseDao<SysMenu> {

    /**
    *@description 根据角色名称来查询目录
    *@author  zeal
    *@date  2018-04-24  14:19
    *@version 1.0.0
    */
    Set<SysMenu>findMenuByRole(String role);
}