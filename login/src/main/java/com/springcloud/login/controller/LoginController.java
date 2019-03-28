package com.springcloud.login.controller;

import com.springcloud.login.repository.UserLoginRepository;
import com.springcloud.login.user.UserLoginJudgment;
import com.springcloud.login.user.UserLoginReceive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@CrossOrigin
@RestController
public class LoginController {
    private UserLoginJudgment user;
    @Autowired
    UserLoginRepository userLoginRepository;


    @PostMapping(value = "/user/login")
    public int login(@RequestBody UserLoginReceive userLoginReceive, HttpSession session){


        user = userLoginRepository.findByUsername(userLoginReceive.getUsername());
        if(userLoginReceive.getPassword().equals(user.getPassword())&&user!=null){
            //登陆成功
            session.setAttribute("username",userLoginReceive.getUsername());
            System.out.println("用户："+userLoginReceive.getUsername()+"登陆成功");
            return 200;
        }
        else{
            //登陆失败
            System.out.println("用户："+userLoginReceive.getUsername()+"登陆失败");
            return 400;
        }

    }


}
