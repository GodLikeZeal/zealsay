package com.zeal.zealsay.common.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * @author lengleng
 * @date 2017/11/20
 */
@Data
public class Log implements Serializable {
    private static final long serialVersionUID = 1L;

    private String token;
}
