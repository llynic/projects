package com.zzax.mall.service;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-26 15:20 星期二
 */
public interface CacheService {

    /**
     * 从缓存中取出数据
     * @param cacheKey
     * @param <T>
     * @return
     */
    <T> T cacheResult(String cacheKey);

    /**
     * 往缓存中放入数据
     * @param cacheKey
     * @param value
     * @param <T>
     */
    <T> void cachePut(String cacheKey,T value);

    /**
     * 清除缓存中的数据
     * @param cacheKey
     */
    void cacheRemove(String cacheKey);
}
