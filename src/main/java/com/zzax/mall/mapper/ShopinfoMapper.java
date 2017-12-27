package com.zzax.mall.mapper;

import com.zzax.mall.domain.Shopinfo;

public interface ShopinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(Shopinfo record);

    int insertSelective(Shopinfo record);

    Shopinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Shopinfo record);

    int updateByPrimaryKey(Shopinfo record);

    void addShop();
}