package com.joseph.designpatterns.templatemethod.functionalcode;

import com.joseph.designpatterns.templatemethod.code.LoginModel;

import java.util.function.Function;

public final class LoginFunctions {
    private LoginFunctions(){
        throw new AssertionError();
    }
    public static Function<String, LoginModel> FIND_NORMAL_USER_BY_ID = loginId -> {
        //从普通用户表查询前台用户
        LoginModel dbo = new LoginModel();
        dbo.setLoginId(loginId);
        dbo.setPassword("test");
        return dbo;
    };
    public static Function<String, LoginModel> FIND_ADMIN_USER_BY_ID = loginId -> {
        //从管理员表查询后台用户
        LoginModel dbo = new LoginModel();
        dbo.setLoginId(loginId);
        dbo.setPassword("test");
        return dbo;
    };
}
