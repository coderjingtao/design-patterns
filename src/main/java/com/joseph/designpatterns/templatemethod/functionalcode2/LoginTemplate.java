package com.joseph.designpatterns.templatemethod.functionalcode2;

import com.joseph.designpatterns.templatemethod.code.LoginModel;

//这样实现的前提是：接口中只有一个抽象方法的时候
@FunctionalInterface
public interface LoginTemplate {
    /**
     * 公共登陆的控制算法骨架
     * @param vo view object 从前台传来的对象
     * @return
     */
    default boolean login(LoginModel vo){
        //1.
        LoginModel dbo = findLoginUserFromDb(vo.getLoginId());
        if(dbo != null){
            //2.
            String encryptedPwd = this.encryptPwd(vo.getPassword());
            vo.setPassword(encryptedPwd);
            //3.
            return this.match(vo,dbo);
        }
        return false;
    }

    default String encryptPwd(String password){
        System.out.println("encrypt password with MD5");
        return password;
    }

    default boolean match(LoginModel vo, LoginModel dbo){
        if(vo.getLoginId().equals(dbo.getLoginId()) && vo.getPassword().equals(dbo.getPassword())){
            return true;
        }
        return false;
    }

    LoginModel findLoginUserFromDb(String loginId);
}
