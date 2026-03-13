package com.earth.runner;

import com.earth.entity.Meta;
import com.earth.service.IMetaService;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class AutoTestRunner implements ApplicationRunner {

    private IMetaService metaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
       /* final List<Meta> metas = metaService.listMetaByCodes(new String[]{"Roboot", "House"});
        System.out.println(metas);*/
        final List<Object> objects = metaService.selectHasFunctionNvl();
        System.out.println(objects);
    }
}
