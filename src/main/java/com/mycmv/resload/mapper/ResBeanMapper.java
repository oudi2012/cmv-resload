package com.mycmv.resload.mapper;


import com.mycmv.resload.model.ResBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/***
 * @author a
 * @param <T>
 */
public interface ResBeanMapper<T extends ResBean> {

    /***
     * 列表
     * @param t t
     * @return List
     */
    List<T> list(T t);

    /***
     * 列表
     * @param idList idList
     * @return List
     */
    List<T> listByIds(@Param("list")List<Long> idList);

    /***
     * 详细
     * @param id id
     * @return obj
     */
    T findById(long id);

    /***
     * 单条
     * @param t t
     * @return obj
     */
    T findOne(T t);

    /***
     * 添加
     * @param item item
     */
    void insert(T item);

    /***
     * 编辑
     * @param item item
     */
    void update(T item);

    /***
     * 批量添加
     * @param list list
     */
    void batchInsert(@Param("list")List<T> list);

    /***
     * 删除
     * @param idList idList
     * @return int
     */
    int delete(@Param("idList")List<Long> idList);
}
