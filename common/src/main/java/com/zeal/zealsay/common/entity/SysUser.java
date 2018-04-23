/** 
 * Copyright ® 2016-2018 zeal  zhangleifor@163.com.
 * All right reserved. 
 */
package com.zeal.zealsay.common.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zeal.zealsay.common.web.BaseEntity;
import com.zeal.zealsay.common.util.DateUtils;
import com.zeal.zealsay.common.util.CommonUtils;

import java.text.SimpleDateFormat;
import java.util.Map;
import java.math.BigDecimal;
import lombok.Data;



/**
 * sys_user实体类接口
 * 
 * @author zeal
 * @date 2018-04-23 17:25:34
 */
@Data
public class SysUser extends BaseEntity<SysUser> {
	private static final long serialVersionUID = 1L;
	protected int revision;
	//属性字段
	/**
	 *  注册时间
	 */
	private Date createDate;
	/**
	 *  用户标识
	 */
	private String id;
	/**
	 *  是否删除(0否，1是)
	 */
	private String isDel;
	/**
	 *  用户登录密码
	 */
	private String password;
	/**
	 *  用户手机号
	 */
	private String phoneNumber;
	/**
	 *  随机盐
	 */
	private String salt;
	/**
	 *  更新时间
	 */
	private Date updateDate;
	/**
	 *  用户邮箱
	 */
	private String userEmail;
	/**
	 *  用户名
	 */
	private String username;
	/**
	 *  用户的openid
	 */
	private String userOpenId;
	/**
	 *  用户QQ号码
	 */
	private String userQQ;
	/**
	 *  用户角色外键
	 */
	private String userRole;
	/**
	 *  用户状态(0封禁，1正常，2注销)
	 */
	private String userStatu;


	//属性字段是否变化
	/**
	 *  用户标识
	 */
	private Boolean idChanged = false;
	/**
	 *  用户状态(0封禁，1正常，2注销)
	 */
	private Boolean userStatuChanged = false;
	/**
	 *  注册时间
	 */
	private Boolean createDateChanged = false;
	/**
	 *  更新时间
	 */
	private Boolean updateDateChanged = false;
	/**
	 *  是否删除(0否，1是)
	 */
	private Boolean isDelChanged = false;
	/**
	 *  用户名
	 */
	private Boolean usernameChanged = false;
	/**
	 *  用户登录密码
	 */
	private Boolean passwordChanged = false;
	/**
	 *  随机盐
	 */
	private Boolean saltChanged = false;
	/**
	 *  用户手机号
	 */
	private Boolean phoneNumberChanged = false;
	/**
	 *  用户邮箱
	 */
	private Boolean userEmailChanged = false;
	/**
	 *  用户QQ号码
	 */
	private Boolean userQQChanged = false;
	/**
	 *  用户的openid
	 */
	private Boolean userOpenIdChanged = false;
	/**
	 *  用户角色外键
	 */
	private Boolean userRoleChanged = false;


	/**
	 * 无参构造函数
	 */
	public SysUser() {
		super();
	}

	public SysUser(Map<String,String> allRequestParams)  throws Exception{
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");//用于时间格式化

		if (CommonUtils.mapContainsKey(allRequestParams,"id")) {
           /**
            *  用户标识
            */
			setId(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"id")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userStatu")) {
           /**
            *  用户状态(0封禁，1正常，2注销)
            */
			setUserStatu(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userStatu")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"createDate")) {
           /**
            *  注册时间
            */
			setCreateDate(formater.parse(CommonUtils.getMapValueIgnoreCase(allRequestParams,"createDate")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"updateDate")) {
           /**
            *  更新时间
            */
			setUpdateDate(formater.parse(CommonUtils.getMapValueIgnoreCase(allRequestParams,"updateDate")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"isDel")) {
           /**
            *  是否删除(0否，1是)
            */
			setIsDel(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"isDel")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"username")) {
           /**
            *  用户名
            */
			setUsername(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"username")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"password")) {
           /**
            *  用户登录密码
            */
			setPassword(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"password")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"salt")) {
           /**
            *  随机盐
            */
			setSalt(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"salt")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"phoneNumber")) {
           /**
            *  用户手机号
            */
			setPhoneNumber(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"phoneNumber")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userEmail")) {
           /**
            *  用户邮箱
            */
			setUserEmail(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userEmail")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userQQ")) {
           /**
            *  用户QQ号码
            */
			setUserQQ(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userQQ")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userOpenId")) {
           /**
            *  用户的openid
            */
			setUserOpenId(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userOpenId")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userRole")) {
           /**
            *  用户角色外键
            */
			setUserRole(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userRole")));
		}
	}

    /**
	 * 对象结果输出字符串
	 * @return
	 * @throws Exception
     */
	public String entityToString(){
	    StringBuilder sbSql=new StringBuilder();
	    sbSql.append("this.class = " + this.toString() + "\r\n");
	    // 用户标识
	    sbSql.append("id = " + getId() + "\r\n");
	    // 用户状态(0封禁，1正常，2注销)
	    sbSql.append("userStatu = " + getUserStatu() + "\r\n");
	    // 注册时间
	    sbSql.append("createDate = " + DateUtils.formatDateTime(getCreateDate()) + "\r\n"); 
	    // 更新时间
	    sbSql.append("updateDate = " + DateUtils.formatDateTime(getUpdateDate()) + "\r\n"); 
	    // 是否删除(0否，1是)
	    sbSql.append("isDel = " + getIsDel() + "\r\n");
	    // 用户名
	    sbSql.append("username = " + getUsername() + "\r\n");
	    // 用户登录密码
	    sbSql.append("password = " + getPassword() + "\r\n");
	    // 随机盐
	    sbSql.append("salt = " + getSalt() + "\r\n");
	    // 用户手机号
	    sbSql.append("phoneNumber = " + getPhoneNumber() + "\r\n");
	    // 用户邮箱
	    sbSql.append("userEmail = " + getUserEmail() + "\r\n");
	    // 用户QQ号码
	    sbSql.append("userQQ = " + getUserQQ() + "\r\n");
	    // 用户的openid
	    sbSql.append("userOpenId = " + getUserOpenId() + "\r\n");
	    // 用户角色外键
	    sbSql.append("userRole = " + getUserRole() + "\r\n");
        return sbSql.toString();

	}

    /**
     * 重置属性变化状态
     * @param changeState
     */
	public void resetChangeState(Boolean changeState){
           /**
            *  用户标识
            */
        idChanged = changeState;
           /**
            *  用户状态(0封禁，1正常，2注销)
            */
        userStatuChanged = changeState;
           /**
            *  注册时间
            */
        createDateChanged = changeState;
           /**
            *  更新时间
            */
        updateDateChanged = changeState;
           /**
            *  是否删除(0否，1是)
            */
        isDelChanged = changeState;
           /**
            *  用户名
            */
        usernameChanged = changeState;
           /**
            *  用户登录密码
            */
        passwordChanged = changeState;
           /**
            *  随机盐
            */
        saltChanged = changeState;
           /**
            *  用户手机号
            */
        phoneNumberChanged = changeState;
           /**
            *  用户邮箱
            */
        userEmailChanged = changeState;
           /**
            *  用户QQ号码
            */
        userQQChanged = changeState;
           /**
            *  用户的openid
            */
        userOpenIdChanged = changeState;
           /**
            *  用户角色外键
            */
        userRoleChanged = changeState;
    }


}