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
 * sys_role实体类接口
 * 
 * @author zeal
 * @date 2018-04-23 17:25:20
 */
@Data
public class SysRole extends BaseEntity<SysRole> {
	private static final long serialVersionUID = 1L;
	protected int revision;
	//属性字段
	/**
	 *  创建时间
	 */
	private Date createTime;
	/**
	 *  id
	 */
	private String id;
	/**
	 *  是否删除(0正常 1删除)
	 */
	private String isDel;
	/**
	 *  角色编码
	 */
	private String roleCode;
	/**
	 *  角色排序
	 */
	private String roleDesc;
	/**
	 *  角色名称
	 */
	private String roleName;
	/**
	 *  最后更新时间
	 */
	private Date updateTime;


	//属性字段是否变化
	/**
	 *  id
	 */
	private Boolean idChanged = false;
	/**
	 *  角色名称
	 */
	private Boolean roleNameChanged = false;
	/**
	 *  角色编码
	 */
	private Boolean roleCodeChanged = false;
	/**
	 *  角色排序
	 */
	private Boolean roleDescChanged = false;
	/**
	 *  创建时间
	 */
	private Boolean createTimeChanged = false;
	/**
	 *  最后更新时间
	 */
	private Boolean updateTimeChanged = false;
	/**
	 *  是否删除(0正常 1删除)
	 */
	private Boolean isDelChanged = false;


	/**
	 * 无参构造函数
	 */
	public SysRole() {
		super();
	}

	public SysRole(Map<String,String> allRequestParams)  throws Exception{
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");//用于时间格式化

		if (CommonUtils.mapContainsKey(allRequestParams,"id")) {
           /**
            *  id
            */
			setId(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"id")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"roleName")) {
           /**
            *  角色名称
            */
			setRoleName(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"roleName")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"roleCode")) {
           /**
            *  角色编码
            */
			setRoleCode(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"roleCode")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"roleDesc")) {
           /**
            *  角色排序
            */
			setRoleDesc(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"roleDesc")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"createTime")) {
           /**
            *  创建时间
            */
			setCreateTime(formater.parse(CommonUtils.getMapValueIgnoreCase(allRequestParams,"createTime")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"updateTime")) {
           /**
            *  最后更新时间
            */
			setUpdateTime(formater.parse(CommonUtils.getMapValueIgnoreCase(allRequestParams,"updateTime")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"isDel")) {
           /**
            *  是否删除(0正常 1删除)
            */
			setIsDel(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"isDel")));
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
	    // id
	    sbSql.append("id = " + getId() + "\r\n");
	    // 角色名称
	    sbSql.append("roleName = " + getRoleName() + "\r\n");
	    // 角色编码
	    sbSql.append("roleCode = " + getRoleCode() + "\r\n");
	    // 角色排序
	    sbSql.append("roleDesc = " + getRoleDesc() + "\r\n");
	    // 创建时间
	    sbSql.append("createTime = " + DateUtils.formatDateTime(getCreateTime()) + "\r\n"); 
	    // 最后更新时间
	    sbSql.append("updateTime = " + DateUtils.formatDateTime(getUpdateTime()) + "\r\n"); 
	    // 是否删除(0正常 1删除)
	    sbSql.append("isDel = " + getIsDel() + "\r\n");
        return sbSql.toString();

	}

    /**
     * 重置属性变化状态
     * @param changeState
     */
	public void resetChangeState(Boolean changeState){
           /**
            *  id
            */
        idChanged = changeState;
           /**
            *  角色名称
            */
        roleNameChanged = changeState;
           /**
            *  角色编码
            */
        roleCodeChanged = changeState;
           /**
            *  角色排序
            */
        roleDescChanged = changeState;
           /**
            *  创建时间
            */
        createTimeChanged = changeState;
           /**
            *  最后更新时间
            */
        updateTimeChanged = changeState;
           /**
            *  是否删除(0正常 1删除)
            */
        isDelChanged = changeState;
    }


}