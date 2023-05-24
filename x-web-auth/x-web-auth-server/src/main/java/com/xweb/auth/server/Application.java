package com.xweb.auth.server;

import com.xweb.config.exeception.EnableGlobalExceptionHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.xweb.auth.server"})
@MapperScan(basePackages = {"com.xweb.auth.server.mapper"})
@EnableGlobalExceptionHandler
//@EnableRedisHttpSession
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
