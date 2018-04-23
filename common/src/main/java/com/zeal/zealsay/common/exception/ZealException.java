package com.zeal.zealsay.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
*@description 自定义封装异常类
*@author  zeal
*@date  2018-04-23  9:26
*@version 1.0.0
*/
public class ZealException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ZealException(){

    }
    public ZealException(String message){
        super(message);
    }
}
