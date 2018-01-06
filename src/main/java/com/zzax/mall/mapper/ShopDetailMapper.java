package com.zzax.mall.mapper;

import com.zzax.mall.domain.ShopDetail;

public interface ShopDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopDetail record);

    int insertSelective(ShopDetail record);

    ShopDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopDetail record);

    int updateByPrimaryKey(ShopDetail record);
}