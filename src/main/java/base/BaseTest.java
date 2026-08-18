package base;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseTest {


    protected static WebDriver driver;


    @BeforeSuite
    public void setup(){

        driver = new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        driver.manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get(
                "https://qa.iqigai.ai/admin/sign-in"
        );


    }



    @AfterSuite
    public void tearDown(){


        if(driver!=null){

            driver.quit();

        }


    }

}