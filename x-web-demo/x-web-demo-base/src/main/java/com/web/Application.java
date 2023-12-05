package com.web;

import com.web.context.NoWebApplication;
import com.xweb.config.parameter.EnableRestFullStandardHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableRestFullStandardHandler
@EnableSwagger2
public class Application {
    public static void main(String[] args) {
        NoWebApplication.run(Application.class, args);
    }
}
