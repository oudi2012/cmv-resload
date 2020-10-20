package com.mycmv.resload.service.image;

import com.github.pagehelper.PageInfo;
import com.mycmv.resload.model.ResBean;

import java.util.List;
import java.util.Map;

/***
 * 父接口
 * @author a
 */
public interface ResBeanService<T extends ResBean> {

    /***
     * 列表
     * @param t t
     * @return
     */
    List<T> list(T t);

    /***
     * 列表
     * @param idList idList
     * @return List
     */
    List<T> listByIds(List<Long> idList);

    /***
     * mapByIds
     * @param idList idList
     * @return
     */
    Map<Long, T> mapByIds(List<Long> idList);

    /***
     * 详细
     * @param id id
     * @return obj
     */
    T findById(int id);

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
    void batchInsert(List<T> list);

    /***
     * 删除
     * @param idList idList
     * @return int
     */
    int delete(List<Long> idList);

    /***
     * 分页显示
     * @param t t
     * @param pageIndex pageIndex
     * @param pageSize pageSize
     * @return PageInfo
     */
    PageInfo<T> pageList(T t, int pageIndex, int pageSize);

}
