package com.xweb.excel.three;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.OutputStream;
import java.util.List;

public class HSSThreeExcel extends AbstractThreeExcel {

    @Override
    public <T> void write(List<T> dataList, OutputStream outputStream, String sheetName) throws Exception {
        Workbook workBook = new HSSFWorkbook();
        doWrite(workBook, dataList, outputStream, sheetName);
    }

    @Override
    public <T> List<T> read(Workbook workBook, Class<T> clazz) throws Exception {
        return doRead(workBook, clazz);
    }
}
