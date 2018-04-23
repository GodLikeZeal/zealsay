package com.zeal.zealsay.common.exception;

import cn.hutool.http.HttpUtil;
import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.util.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

/**
*@description 自定义异常切面
*@author  zeal
*@date  2018-04-23  9:53
*@version 1.0.0
*/
@ControllerAdvice
public class ExceptionAdvice {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @ExceptionHandler(value = ZealException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)     //500系统错误
    public Result handleZealException(Exception e, WebRequest request){
        logger.error("用户: "+ UserUtils.getUserName()+" 在执行请求---->"+((ServletWebRequest) request).getRequest().getServletPath()+" 时发生异常");
        logger.error("ip地址: "+HttpUtil.getClientIP(((ServletWebRequest) request).getRequest()));
        logger.error("异常信息: "+e.getMessage());
        return new Result("error",e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)     //500系统错误
    public Result handleRuntimeException(Exception e,WebRequest request){
        logger.error("用户: "+ UserUtils.getUserName()+" 在执行请求---->"+((ServletWebRequest) request).getRequest().getServletPath()+" 时发生异常");
        logger.error("ip地址: "+HttpUtil.getClientIP(((ServletWebRequest) request).getRequest()));
        logger.error("异常信息: "+e.getMessage());
        return new Result("error","系统内部异常");
    }
}
