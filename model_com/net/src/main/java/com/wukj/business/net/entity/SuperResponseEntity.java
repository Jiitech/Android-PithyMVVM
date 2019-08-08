package com.wukj.business.net.entity;


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
public class SuperResponseEntity extends SuperEntity {

    /**
     * 成功的状态码
     */
    public final static int SUCCESS_CODE = 200;

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
