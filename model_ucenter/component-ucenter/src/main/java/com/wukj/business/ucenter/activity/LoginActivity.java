package com.wukj.business.ucenter.activity;


import android.view.View;

import com.wukj.business.ucenter.R;
import com.wukj.business.net.entity.SuperResponseEntity;
import com.wukj.business.net.entity.request.LoginRequest;
import com.wukj.business.net.entity.response.LoginEntity;
import com.wukj.lib.tools.ToastTools;
import com.wukj.ui.common.res.LoginUserConf;
import com.wukj.business.net.CommonObserver;
import com.wukj.ui.common.activity.CommonUIActivity;

import com.wukj.utils.StringUtils;
import com.wukj.utils.LogUtils;
import com.kymjs.themvp.databind.DataBinder;
import com.wukj.business.ucenter.databinder.LoginDataBinder;
import com.wukj.business.ucenter.delegate.LoginDelegate;
import com.wukj.business.ucenter.model.LoginModel;
import com.wukj.business.ucenter.urls.RequestURLs;

public class LoginActivity extends CommonUIActivity<LoginDelegate> implements View.OnClickListener {


    private LoginModel mLoginModel = new LoginModel();

    @Override
    protected Class<LoginDelegate> getDelegateClass() {
        return LoginDelegate.class;
    }

    @Override
    public DataBinder getDataBinder() {
        return new LoginDataBinder();
    }

    @Override
    protected void bindEvenListener() {
        super.bindEvenListener();
        //可以同时对多个控件设置同一个点击事件,后面id参数可以传多个
        viewDelegate.setOnClickListener(this, R.id.login_btn_login);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_btn_login){
            LogUtils.d(this.getClass(),"------------登陆-------------");
            request();
        }
    }


    private void request(){

        LoginRequest request = new LoginRequest();
        request.setAccount(viewDelegate.getEditMobile());
        request.setPassword(viewDelegate.getEditPwd());
        request.setType(LoginRequest.TYPE_1);
        if (!mLoginModel.getVerifyParameterable(this,request)){
            return;
        }
        mLoginModel.request(RequestURLs.getLoginURL(), request, new CommonObserver<SuperResponseEntity>() {
            @Override
            public void onSuccess(SuperResponseEntity response) {

                if (response instanceof LoginEntity){
                    LoginEntity entity = (LoginEntity) response;
                    LogUtils.d(this.getClass(), "-onSuccess-:" + entity.getToken());
                    LoginUserConf.instance(LoginActivity.this).setToken(entity.getToken());
                } else {
                    LogUtils.d(this.getClass(), "-onSuccess-:" + response.getCode());
                }

            }

            @Override
            public void onFailure(String error_msg) {
                if (!StringUtils.isEmpty(error_msg)){
                    ToastTools.show(error_msg);
                }
            }
        }, LoginEntity.class);

    }




}
