package org.lzz.mp.demo.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.lzz.mp.demo.model.UserInfo;
import org.lzz.mp.demo.service.UserService;

/**
 * @BelongsProject: mp-demo
 * @BelongsPackage: org.lzz.mp.demo.service.impl
 * @Author: lizeze
 * @CreateTime: 2020-07-02 23:26
 * @Description: ${Description}
 */
public class UserServiceImpl extends ServiceImpl<BaseMapper<UserInfo, UserInfo>> implements UserService {


    public boolean saveOrUpdate(UserInfo entity) {
        return false;
    }
}
