package com.xweb.auth.server;

import com.xweb.common.process.EnableGlobalExceptionHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.xweb.auth.server"})
@EnableGlobalExceptionHandler(value = true)
@MapperScan(basePackages = {"com.xweb.auth.server.mapper"})
//@EnableRedisHttpSession
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
