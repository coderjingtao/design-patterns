package com.joseph.designpatterns.proxy.code;

/**
 * 房屋中介类，即租客的代理类，代理租客的行为，并对租金收取一定比例的抽成
 * @author Joseph.Liu
 */
public class HouseAgent implements Tenant {

    private Tenant tenant;
    /**
     * 房租代理费
     */
    private int proxyAmount;

    public HouseAgent(Tenant tenant) {
        this.tenant = tenant;
        if(tenant.getClass() == LongTermTenant.class){
            proxyAmount = 1;
        }
        if(tenant.getClass() == ShortTermTenant.class){
            proxyAmount = 2;
        }
    }

    @Override
    public void payRent(int rent) {
        System.out.println("中介扣减代理费: "+ proxyAmount);
        int realRent = rent - proxyAmount;
        tenant.payRent(realRent);
    }
}