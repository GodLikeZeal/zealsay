package com.zeal.zealsay.common.util;


import org.apache.commons.collections.map.HashedMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by  zeal on 2015/9/14.
 */
public class CommonUtils {


    /**
     * 获取Map对象忽略大小写
     * @param map
     * @param key
     * @return
     */
    public static<T> T getMapValueIgnoreCase(Map<String, T> map,String key){
        for(String k:map.keySet()){
            if(k.equalsIgnoreCase(key)){
                return map.get(k);
            }
        }
        return null;
    }

    /**
     * 判断是都存在Key，忽略大小写
     * @param map
     * @param key
     * @param <T>
     * @return
     */
    public static<T> Boolean mapContainsKey(Map<String, T> map,String key){
        for(String k:map.keySet()){
            if(k.equalsIgnoreCase(key)){
               return true;
            }
        }
        return false;
    }



    /**
     * List<map>对象键值转换成小写的
     * @param lst
     * @param <T>
     * @return
     */
    public static<T> List<Map<String, T>> listMapKeyToLowerCaseComm(List<Map<String,T>> lst,Boolean isUpperCase) {
        List<Map<String, T>> lstMapLower = new ArrayList<>();
        if (lst != null && lst.size() > 0) {
            for (Map<String,T> m : lst) {
                Map<String, T> mapLower = mapKeyToLowerCase(m,isUpperCase);
                lstMapLower.add(mapLower);
            }
        }
        return lstMapLower;
    }

    /**
     * map对象键值转换成小写的
     * @param map
     * @param <T>
     * @return
     */
    public static <T> Map<String, T> mapKeyToLowerCase(Map<String, T> map, Boolean isUpperCase) {
        Map<String, T> mapResult = new HashedMap();
        for (String k : map.keySet()) {
            if(isUpperCase) {
                k = k.toUpperCase();
            } else {
                k = k.toLowerCase();
            }
            mapResult.put(k, map.get(k));
        }
        return mapResult;
    }

}
