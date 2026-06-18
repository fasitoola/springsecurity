package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.atguigu.mapper"})
@SpringBootApplication
public class SpringSecurtityDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurtityDbApplication.class, args);
    }

}
