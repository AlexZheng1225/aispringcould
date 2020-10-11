package com.alexzheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Alex Zheng
 * @Date 2020/10/9 21:58
 * @Annotation
 */
@SpringBootApplication
public class RestTemplateApplication {


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }

}
