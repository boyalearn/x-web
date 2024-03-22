package com.web.phoenix;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zouhuixing
 * @date 2024/3/22
 */
public class MybatisPlusGenerator {

    private static final String ALL = "all";

    private static final String CREATE_TIME = "create_time";

    private static final String SUB_PROJECT_PATH = "/x-web-demo/x-web-demo-phoenix";

    private static final String BASE_PACKAGE = "com.web.phoenix";

    private static final String MAPPER_PATH = "/src/main/resources/mapper/";

    private static final String SOURCE_PATH = "/src/main/java";

    private static final String DATABASE_URL = "jdbc:phoenix:hadoop-master:2181:/hbase";

    private static final String DATABASE_USER = "root";

    private static final String DATABASE_PASSWORD = "12345678";

    private static final String TIP = "请输入表名，多个英文逗号分隔？所有输入 all";

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir") + SUB_PROJECT_PATH;
        FastAutoGenerator generator = FastAutoGenerator.create(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        generator.globalConfig((scanner, builder) -> builder.author("zhx").fileOverride().outputDir(projectPath + SOURCE_PATH));
        //包配置
        generator.packageConfig((scanner, builder) ->
                builder.parent(BASE_PACKAGE).pathInfo(Collections.singletonMap(OutputFile.mapperXml, projectPath + MAPPER_PATH)));
        //策略配置
        generator.strategyConfig((scanner, builder) -> builder.addInclude(getTables(scanner.apply(TIP)))
                .controllerBuilder().enableRestStyle().enableHyphenStyle()
                .entityBuilder().enableLombok().addTableFills(new Column(CREATE_TIME, FieldFill.INSERT)).build());
        generator.execute();
    }

    protected static List<String> getTables(String tables) {
        return ALL.equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
