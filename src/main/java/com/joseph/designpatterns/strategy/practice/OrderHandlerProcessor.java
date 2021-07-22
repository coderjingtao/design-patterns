package com.joseph.designpatterns.strategy.practice;

import com.joseph.designpatterns.strategy.practice.annotation.OrderHandlerType;
import com.joseph.designpatterns.strategy.practice.handler.OrderHandler;
import com.joseph.designpatterns.strategy.practice.util.ClassScanner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 扫描带有注解 @OrderHandlerType 的所有类，初始化HandlerContext，将其注册到spring容器
 * @author Joseph.Liu
 */
@Component
@SuppressWarnings("unchecked")
public class OrderHandlerProcessor implements BeanFactoryPostProcessor {
    private static final String HANDLER_PACKAGE = "com.joseph.designpatterns.strategy.practice.handler";

    /**
     *  - 扫描指定包中标有@OrderHandlerType的类；
     *  - 将注解中的类型值作为key，对应的类作为value，保存在Map中；
     *  - 以上面的map作为构造函数参数，初始化HandlerContext，将其注册到spring容器中；
     * @param configurableListableBeanFactory Bean 工厂
     * @throws BeansException exception
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        Map<String, Class<OrderHandler>> orderHandlerMap = new HashMap<>(3);
        ClassScanner.scan(HANDLER_PACKAGE, OrderHandlerType.class).forEach( clazz -> {
            //获取注解中的订单类型值
            String type = clazz.getAnnotation(OrderHandlerType.class).value();
            //将注解中的订单类型值作为key, 对应的类作为value, 保存到map中
            orderHandlerMap.put(type, (Class<OrderHandler>) clazz);
        });
        OrderHandlerContext context = new OrderHandlerContext(orderHandlerMap);
        configurableListableBeanFactory.registerSingleton(OrderHandlerContext.class.getName(),context);
    }
}
