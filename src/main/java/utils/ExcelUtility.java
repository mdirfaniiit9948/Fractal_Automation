package utils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {


    public static Object[][] getExcelData(String sheetName) {


        List<Object[]> data = new ArrayList<>();


        try {


            FileInputStream fis =
                    new FileInputStream(
                            "src/main/resources/TestData.xlsx"
                    );


            Workbook workbook =
                    new XSSFWorkbook(fis);


            Sheet sheet =
                    workbook.getSheet(sheetName);



            int rows = sheet.getPhysicalNumberOfRows();


            for(int i=1;i<rows;i++){


                Row row = sheet.getRow(i);


                if(row == null)
                    continue;



                String username =
                        row.getCell(0)
                                .getStringCellValue();



                String password =
                        row.getCell(1)
                                .getStringCellValue();



                String result =
                        row.getCell(2)
                                .getStringCellValue();



                data.add(
                        new Object[]{
                                username,
                                password,
                                result
                        }
                );


            }


            workbook.close();


        }
        catch(Exception e){

            e.printStackTrace();

            throw new RuntimeException(
                    "Excel reading failed"
            );
        }



        return data.toArray(new Object[0][]);

    }

}