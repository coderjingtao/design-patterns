package com.joseph.designpatterns.strategy.practice.handler;

import com.joseph.designpatterns.strategy.practice.OrderDTO;
import com.joseph.designpatterns.strategy.practice.annotation.OrderHandlerType;
import org.springframework.stereotype.Component;

@Component
@OrderHandlerType("1")
public class NormalOrderHandler implements OrderHandler {
    @Override
    public String process(OrderDTO orderDTO) {
        return "处理普通订单";
    }
}
