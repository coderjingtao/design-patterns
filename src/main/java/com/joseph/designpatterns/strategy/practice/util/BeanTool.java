package com.joseph.designpatterns.strategy.practice.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Bean工具类：可以在非spring管理的类中获取spring注册的bean
 * @author Joseph.Liu
 */
@Component
public class BeanTool implements ApplicationContextAware {
    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(context == null){
            context = applicationContext;
        }
    }

    public static Object getBean(String name){
        return context.getBean(name);
    }

    public static <T> T getBean(Class<T> clazz){
        return context.getBean(clazz);
    }
}
