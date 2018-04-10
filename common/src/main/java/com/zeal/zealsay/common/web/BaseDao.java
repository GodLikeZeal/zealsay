package com.zeal.zealsay.common.web;



import java.util.List;

/**
 * Created by Zeal on 2017/1/9.
 */
public interface BaseDao<T> {
    /**
     * 根据ID查找对象
     * @param id
     * @return
     */
    T findById(String id);

    /**
     * 根据对象查找对象
     * @param limitEntity
     * @return
     */
    List<T> findByClass(T limitEntity);

    /**
     * 插入记录
     * @param limitEntity
     * @return
     */
    int insert(T limitEntity);

    /**
     * 更新记录
     * @param limitEntity
     * @return
     */
    int update(T limitEntity);

    /**
     * 通过Class删除记录
     * @param limitEntity
     * @return
     */
    int delete(T limitEntity);

    /**
     * 通过id删除记录
     * @param id
     * @return
     */
    int deleteById(String id);

    /**
     * 分页查询
     * @param limitEntity
     * @return
     */
    List<T> findByClassPaginate(T limitEntity);

    /**
     * 分页查询总数
     * @param limitEntity
     * @return
     */
    long findByClassPaginateCount(T limitEntity);

}
