package com.alexzheng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Alex Zheng
 * @Date 2020/10/11 11:17
 * @Annotation
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "端口号为: "+this.port;
    }

}
