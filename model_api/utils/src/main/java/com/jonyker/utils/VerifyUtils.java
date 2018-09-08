package com.jonyker.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 项目名称：
 * 类名称：com.xintuyun.netcar.steamer.common.utils
 * 类描述：
 * 创建人：Jonyker
 * 创建时间：2017/9/21 0021 下午 3:45
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2017/9/21 0021 下午 3:45
 * 修改备注：
 * 版本：V.1.0
 */

public class VerifyUtils {


    /**
     * 验证身份证是否正确
     * @param identity
     * @return
     */
    public static boolean isIdentity(String identity) {
        // 记录错误信息
        String errorInfo = "";
        String[] ValCodeArr = { "1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2" };
        String[] Wi = { "7", "9", "10", "5", "8", "4", "2", "1", "6", "3", "7", "9", "10", "5", "8", "4", "2" };
        String Ai = "";
        // 身份证最后一位小些改成大写
        String tempIDStr = identity;
        if (null != tempIDStr && tempIDStr.length() == 18) {
            String last = tempIDStr.substring(identity.length() - 1, tempIDStr.length());
            if (!isNumeric(last)) {
                String case1 = last.toUpperCase();
                tempIDStr = tempIDStr.substring(0, 17) + case1;
            }
        }
        if (tempIDStr.length() != 15 && tempIDStr.length() != 18) {
            errorInfo = "身份证号码长度应该为15位或18位。";
            return false;
        }
        // 数字 除最后以为都为数字
        if (tempIDStr.length() == 18) {
            Ai = tempIDStr.substring(0, 17);
        } else if (tempIDStr.length() == 15) {
            Ai = tempIDStr.substring(0, 6) + "19" + tempIDStr.substring(6, 15);
        }
        if (isNumeric(Ai) == false) {
            errorInfo = "身份证15位号码都应为数字 ; 18位号码除最后一位外，都应为数字。";
            return false;
        }
        // 出生年月是否有效
        // 年份
        String strYear = Ai.substring(6, 10);
        // 月份
        String strMonth = Ai.substring(10, 12);
        // 月份
        String strDay = Ai.substring(12, 14);
        if (isDate(strYear + "-" + strMonth + "-" + strDay) == false) {
            errorInfo = "身份证生日无效。";
            return false;
        }
        GregorianCalendar gc = new GregorianCalendar();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if ((gc.get(Calendar.YEAR) - Integer.parseInt(strYear)) > 150
                    || (gc.getTime().getTime() - s.parse(strYear + "-" + strMonth + "-" + strDay).getTime()) < 0) {
                errorInfo = "身份证生日不在有效范围。";
                return false;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        if (Integer.parseInt(strMonth) > 12 || Integer.parseInt(strMonth) < 1) {
            errorInfo = "身份证月份无效";
            return false;
        }
        if (Integer.parseInt(strDay) > 31 || Integer.parseInt(strDay) < 1) {
            errorInfo = "身份证日期无效";
            return false;
        }
        Map<String, String> h = getAreaCode();
        if (h.get(Ai.substring(0, 2)) == null) {
            errorInfo = "身份证地区编码错误。";
            return false;
        }
        // 判断最后一位的值
        int TotalmulAiWi = 0;
        for (int i = 0; i < 17; i++) {
            TotalmulAiWi = TotalmulAiWi + Integer.parseInt(String.valueOf(Ai.charAt(i))) * Integer.parseInt(Wi[i]);
        }
        int modValue = TotalmulAiWi % 11;
        String strVerifyCode = ValCodeArr[modValue];
        Ai = Ai + strVerifyCode;
        if (tempIDStr.length() == 18) {
            if (Ai.equals(tempIDStr) == false) {
                errorInfo = "身份证无效，不是合法的身份证号码";
                return false;
            }
        }
        return true;
    }


    /**
     * 手机号验证
     * @author ：shijing
     * 2016年12月5日下午4:34:46
     * @param  mobile
     * @return 验证通过返回true
     */
    public static boolean isMobile(final String mobile) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
        m = p.matcher(mobile);
        b = m.matches();
        return b;
    }

    /**
     * 判断是否包含数字，字母。只可以是汉字
     * @param str
     * @return
     */
    public static boolean isMatchExceptHz(String str) {
        if (Pattern.compile("(?i)[a-zA-Z0-9]").matcher(str).find()) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * 功能：设置地区编码
     * @return Hashtable 对象
     */
    private static Map<String, String> getAreaCode() {
        Map<String, String> hashtable = new HashMap<String, String>();
        hashtable.put("11", "北京");
        hashtable.put("12", "天津");
        hashtable.put("13", "河北");
        hashtable.put("14", "山西");
        hashtable.put("15", "内蒙古");
        hashtable.put("21", "辽宁");
        hashtable.put("22", "吉林");
        hashtable.put("23", "黑龙江");
        hashtable.put("31", "上海");
        hashtable.put("32", "江苏");
        hashtable.put("33", "浙江");
        hashtable.put("34", "安徽");
        hashtable.put("35", "福建");
        hashtable.put("36", "江西");
        hashtable.put("37", "山东");
        hashtable.put("41", "河南");
        hashtable.put("42", "湖北");
        hashtable.put("43", "湖南");
        hashtable.put("44", "广东");
        hashtable.put("45", "广西");
        hashtable.put("46", "海南");
        hashtable.put("50", "重庆");
        hashtable.put("51", "四川");
        hashtable.put("52", "贵州");
        hashtable.put("53", "云南");
        hashtable.put("54", "西藏");
        hashtable.put("61", "陕西");
        hashtable.put("62", "甘肃");
        hashtable.put("63", "青海");
        hashtable.put("64", "宁夏");
        hashtable.put("65", "新疆");
        hashtable.put("71", "台湾");
        hashtable.put("81", "香港");
        hashtable.put("82", "澳门");
        hashtable.put("91", "国外");
        return hashtable;
    }

    /**
     * 功能：判断字符串是否为数字
     *
     * @param str
     * @return
     */
    private static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (isNum.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 功能：判断字符串是否为日期格式
     *
     * @param strDate
     * @return
     */
    public static boolean isDate(String strDate) {
        String regxStr = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$";
        Pattern pattern = Pattern.compile(regxStr);
        Matcher m = pattern.matcher(strDate);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 格式化身份账号
     * @param str
     * @return
     */
    public static String certificateFormat(String str) {
        String a = "";
        if (!StringUtils.isEmpty(str) && str.length() > 8) {
            a = str.substring(0, 3) + "**********" + str.substring(str.length() - 3, str.length());
        }
        return a;
    }

    /**
     * 格式化手机号
     * @param mobile
     * @return
     */
    public static String mobileFormat(String mobile){
        String a = "";
        if (!StringUtils.isEmpty(mobile) && mobile.length() == 11) {
            a = mobile.substring(0, 3) + "****" + mobile.substring(mobile.length() - 4, mobile.length());
        }
        return a;
    }
}
