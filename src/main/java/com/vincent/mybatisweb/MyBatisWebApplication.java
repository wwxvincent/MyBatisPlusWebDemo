package com.vincent.mybatisweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vincent.mybatisweb.mapper")//自动把mapper导入进springboot
public class MyBatisWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisWebApplication.class, args);
    }

}
