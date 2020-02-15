package com.wzj.nacos;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;

public class SimpleDemoMain {

    public static void main(String[] args) throws NacosException {

        String serverAddr="127.0.0.1:8848";
        String dataId="nacos.cfg.dataId";
        String group="test";

        Properties properties = new Properties();
        properties.put("serverAddr",serverAddr);
        ConfigService configService = NacosFactory.createConfigService(properties);
        String config = configService.getConfig(dataId, group, 5000);

        System.out.println(config);
    }
}
