package com.zeal.gateway.componet.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zeal.zealsay.common.constant.AuthConstants;
import com.zeal.zealsay.common.entity.Result;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
*@description 授权拒绝处理器，覆盖默认的OAuth2AccessDeniedHandler
* 包装失败信息到PigDeniedException
*@author  zeal
*@date  2018-04-23  18:10
*@version 1.0.0
*/
@Component
public class AccessDeniedHandler extends OAuth2AccessDeniedHandler {
    private static Logger logger = LoggerFactory.getLogger(AccessDeniedHandler.class);
    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 授权拒绝处理，使用Result包装
     *
     * @param request       request
     * @param response      response
     * @param authException authException
     * @throws IOException      IOException
     * @throws ServletException ServletException
     */
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException authException) throws IOException, ServletException {
        logger.info("授权失败，禁止访问");
        response.setCharacterEncoding(AuthConstants.UTF8);
        response.setContentType(AuthConstants.CONTENT_TYPE);
        Result<String> result = new Result<String>("授权失败，禁止访问");
        response.setStatus(HttpStatus.SC_FORBIDDEN);
        PrintWriter printWriter = response.getWriter();
        printWriter.append(objectMapper.writeValueAsString(result));
    }
}
