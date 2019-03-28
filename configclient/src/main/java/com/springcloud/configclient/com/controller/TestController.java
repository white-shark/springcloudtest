package com.springcloud.configclient.com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String hello(){

        return this.profile;
    }
//    @PostMapping("/refresh")
//    public String test(){
//
//        return "success";
//    }

}
