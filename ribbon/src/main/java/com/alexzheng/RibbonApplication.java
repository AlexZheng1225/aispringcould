package com.alexzheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Alex Zheng
 * @Date 2020/10/10 15:36
 * @Annotation Ribbon不提供服务，只提供负载均衡服务
 */
@SpringBootApplication
public class RibbonApplication {

    @Bean
    @LoadBalanced //加这个注解实现负载均衡 Ribbon
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }
}
