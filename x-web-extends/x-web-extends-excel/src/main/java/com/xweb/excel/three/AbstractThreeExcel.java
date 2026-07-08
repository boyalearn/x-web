package com.xweb.excel.three;

import com.xweb.excel.entity.CellInfo;
import com.xweb.excel.utils.ExcelReflectUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class AbstractThreeExcel implements ThreeExcel {
    public <T> void doWrite(Workbook workBook, List<T> dataList, OutputStream outputStream, String sheetName) throws Exception {
        Sheet sheet = workBook.createSheet(sheetName);
        int rowNum = 0;
        Row headRow = sheet.createRow(rowNum);
        Class<?> dataType = dataList.get(0).getClass();
        List<CellInfo> cellList = ExcelReflectUtil.getFieldsCellInfo(dataType);

        for (CellInfo cellInfo : cellList) {
            headRow.createCell(cellInfo.getOrder()).setCellValue(cellInfo.getName());
        }
        rowNum++;
        Map<String, Method> methodMap = ExcelReflectUtil.getMethodMap(dataType);
        for (int i = 0; i < dataList.size(); i++) {
            Object bean = dataList.get(i);
            Row dateRow = sheet.createRow(rowNum);
            for (CellInfo cellInfo : cellList) {
                Method method = methodMap.get(ExcelReflectUtil.getGetMethodName(cellInfo.getFieldName()));
                Class<?> returnType = method.getReturnType();
                try {
                    Cell cell = dateRow.createCell(cellInfo.getOrder());
                    ExcelReflectUtil.setCellValue(cell, ExcelReflectUtil.invoke(bean, method), returnType);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            rowNum++;
        }

        try {
            workBook.write(outputStream);
            outputStream.close();
            workBook.close();
        } catch (FileNotFoundException e) {
            throw new Exception("FileNotFoundException");
        } catch (IOException e) {
            throw new Exception("IOException");
        }

    }


    public <T> List<T> doRead(Workbook workBook, Class<T> clazz) throws Exception {
        Sheet sheet = workBook.getSheetAt(0);
        List<CellInfo> cellInfoList = ExcelReflectUtil.getFieldsCellInfo(clazz);
        Map<String, Method> methodMap = ExcelReflectUtil.getMethodMap(clazz);
        List<T> list = new ArrayList<T>();
        int rowNum = sheet.getLastRowNum();
        for (int i = 1; i <= rowNum; i++) {
            Row row = sheet.getRow(i);
            T bean = (T) clazz.newInstance();
            for (CellInfo cellInfo : cellInfoList) {
                Cell cell = row.getCell(cellInfo.getOrder());
                Object data = ExcelReflectUtil.getCellValue(cell);
                ExcelReflectUtil.setBeanMethodValue(bean, methodMap.get(ExcelReflectUtil.getSetMethodName(cellInfo.getFieldName())), data);
            }
            list.add(bean);
        }
        return list;
    }
}
