package com.joseph.designpatterns.proxy.code;

/**
 * @author Joseph.Liu
 */
public class ShortTermTenant implements Tenant {
    private String name;

    public ShortTermTenant(String name) {
        this.name = name;
    }

    @Override
    public void payRent(int rent) {
        System.out.println(String.format("短期房客: [%s] 交租金: [%d] 元.",name,rent));
    }
}
