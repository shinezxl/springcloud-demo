package com.example.consumer.serviceimpl;

import com.example.consumer.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
@Component
public class HelloServiceHystrix implements HelloService{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "failure:"+name;
    }
}
