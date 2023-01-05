package com.joseph.designpatterns.templatemethod.code;

/**
 * 公共登陆的抽象类
 */
public abstract class LoginTemplate {

    /**
     * 公共登陆的控制算法骨架
     * @param vo view object 从前台传来的对象
     * @return
     */
    public final boolean login(LoginModel vo){
        //1.
        LoginModel dbo = this.findLoginUserFromDb(vo.getLoginId());
        if(dbo != null){
            //2.
            String encryptedPwd = this.encryptPwd(vo.getPassword());
            vo.setPassword(encryptedPwd);
            //3.
            return this.match(vo,dbo);
        }
        return false;
    }

    protected abstract LoginModel findLoginUserFromDb(String loginId);

    private String encryptPwd(String password){
        System.out.println("encrypt password with MD5");
        return password;
    }

    private boolean match(LoginModel vo, LoginModel dbo){
        if(vo.getLoginId().equals(dbo.getLoginId()) && vo.getPassword().equals(dbo.getPassword())){
            return true;
        }
        return false;
    }




}
