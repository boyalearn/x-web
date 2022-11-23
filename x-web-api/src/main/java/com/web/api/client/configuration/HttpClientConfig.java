package com.web.api.client.configuration;

import feign.Client;
import feign.httpclient.ApacheHttpClient;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.URI;

@Configuration
public class HttpClientConfig {

    @Bean
    public Client httpClient() {
        CloseableHttpClient httpClient = HttpClients.custom().addInterceptorFirst(new HttpResponseInterceptor() {
            @Override
            public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
                int statusCode = httpResponse.getStatusLine().getStatusCode();
                HttpRequestWrapper request = (HttpRequestWrapper)httpContext.getAttribute("http.request");
                URI uri = request.getURI();
                System.out.println(uri);
                System.out.println(statusCode);
            }
        }).build();
        return new ApacheHttpClient(httpClient);

    }
}
