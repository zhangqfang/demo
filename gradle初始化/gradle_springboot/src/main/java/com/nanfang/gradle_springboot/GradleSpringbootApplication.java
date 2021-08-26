package com.nanfang.gradle_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nanfang.gradle_springboot.mapper")
public class GradleSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleSpringbootApplication.class, args);
    }

}
