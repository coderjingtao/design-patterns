package com.joseph.designpatterns.responsibilitychain.practice2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 责任链上的每一个handler，一般存在数据库中进行配置
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TxnHandlerEntity {

    private Integer handlerId;

    private String handlerName;

    private String classPath;

    private Integer preHandlerId;

    private Integer nextHandlerId;
}
