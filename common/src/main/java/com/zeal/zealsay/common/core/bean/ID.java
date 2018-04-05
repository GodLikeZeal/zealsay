package com.zeal.zealsay.common.core.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
*@description id生成类对象
*@author zeal
*@date 2018-04-05 12:14
*@version 1.0.0
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ID implements Serializable {
    private long timeStamp;
    private long worker;
    private long sequence;
}
