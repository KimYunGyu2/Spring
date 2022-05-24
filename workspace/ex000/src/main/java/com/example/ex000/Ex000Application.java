package com.example.ex000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Ex000Application {

    public static void main(String[] args) {
        SpringApplication.run(Ex000Application.class, args);
    }

}
