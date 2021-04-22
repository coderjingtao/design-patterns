package com.joseph.designpatterns.observer.practice.service;

import com.joseph.designpatterns.observer.practice.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 第一种实现事件监听的方法：实现ApplicationListener接口
 * @author Joseph.Liu
 */
@Service
@Slf4j
public class EmailService implements ApplicationListener<UserRegisterEvent> {
    /**
     * 监听用户注册成功事件，一旦监听到，发送邮件给用户
     * 由于实际场景下,邮件发送较慢，且为非关键逻辑，所以用异步执行更合理。
     * 需要在SpringBoot入口类加入@EnableAsync 注解
     * @param userRegisterEvent 用户注册成功事件
     */
    @Override
    @Async
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        log.info("[给用户({})]发送邮件",userRegisterEvent.getUsername());
    }
}
