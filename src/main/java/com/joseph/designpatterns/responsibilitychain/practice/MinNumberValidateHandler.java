package com.joseph.designpatterns.responsibilitychain.practice;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 最小数字校验处理器
 * @author Joseph.Liu
 */
@Component
public class MinNumberValidateHandler implements ValidateHandler {
    @Override
    public List<Object> validate(List<Object> allRequests) {
        System.out.println("Execute MinNumberValidateHandler");
        List<Object> filteredList = null;
        //业务逻辑
        filteredList = allRequests;
        return filteredList;
    }
}
