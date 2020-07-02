package org.lzz.mp.demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @BelongsProject: mp-demo
 * @BelongsPackage: org.lzz.mp.demo.model
 * @Author: lizeze
 * @CreateTime: 2020-07-02 22:56
 * @Description: ${Description}
 */
@Data
public class UserInfo {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    private String name;
}
