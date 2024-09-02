package com.vattima.lego.data.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"net.lego.data.v2"})
public class LegoDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegoDataServiceApplication.class, args);
    }

}
