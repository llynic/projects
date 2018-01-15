package com.zzax.mall.service.impl;

import com.zzax.mall.domain.Goods;
import com.zzax.mall.mapper.GoodsMapper;
import com.zzax.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2018-01-15 12:33 星期一
 */
@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public Goods selectGoodsById(String id) {
        return goodsMapper.selectByPrimaryKey(id);
    }
}
