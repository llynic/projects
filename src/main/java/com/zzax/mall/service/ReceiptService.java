package com.zzax.mall.service;

import com.zzax.mall.domain.Receipt;
import com.zzax.mall.domain.page.PageResult;

/**
 * @Description 仓单服务接口
 * @Created By : wangzhenjia
 * @DATE 2018-01-14 17:27 星期日
 */
public interface ReceiptService {
    /**
     * 根据查询条件返回分页查询结果
     *
     * @return 仓单列表
     */
    PageResult<Receipt> getList(PageResult result);

    /**
     * 根据id查询仓单
     *
     * @param id - 仓单id
     * @return 仓单实体对象
     */
    Receipt selectReceiptById(String id);
}
