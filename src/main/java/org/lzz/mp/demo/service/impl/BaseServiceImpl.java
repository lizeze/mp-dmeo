package org.lzz.mp.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.lzz.mp.demo.core.RequestDto;
import org.lzz.mp.demo.service.BaseService;

import java.io.Serializable;
import java.util.List;

/**
 * @BelongsProject: mp-demo
 * @BelongsPackage: org.lzz.mp.demo.service.impl
 * @Author: lizeze
 * @CreateTime: 2020-07-02 23:09
 * @Description: ${Description}
 */
public class BaseServiceImpl<T> implements BaseService<T> {
    @Override
    public T getById(Serializable id) {
        return null;
    }

    @Override
    public T getOne(RequestDto requestDto) {
        return null;
    }

    @Override
    public List<T> list() {
        return null;
    }

    @Override
    public List<T> list(RequestDto requestDto) {
        return null;
    }

    @Override
    public IPage<T> page(RequestDto requestDto) {
        return null;
    }

    @Override
    public Boolean remove(RequestDto requestDto) {
        return null;
    }

    @Override
    public Boolean removeById(Serializable id) {
        return null;
    }
}
