package com.xweb.auth.server.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/29 19:56
 ******************************/
public class FileReaderUtil {

    public static String read(String fileName) throws IOException {
        FileReader fr = new FileReader(new File(fileName));
        BufferedReader bufr = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        String line = null;
        while ((line = bufr.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }
}
