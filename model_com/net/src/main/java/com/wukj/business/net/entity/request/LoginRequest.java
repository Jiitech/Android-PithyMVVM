package com.wukj.business.net.entity.request;



import com.wukj.business.net.entity.SuperRequestEntity;

/**
 * 项目名称：Android-Scaffold
 * 创建时间：2018/11/2 上午 11:19
 * 作者：Jonyker
 * 简书：https://www.jianshu.com/u/07642698e7f4
 * github：https://github.com/Jonyker
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/11/2 下午 05:07
 * 备注：
 * 版本：V.1.0
 * 描述：
 * 1.实现IModel目的是在使用theMVP的时候，进行数据绑定
 * 2.
 * 3.
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
