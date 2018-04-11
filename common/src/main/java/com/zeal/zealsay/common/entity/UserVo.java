package com.zeal.zealsay.common.entity;

import lombok.Data;

import java.util.Date;

/**
*@description 用户信息包装对象
*@author zeal
*@date 2018-04-11 21:06
*@version 1.0.0
*/
@Data
public class UserVo extends SysUser {

    /**
     * 部门编号
     */
    private String deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 登录时间
     */
    private Date loginTime;


}
