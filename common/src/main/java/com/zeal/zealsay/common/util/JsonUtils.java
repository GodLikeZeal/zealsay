package com.zeal.zealsay.common.util;


import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
*@description Json工具类
*@author  zeal
*@date  2018-04-16  16:00
*@version 1.0.0
*/
public class JsonUtils {
    /**
     * JSON转换核心类
     */
    public static ObjectMapper objectMapper=new ObjectMapper().configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES,true);

}
