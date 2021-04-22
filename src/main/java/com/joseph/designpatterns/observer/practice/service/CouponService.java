package com.joseph.designpatterns.observer.practice.service;

import com.joseph.designpatterns.observer.practice.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * 第二种实现事件监听的方法：在方法上使用@EventListener注解
 * @author Joseph.Liu
 */
@Service
@Slf4j
public class CouponService {

    @EventListener
    public void addCouponToUser(UserRegisterEvent userRegisterEvent){
        log.info("[给用户({})]发送优惠券",userRegisterEvent.getUsername());
    }
}
