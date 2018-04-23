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
 * sys_menu实体类接口
 * 
 * @author zeal
 * @date 2018-04-23 17:25:12
 */
@Data
public class SysMenu extends BaseEntity<SysMenu> {
	private static final long serialVersionUID = 1L;
	protected int revision;
	//属性字段
	/**
	 *  vue页面
	 */
	private String component;
	/**
	 *  创建时间
	 */
	private Date createTime;
	/**
	 *  图标
	 */
	private String icon;
	/**
	 *  菜单id
	 */
	private String id;
	/**
	 *  是否删除
	 */
	private String isDel;
	/**
	 *  请求方法
	 */
	private String method;
	/**
	 *  菜单名称
	 */
	private String name;
	/**
	 *  父级菜单id
	 */
	private String parentId;
	/**
	 *  前端url
	 */
	private String path;
	/**
	 *  菜单权限标识
	 */
	private String permission;
	/**
	 *  排序值
	 */
	private Integer sort;
	/**
	 *  类型（0菜单 1按钮）
	 */
	private String type;
	/**
	 *  更新时间
	 */
	private Date updateTime;
	/**
	 *  请求连接
	 */
	private String url;


	//属性字段是否变化
	/**
	 *  菜单id
	 */
	private Boolean idChanged = false;
	/**
	 *  排序值
	 */
	private Boolean sortChanged = false;
	/**
	 *  类型（0菜单 1按钮）
	 */
	private Boolean typeChanged = false;
	/**
	 *  创建时间
	 */
	private Boolean createTimeChanged = false;
	/**
	 *  更新时间
	 */
	private Boolean updateTimeChanged = false;
	/**
	 *  是否删除
	 */
	private Boolean isDelChanged = false;
	/**
	 *  菜单名称
	 */
	private Boolean nameChanged = false;
	/**
	 *  菜单权限标识
	 */
	private Boolean permissionChanged = false;
	/**
	 *  前端url
	 */
	private Boolean pathChanged = false;
	/**
	 *  请求连接
	 */
	private Boolean urlChanged = false;
	/**
	 *  请求方法
	 */
	private Boolean methodChanged = false;
	/**
	 *  父级菜单id
	 */
	private Boolean parentIdChanged = false;
	/**
	 *  图标
	 */
	private Boolean iconChanged = false;
	/**
	 *  vue页面
	 */
	private Boolean componentChanged = false;


	/**
	 * 无参构造函数
	 */
	public SysMenu() {
		super();
	}

	public SysMenu(Map<String,String> allRequestParams)  throws Exception{
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");//用于时间格式化

		if (CommonUtils.mapContainsKey(allRequestParams,"id")) {
           /**
            *  菜单id
            */
			setId(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"id")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"sort")) {
           /**
            *  排序值
            */
			setSort(Integer.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"sort")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"type")) {
           /**
            *  类型（0菜单 1按钮）
            */
			setType(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"type")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"createTime")) {
           /**
            *  创建时间
            */
			setCreateTime(formater.parse(CommonUtils.getMapValueIgnoreCase(allRequestParams,"createTime")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"updateTime")) {
           /**
            *  更新时间
            */
			setUpdateTime(formater.parse(CommonUtils.getMapValueIgnoreCase(allRequestParams,"updateTime")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"isDel")) {
           /**
            *  是否删除
            */
			setIsDel(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"isDel")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"name")) {
           /**
            *  菜单名称
            */
			setName(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"name")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"permission")) {
           /**
            *  菜单权限标识
            */
			setPermission(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"permission")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"path")) {
           /**
            *  前端url
            */
			setPath(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"path")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"url")) {
           /**
            *  请求连接
            */
			setUrl(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"url")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"method")) {
           /**
            *  请求方法
            */
			setMethod(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"method")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"parentId")) {
           /**
            *  父级菜单id
            */
			setParentId(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"parentId")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"icon")) {
           /**
            *  图标
            */
			setIcon(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"icon")));
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"component")) {
           /**
            *  vue页面
            */
			setComponent(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"component")));
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
	    // 菜单id
	    sbSql.append("id = " + getId() + "\r\n");
	    // 排序值
	    sbSql.append("sort = " + getSort() + "\r\n");
	    // 类型（0菜单 1按钮）
	    sbSql.append("type = " + getType() + "\r\n");
	    // 创建时间
	    sbSql.append("createTime = " + DateUtils.formatDateTime(getCreateTime()) + "\r\n"); 
	    // 更新时间
	    sbSql.append("updateTime = " + DateUtils.formatDateTime(getUpdateTime()) + "\r\n"); 
	    // 是否删除
	    sbSql.append("isDel = " + getIsDel() + "\r\n");
	    // 菜单名称
	    sbSql.append("name = " + getName() + "\r\n");
	    // 菜单权限标识
	    sbSql.append("permission = " + getPermission() + "\r\n");
	    // 前端url
	    sbSql.append("path = " + getPath() + "\r\n");
	    // 请求连接
	    sbSql.append("url = " + getUrl() + "\r\n");
	    // 请求方法
	    sbSql.append("method = " + getMethod() + "\r\n");
	    // 父级菜单id
	    sbSql.append("parentId = " + getParentId() + "\r\n");
	    // 图标
	    sbSql.append("icon = " + getIcon() + "\r\n");
	    // vue页面
	    sbSql.append("component = " + getComponent() + "\r\n");
        return sbSql.toString();

	}

    /**
     * 重置属性变化状态
     * @param changeState
     */
	public void resetChangeState(Boolean changeState){
           /**
            *  菜单id
            */
        idChanged = changeState;
           /**
            *  排序值
            */
        sortChanged = changeState;
           /**
            *  类型（0菜单 1按钮）
            */
        typeChanged = changeState;
           /**
            *  创建时间
            */
        createTimeChanged = changeState;
           /**
            *  更新时间
            */
        updateTimeChanged = changeState;
           /**
            *  是否删除
            */
        isDelChanged = changeState;
           /**
            *  菜单名称
            */
        nameChanged = changeState;
           /**
            *  菜单权限标识
            */
        permissionChanged = changeState;
           /**
            *  前端url
            */
        pathChanged = changeState;
           /**
            *  请求连接
            */
        urlChanged = changeState;
           /**
            *  请求方法
            */
        methodChanged = changeState;
           /**
            *  父级菜单id
            */
        parentIdChanged = changeState;
           /**
            *  图标
            */
        iconChanged = changeState;
           /**
            *  vue页面
            */
        componentChanged = changeState;
    }


}