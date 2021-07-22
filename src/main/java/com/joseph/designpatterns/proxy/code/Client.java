package com.joseph.designpatterns.proxy.code;

import sun.management.resources.agent;

/**
 * 代理模式客户端调用测试类
 * @author Joseph.Liu
 */
public class Client {
    public static void main(String[] args) {
        Tenant joseph = new LongTermTenant("Joseph");
        Tenant tony = new ShortTermTenant("Tony");
        int rent = 100;
        HouseAgent josephAgent = new HouseAgent(joseph);
        josephAgent.payRent(rent);

        HouseAgent tonyAgent = new HouseAgent(tony);
        tonyAgent.payRent(rent);
    }
}
