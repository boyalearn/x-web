package com.web.api.client.callback;

import com.web.api.client.DemoClient;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DemoClientCallback implements DemoClient {


    @Override
    public Map<String, Object> postHome(Long userId, Map<String, Object> header, Map<String, Object> body) {

        System.out.println("call back post");
        return null;
    }

    @Override
    public Map<String, Object> getHome(Long userId, Map<String, Object> header, Map<String, Object> body) {
        System.out.println("call back get");

        return null;
    }
}
