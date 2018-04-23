package com.zeal.zealsay.common.constant;

/**
*@description MQ 消息队列
*@author  zeal
*@date  2018-04-23  14:33
*@version 1.0.0
*/
public interface MqQueueConstant {
    /**
     * log rabbit队列名称
     */
    String LOG_QUEUE = "log";

    /**
     * 发送短信验证码队列
     */
    String MOBILE_CODE_QUEUE = "mobile_code_queue";

    /**
     * 服务状态队列
     */
    String SERVICE_STATUS_CHANGE = "service_status_change";

    /**
     * zipkin 队列
     */
    String ZIPKIN_NAME_QUEUE = "zipkin";
}
