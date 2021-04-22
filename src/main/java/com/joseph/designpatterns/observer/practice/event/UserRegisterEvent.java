package com.joseph.designpatterns.observer.practice.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 用户注册成功的事件
 * @author Joseph.Liu
 */
@Getter
public class UserRegisterEvent extends ApplicationEvent {
    private String username;
    public UserRegisterEvent(Object source) {
        super(source);
    }
    public UserRegisterEvent(Object source, String username){
        super(source);
        this.username = username;
    }
}
