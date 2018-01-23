package com.zzax.mall.service;

import com.zzax.mall.domain.Goods;
import com.zzax.mall.domain.Receipt;
import com.zzax.mall.domain.Shop;
import com.zzax.mall.domain.page.PageResult;

import java.util.List;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-26 15:25 星期二
 */
public interface ShopService {

    boolean saveToShop(Goods goods);

    boolean shelveShop(Goods goods);

    /**
     * 获取商品对象列表
     * @param result 分页查询对象
     * @return 分页查询商品
     */
    PageResult<Receipt> getList(PageResult result);

    /**
     * 查询商品列表
     * @return
     */
    List<Shop> getShopList(PageResult result);

    /**
     * 更新某个商品的状态
     * @param id
     * @return
     */
    Shop shelfShop(Integer id);
}
