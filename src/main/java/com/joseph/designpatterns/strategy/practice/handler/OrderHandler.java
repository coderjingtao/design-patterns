package com.joseph.designpatterns.strategy.practice.handler;

import com.joseph.designpatterns.strategy.practice.OrderDTO;

public interface OrderHandler {
    String process(OrderDTO orderDTO);
}
