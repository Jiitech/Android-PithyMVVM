package com.wukj.business.ucenter.urls;

/**
 * 项目名称：NetCar_Chauffeur
 * 包名称：com.jonyker.common.net.urls.
 * 创建时间：2018/8/3 15:29
 * 作者：Jonyker
 * 博客：https://www.jianshu.com/u/07642698e7f4
 * github：https://github.com/Jonyker
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/3 15:29
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public class RequestURLs {

    public static final String BASE_IP = "http://192.168.254.109:8080/";

    /**
     * 登陆
     * @return
     */
    public static String getLoginURL(){
        return BASE_IP + "api/v1_001/netCarAuth/driverLogin";
    }


}
