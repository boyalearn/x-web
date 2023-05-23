package com.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public Map demo() {
        Map result = new HashMap<String, Object>();
        result.put("data", "demo");
        return result;
    }
}
