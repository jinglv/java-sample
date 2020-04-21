package com.mp.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jingLv
 * @date 2020-04-17 5:16 PM
 */
@SpringBootApplication
@MapperScan("com.mp.example.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
