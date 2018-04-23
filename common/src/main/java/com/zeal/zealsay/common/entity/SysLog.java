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


/**
 * sys_log实体类接口
 * 
 * @author zeal
 * @date 2018-04-23 13:56:11
 */
public class SysLog extends BaseEntity<SysLog> {
	private static final long serialVersionUID = 1L;
	protected int revision;
	//属性字段
	private String createBy; // 创建者
	private Date createTime; // 创建时间
	private String exception; // 异常信息
	private String id; // 主键
	private String isDel; // 是否删除
	private String method; // 操作方式
	private String params; // 操作提交的数据
	private String remoteAddr; // 操作ip地址
	private String requestUri; // 请求uri
	private String serviceId; // 服务id
	private String time; // 执行时间
	private String type; // 日志类型
	private Date updateTime; // 更新时间
	private String userAgent; // 用户代理


	//属性字段是否变化
	/**
	 *
	 */
	private Boolean idChanged = false; // 主键
	private Boolean methodChanged = false; // 操作方式
	private Boolean paramsChanged = false; // 操作提交的数据
	private Boolean timeChanged = false; // 执行时间
	private Boolean exceptionChanged = false; // 异常信息
	private Boolean isDelChanged = false; // 是否删除
	private Boolean typeChanged = false; // 日志类型
	private Boolean serviceIdChanged = false; // 服务id
	private Boolean createByChanged = false; // 创建者
	private Boolean createTimeChanged = false; // 创建时间
	private Boolean updateTimeChanged = false; // 更新时间
	private Boolean remoteAddrChanged = false; // 操作ip地址
	private Boolean userAgentChanged = false; // 用户代理
	private Boolean requestUriChanged = false; // 请求uri


	/**
	 * 无参构造函数
	 */
	public SysLog() {
		super();
	}

