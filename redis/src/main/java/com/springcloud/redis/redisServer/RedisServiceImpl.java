package com.springcloud.redis.redisServer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public void set(String key, Object value, long seconds) {

        System.out.println(key+value+seconds);
        redisTemplate.opsForValue().set("test","successful",3000,TimeUnit.SECONDS);
    }



    @Override
    public Object get(String key) {

        return redisTemplate.opsForValue().get(key);
    }
}