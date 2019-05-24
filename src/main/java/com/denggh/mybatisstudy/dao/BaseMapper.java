package com.denggh.mybatisstudy.dao;

import javax.management.Query;
import java.util.List;

/**
 * @author ：denggh
 * @date ：Created in 2019/5/16 10:54
 * @description：
 */
public interface BaseMapper<T> {
    /**
     * 新增
     * @param t
     * @return
     */
    int save(T t);

    /**
     * 新增
     * @param query
     * @return
     */
    int save(Query query);

    /**
     * 批量新增
     * @param items
     * @return
     */
    int batchSave(List<T> items);

    /**
     * 查询详情
     * @param t
     * @return
     */
    T getObject(T t);

    /**
     * 根据id查询详情
     * @param id
     * @return
     */
    T getObjectById(Object id);

    /**
     * 更新
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 更新
     * @param query
     * @return
     */
    int update(Query query);

    /**
     * 批量更新
     * @param query
     * @return
     */
    int batchUpdate(Query query);

    /**
     * 删除
     * @param id
     * @return
     */
    int remove(Object id);

    /**
     * 逻辑删除
     * @param id
     * @return
     */
    int removeLogic(Object id);

    /**
     * 批量删除
     * @param id
     * @return
     */
    int batchRemove(Object[] id);

    /**
     * 批量逻辑删除
     * @param id
     * @return
     */
    int batchRemoveLogic(Object[] id);

    /**
     * 查询列表
     * @param query
     * @return
     */
    List<T> list(Query query);

    /**
     * 查询列表
     * @return
     */
    List<T> list();

    /**
     * 统计
     * @return
     */
    int countTotal();

    /**
     * 统计
     * @param query
     * @return
     */
    int countTotal(Query query);
}
