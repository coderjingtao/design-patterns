package com.joseph.designpatterns.responsibilitychain.practice;

import java.util.List;

/**
 * 业务场景：对web上传进来的请求参数进行合法性校验，只有全部通过校验才会存储到数据库中
 * 假设只需要进行2种校验：1.非空字段校验 2.最小值校验
 * @author Joseph.Liu
 */
public interface ValidateHandler {
    /**
     * 对所有的请求数据进行校验，只返回校验通过的请求数据
     * @param allRequests 所有的请求数据
     * @return 校验通过的请求数据
     */
    List<Object> validate(List<Object> allRequests);
}
