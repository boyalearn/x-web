package com.xweb.excel.utils;

import com.xweb.excel.api.DefaultExcel;
import com.xweb.excel.api.EuExcel;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public final class ExcelUtil {

    private static EuExcel excel = new DefaultExcel();

    /**
     * @param fileName  全文件路径
     * @param dataList  需要导入Excel表格数据
     * @param sheetName sheet表名称
     */
    public final static <T> void write(String fileName, List<T> dataList, String sheetName) throws Exception {
        excel.write(fileName, dataList, sheetName);
    }


    /**
     * @param fileName  全文件路径
     * @param dataList  需要导入Excel表格数据
     * @param sheetName sheet表名称
     */
    public final static <T> void write(String fileName, List<T> dataList, String sheetName, HttpServletResponse response) throws Exception {
        excel.write(fileName, dataList, sheetName, response);
    }


    /**
     * @param fileName 读取文件路径
     * @return 返回数据List
     */
    public final static <T> List<T> read(String fileName, Class<T> clazz) throws Exception {
        return excel.read(fileName, clazz);
    }
}
