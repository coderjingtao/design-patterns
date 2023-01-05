package com.joseph.designpatterns.templatemethod.code;

public class Client {
    public static void main(String[] args) {
        //管理人员
        LoginModel admin = new LoginModel();
        admin.setLoginId("admin");
        admin.setPassword("test");

        LoginTemplate lt = new AdminUserLogin();
        boolean flag = lt.login(admin);
        System.out.println("Admin user can login ? " + flag);

        //普通用户
        LoginModel user = new LoginModel();
        user.setLoginId("user");
        user.setPassword("test");

        LoginTemplate lt2 = new NormalUserLogin();
        boolean flag2 = lt2.login(user);
        System.out.println("Normal user can login ? " + flag2);
    }
}
