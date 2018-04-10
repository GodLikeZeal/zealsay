package com.zeal.zealsay.common.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Zeal on 2017/1/10.
 */
@Transactional
public class BaseService<D extends BaseDao<T>, T > {
    @Autowired
    protected D dao;


    /**
     * 通过ID查找
     * @param id
     * @return
     */
    //Ehcache的spring缓存注解，在userCache中缓存id为id的对象
//    @Cacheable(value = "userCache",key="entity+findById+#id")
    public T findById(String id){
        T entity = dao.findById(id);
        return entity;
    }

    /**
     * 通过Class查找
     * @param entity
     * @return
     */
//    @Cacheable(value = "userCache",key = "#root.targetClass")
    public List<T> findByClass(T entity) {
        return dao.findByClass(entity);
    }

    /**
     * 新增记录
     * @param entity
     * @return
     */
//    @CacheEvict(value="userCache",key="0",beforeInvocation=true)
    public Integer insert(T entity){
        return dao.insert(entity);
    }

    /**
     * 更新记录
     * @param entity
     * @return
     */
//    @CachePut(value = "userCache",key = "#entity.id")
    public Integer update(T entity){
        return dao.update(entity);
    }

    /**
     * 通过class 删除记录
     * @param limitEntity
     * @return
     */
//    @CacheEvict(value = "userCache",key = "#root.targetClass")
    public Integer delete(T limitEntity){
        return dao.delete(limitEntity);
    }

    /**
     * 通过ID删除记录
     * @param id
     * @return
     */
//    @CacheEvict(value = "userCache",key = "#id")
    public Integer deleteById(String id){
        return dao.deleteById(id);
    }



}
