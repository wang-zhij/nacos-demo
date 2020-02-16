package com.wzj.nacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service1Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Service1Bootstrap.class,args);
    }

    @Autowired
    ConfigurableApplicationContext configurableApplicationContext;

    @Value("${common.name}")
    private  String config1;

    @GetMapping("/configs")
    public String getConfigs(){
       // return config1;
        return  configurableApplicationContext.getEnvironment().getProperty("common.name");
    }
    @GetMapping("/configs2")
    public String getConfigs2(){
       // return config1;

        String name=configurableApplicationContext.getEnvironment()
                .getProperty("common.name");
        String age=configurableApplicationContext.getEnvironment()
                .getProperty("common.age");
        String address=configurableApplicationContext.getEnvironment()
                .getProperty("common.address");
        String birthday=configurableApplicationContext.getEnvironment()
                .getProperty("common.birthday");
        String fullname=configurableApplicationContext.getEnvironment()
                .getProperty("common.fullname");
        return  name+age+address+birthday+fullname;
    }
}
