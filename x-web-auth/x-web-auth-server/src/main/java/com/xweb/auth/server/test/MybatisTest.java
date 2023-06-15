package com.xweb.auth.server.test;

import com.xweb.auth.server.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MybatisTest implements ApplicationRunner {

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        clientMapper.findAllClient("111", "222");
    }
}
