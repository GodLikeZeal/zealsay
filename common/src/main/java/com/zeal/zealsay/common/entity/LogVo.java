package com.zeal.zealsay.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
*@description 日志包装对象
*@author  zeal
*@date  2018-04-23  14:31
*@version 1.0.0
*/
@Data
public class LogVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private SysLog sysLog;

    private String token;
}
