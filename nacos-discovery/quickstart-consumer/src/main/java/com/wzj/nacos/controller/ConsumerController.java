package com.wzj.nacos.controller;

import com.wzj.nacos.client.ProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private static final Logger log= LoggerFactory
            .getLogger(ConsumerController.class);

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/service")
    public String service(){
        log.info("consumer ");
        String providerResult = providerClient.service();
        return "consumer "+providerResult;
    }
}
