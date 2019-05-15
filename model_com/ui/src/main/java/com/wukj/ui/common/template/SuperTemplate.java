package com.wukj.ui.common.template;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

import com.android.volley.request.SimpleMultiPartRequest;
import com.android.volley.request.StringRequest;

import java.util.Map;

/**
 * 项目名称：PithyMVVM
 * 创建时间：2018/9/18 下午6:46
 * 作者：Jonyker
 * 博客：https://www.jianshu.com/u/07642698e7f4
 * github：https://github.com/Jonyker
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/9/18 下午6:46
 * 备注：
 * 版本：V.1.0
 * 描述：
 * 1.
 * 2.
 * 3.
 */
public interface SuperTemplate {

    /**
     * 显示加载过程
     */
    public void showProgressLoading();
    /**
     * 显示加载过程，
     * @param isOperation true加载过程中可以操作 false不可操作
     */
    public void showProgressLoading(boolean isOperation);
    /**
     * 隐藏加载框
     * 如果显示到结束低于1秒时间 则延迟1秒关闭，避免一种闪避效果
     */
    public  void dismissProgress();
    /**
     * 网络请求
     * @throws Exception
     */
    public StringRequest requestGet(String url, Map<String, String> headMap);
    public StringRequest requestGet(String url, Map<String, String> headMap, int eventCode);
    public StringRequest requestPost(String url, Map<String, String> headMap, byte[] postData);
    public StringRequest requestPost(String url, Map<String, String> headMap, byte[] postData, int eventCode);
    public StringRequest requestPost(String url, Map<String, String> headMap, String postData);
    public StringRequest requestPost(String url, Map<String, String> headMap, String postData, int eventCode);
    /**
     * 图片上传
     */
    public SimpleMultiPartRequest requestUploadFileText(String filePath);
    /**
     * 控件初始化
     */
    public void onInitView() throws Exception;
    public void onInitValue() throws Exception;
    public View customTitleView(LayoutInflater inflater);
    /**
     * 自定义右边
     */
    public View customViewRight(View view);
    /**
     * 对右边元素的click事件监听
     */
    public void onRightClickListener(View view);
    /**
     * 自定义布局
     */
    public View customContentView();
    /**
     * 显示提示框
     */
    public AlertDialog showDialog();
    // public DialogSetting getDialogSetting(DialogSetting setting);
    public void dismissDialog();
    public void onClickDialogLeftButton(View v);
    public void onClickDialogRightButton(View v);

}
