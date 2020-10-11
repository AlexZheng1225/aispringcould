package com.alexzheng.feign;

import com.alexzheng.entity.Student;
import com.alexzheng.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Author Alex Zheng
 * @Date 2020/10/10 16:20
 * @Annotation @FeignClient表明使用哪个服务提供者
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();


    @GetMapping("/student/index")
    public String index();

}
