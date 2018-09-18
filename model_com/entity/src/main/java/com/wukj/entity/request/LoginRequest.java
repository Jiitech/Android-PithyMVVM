package com.wukj.entity.request;


import com.wukj.entity.SuperRequestEntity;

/**
 * 项目名称：NetCar_Chauffeur
 * 包名称：com.netcar.chauffeur.entity.request.
 * 创建时间：2018/8/7 9:59
 * 作者：Jonyker
 * 博客：http://blog.csdn.net/jerry_137188
 * github：https://github.com/Jiitech
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/7 9:59
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public class LoginRequest extends SuperRequestEntity {

    // type=1是密码登录2是验证码登录
    public static String TYPE_1 = "1";
    public static String TYPE_2 = "2";
    private String account;
    private String password;
    private String verifyCode;
    private String type;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
