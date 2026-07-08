package com.xweb.excel.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public interface ExcelService {

    <T> void write(List<T> dataList, OutputStream outputStream, String sheetName) throws Exception;

    <T> List<T> read(InputStream in, Class<T> clazz) throws Exception;

}
