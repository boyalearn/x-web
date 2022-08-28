package com.xweb.auth.server.util;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 0:17
 ******************************/
public class TemplateUtil {

    private static final String TEMPLATE_PATH = "/templates/";

    private static final String EMPTY_STR = "";

    private static final String UTF_8 = "utf-8";
    private static Configuration configuration;

    static {
        configuration = new Configuration(Configuration.getVersion());
        String path = TemplateUtil.class.getClassLoader().getResource(EMPTY_STR).getPath();
        try {
            configuration.setDirectoryForTemplateLoading(new File(path + TEMPLATE_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
        configuration.setDefaultEncoding(UTF_8);
    }

    public static String getTemplate(Map model, String templateFileName) throws Exception {

        Template template = configuration.getTemplate(templateFileName);
        StringWriter stringWriter = new StringWriter();
        template.process(model, stringWriter);
        return stringWriter.toString();
    }
}
