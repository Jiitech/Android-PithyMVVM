package com.wukj.business.ucenter.delegate;

import android.text.Editable;
import android.text.InputType;
import android.text.Selection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kymjs.themvp.view.AppDelegate;
import com.wukj.business.ucenter.R;
import com.wukj.business.ucenter.R2;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 项目名称：${project_name}
 * 包名称：${package_name}.${file_name}
 * 创建时间：2018/8/2 16:22
 * 作者：Jonyker
 * 博客：http://blog.csdn.net/jerry_137188
 * github：https://github.com/Jiitech
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/2 16:22
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public class LoginDelegate extends AppDelegate {

    @BindView(R2.id.login_mobile_et)
    EditText mLoginMobileEdit;
    @BindView(R2.id.login_pwd_et)
    EditText mLoginPwdEdit;
    @BindView(R2.id.login_btn_login)
    Button mLoginBtnLogin;
    @BindView(R2.id.login_pwd_ishow)
    TextView mLoginPwdIshow;
    @BindView(R2.id.login_forget_pwd_tv)
    TextView mLoginForgetPwdTv;

    private String mMobile;
    private String mPwd;
    private boolean isShow = true;

    @Override
    public int getRootLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initWidget() {
        super.initWidget();


    }


    @OnClick(R2.id.login_btn_login)
    public void onViewClicked() {

        mMobile = mLoginMobileEdit.getText().toString();
        mPwd = mLoginPwdEdit.getText().toString();

    }

    @OnClick(R2.id.login_pwd_ishow)
    public void onShowHidePwd() {
        if (isShow) {
            // 显示密码
            mLoginPwdEdit.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            Editable etext = mLoginPwdEdit.getText();
            Selection.setSelection(etext, etext.length());
            mLoginPwdIshow.setText(R.string.login_pwd_hide_text);
        } else {
            // 隐藏密码
            mLoginPwdEdit.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            Editable etext = mLoginPwdEdit.getText();
            Selection.setSelection(etext, etext.length());
            mLoginPwdIshow.setText(R.string.login_pwd_show_text);
        }
        isShow = !isShow;
    }

    /**
     * 获取手机号
     *
     * @return
     */
    public String getEditMobile() {
        return mLoginMobileEdit.getText().toString();
    }

    /**
     * 获取验证码
     *
     * @return
     */
    public String getEditPwd() {
        return mLoginPwdEdit.getText().toString();
    }


    @OnClick(R2.id.login_forget_pwd_tv)
    public void onForgetPwd() {

    }



}
