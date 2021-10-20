package com.cuit.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//自动装配指定包下所有Mapper 省得每个去写@Mapper

@MapperScan("com.cuit.springboot.mapper")
@SpringBootApplication
public class SpringBoot08DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot08DataMybatisApplication.class, args);
    }

}
