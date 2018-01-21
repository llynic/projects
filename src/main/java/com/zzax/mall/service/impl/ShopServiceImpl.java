package com.zzax.mall.service.impl;

import com.zzax.mall.domain.Goods;
import com.zzax.mall.domain.Shop;
import com.zzax.mall.mapper.ShopMapper;
import com.zzax.mall.service.ShopService;
import com.zzax.mall.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2018-01-21 16:29 星期日
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public boolean saveToShop(Goods goods) {
        if (null != goods) {
            Shop shop = new Shop();
            shop.setCreateDate(new Date());
            shop.setCode(CodeUtil.createShopCode());
            shop.setCreator("user");
            shop.setEditor("user");
            shop.setPrice(goods.getPrice());
            shop.setReceiptId(goods.getReceiptId());
            shop.setStatus("0");
            shop.setTitle("商品1");
            shop.setUpdateDate(new Date());
            shop.setUserId(1);
            shop.setImage("/images/car/luhu1.png");
            shopMapper.insert(shop);
            return true;
        } else {
            return false;
            //TODO 待完成
        }
    }

    /**
     * 直接上架商品
     * @param goods
     * @return
     */
    @Override
    public boolean shelveShop(Goods goods) {
        if (null != goods) {
            Shop shop = new Shop();
            shop.setCreateDate(new Date());
            shop.setCode(CodeUtil.createShopCode());
            shop.setCreator("user");
            shop.setEditor("user");
            shop.setPrice(goods.getPrice());
            shop.setReceiptId(goods.getReceiptId());
            shop.setStatus("1");
            shop.setTitle("商品1");
            shop.setUpdateDate(new Date());
            shop.setUserId(1);
            shop.setImage("/images/car/luhu1.png");
            shopMapper.insert(shop);
            return true;
        } else {
            return false;
            //TODO 待完成
        }
    }
}
