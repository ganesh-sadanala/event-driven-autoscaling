package com.systems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserManagement {
    public static void main(String[] args) {
        // Will configure using accounts-server.yml
        System.setProperty("spring.config.additional-location", "classpath:users-server.yml");

        SpringApplication.run(UserManagement.class, args);
    }
}
