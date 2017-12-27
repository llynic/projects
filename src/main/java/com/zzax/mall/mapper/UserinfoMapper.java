package com.zzax.mall.mapper;

import com.zzax.mall.domain.Userinfo;
import org.springframework.stereotype.Component;

@Component
public interface UserinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    Userinfo selectByUsernameAndPassword(Userinfo record);
}