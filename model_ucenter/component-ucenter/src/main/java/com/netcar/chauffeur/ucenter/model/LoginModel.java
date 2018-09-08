package com.netcar.chauffeur.ucenter.model;

import android.content.Context;

import com.jonyker.entity.request.LoginRequest;
import com.jonyker.common.net.common.CommonModel;
import com.jonyker.utils.StringUtils;
import com.jonyker.utils.ToastUtils;
import com.jonyker.utils.VerifyUtils;
import com.netcar.chauffeur.ucenter.R;

/**
 * 项目名称：NetCar_Chauffeur
 * 包名称：com.netcar.chauffeur.ucenter.model.
 * 创建时间：2018/8/7 9:26
 * 作者：Jonyker
 * 博客：http://blog.csdn.net/jerry_137188
 * github：https://github.com/Jiitech
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/7 9:26
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public class LoginModel extends CommonModel{


    /**
     * 验证请求参数
     * @param request
     * @return
     */
    public boolean getVerifyParameterable(Context context,LoginRequest request){
        if(StringUtils.isEmpty(request.getAccount())){
            ToastUtils.show(context,context.getString(R.string.mobile_not_empty));
            return false;
        }
        if(StringUtils.isEmpty(request.getPassword())){
            ToastUtils.show(context,context.getString(R.string.passwprd_not_empty));
            return false;
        }
        if(!VerifyUtils.isMobile(request.getAccount())){
            ToastUtils.show(context,context.getString(R.string.mobile_not_lawful));
            return false;
        }
        if(request.getPassword().length()<6){
            ToastUtils.show(context,context.getString(R.string.passwprd_not_lawful_6));
            return false;
        }
        return true;
    }


}
