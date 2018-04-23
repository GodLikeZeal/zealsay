/** 
 * Copyright ® 2016-2018 zeal  1332949188@qq.com.
 * All right reserved. 
 */
package com.zeal.admin.modules.authority.dao;

import com.zeal.zealsay.common.annotation.MyBatisDao;
import com.zeal.zealsay.common.entity.SysUser;
import com.zeal.zealsay.common.entity.UserVo;
import com.zeal.zealsay.common.web.BaseDao;
import org.apache.ibatis.annotations.Param;

/**
 * sys_user数据访问接口
 * 
 * @author zeal
 * @date 2018-04-23 13:57:02
 */
@MyBatisDao
public interface SysUserDao extends BaseDao<SysUser> {
    /**
     *@description 根据用户名来查询用户信息
     *@author  zeal
     *@date  2018-04-13  14:54
     *@version 1.0.0
     */
    UserVo findUserByUsername(@Param("username") String username);

    /**
     *@description 根据手机号来查询用户信息
     *@author  zeal
     *@date  2018-04-13  14:59
     *@version 1.0.0
     */
    UserVo findUserByPhoneNum(@Param("phoneNumber") String phoneNumber);

    /**
     *@description 根据用户邮箱来查询用户信息
     *@author  zeal
     *@date  2018-04-13  14:59
     *@version 1.0.0
     */
    UserVo findUserByEmail(@Param("email") String email);
}