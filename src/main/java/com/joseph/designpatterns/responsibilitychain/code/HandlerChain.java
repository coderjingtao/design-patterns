package com.joseph.designpatterns.responsibilitychain.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 将所有处理器串成一条链执行的处理器链
 * @author Joseph.Liu
 */
public class HandlerChain {
    List<IHandler> allHandlers = new ArrayList<>();

    public void addHandler(List<IHandler> handlers){
        allHandlers.addAll(handlers);
    }

    /**
     * 如果单个处理器处理失败，返回布尔值为 false，那么责任链发起类会中断流程，剩余处理器将不会被执行。
     * @return 失败返回false
     */
    public boolean handle(){
        boolean result = true;
        for(IHandler handler : allHandlers){
            if(!handler.handle()){
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * test
     * @param args
     */
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        List<IHandler> handlers = new ArrayList<>();
        handlers.add(new HandlerA());
        handlers.add(new HandlerB());
        handlerChain.addHandler(handlers);
        boolean success = handlerChain.handle();
        if(success){
            System.out.println("责任链对所有请求处理成功");
        }else{
            System.out.println("责任链中处理器不满足条件");
        }
    }
}
