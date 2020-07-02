package org.lzz.mp.demo.core;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.LifecycleState;

import java.util.List;

/**
 * @BelongsProject: mp-demo
 * @BelongsPackage: org.lzz.mp.demo.core
 * @Author: lizeze
 * @CreateTime: 2020-07-02 23:02
 * @Description: ${Description}
 */
@Getter
@Setter
public class RequestDto {
    private Integer pageIndex;
    private Integer pageSize;
    private List<Fileds> fileds;

}
