package com.zzax.mall.util;

/**
 * @Description 字符串的工具类
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 14:48 星期五
 */
public class StringUtil {

    public static boolean isEmpty(String value){
        if (null == value || "".equals(value.trim())){
            return true;
        }
        return false;
    }
}
