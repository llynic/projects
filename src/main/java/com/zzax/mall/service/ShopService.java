package com.zzax.mall.service;

import com.zzax.mall.domain.Goods;

import java.util.List;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-26 15:25 星期二
 */
public interface ShopService {

    boolean saveToShop(Goods goods);

    boolean shelveShop(Goods goods);
}
