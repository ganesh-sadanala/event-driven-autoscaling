package com.systems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceRegistrationServer {
    public static void main(String[] args) {
        // Tell Boot to look for registration-server.yml
    System.setProperty("spring.config.name", "registration-server");
        SpringApplication.run(ServiceRegistrationServer.class);
    }
}
