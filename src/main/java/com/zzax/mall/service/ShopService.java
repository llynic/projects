package com.zzax.mall.service;

import com.zzax.mall.domain.Shopinfo;

import java.util.List;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-26 15:25 星期二
 */
public interface ShopService {
    //获取所有商品
    List<Shopinfo> getShops();

    //
    Shopinfo getShop(String code);
}
