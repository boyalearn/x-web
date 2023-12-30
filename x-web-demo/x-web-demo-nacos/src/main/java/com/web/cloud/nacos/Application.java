package com.web.cloud.nacos;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.cloud.bootstrap.BootstrapApplicationListener;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.cloud.endpoint.event.RefreshEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zouhuixing
 * @date 2023/12/24
 */
@SpringBootApplication
public class Application {

    private static final String[] DEFAULT_PROPERTY_SOURCES = new String[]{"commandLineArgs", "defaultProperties"};


    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        ConfigurableApplicationContext applicationContext = springApplication.run(args);
        Set<String> keys = new HashSet<>();
        RefreshEvent environmentChangeEvent = new RefreshEvent(applicationContext, null, "");
        applicationContext.publishEvent(environmentChangeEvent);
        StandardEnvironment environment = copyEnvironment(applicationContext.getEnvironment());
        SpringApplicationBuilder builder = (new SpringApplicationBuilder(new Class[]{Empty.class})).bannerMode(Banner.Mode.CONSOLE).web(WebApplicationType.NONE).environment(environment);
        builder.application().setListeners(Arrays.asList(new BootstrapApplicationListener(), new ConfigFileApplicationListener()));
        builder.run(new String[0]);
    }

    @Configuration(
            proxyBeanMethods = false
    )
    protected static class Empty {
        protected Empty() {
        }
    }

    private static StandardEnvironment copyEnvironment(ConfigurableEnvironment input) {
        StandardEnvironment environment = new StandardEnvironment();
        MutablePropertySources capturedPropertySources = environment.getPropertySources();
        String[] var4 = DEFAULT_PROPERTY_SOURCES;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            String name = var4[var6];
            if (input.getPropertySources().contains(name)) {
                if (capturedPropertySources.contains(name)) {
                    capturedPropertySources.replace(name, input.getPropertySources().get(name));
                } else {
                    capturedPropertySources.addLast(input.getPropertySources().get(name));
                }
            }
        }

        environment.setActiveProfiles(input.getActiveProfiles());
        environment.setDefaultProfiles(input.getDefaultProfiles());
        Map<String, Object> map = new HashMap();
        map.put("spring.jmx.enabled", false);
        map.put("spring.main.sources", "");
        map.put("spring.main.web-application-type", "NONE");
        capturedPropertySources.addFirst(new MapPropertySource("refreshArgs", map));
        return environment;
    }
}
