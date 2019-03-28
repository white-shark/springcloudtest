package com.springcloud.redis.redisServer;

public interface RedisService {
    public void set(String key, Object value, long seconds);
    public Object get(String key);
}