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

    /*@PostConstruct
    public void test() {
        new Thread(() -> {
            String sql = "UPSERT INTO TEST_TABLE(ROWKEY,FILENAME,DEVICE_ID) VALUES ('%s','%s','%s')";

            for (int i = 0; i < 100000000; i++) {
                String uuid = UUID.randomUUID().toString();
                System.out.println(String.format("insert uuid is %s", uuid));
                commonMapper.update(String.format(sql, uuid, "fileName_" + uuid + ".txt", uuid));
            }
        }).start();
    }*/

    @PostConstruct
    public void test_ALARM_TROJAN() {
        new Thread(() -> {
            String sql = "UPSERT INTO ALARM_TROJAN(ROWKEY,ID,DEVICE_ID,PARENT_ID,RULE_ID,SPORT) VALUES ('%s','%s','%s','%s','%s','%s')";

            for (int i = 0; i < 100000000; i++) {
                String uuid = UUID.randomUUID().toString();
                System.out.println(String.format("insert ALARM_TROJAN uuid is %s", uuid));
                commonMapper.update(String.format(sql, uuid, uuid, uuid, uuid, uuid, uuid));
            }
        }).start();
    }
}
