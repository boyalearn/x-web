package com.xweb.excel.three;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.OutputStream;
import java.util.List;

/**
 * 2007+/2010
 */
public class XSSThreeExcel extends AbstractThreeExcel {

    @Override
    public <T> void write(List<T> dataList, OutputStream outputStream, String sheetName) throws Exception {
        Workbook workBook = new XSSFWorkbook();
        doWrite(workBook, dataList, outputStream, sheetName);
    }

    @Override
    public <T> List<T> read(Workbook workBook, Class<T> clazz) throws Exception {
        return doRead(workBook, clazz);
    }
}
