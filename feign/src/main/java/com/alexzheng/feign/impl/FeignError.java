package com.alexzheng.feign.impl;

import com.alexzheng.entity.Student;
import com.alexzheng.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Author Alex Zheng
 * @Date 2020/10/10 19:24
 * @Annotation
 */
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}
