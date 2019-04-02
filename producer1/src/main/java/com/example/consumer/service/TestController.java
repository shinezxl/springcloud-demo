package com.example.consumer.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class TestController {

    @GetMapping("/hello")
    public String index(@RequestParam("name") String name) {
        return "hello "+name+"，this is first messge111";
    }

}
