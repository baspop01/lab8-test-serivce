package com.example.lab8testserivce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class Lab8TestSerivceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab8TestSerivceApplication.class, args);
    }

}
