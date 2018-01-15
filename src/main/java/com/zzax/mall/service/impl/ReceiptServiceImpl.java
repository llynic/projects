package com.zzax.mall.service.impl;

import com.zzax.mall.domain.Receipt;
import com.zzax.mall.domain.page.PageResult;
import com.zzax.mall.mapper.ReceiptMapper;
import com.zzax.mall.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2018-01-14 17:33 星期日
 */
@Service
@Transactional
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ReceiptMapper receiptMapper;

    @Override
    public PageResult<Receipt> getList(PageResult result) {
        //1.先查询数据总数
        int total = receiptMapper.getCount(result);
        //2.如果大于0,说明有数值,那么才开始分页查询数据
        if (total > 0) {
            List<Receipt> list = receiptMapper.getList(result);
            PageResult pageResult = new PageResult(result.getPageNumber(),result.getPageSize(),total,list);
            return pageResult;
        } else {
            return new PageResult(result.getPageNumber(),result.getPageSize(),total,null);
        }
    }

    @Override
    public Receipt selectReceiptById(String id) {
        return receiptMapper.selectByPrimaryKey(id);
    }
}
