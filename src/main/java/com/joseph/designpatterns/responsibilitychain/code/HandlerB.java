package com.joseph.designpatterns.responsibilitychain.code;

/**
 * 需要负责处理某一具体逻辑的处理器
 * @author Joseph.Liu
 */
public class HandlerB implements IHandler {

    /**
     * 根据业务规则，看是否符合该规则, 可以联想 SpringMVC 拦截器的实现流程
     * @return 符合返回true, 不符合返回false
     */
    @Override
    public boolean handle() {
        boolean result = true;
        System.out.println("执行HandlerB...");
        return result;
    }
}
