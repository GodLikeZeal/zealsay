package com.zeal.zealsay.common.web;



import java.io.Serializable;

/**
 * Created by Zeal on 2017/1/20.
 */
public abstract class BaseEntity<T> implements Cloneable,Serializable {

    @Override
    public T clone() throws CloneNotSupportedException {
        T newBody =  (T) super.clone();
        return newBody;
    }
    protected String islike; //是否模糊搜索

    public String getIslike() {
        return islike;
    }

    public void setIslike(String islike) {
        this.islike = islike;
    }
}
