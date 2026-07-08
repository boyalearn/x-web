package com.xweb.excel.api;

import com.xweb.excel.core.DefaultExcelService;
import com.xweb.excel.core.ExcelService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLEncoder;
import java.util.List;

public class DefaultExcel implements EuExcel {

    private ExcelService service;

    public DefaultExcel() {
        this.service = new DefaultExcelService();
    }

    @Override
    public <T> void write(String fileName, List<T> dataList, String sheetName) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        this.service.write(dataList, fileOutputStream, sheetName);

    }

    @Override
    public <T> void write(String fileName, List<T> dataList, String sheetName, HttpServletResponse response) throws Exception {
        ServletOutputStream outputStream = response.getOutputStream();
        this.service.write(dataList, outputStream, sheetName);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.addHeader("Content-Disposition", "Attachment;Filename=" + URLEncoder.encode(fileName, "utf8"));
    }

    @Override
    public <T> List<T> read(String fileName, Class<T> clazz) throws Exception {
        return this.service.read(new FileInputStream(fileName), clazz);
    }
}
