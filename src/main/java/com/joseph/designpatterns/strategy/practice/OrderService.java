package com.joseph.designpatterns.strategy.practice;

import com.joseph.designpatterns.strategy.practice.handler.OrderHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Joseph.Liu
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderService {

    private final OrderHandlerContext orderHandlerContext;

    /**
     * 传统实现方式: 根据订单的不同类型，对订单进行处理
     * @param orderDTO 订单
     * @return 返回字符串
     */
    public String precess(OrderDTO orderDTO){
        String orderType = orderDTO.getType();
        if ("1".equals(orderType)) {
            return "处理普通订单";
        } else if ("2".equals(orderType)) {
            return "处理团购订单";
        } else if ("3".equals(orderType)) {
            return "处理促销订单";
        }else{
            return null;
        }
    }

    /**
     * 利用策略模式，实现根据订单的不同类型，对订单进行处理，减少了if else的使用
     * @param orderDTO 订单
     * @return 返回字符串
     */
    public String handleOrder(OrderDTO orderDTO){
        OrderHandler orderHandler = orderHandlerContext.getInstance(orderDTO.getType());
        return orderHandler.process(orderDTO);
    }

}
