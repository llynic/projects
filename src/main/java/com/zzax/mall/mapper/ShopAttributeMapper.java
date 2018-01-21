package com.zzax.mall.mapper;

import com.zzax.mall.domain.ShopAttribute;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ShopAttributeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopAttribute record);

    int insertSelective(ShopAttribute record);

    ShopAttribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopAttribute record);

    int updateByPrimaryKey(ShopAttribute record);
}