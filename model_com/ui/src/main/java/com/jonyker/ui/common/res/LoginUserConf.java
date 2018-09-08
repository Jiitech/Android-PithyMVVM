package com.jonyker.ui.common.res;


import android.content.Context;
import android.content.SharedPreferences;

/**
 * 项目名称：
 * 类名称：com.xintuyun.netcar.steamer.common.sp
 * 类描述：
 *
 *
 * 创建人：Jonyker
 * 创建时间：2017/9/20 0020 下午 3:51
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2017/9/20 0020 下午 3:51
 * 修改备注：
 * 版本：V.1.0
 */

public class LoginUserConf {

    private static String CONFIG_NAME = "chauffeur_config";                         //配合文件的名称
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
