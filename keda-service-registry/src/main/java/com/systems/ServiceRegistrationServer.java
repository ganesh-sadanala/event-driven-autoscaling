package com.systems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class ServiceRegistrationServer {
    public static void main(String[] args) {
        // Tell Boot to look for registration-server.yml
        System.setProperty("spring.config.additional-location", "classpath:registration-server.yml");
        SpringApplication.run(ServiceRegistrationServer.class, args);
    }
}
