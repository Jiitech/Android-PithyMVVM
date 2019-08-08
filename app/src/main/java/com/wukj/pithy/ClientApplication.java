package com.wukj.pithy;

import com.wukj.lib.delegate.ApplicationDelegate;
import com.wukj.business.ucenter.app.UCenterApplication;

/**
 * 项目名称：NetCar_Chauffeur
 * 包名称：com.xintuyun.netcar.chauffeur.
 * 创建时间：2018/8/7 10:40
 * 作者：Jonyker
 * 博客：https://www.jianshu.com/u/07642698e7f4
 * github：https://github.com/Jonyker
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/7 10:40
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public class ClientApplication extends ApplicationDelegate {
    @Override
    public int getLevel() {
        return LEVEL_APP;
    }

    @Override
    public Class[] subDelegates() {
        return new Class[] {UCenterApplication.class};
    }

    @Override
    public void onCreateDelegate() {

    }
}
