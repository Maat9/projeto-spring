package com.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = {"com.gof.service"})
public class MyApp {
    
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);     
    }
}

