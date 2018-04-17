/** 
 * Copyright ® 2016-2018 zeal  zhangleifor@163.com.
 * All right reserved. 
 */
package com.zeal.zealsay.common.entity;

import java.io.Serializable;
import java.util.Date;

import com.zeal.zealsay.common.web.BaseEntity;
import com.zeal.zealsay.common.util.DateUtils;
import com.zeal.zealsay.common.util.CommonUtils;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Map;


/**
 * sys_user实体类接口
 * 
 * @author zeal
 * @date 2018-04-11 20:57:21
 */
@Data
public class SysUser extends BaseEntity<SysUser> implements Serializable {
	private static final long serialVersionUID = 1L;
	protected int revision;
	//属性字段
	private Date createDate; // 注册时间
	private String id; // 用户标识
	private String isDel; // 是否删除(0否，1是)
	private String password; // 用户登录密码
	private String phoneNumber; // 用户手机号
	private String salt; // 随机盐
	private Date updateDate; // 更新时间
	private String userEmail; // 用户邮箱
	private String username; // 用户名
	private String userOpenId; // 用户的openid
	private String userQQ; // 用户QQ号码
	private String userRole; // 用户角色外键
	private String userStatu; // 用户状态(0封禁，1正常，2注销)


	//属性字段是否变化
	private Boolean idChanged = false; // 用户标识
	private Boolean userStatuChanged = false; // 用户状态(0封禁，1正常，2注销)
	private Boolean createDateChanged = false; // 注册时间
	private Boolean updateDateChanged = false; // 更新时间
	private Boolean isDelChanged = false; // 是否删除(0否，1是)
	private Boolean usernameChanged = false; // 用户名
	private Boolean passwordChanged = false; // 用户登录密码
	private Boolean saltChanged = false; // 随机盐
	private Boolean phoneNumberChanged = false; // 用户手机号
	private Boolean userEmailChanged = false; // 用户邮箱
	private Boolean userQQChanged = false; // 用户QQ号码
	private Boolean userOpenIdChanged = false; // 用户的openid
	private Boolean userRoleChanged = false; // 用户角色外键


	/**
	 * 无参构造函数
	 */
	public SysUser() {
		super();
	}

	public SysUser(Map<String,String> allRequestParams)  throws Exception{
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");//用于时间格式化

		if (CommonUtils.mapContainsKey(allRequestParams,"id")) {
			setId(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"id"))); // 用户标识
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userStatu")) {
			setUserStatu(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userStatu"))); // 用户状态(0封禁，1正常，2注销)
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"createDate")) {
			setCreateDate(formater.parse(CommonUtils.getMapValueIgnoreCase(allRequestParams,"createDate"))); // 注册时间
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"updateDate")) {
			setUpdateDate(formater.parse(CommonUtils.getMapValueIgnoreCase(allRequestParams,"updateDate"))); // 更新时间
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"isDel")) {
			setIsDel(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"isDel"))); // 是否删除(0否，1是)
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"username")) {
			setUsername(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"username"))); // 用户名
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"password")) {
			setPassword(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"password"))); // 用户登录密码
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"salt")) {
			setSalt(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"salt"))); // 随机盐
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"phoneNumber")) {
			setPhoneNumber(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"phoneNumber"))); // 用户手机号
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userEmail")) {
			setUserEmail(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userEmail"))); // 用户邮箱
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userQQ")) {
			setUserQQ(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userQQ"))); // 用户QQ号码
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userOpenId")) {
			setUserOpenId(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userOpenId"))); // 用户的openid
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userRole")) {
			setUserRole(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userRole"))); // 用户角色外键
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
	    sbSql.append("id = " + getId() + "\r\n");  // 用户标识
	    sbSql.append("userStatu = " + getUserStatu() + "\r\n");  // 用户状态(0封禁，1正常，2注销)
	    sbSql.append("createDate = " + DateUtils.formatDateTime(getCreateDate()) + "\r\n");  // 注册时间
	    sbSql.append("updateDate = " + DateUtils.formatDateTime(getUpdateDate()) + "\r\n");  // 更新时间
	    sbSql.append("isDel = " + getIsDel() + "\r\n");  // 是否删除(0否，1是)
	    sbSql.append("username = " + getUsername() + "\r\n");  // 用户名
	    sbSql.append("password = " + getPassword() + "\r\n");  // 用户登录密码
	    sbSql.append("salt = " + getSalt() + "\r\n");  // 随机盐
	    sbSql.append("phoneNumber = " + getPhoneNumber() + "\r\n");  // 用户手机号
	    sbSql.append("userEmail = " + getUserEmail() + "\r\n");  // 用户邮箱
	    sbSql.append("userQQ = " + getUserQQ() + "\r\n");  // 用户QQ号码
	    sbSql.append("userOpenId = " + getUserOpenId() + "\r\n");  // 用户的openid
	    sbSql.append("userRole = " + getUserRole() + "\r\n");  // 用户角色外键
        return sbSql.toString();

	}

    /**
     * 重置属性变化状态
     * @param changeState
     */
	public void resetChangeState(Boolean changeState){
        idChanged = changeState; // 用户标识
        userStatuChanged = changeState; // 用户状态(0封禁，1正常，2注销)
        createDateChanged = changeState; // 注册时间
        updateDateChanged = changeState; // 更新时间
        isDelChanged = changeState; // 是否删除(0否，1是)
        usernameChanged = changeState; // 用户名
        passwordChanged = changeState; // 用户登录密码
        saltChanged = changeState; // 随机盐
        phoneNumberChanged = changeState; // 用户手机号
        userEmailChanged = changeState; // 用户邮箱
        userQQChanged = changeState; // 用户QQ号码
        userOpenIdChanged = changeState; // 用户的openid
        userRoleChanged = changeState; // 用户角色外键
    }


}