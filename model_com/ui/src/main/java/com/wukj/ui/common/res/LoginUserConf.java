package com.wukj.ui.common.res;


import android.content.Context;
import android.content.SharedPreferences;

/**
 * 项目名称：PithyMVVM
 * 创建时间：2018/9/18 下午6:41
 * 作者：Jonyker
 * 博客：https://www.jianshu.com/u/07642698e7f4
 * github：https://github.com/Jonyker
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/9/18 下午6:41
 * 备注：
 * 版本：V.1.0
 * 描述：
 * 1.
 * 2.
 * 3.
 */
public class LoginUserConf {

    private static String CONFIG_NAME = "app_config";                         //配合文件的名称
    private static LoginUserConf userConf;                                          //Loginuserf对象
    private SharedPreferences preference;                                           //xml中用户id的key


    private static final String USER_MID = "USER_TOKEN";                              //xml中用户TOKEN的key


    public static LoginUserConf instance(Context context){
        if (userConf == null){
            userConf = new LoginUserConf(context);
        }
        return userConf;
    }

    private LoginUserConf(Context context){
        preference = context.getSharedPreferences(CONFIG_NAME, Context.MODE_PRIVATE);
    }

    /**
     * 读取用户token
     * @return
     */
    public String getToken(){
        return preference.getString(USER_MID, "");
    }

    /**
     * 保存用户token
     * @param mid
     */
    public void setToken(String mid){
        preference.edit().putString(USER_MID, mid).commit();
        return;
    }





}
