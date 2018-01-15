package com.zzax.mall.mapper;

import com.zzax.mall.domain.Receipt;
import com.zzax.mall.domain.page.PageResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ReceiptMapper {
    int deleteByPrimaryKey(String id);

    int insert(Receipt record);

    int insertSelective(Receipt record);

    Receipt selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Receipt record);

    int updateByPrimaryKey(Receipt record);

    /**
     * 根据条件查询分页结果
     * @param result
     * @return
     */
    List<Receipt> getList(PageResult result);

    /**
     * 获取数据的总数量
     * @param result
     * @return
     */
    int getCount(PageResult result);
}