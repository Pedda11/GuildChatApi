package com.example.demo_peter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class DemoPeterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoPeterApplication.class, args);
    }

}
