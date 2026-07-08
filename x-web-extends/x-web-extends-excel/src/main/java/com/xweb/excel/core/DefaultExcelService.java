package com.xweb.excel.core;

import com.xweb.excel.three.HSSThreeExcel;
import com.xweb.excel.three.ThreeExcel;
import com.xweb.excel.three.XSSThreeExcel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultExcelService implements ExcelService {

    private static Map<Class<?>, ThreeExcel> THREE_EXCELS;

    static {
        THREE_EXCELS = new HashMap<>();
        THREE_EXCELS.put(HSSFWorkbook.class, new HSSThreeExcel());
        THREE_EXCELS.put(XSSFWorkbook.class, new XSSThreeExcel());
    }

    private ThreeExcel threeExcel;

    @Override
    public <T> void write(List<T> dataList, OutputStream outputStream, String sheetName) throws Exception {
        this.threeExcel = THREE_EXCELS.get(XSSFWorkbook.class);
        this.threeExcel.write(dataList, outputStream, sheetName);
    }

    @Override
    public <T> List<T> read(InputStream in, Class<T> clazz) throws Exception {
        Workbook workbook = WorkbookFactory.create(in);
        if (workbook instanceof XSSFWorkbook) {
            this.threeExcel = THREE_EXCELS.get(XSSFWorkbook.class);
        } else if (workbook instanceof HSSFWorkbook) {
            this.threeExcel = THREE_EXCELS.get(HSSFWorkbook.class);
        } else {
            throw new Exception("Unknown File Type Exception");
        }
        return threeExcel.read(workbook, clazz);
    }
}
