package com.alexzheng.controller;

import com.alexzheng.entity.Student;
import com.alexzheng.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Author Alex Zheng
 * @Date 2020/10/10 16:19
 * @Annotation
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }


    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}

