package com.yyl.feign.controller;

import com.yyl.feign.api.HelloApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:yangyuanliang Date:2019-08-20 Time:13:43
 **/
@Controller
@RequestMapping("feign")
public class HelloController {
    @Autowired
    private HelloApi helloApi;
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return helloApi.hello();
    }
}
