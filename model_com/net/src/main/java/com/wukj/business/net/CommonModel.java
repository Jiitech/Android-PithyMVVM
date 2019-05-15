package com.wukj.business.net;

import android.text.TextUtils;
import android.util.Base64;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.error.VolleyError;
import com.android.volley.request.StringRequest;
import com.google.gson.Gson;
import com.wukj.business.net.entity.SuperRequestEntity;
import com.wukj.business.net.entity.SuperResponseEntity;
import com.wukj.business.net.utils.VolleyUtils;
import com.wukj.utils.LogUtils;
import com.wukj.utils.safety.AndroidDes3Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：NetCar_Chauffeur
 * 包名称：com.jonyker.mvp.model.
 * 创建时间：2018/8/7 9:32
 * 作者：Jonyker
 * 博客：http://blog.csdn.net/jerry_137188
 * github：https://github.com/Jonyker
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/7 9:32
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public abstract class CommonModel implements SuperModel {


    @Override
    public void request(String url, final SuperRequestEntity req, CommonObserver bdo, Class<? extends SuperResponseEntity> clazz) {
        RequestQueue queue = VolleyUtils.getRequestQueue();
        StringRequest request = new StringRequest(Request.Method.POST,
                url,
                createMyReqSuccessListener(bdo, clazz),
                createMyReqErrorListener(bdo));
        Map<String, String> params = new HashMap<>();
        LogUtils.d(this.getClass(), "-getDesJson-原文:" + getJSON(req));
        LogUtils.d(this.getClass(), "-getDesJson-加密:" + getDesJson(req));
        params.put(RequestCont.PARAM_KEY, getDesJson(req));
        request.setParams(params);
        queue.add(request);
    }

    private Response.Listener<String> createMyReqSuccessListener(final CommonObserver dataObserver, final Class<? extends SuperResponseEntity> clazz) {
        return new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                String  decodeBase46 = new String(Base64.decode(response.getBytes(), Base64.DEFAULT));
                LogUtils.d(this.getClass(),decodeBase46);
                SuperResponseEntity responseEntity = gson.fromJson(decodeBase46, clazz);
                if(responseEntity.getCode() == SuperResponseEntity.SUCCESS_CODE){
                    dataObserver.onSuccess(responseEntity);
                } else {
                    if (!TextUtils.isEmpty(responseEntity.getMessage())){
                        dataObserver.onFailure(responseEntity.getMessage());
                    }
                }
            }
        };
    }

    private Response.ErrorListener createMyReqErrorListener(final CommonObserver dataObserver) {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                LogUtils.d(this.getClass(), "-statusCode：" + error.networkResponse.statusCode+" --errorMessage:"+error.getMessage());
                dataObserver.onFailure(error.getMessage());
            }
        };
    }

    private String getDesJson(SuperRequestEntity req) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(req);
        return AndroidDes3Utils.encode(jsonString,RequestCont.DES_KEY);
    }

    private String getJSON(SuperRequestEntity req) {
        Gson gson = new Gson();
        return gson.toJson(req);
    }

}
