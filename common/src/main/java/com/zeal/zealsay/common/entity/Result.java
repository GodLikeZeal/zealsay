package com.zeal.zealsay.common.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
*@description 统一响应返回结果集
*@author zeal
*@date 2018-04-05 15:58
*@version 1.0.0
*/
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    //返回码
    private String code;
    //返回对象
    private T data;

    public Result(){
        super();
        this.code="ok";
    }

    public Result(T data) {
        this.data=data;
        this.code="ok";
    }

    public Result(String code,T data){
        this.code=code;
        this.data=data;
    }
}
