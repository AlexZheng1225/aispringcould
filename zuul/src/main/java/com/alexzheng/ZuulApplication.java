package com.alexzheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author Alex Zheng
 * @Date 2020/10/10 10:51
 * @Annotation 启动类
 */
//包含了@EnableZuulServer(设置该类是网关启动类)
@EnableZuulProxy
//可帮助Spring Boot应用将所有符合条件的@Configuration配置加载到当前Spring Boot创建并使用的IOC容器中
@EnableAutoConfiguration
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }

}
