package com.wang.boot.whyq.wuhanyq;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = "com.wang.boot.whyq.wuhanyq.mapper")
public class WuhanyqApplication {

    public static void main(String[] args) {
        SpringApplication.run(WuhanyqApplication.class, args);
    }

}
