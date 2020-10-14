package com.mycmv.resload.service.impl.book;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mycmv.resload.mapper.ResBeanMapper;
import com.mycmv.resload.model.ResBean;
import com.mycmv.resload.service.book.ResBeanService;
import org.springframework.util.CollectionUtils;

import java.util.List;

/***
 * @author a
 * @param <T>
 */
public abstract class BaseResBeanService<T extends ResBean> implements ResBeanService<T> {

    /***
     * getResBeanMapper
     * @return ResBeanMapper
     */
    public abstract ResBeanMapper<T> getResBeanMapper();

    @Override
    public List<T> list(T t) {
        return getResBeanMapper().list(t);
    }

    @Override
    public T findById(int id) {
        return getResBeanMapper().findById(id);
    }

    @Override
    public void insert(T item) {
        getResBeanMapper().insert(item);
    }

    @Override
    public void batchInsert(List<T> list) {
        getResBeanMapper().batchInsert(list);
    }

    @Override
    public PageInfo<T> pageList(T t, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<T> list = getResBeanMapper().list(t);
        if (CollectionUtils.isEmpty(list)) {
            return new PageInfo<>();
        }
        return new PageInfo<>(list);
    }
}
