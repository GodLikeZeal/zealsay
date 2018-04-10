package com.zeal.zealsay.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
*@description 用户信息
*@author  zeal
*@date  2018-04-10  15:38
*@version 1.0.0
*/
@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 随机盐
     */
    private String salt;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 0-正常，1-删除
     */
    private String delFlag;
    /**
     * 简介
     */
    private String introduction;
    /**
     * 头像
     */
    private String avatar;

    /**
     * 部门ID
     */
    private Integer deptId;
    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 角色列表
     */
    private List<SysRole> roleList = new ArrayList<>();
}