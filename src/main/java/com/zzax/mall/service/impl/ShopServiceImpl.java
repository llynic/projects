package com.zzax.mall.service.impl;

import com.zzax.mall.domain.Goods;
import com.zzax.mall.domain.Receipt;
import com.zzax.mall.domain.Shop;
import com.zzax.mall.domain.page.PageResult;
import com.zzax.mall.mapper.ShopMapper;
import com.zzax.mall.service.ShopService;
import com.zzax.mall.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


    @Override
    public PageResult<Receipt> getList(PageResult result) {
        //1.先查询数据总数
        int total = shopMapper.getCount(result);
        //2.如果大于0,说明有数值,那么才开始分页查询数据
        if (total > 0) {
            List<Shop> list = shopMapper.getList(result);
            PageResult pageResult = new PageResult(result.getPageNumber(),result.getPageSize(),total,list);
            return pageResult;
        } else {
            return new PageResult(result.getPageNumber(),result.getPageSize(),total,null);
        }
    }

    @Override
    public List<Shop> getShopList(PageResult result) {
        List<Shop> list = new ArrayList<>();
        //1.先查询数据总数
        int total = shopMapper.getCount(result);
        if (total > 0) {
            list = shopMapper.getList(result);
        }
        return list;
    }

    @Override
    public Shop shelfShop(Integer id) {
        Shop shop = shopMapper.selectByPrimaryKey(id);
        shop.setStatus("1");
        shopMapper.updateByPrimaryKey(shop);
        return shop;
    }

    @Override
    public Shop unShelfShop(Integer id) {
        Shop shop = shopMapper.selectByPrimaryKey(id);
        shop.setStatus("0");
        shopMapper.updateByPrimaryKey(shop);
        return shop;
    }

    @Override
    public Shop getShopById(Integer id) {
        Shop shop = shopMapper.selectByPrimaryKey(id);
        return shop;
    }
}
