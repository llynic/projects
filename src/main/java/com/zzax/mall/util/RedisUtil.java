package com.zzax.mall.util;

import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description redis的工具类,使用redisTemplate 来处理
 * @Created By : wangzhenjia
 * @DATE 2017-12-26 15:08 星期二
 */
@Component
public class RedisUtil {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * 从redis 中获取list数据
     * @param cacheKey
     * @return
     */
    public List<Object> getCacheList(String cacheKey){
        BoundListOperations listOps = redisTemplate.boundListOps(cacheKey);
        Long size = listOps.size();
        return listOps.range(0L,size);
    }

    /**
     * 从redis 中更新list 数据
     * @param cacheKey
     * @param dataList
     */
    public void updateCacheList(String cacheKey,List<Object> dataList){
        redisTemplate.delete(cacheKey);
        BoundListOperations<String, Object> listOps = redisTemplate.boundListOps(cacheKey);
        listOps.rightPushAll(dataList.toArray());
    }

    /**
     * 从redis 中获取map数据
     * @param cacheKey
     * @return
     */
    public Map<String,Object> getCacheMap(String cacheKey){
        BoundHashOperations boundHashOps = redisTemplate.boundHashOps(cacheKey);
        return boundHashOps.entries();
    }

    /**
     * 从redis 中删除缓存数据
     * @param cacheKey
     */
    public void clearCache(String cacheKey){
        redisTemplate.delete(cacheKey);
    }

    /**
     *  从redis中获取map中某个键值数据
     * @param cacheKey
     * @param key
     * @return
     */
    public Object getDataFromCacheMap(String cacheKey,Object key){
        BoundHashOperations boundHashOps = redisTemplate.boundHashOps(cacheKey);
        return boundHashOps.get(key);
    }

    /**
     * 从redis中新增map键值数据
     * @param cacheKey
     * @param key
     * @param value
     * @return
     */
    public void putDataFromCacheMap(String cacheKey,Object key,Object value){
        BoundHashOperations<String, Object, Object> boundHashOps = redisTemplate.boundHashOps(cacheKey);
        boundHashOps.put(key,value);
    }

    /**
     * 根据键 把值放在redis 中
     * @param cacheKey
     * @param value
     */
    public void putDataToCache(String cacheKey,Object value){
        BoundValueOperations<String, Object> boundValueOps = redisTemplate.boundValueOps(cacheKey);
        boundValueOps.set(value);
    }

    /**
     * 根据键 从redis 中取出值
     * @param cacheKey
     * @return
     */
    public Object getDataFromCache(String cacheKey){
        BoundValueOperations<String, Object> boundValueOps = redisTemplate.boundValueOps(cacheKey);
        return boundValueOps.get();
    }
}
