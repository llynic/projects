package com.zzax.mall.service.impl;

import com.zzax.mall.service.CacheService;
import com.zzax.mall.util.RedisUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-26 15:22 星期二
 */
@Service
public class CacheServiceImpl implements CacheService {

    @Resource
    private RedisUtil redisUtil;

    @Override
    public <T> T cacheResult(String cacheKey) {
        return (T) redisUtil.getDataFromCache(cacheKey);
    }

    @Override
    public <T> void cachePut(String cacheKey, T value) {
        redisUtil.putDataToCache(cacheKey,value);
    }

    @Override
    public void cacheRemove(String cacheKey) {
        redisUtil.clearCache(cacheKey);
    }
}
