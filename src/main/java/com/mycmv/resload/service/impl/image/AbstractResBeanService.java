package com.mycmv.resload.service.impl.image;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.base.Functions;
import com.mycmv.resload.mapper.ResBeanMapper;
import com.mycmv.resload.model.ResBean;
import com.mycmv.resload.service.image.ResBeanService;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/***
 * @author a
 * @param <T>
 */
public abstract class AbstractResBeanService<T extends ResBean> implements ResBeanService<T> {

    /***
     *  getResBeanMapper
     * @return ResBeanMapper
     */
    public abstract ResBeanMapper<T> getResBeanMapper();

    @Override
    public List<T> list(T t) {
        return getResBeanMapper().list(t);
    }

    @Override
    public List<T> listByIds(List<Long> idList) {
        return getResBeanMapper().listByIds(idList);
    }

    @Override
    public Map<Long, T> mapByIds(List<Long> idList) {
        List<T> list = listByIds(idList);
        if (CollectionUtils.isEmpty(list)) {
            return new HashMap<>(0);
        }
        return list.stream().collect(Collectors.toMap(ResBean::getId, Functions.identity()));
    }

    @Override
    public T findById(int id) {
        return getResBeanMapper().findById(id);
    }

    @Override
    public T findOne(T t) {
        return getResBeanMapper().findOne(t);
    }

    @Override
    public void insert(T item) {
        getResBeanMapper().insert(item);
    }

    @Override
    public void update(T item) {
        getResBeanMapper().update(item);
    }

    @Override
    public void batchInsert(List<T> list) {
        getResBeanMapper().batchInsert(list);
    }

    @Override
    public int delete(List<Long> idList) {
        return getResBeanMapper().delete(idList);
    }

    @Override
    public PageInfo<T> pageList(T t, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize).setOrderBy(" id desc ");
        List<T> list = getResBeanMapper().list(t);
        if (CollectionUtils.isEmpty(list)) {
            return new PageInfo<>();
        }
        return new PageInfo<>(list);
    }
}
