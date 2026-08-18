package utils;


import org.testng.annotations.DataProvider;


public class DataProviderUtil {


    @DataProvider(name="loginData")
    public Object[][] loginData(){


        return ExcelUtility.getExcelData("Login");


    }

}