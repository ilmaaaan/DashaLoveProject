package com.spring.spring_boot.bogdanov.dashaloveproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class DashaLoveProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashaLoveProjectApplication.class, args);
    }

}
