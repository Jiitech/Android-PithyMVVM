package com.wukj.ui.common.res;


import android.content.Context;
import android.content.SharedPreferences;

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
