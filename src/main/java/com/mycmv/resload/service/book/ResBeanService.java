package com.mycmv.resload.service.book;

import com.github.pagehelper.PageInfo;
import com.mycmv.resload.model.ResBean;

import java.util.List;

/***
 * 父接口
 */
public interface ResBeanService<T extends ResBean> {

    /***
     * 列表
     * @param t
     * @return
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
     * 批量添加
     * @param list list
     */
    void batchInsert(List<T> list);

    /***
     * 分页显示
     * @param t t
     * @param pageIndex pageIndex
     * @param pageSize pageSize
     * @return PageInfo
     */
    PageInfo<T> pageList(T t, int pageIndex, int pageSize);

}
