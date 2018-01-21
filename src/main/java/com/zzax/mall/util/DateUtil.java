package com.zzax.mall.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description 日期工具类
 * @Created By : wangzhenjia
 * @DATE 2018-01-21 15:22 星期日
 */
public class DateUtil {
    private static final ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>();
    private static final Object object = new Object();
    private static SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat formatter3 = new SimpleDateFormat("yyyyMMddHHmmssSSS");


    /**
     * 获取现在时间
     * @return 字符串类型的日期
     */
    public static String getNow() {
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter2.format(new Date());
    }


    /**
     * 获取现在时间
     * @return 连续数字形式的日期
     */
    public static String getTime() {
        return formatter3.format(new Date());
    }


    public static void main(String[] args) {
        System.out.println(getTime());
        System.out.println(getNow());
    }


}
