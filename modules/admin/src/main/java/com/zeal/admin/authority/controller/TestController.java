package com.zeal.admin.authority.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${qiniu.bucket}")
    private String hello;

    @GetMapping(value = "/hello")
    public String Test(){
        return hello;
    }

}
