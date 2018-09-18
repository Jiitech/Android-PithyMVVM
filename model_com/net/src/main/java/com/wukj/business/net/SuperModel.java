package com.wukj.business.net;

import com.wukj.entity.SuperRequestEntity;
import com.wukj.entity.SuperResponseEntity;

/**
 * 项目名称：NetCar_Chauffeur
 * 包名称：com.jonyker.mvp.model.
 * 创建时间：2018/8/7 9:20
 * 作者：Jonyker
 * 博客：http://blog.csdn.net/jerry_137188
 * github：https://github.com/Jiitech
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/7 9:20
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public interface SuperModel {


    /**
     * 基础网络请求
     *
     * @param url
     * @param req
     * @param bdo
     * @return
     */
    void request(String url, SuperRequestEntity req, CommonObserver bdo, Class<? extends SuperResponseEntity> clazz);

}
