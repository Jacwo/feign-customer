package com.yyl.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignCustomerApplication.class, args);
    }

}
