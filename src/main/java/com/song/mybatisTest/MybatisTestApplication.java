package com.song.mybatisTest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@MapperScan(basePackages = "com.song.mybatisTest.mapper")
public class MybatisTestApplication {
    
    public static void main(String[] args) {

        SpringApplication.run(MybatisTestApplication.class, args);
        log.info("服务启动…………");
    }
}
