package com.joseph.designpatterns.proxy.code;

/**
 * 代理模式的公共接口类：租客行为
 * 长期租客LongTermTenant类和短期租客ShortTermTenant类和房屋中介Agent代理类都继承该租客接口
 * 然后由Agent代理房客交付房租，形成静态代理模式
 * @author Joseph.Liu
 */
public interface Tenant {
    /**
     * 交房租
     * @param rent 租金
     */
    void payRent(int rent);
}
