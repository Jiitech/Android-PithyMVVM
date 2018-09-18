package com.wukj.utils;

import android.util.Log;

import com.wukj.lib.tools.EnvironmentVariable;
import com.orhanobut.logger.Logger;

/**
 * 项目名称：
 * 类名称：com.jonyker.common.utils
 * 类描述：
 * 创建人：Jonyker
 * 创建时间：2017/2/30 0030 上午 10:34
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2017/2/30 0030 上午 10:34
 * 修改备注：
 * 版本：V.1.0
 */

public class LogUtils {

    private static final String DEFAULT_TAG = "LogUtils";
    public static boolean isDebug = true;

    public static void d(Class clazz,String printMsg){
        if (isDebug){
            StackTraceElement[] stacks = new Throwable().getStackTrace();
            String sampleName = clazz.getSimpleName();
            Log.e(DEFAULT_TAG,"["+sampleName+"]---: "+printMsg);
        }
    }

    public static void json(String printMsg){
        if (isDebug){
            Logger.json(printMsg);
        }
    }

}
