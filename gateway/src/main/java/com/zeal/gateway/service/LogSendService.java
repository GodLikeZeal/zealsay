package com.zeal.gateway.service;


import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.URLUtil;
import cn.hutool.http.HttpUtil;
import com.netflix.zuul.context.RequestContext;
import com.zeal.zealsay.common.constant.AuthConstants;
import com.zeal.zealsay.common.constant.MqQueueConstant;
import com.zeal.zealsay.common.entity.LogVo;
import com.zeal.zealsay.common.entity.SysLog;
import com.zeal.zealsay.common.util.UserUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
*@description 消息发往消息队列工具类
*@author  zeal
*@date  2018-04-23  11:32
*@version 1.0.0
*/
@Component
public class LogSendService {
    private static final String SERVICE_ID = "serviceId";
    private Logger logger = LoggerFactory.getLogger(LogSendService.class);
    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 1. 获取 requestContext 中的请求信息
     * 2. 如果返回状态不是OK，则获取返回信息中的错误信息
     * 3. 发送到MQ
     *
     * @param requestContext 上下文对象
     */
    public void send(RequestContext requestContext) {
        HttpServletRequest request = requestContext.getRequest();
        String requestUri = request.getRequestURI();
        String method = request.getMethod();
        SysLog log = new SysLog();
        log.setType(AuthConstants.STATUS_NORMAL);
        log.setRemoteAddr(HttpUtil.getClientIP(request));
        log.setRequestUri(URLUtil.getPath(requestUri));
        log.setMethod(method);
        log.setUserAgent(request.getHeader("user-agent"));
        log.setParams(HttpUtil.toParams(request.getParameterMap()));
        log.setCreateBy(UserUtils.getUserName(request));
        Long startTime = (Long) requestContext.get("startTime");
        log.setTime(String.valueOf(System.currentTimeMillis() - startTime));
        if (requestContext.get(SERVICE_ID) != null) {
            log.setServiceId(requestContext.get(SERVICE_ID).toString());
        }

        //正常发送服务异常解析
        if (requestContext.getResponseStatusCode() != HttpStatus.SC_OK
                && requestContext.getResponseDataStream() != null) {
            InputStream inputStream = requestContext.getResponseDataStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InputStream stream1 = null;
            InputStream stream2;
            byte[] buffer = IoUtil.readBytes(inputStream);
            try {
                baos.write(buffer);
                baos.flush();
                stream1 = new ByteArrayInputStream(baos.toByteArray());
                stream2 = new ByteArrayInputStream(baos.toByteArray());
                String resp = IoUtil.read(stream1, AuthConstants.UTF8);
                log.setType(AuthConstants.STATUS_LOCK);
                log.setException(resp);
                requestContext.setResponseDataStream(stream2);
            } catch (IOException e) {
                logger.error("响应流解析异常：", e);
                throw new RuntimeException(e);
            } finally {
                IoUtil.close(stream1);
                IoUtil.close(baos);
                IoUtil.close(inputStream);
            }

        }

        //网关内部异常
        Throwable throwable = requestContext.getThrowable();
        if (throwable != null) {
            logger.error("网关异常", throwable);
            log.setException(throwable.getMessage());
        }

        //保存发往MQ（只保存授权）
        LogVo logVo = new LogVo();
        logVo.setSysLog(log);
        if (StringUtils.isNotEmpty(request.getHeader(AuthConstants.REQ_HEADER))) {
            logVo.setToken(request.getHeader(AuthConstants.REQ_HEADER));
            rabbitTemplate.convertAndSend(MqQueueConstant.LOG_QUEUE, logVo);
        }
    }
}
