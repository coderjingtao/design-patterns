package com.joseph.designpatterns.strategy.practice.annotation;

import java.lang.annotation.*;

/**
 * @author Joseph.Liu
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface OrderHandlerType {
    String value();
}
