package com.web.phoenix;

import com.web.phoenix.mapper.CommonMapper;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.UUID;

/**
 * @author zouhuixing
 * @date 2024/3/22
 */
@SpringBootApplication
@AllArgsConstructor
public class DataCreateTest {

    private CommonMapper commonMapper;

    public static void main(String[] args) {
        SpringApplication.run(DataCreateTest.class, args);
    }

    @PostConstruct
    public void test() {
        String sql = "UPSERT INTO TEST_TABLE(ROWKEY,FILENAME,DEVICE_ID) VALUES ('%s','%s','%s')";

        for (int i = 0; i < 10000000; i++) {
            String uuid = UUID.randomUUID().toString();
            commonMapper.update(String.format(sql, uuid, "fileName_" + uuid + ".txt", uuid));
        }

    }
}
