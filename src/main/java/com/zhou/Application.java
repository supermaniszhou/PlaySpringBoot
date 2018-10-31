package com.zhou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by Administrator on 2017/12/25 0025.
 */
@SpringBootApplication
//用于mybatis 扫描mapper 接口
@MapperScan(basePackages = {"com.zhou.mapper.sys", "com.zhou.mapper.app"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
