package com.zzax.mall.service;

import com.zzax.mall.domain.Goods;

/**
 * @Description 仓单货物服务接口
 * @Created By : wangzhenjia
 * @DATE 2018-01-15 12:26 星期一
 */

public interface GoodsService {

    /**
     * 根据仓单id查询对应的货物详情
     *
     * @param id - 关联的仓单id
     * @return 对应的仓单货物实体
     */
    Goods selectGoodsById(String id);
}
