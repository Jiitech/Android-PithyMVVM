package com.jonyker.utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 项目名称：dev_BoatTicket_debug_v_1.0
 * 类名称：com.xintuyun.roadcloud.utils
 * 类描述：
 * 创建人：Jonyker
 * 创建时间：2017/6/21 0021 下午 5:57
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2017/6/21 0021 下午 5:57
 * 修改备注：
 * 版本：V.1.0
 */

public class StringUtils {


    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if ("".equals(str) || null == str || "null".equals(str)) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * 判断list是否为空，空返回true
     * @param list
     * @return
     */
    public static boolean listIsEmpty(List list) {
        if (null != list && !list.isEmpty())
            return false;
        return true;
    }


    /**
     * 特殊字符过滤
     * @param str
     * @return
     */
    public static String stringFilter(String str) {
        String regEx = "[`~!@#$^&*()=|{}':;',\"\\[\\].<>~！@#￥……&*（）&;—|{}【】《》‘；：”“'。，、？]"; // 要过滤掉的字符
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }

    /**
     * 〈身份证中间显示****〉
     */
    public static String certificateFormat(String str) {
        String a = "";
        if (!isEmpty(str) && str.length() > 8) {
            a = str.substring(0, 5) + "********" + str.substring(str.length() - 3, str.length());
        }
        return a;
    }
}
