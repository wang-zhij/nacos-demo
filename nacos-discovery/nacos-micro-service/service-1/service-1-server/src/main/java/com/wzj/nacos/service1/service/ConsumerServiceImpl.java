package com.wzj.nacos.service1.service;

import com.wzj.nacos.service1.api.ConsumeService;
import com.wzj.nacos.service2.api.ProviderService;


@org.apache.dubbo.config.annotation.Service  //dubbo接口
public class ConsumerServiceImpl implements ConsumeService {

@org.apache.dubbo.config.annotation.Reference
    ProviderService providerService;

    public String service() {
        String service = providerService.service();
        return "consumer invoke=====0"+service;
    }
}
