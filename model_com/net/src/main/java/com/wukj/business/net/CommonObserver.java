package com.wukj.business.net;

import com.wukj.business.net.entity.SuperResponseEntity;

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
 * 1.
 * 2.
 * 3.
 */
public interface CommonObserver<RES extends SuperResponseEntity> {

    /**
     * 成功回调
     * @param res
     */
    void onSuccess(RES res);

    /**
     * 失败回调
     * @param error_msg
     */
    void onFailure(String error_msg);

}
