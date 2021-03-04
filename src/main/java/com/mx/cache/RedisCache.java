package com.mx.cache;

import com.mx.ApplicationHolder;
import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class RedisCache implements Cache {

    private RedisTemplate redisTemplate;

    private final String id;

    public RedisCache(String id){
        this.id=id;
        redisTemplate = (RedisTemplate) ApplicationHolder.applicationContext.getBean("redisTemplate");
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void putObject(Object key, Object value) {
        redisTemplate.opsForHash().put(id,key.toString(),value);
    }

    @Override
    public Object getObject(Object key) {
        return redisTemplate.opsForHash().get(id, key.toString());
    }

    @Override
    public Object removeObject(Object o) {
        return null;
    }

    @Override
    public void clear() {
        redisTemplate.delete(id);
    }

    @Override
    public int getSize() {
        return (int)redisTemplate.opsForHash().size(id).intValue();
    }
}
