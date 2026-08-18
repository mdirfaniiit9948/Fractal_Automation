package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.DataProviderUtil;

public class LoginTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(LoginTest.class);


    @Test(dataProvider = "loginData",
            dataProviderClass = DataProviderUtil.class)
    public void loginValidation(
            String username,
            String password,
            String expectedResult
    ) throws InterruptedException {

        logger.info("Starting login test");
        logger.info("Testing login with username: {}", username);

        LoginPage lp = new LoginPage(driver);

        lp.setUserName(username);
        logger.info("Username entered");

        lp.setPassword(password);
        logger.info("Password entered");

        lp.clickLogin();
        Thread.sleep(4000);
        logger.info("Login button clicked");


        if (expectedResult.equalsIgnoreCase("Pass")) {

            logger.info("Expected result: PASS. Validating dashboard URL");

            String actualUrl = driver.getCurrentUrl();

            logger.info("Current URL after login: {}", actualUrl);


            Assert.assertTrue(
                    actualUrl.contains("dashboard"),
                    "Login failed. Dashboard URL not found. Actual URL: " + actualUrl
            );

            logger.info("Login successful. Dashboard URL validated");


        } else {

            logger.info("Expected result: FAIL. Validating error message");


            Assert.assertTrue(
                    lp.isErrorDisplayed(),
                    "Error message not displayed for invalid login"
            );

            logger.info("Invalid login error message displayed successfully");

        }

        logger.info("Login test completed");

    }
}