package com.mycmv.resload.mapper;


import com.mycmv.resload.model.ResBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/***
 * @author a
 * @param <T>
 */
public interface ExamInfoMapper<T extends ResBean> {

    /***
     * 列表
     * @param t t
     * @return List
     */
    List<T> list(T t);

    /***
     * 详细
     * @param id id
     * @return obj
     */
    T findById(int id);

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
