package com.ll.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //标识一个Eureka方服务端应用--->服务注册中心
@SpringBootApplication
public class EurekaServer_6002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6002.class,args);
    }

}
