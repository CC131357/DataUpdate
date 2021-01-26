package com.example.spring_dingshi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.spring_dingshi.Dao")
public class SpringDingshiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDingshiApplication.class, args);
    }

}
