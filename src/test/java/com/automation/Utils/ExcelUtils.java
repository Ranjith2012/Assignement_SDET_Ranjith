package com.automation.Utils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcelUtils {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    public ExcelUtils(String filename, String sheetname){
        try {
            workbook = new XSSFWorkbook("src/test/resources/DataFiles/"+filename);
            sheet = workbook.getSheet(sheetname);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getLastRow(){
        return sheet.getLastRowNum();
    }
    public int getLastCol(){
        return sheet.getRow(0).getLastCellNum();
    }

    public List<List<String>> getData() {

        List<List<String>> tableData = new ArrayList<>();
        for(int i=1;i<getLastRow();i++){
            XSSFRow row = sheet.getRow(i);
            List<String> row_data = new ArrayList<>();
            for(int j=0;j<row.getLastCellNum();j++){
                row_data.add(row.getCell(j).getStringCellValue());
            }
            tableData.add(row_data);
        }
    return tableData;
    }



//        for(int i=0; i<test.getLastRowNum();i++){
//            XSSFRow row = test.getRow(i);
//            for(int j=0;j<row.getLastCellNum();j++){
//                System.out.print(row.getCell(j).getStringCellValue()+"   ");
//            }
//            System.out.println();


//        public void array(){
//            List<String> p1 = Arrays.asList("bis1", "bis2","bis3");
//            List<String> p2 = Arrays.asList("bis1", "bis2","bis3");
//            List<String> p3 = Arrays.asList("bis1", "bis2","bis3");
//
//            List<List<String>> box = new ArrayList<>();
//            box.add(p1);
//            box.add(p2);
//            box.add(p3);
//
//            for(List<String> boxes : box){
//                for(String packet : boxes){
//                    System.out.print(packet+" ");
//                }
//                System.out.println();
//            }
//
//        }
}
