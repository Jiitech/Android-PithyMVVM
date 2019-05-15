package com.wukj.business.net.entity;


/**
 * 项目名称：${project_name}
 * 包名称：${package_name}.${file_name}
 * 创建时间：2018/8/2 15:35
 * 作者：Jonyker
 * 博客：http://blog.csdn.net/jerry_137188
 * github：https://github.com/Jonyker
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/2 15:35
 * 备注：
 * 版本：V.1.0
 * 描述：
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
