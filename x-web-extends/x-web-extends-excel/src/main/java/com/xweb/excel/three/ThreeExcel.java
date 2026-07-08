package com.xweb.excel.three;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.OutputStream;
import java.util.List;

public interface ThreeExcel {

    <T> void write(List<T> dataList, OutputStream outputStream, String sheetName) throws Exception;

    <T> List<T> read(Workbook workbook, Class<T> clazz) throws Exception;
}
