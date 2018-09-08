package com.netcar.chauffeur.ucenter.application;

import com.jonyker.common.net.utils.MyVolley;
import com.jonyker.lib.BaseApplication;
import com.jonyker.lib.delegate.ApplicationDelegate;

/**
 * 项目名称：NetCar_Chauffeur
 * 包名称：com.netcar.chauffeur.ucenter.application.
 * 创建时间：2018/8/7 10:55
 * 作者：Jonyker
 * 博客：http://blog.csdn.net/jerry_137188
 * github：https://github.com/Jiitech
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/7 10:55
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public class UCenterApplication extends ApplicationDelegate {
    @Override
    public int getLevel() {
        return LEVEL_BIZ;
    }

    @Override
    public Class[] subDelegates() {
        return new Class[] {BaseApplication.class};
    }

    @Override
    public void onCreateDelegate() {
        MyVolley.init(getApplicationContext());

    }




}
