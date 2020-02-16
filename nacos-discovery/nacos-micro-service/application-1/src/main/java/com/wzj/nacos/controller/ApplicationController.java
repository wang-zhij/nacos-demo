package com.wzj.nacos.controller;

import com.wzj.nacos.service1.api.ConsumeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    //注入service 通过dubbo
    @org.apache.dubbo.config.annotation.Reference
    ConsumeService consumeService;

    @GetMapping("/service")
    public  String service(){
        String service = consumeService.service();
        return "test"+service;
    }
}