	public SysLog(Map<String,String> allRequestParams)  throws Exception{
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");//用于时间格式化

		if (CommonUtils.mapContainsKey(allRequestParams,"id")) {
			setId(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"id"))); // 主键
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"method")) {
			setMethod(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"method"))); // 操作方式
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"params")) {
			setParams(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"params"))); // 操作提交的数据
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"time")) {
			setTime(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"time"))); // 执行时间
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"exception")) {
			setException(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"exception"))); // 异常信息
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"isDel")) {
			setIsDel(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"isDel"))); // 是否删除
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"type")) {
			setType(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"type"))); // 日志类型
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"serviceId")) {
			setServiceId(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"serviceId"))); // 服务id
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"createBy")) {
			setCreateBy(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"createBy"))); // 创建者
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"createTime")) {
			setCreateTime(formater.parse(CommonUtils.getMapValueIgnoreCase(allRequestParams,"createTime"))); // 创建时间
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"updateTime")) {
			setUpdateTime(formater.parse(CommonUtils.getMapValueIgnoreCase(allRequestParams,"updateTime"))); // 更新时间
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"remoteAddr")) {
			setRemoteAddr(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"remoteAddr"))); // 操作ip地址
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"userAgent")) {
			setUserAgent(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"userAgent"))); // 用户代理
		}
		if (CommonUtils.mapContainsKey(allRequestParams,"requestUri")) {
			setRequestUri(String.valueOf(CommonUtils.getMapValueIgnoreCase(allRequestParams,"requestUri"))); // 请求uri
		}
	}



	/**
	 * 获取“主键”
	 *
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置“主键”
	 *
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
		idChanged = true;
	}
	/**
	 * 获取“操作方式”
	 *
	 * @return method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * 设置“操作方式”
	 *
	 * @param method
	 */
	public void setMethod(String method) {
		this.method = method;
		methodChanged = true;
	}
	/**
	 * 获取“操作提交的数据”
	 *
	 * @return params
	 */
	public String getParams() {
		return params;
	}

	/**
	 * 设置“操作提交的数据”
	 *
	 * @param params
	 */
	public void setParams(String params) {
		this.params = params;
		paramsChanged = true;
	}
	/**
	 * 获取“执行时间”
	 *
	 * @return time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * 设置“执行时间”
	 *
	 * @param time
	 */
	public void setTime(String time) {
		this.time = time;
		timeChanged = true;
	}
	/**
	 * 获取“异常信息”
	 *
	 * @return exception
	 */
	public String getException() {
		return exception;
	}

	/**
	 * 设置“异常信息”
	 *
	 * @param exception
	 */
	public void setException(String exception) {
		this.exception = exception;
		exceptionChanged = true;
	}
	/**
	 * 获取“是否删除”
	 *
	 * @return isDel
	 */
	public String getIsDel() {
		return isDel;
	}

	/**
	 * 设置“是否删除”
	 *
	 * @param isDel
	 */
	public void setIsDel(String isDel) {
		this.isDel = isDel;
		isDelChanged = true;
	}
	/**
	 * 获取“日志类型”
	 *
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置“日志类型”
	 *
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
		typeChanged = true;
	}
	/**
	 * 获取“服务id”
	 *
	 * @return serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * 设置“服务id”
	 *
	 * @param serviceId
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		serviceIdChanged = true;
	}
	/**
	 * 获取“创建者”
	 *
	 * @return createBy
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * 设置“创建者”
	 *
	 * @param createBy
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
		createByChanged = true;
	}
	/**
	 * 获取“创建时间”
	 *
	 * @return createTime
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置“创建时间”
	 *
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
		createTimeChanged = true;
	}
	/**
	 * 获取“更新时间”
	 *
	 * @return updateTime
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置“更新时间”
	 *
	 * @param updateTime
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		updateTimeChanged = true;
	}
	/**
	 * 获取“操作ip地址”
	 *
	 * @return remoteAddr
	 */
	public String getRemoteAddr() {
		return remoteAddr;
	}

	/**
	 * 设置“操作ip地址”
	 *
	 * @param remoteAddr
	 */
	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
		remoteAddrChanged = true;
	}
	/**
	 * 获取“用户代理”
	 *
	 * @return userAgent
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * 设置“用户代理”
	 *
	 * @param userAgent
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
		userAgentChanged = true;
	}
	/**
	 * 获取“请求uri”
	 *
	 * @return requestUri
	 */
	public String getRequestUri() {
		return requestUri;
	}

	/**
	 * 设置“请求uri”
	 *
	 * @param requestUri
	 */
	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
		requestUriChanged = true;
	}

    /**
	 * 对象结果输出字符串
	 * @return
	 * @throws Exception
     */
	public String entityToString(){
	    StringBuilder sbSql=new StringBuilder();
	    sbSql.append("this.class = " + this.toString() + "\r\n");
	    sbSql.append("id = " + getId() + "\r\n");  // 主键
	    sbSql.append("method = " + getMethod() + "\r\n");  // 操作方式
	    sbSql.append("params = " + getParams() + "\r\n");  // 操作提交的数据
	    sbSql.append("time = " + getTime() + "\r\n");  // 执行时间
	    sbSql.append("exception = " + getException() + "\r\n");  // 异常信息
	    sbSql.append("isDel = " + getIsDel() + "\r\n");  // 是否删除
	    sbSql.append("type = " + getType() + "\r\n");  // 日志类型
	    sbSql.append("serviceId = " + getServiceId() + "\r\n");  // 服务id
	    sbSql.append("createBy = " + getCreateBy() + "\r\n");  // 创建者
	    sbSql.append("createTime = " + DateUtils.formatDateTime(getCreateTime()) + "\r\n");  // 创建时间
	    sbSql.append("updateTime = " + DateUtils.formatDateTime(getUpdateTime()) + "\r\n");  // 更新时间
	    sbSql.append("remoteAddr = " + getRemoteAddr() + "\r\n");  // 操作ip地址
	    sbSql.append("userAgent = " + getUserAgent() + "\r\n");  // 用户代理
	    sbSql.append("requestUri = " + getRequestUri() + "\r\n");  // 请求uri
        return sbSql.toString();

	}

    /**
     * 重置属性变化状态
     * @param changeState
     */
	public void resetChangeState(Boolean changeState){
        idChanged = changeState; // 主键
        methodChanged = changeState; // 操作方式
        paramsChanged = changeState; // 操作提交的数据
        timeChanged = changeState; // 执行时间
        exceptionChanged = changeState; // 异常信息
        isDelChanged = changeState; // 是否删除
        typeChanged = changeState; // 日志类型
        serviceIdChanged = changeState; // 服务id
        createByChanged = changeState; // 创建者
        createTimeChanged = changeState; // 创建时间
        updateTimeChanged = changeState; // 更新时间
        remoteAddrChanged = changeState; // 操作ip地址
        userAgentChanged = changeState; // 用户代理
        requestUriChanged = changeState; // 请求uri
    }


}