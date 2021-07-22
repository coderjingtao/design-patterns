package com.joseph.designpatterns.strategy.practice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Setter
@Getter
@ToString
public class OrderDTO {
    private String code;
    private BigDecimal price;
    /** 订单类型* 1：普通订单；* 2：团购订单；* 3：促销订单；**/
    private String type;
}
