package com.joseph.designpatterns.responsibilitychain.practice;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 非空字段校验处理器
 * @author Joseph.Liu
 */
@Component
public class NotNullValidateHandler implements ValidateHandler {
    @Override
    public List<Object> validate(List<Object> allRequests) {
        System.out.println("Execute NotNullValidateHandler...");
        List<Object> filteredList = null;
        //业务逻辑
        filteredList = allRequests;
        return filteredList;
    }
}
