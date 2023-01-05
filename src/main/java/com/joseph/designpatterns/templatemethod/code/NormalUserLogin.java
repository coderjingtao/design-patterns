package com.joseph.designpatterns.templatemethod.code;

public class NormalUserLogin extends LoginTemplate{
    @Override
    protected LoginModel findLoginUserFromDb(String loginId) {
        //从普通用户表查询登陆用户
        LoginModel dbo = new LoginModel();
        dbo.setLoginId(loginId);
        dbo.setPassword("test");
        return dbo;
    }
}
