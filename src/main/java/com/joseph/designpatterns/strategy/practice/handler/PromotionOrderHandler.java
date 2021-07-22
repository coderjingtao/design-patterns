package com.joseph.designpatterns.strategy.practice.handler;

import com.joseph.designpatterns.strategy.practice.OrderDTO;
import com.joseph.designpatterns.strategy.practice.annotation.OrderHandlerType;
import org.springframework.stereotype.Component;

@Component
@OrderHandlerType("3")
public class PromotionOrderHandler implements OrderHandler {
    @Override
    public String process(OrderDTO orderDTO) {
        return "处理促销订单";
    }
}
