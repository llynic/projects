package com.zzax.mall.util;

/**
 * @Description 商品/订单编号生成工具类
 * @Created By : wangzhenjia
 * @DATE 2018-01-21 15:16 星期日
 */
public class CodeUtil {

    public static String createShopCode(){
        return "SP"+ DateUtil.getTime();
    }

}
