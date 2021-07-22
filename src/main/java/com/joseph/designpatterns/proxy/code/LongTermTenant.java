package com.joseph.designpatterns.proxy.code;

/**
 * @author Joseph.Liu
 */
public class LongTermTenant implements Tenant {

    private String name;

    public LongTermTenant(String name) {
        this.name = name;
    }

    @Override
    public void payRent(int rent) {
        System.out.println(String.format("长期房客: [%s] 交租金: [%d] 元.",name,rent));
    }
}
