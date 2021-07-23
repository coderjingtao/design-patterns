package com.joseph.designpatterns.initsolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 如果我们不需要获取命令行参数，我们可以通过 ApplicationListener 创建一些全局的启动逻辑，
 * 我们还可以通过它获取 Spring Boot 支持的 configuration properties 环境变量参数 ,因为event参数有configuration上下文
 * @author Joseph.Liu
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("MyApplicationListener running...");
        System.out.println("You can start init data.");
//        ConfigurableApplicationContext applicationContext = applicationReadyEvent.getApplicationContext();
//        applicationContext.getBeansOfType("your need class type");
    }
}
