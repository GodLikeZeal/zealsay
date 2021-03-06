/** 
 * Copyright ® 2016-2018 zeal  zhangleifor@163.com.
 * All right reserved. 
 */
package com.zeal.admin.modules.authority.service;

import com.zeal.admin.modules.authority.dao.SysUserDao;
import com.zeal.zealsay.common.entity.SysUser;
import com.zeal.zealsay.common.entity.UserVo;
import org.springframework.stereotype.Service;
import com.zeal.zealsay.common.web.BaseService;


/**
 * sys_user业务层
 * 
 * @author zeal
 * @date 2018-04-23 13:57:02
 */
@Service
public class SysUserService extends BaseService<SysUserDao,SysUser> {
    /**
     *@description 根据用户名来查询用户信息
     *@author  zeal
     *@date  2018-04-13  14:54
     *@version 1.0.0
     */
    public UserVo findUserByUsername(String username){
        return dao.findUserByUsername(username);
    }

    /**
     *@description 根据手机号来查询用户信息
     *@author  zeal
     *@date  2018-04-13  14:54
     *@version 1.0.0
     */
    public UserVo findUserByPhoneNum(String phoneNumber){
        return dao.findUserByPhoneNum(phoneNumber);
    }

    /**
     *@description 根据用户名来查询用户信息
     *@author  zeal
     *@date  2018-04-13  14:54
     *@version 1.0.0
     */
    public UserVo findUserByEmail(String email){
        return dao.findUserByEmail(email);
    }

}