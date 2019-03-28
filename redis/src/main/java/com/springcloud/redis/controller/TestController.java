package com.springcloud.redis.controller;

import com.springcloud.redis.redisServer.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private RedisService redisService;

    @GetMapping("/test")
    public String set() {
        redisService.set("test","successful",3000);

        Object a;
        a = redisService.get("test");
        String s = "testsuccessful"+a;
        System.out.println(s);
        return (String) a;
    }
}
