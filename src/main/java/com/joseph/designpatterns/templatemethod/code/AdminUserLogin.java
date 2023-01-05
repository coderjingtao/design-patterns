package com.joseph.designpatterns.templatemethod.code;

public class AdminUserLogin extends LoginTemplate{
    @Override
    protected LoginModel findLoginUserFromDb(String loginId) {
        //从管理员表查询后台用户
        LoginModel dbo = new LoginModel();
        dbo.setLoginId(loginId);
        dbo.setPassword("test");
        return dbo;
    }
}
