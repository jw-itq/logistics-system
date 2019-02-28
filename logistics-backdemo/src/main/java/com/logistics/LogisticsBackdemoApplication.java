package com.logistics;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.logistics.dao.mapper")
public class LogisticsBackdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticsBackdemoApplication.class, args);
    }

}
