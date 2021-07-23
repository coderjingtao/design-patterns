package com.joseph.designpatterns.initsolution;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 注解PostConstruct方法
 * 1.会在依赖MyPostConstructBean的所有bean初始化之后被自动调用
 * 2.将会在MyPostConstructBean类中依赖注入完成后被自动调用
 * 它仅将其用于此单个 bean 的初始化逻辑;
 * @author Joseph.Liu
 */
@Component
public class MyPostConstructBean {

    @PostConstruct
    public void testPostConstruct(){
        System.out.println("MyPostConstructBean Running...");
    }

    public String getName(){
        return "Joseph";
    }
}
