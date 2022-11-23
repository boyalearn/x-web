package com.web.api.client;

import com.web.api.client.callback.DemoClientCallback;
import com.web.api.client.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(value = "demoClient", url = "http://localhost:9090",
        configuration = FeignConfiguration.class,
        fallback = DemoClientCallback.class, path = "/demo")
public interface DemoClient {

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    Map<String, Object> postHome(@RequestParam(value = "userId") Long userId, @RequestHeader Map<String, Object> header, @RequestBody Map<String, Object> body);


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    Map<String, Object> getHome(@RequestParam(value = "userId") Long userId, @RequestHeader Map<String, Object> header, Map<String, Object> body);
}
