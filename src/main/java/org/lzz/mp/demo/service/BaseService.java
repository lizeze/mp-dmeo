package org.lzz.mp.demo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.lzz.mp.demo.core.RequestDto;

import java.io.Serializable;
import java.util.List;

/**
 * @BelongsProject: mp-demo
 * @BelongsPackage: org.lzz.mp.demo.service
 * @Author: lizeze
 * @CreateTime: 2020-07-02 22:59
 * @Description: ${Description}
 */
public interface BaseService<T> {

    T getById(Serializable id);

    T getOne(RequestDto requestDto);

    List<T> list();

    List<T> list(RequestDto requestDto);

    IPage<T> page(RequestDto requestDto);


    Boolean remove(RequestDto requestDto);

    Boolean removeById(Serializable id);



}
