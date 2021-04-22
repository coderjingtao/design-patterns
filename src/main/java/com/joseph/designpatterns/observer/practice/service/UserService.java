package com.joseph.designpatterns.observer.practice.service;

import com.joseph.designpatterns.observer.practice.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * UserService在用户注册成功后，完成事件的发布。让EmailService或其他service监听该事件并做相应的处理
 * 这样实现业务的解耦
 * @author Joseph.Liu
 */
@Service
@Slf4j
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
          this.applicationEventPublisher = applicationEventPublisher;
    }

    /**
     * 用户注册的逻辑,一般是controller来调用并传入username
     * @param username 用户名
     */
    public void register(String username){
        //执行注册
        log.info("[用户({})]注册成功",username);
        //发布注册成功事件
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this,username));
        log.info("发布[用户({})]注册成功事件",username);
    }
}
