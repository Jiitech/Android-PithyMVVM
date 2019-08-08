package com.wukj.ui.common.activity;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.android.volley.request.SimpleMultiPartRequest;
import com.android.volley.request.StringRequest;
import com.wukj.ui.common.template.SuperTemplate;

import java.util.Map;

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
public class SuperActivity extends AppCompatActivity implements SuperTemplate {

    @Override
    public void showProgressLoading() {

    }

    @Override
    public void showProgressLoading(boolean isOperation) {

    }

    @Override
    public void dismissProgress() {

    }

    @Override
    public StringRequest requestGet(String url, Map<String, String> headMap) {
        return null;
    }

    @Override
    public StringRequest requestGet(String url, Map<String, String> headMap, int eventCode) {
        return null;
    }

    @Override
    public StringRequest requestPost(String url, Map<String, String> headMap, byte[] postData) {
        return null;
    }

    @Override
    public StringRequest requestPost(String url, Map<String, String> headMap, byte[] postData, int eventCode) {
        return null;
    }

    @Override
    public StringRequest requestPost(String url, Map<String, String> headMap, String postData) {
        return null;
    }

    @Override
    public StringRequest requestPost(String url, Map<String, String> headMap, String postData, int eventCode) {
        return null;
    }

    @Override
    public SimpleMultiPartRequest requestUploadFileText(String filePath) {
        return null;
    }

    @Override
    public void onInitView() throws Exception {

    }

    @Override
    public void onInitValue() throws Exception {

    }

    @Override
    public View customTitleView(LayoutInflater inflater) {
        return null;
    }

    @Override
    public View customViewRight(View view) {
        return null;
    }

    @Override
    public void onRightClickListener(View view) {

    }

    @Override
    public View customContentView() {
        return null;
    }

    @Override
    public AlertDialog showDialog() {
        return null;
    }

    @Override
    public void dismissDialog() {

    }

    @Override
    public void onClickDialogLeftButton(View v) {

    }

    @Override
    public void onClickDialogRightButton(View v) {

    }







}
