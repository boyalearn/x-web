package com.xweb.auth.server.test;

import com.xweb.auth.server.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MybatisTest implements ApplicationRunner {

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<Map> allClient = clientMapper.findAllClient("111", "222");
        System.out.println(allClient);
    }
}
