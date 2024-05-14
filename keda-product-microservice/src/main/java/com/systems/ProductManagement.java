package com.systems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductManagement {
    public static void main(String[] args) {
        // Will configure using product-server.yml
        System.setProperty("spring.config.name", "product-server");

        SpringApplication.run(ProductManagement.class, args);
    }
}
