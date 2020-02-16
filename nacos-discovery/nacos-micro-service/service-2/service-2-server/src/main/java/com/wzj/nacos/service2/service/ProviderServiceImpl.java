package com.wzj.nacos.service2.service;

import com.wzj.nacos.service2.api.ProviderService;


@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {

    public String service() {
        return "provider invoke";
    }
}
