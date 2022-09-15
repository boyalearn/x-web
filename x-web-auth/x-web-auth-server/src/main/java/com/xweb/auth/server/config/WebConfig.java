package com.xweb.auth.server.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.xweb.auth.server.service.ISystemLoggerService;
import com.xweb.common.NumEnumDeserializer;
import com.xweb.common.NumEnumSerializer;
import com.xweb.common.auth.XWebTokenEnhancer;
import com.xweb.common.auth.interceptor.XWebAuthInterceptor;
import com.xweb.common.converter.NumberEnumConverterFactory;
import com.xweb.common.resolver.FormParamHandlerMethodArgumentResolver;
import com.xweb.common.standard.IEnum;
import com.xweb.logger.interceptor.XWebLoggerInterceptor;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.nio.charset.StandardCharsets;
import java.util.List;

@Configuration
@EnableSwagger2
public class WebConfig implements WebMvcConfigurer {

    @Value("${spring.swagger.enabled:false}")
    private boolean enable;

    @Bean
    public XWebTokenEnhancer webTokenEnhancer() {
        XWebTokenEnhancer webTokenEnhancer = new XWebTokenEnhancer();
        webTokenEnhancer.setSigningKey("1234");
        return webTokenEnhancer;
    }

    @Bean
    public XWebAuthInterceptor authInterceptor(XWebTokenEnhancer webTokenEnhancer) {
        return new XWebAuthInterceptor(webTokenEnhancer);
    }

    @Bean
    public XWebLoggerInterceptor loggerInterceptor(ISystemLoggerService systemLoggerService,
                                                   XWebTokenEnhancer webTokenEnhancer) {
        return new XWebLoggerInterceptor(systemLoggerService, webTokenEnhancer);
    }

    @Autowired
    private XWebAuthInterceptor authInterceptor;

    @Autowired
    private XWebLoggerInterceptor loggerInterceptor;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.removeConvertible(String.class, Enum.class);
        registry.removeConvertible(Enum.class, String.class);
        registry.addConverterFactory(new NumberEnumConverterFactory());
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor);
        registry.addInterceptor(loggerInterceptor);
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new FormParamHandlerMethodArgumentResolver());
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

        for (HttpMessageConverter<?> converter : converters) {
            if (converter instanceof StringHttpMessageConverter) {
                ((StringHttpMessageConverter) converter).setDefaultCharset(StandardCharsets.UTF_8);
            } else if (converter instanceof MappingJackson2HttpMessageConverter) {
                MappingJackson2HttpMessageConverter messageConverter = (MappingJackson2HttpMessageConverter) converter;
                messageConverter.setObjectMapper(objectMapper());
            }
        }
    }

    private ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);

        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(IEnum.class, new NumEnumSerializer());
        simpleModule.addDeserializer(Enum.class, new NumEnumDeserializer(Enum.class));
        objectMapper.registerModule(simpleModule);
        return objectMapper;
    }

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).enable(enable)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("XAuth API").description("API 文档")
                .version("1.0").build();
    }
}
