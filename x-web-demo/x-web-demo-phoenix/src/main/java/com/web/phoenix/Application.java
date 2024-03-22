package com.web.phoenix;

import com.xweb.config.parameter.EnableRestFullStandardHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zouhuixing
 * @date 2024/3/21
 */
@EnableRestFullStandardHandler
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
