package com.joseph.designpatterns.templatemethod.functionalcode2;

import com.joseph.designpatterns.templatemethod.code.LoginModel;

/**
 * @author Joseph.Liu
 */
public class Client {

    public static void main(String[] args) {
        //普通用户
        LoginModel user = new LoginModel();
        user.setLoginId("user");
        user.setPassword("test");

        //设置函数式接口中的唯一的抽象方法
        LoginTemplate normalUserLoginTemplate = loginId -> {
            //从普通用户表查询前台用户
            LoginModel dbo = new LoginModel();
            dbo.setLoginId(loginId);
            dbo.setPassword("test");
            return dbo;
        };

        //执行函数式接口
        boolean flag = normalUserLoginTemplate.login(user);
        System.out.println("Normal user can login ? " + flag);
    }
}
