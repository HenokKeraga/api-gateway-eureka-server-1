package com.woinhen.eurekaserverapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApiGatewayApplication.class, args);
    }

}
