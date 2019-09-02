package com.yyl.feign.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * author:yangyuanliang Date:2019-08-20 Time:13:42
 *
 * @author yangyuanliang*/
@FeignClient(value = "hello-service")
public interface HelloApi {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello();
}
