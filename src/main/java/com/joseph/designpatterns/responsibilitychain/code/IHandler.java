package com.joseph.designpatterns.responsibilitychain.code;

/**
 * 会对请求有阻断作用的责任链模式实现
 * @author Joseph.Liu
 */
public interface IHandler {
    /**
     * 所有的处理器都需要该处理方法
     * @return 处理成功返回true,失败返回false
     */
    boolean handle();
}
