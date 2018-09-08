package com.netcar.chauffeur.ucenter.activity;


import android.view.View;

import com.jonyker.entity.BaseResponseEntity;
import com.jonyker.entity.request.LoginRequest;
import com.jonyker.entity.response.LoginEntity;
import com.jonyker.ui.common.res.LoginUserConf;
import com.jonyker.common.net.common.BaseDataObserver;
import com.jonyker.ui.common.CommonUIActivity;

import com.jonyker.utils.StringUtils;
import com.jonyker.utils.ToastUtils;
import com.jonyker.utils.LogUtils;
import com.kymjs.themvp.databind.DataBinder;
import com.netcar.chauffeur.ucenter.R;
import com.netcar.chauffeur.ucenter.databinder.LoginDataBinder;
import com.netcar.chauffeur.ucenter.delegate.LoginDelegate;
import com.netcar.chauffeur.ucenter.model.LoginModel;
import com.netcar.chauffeur.ucenter.urls.RequestURLs;

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
        mLoginModel.request(RequestURLs.getLoginURL(), request, new BaseDataObserver<BaseResponseEntity>() {
            @Override
            public void onSuccess(BaseResponseEntity response) {

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
                    ToastUtils.show(LoginActivity.this,error_msg);
                }
            }
        }, LoginEntity.class);

    }




}
