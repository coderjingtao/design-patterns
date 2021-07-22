package com.joseph.designpatterns.strategy.practice;

import com.joseph.designpatterns.strategy.practice.handler.OrderHandler;
import com.joseph.designpatterns.strategy.practice.util.BeanTool;

import java.util.Map;

/**
 * @author Joseph.Liu
 */
public class OrderHandlerContext {
    private Map<String,Class<OrderHandler>> orderHandlerMap;

    public OrderHandlerContext(Map<String,Class<OrderHandler>> orderHandlerMap){
        this.orderHandlerMap = orderHandlerMap;
    }

    public OrderHandler getInstance(String orderType){
        Class<OrderHandler> clazz = orderHandlerMap.get(orderType);
        if(clazz == null){
            throw new IllegalArgumentException("Cannot find order handler for order type: "+ orderType);
        }
        return BeanTool.getBean(clazz);
    }
}
