package com.earth;

import com.xweb.config.parameter.EnableRestFullStandardHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.earth.mapper")
@EnableRestFullStandardHandler
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
