package com.joseph.designpatterns.templatemethod.functionalcode;

import com.joseph.designpatterns.templatemethod.code.LoginModel;

public class Client {
    public static void main(String[] args) {
        //管理人员
        LoginModel admin = new LoginModel();
        admin.setLoginId("admin");
        admin.setPassword("test");

        //将从数据库查询管理人员的逻辑直接写出来
        LoginTemplate lt = new LoginTemplate();
        boolean flag = lt.login(admin, loginId -> {
            //从管理员表查询后台用户
            LoginModel dbo = new LoginModel();
            dbo.setLoginId(loginId);
            dbo.setPassword("test");
            return dbo;
        });
        System.out.println("Admin user can login ? " + flag);

        //普通用户
        LoginModel user = new LoginModel();
        user.setLoginId("user");
        user.setPassword("test");

        //引用预先定义好的从数据库查询普通用户的逻辑
        boolean flag2 = lt.login(user, LoginFunctions.FIND_NORMAL_USER_BY_ID);
        System.out.println("Normal user can login ? " + flag2);

    }
}
