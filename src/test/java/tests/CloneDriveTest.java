package tests;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CloneDrive;

public class CloneDriveTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(CloneDriveTest.class);

    @Test
    public void cloneDriveTest() {

        logger.info("========== Clone Drive Test Started ==========");

        CloneDrive drivePage = new CloneDrive(driver);

        try {

            logger.info("Clicking Search Icon");
            drivePage.clickSearchIcon();

            Thread.sleep(2000);

            logger.info("Searching Drive ID : 349032");
            drivePage.enterSearchText("349032");

            Thread.sleep(2000);

            logger.info("Submitting Search");
            drivePage.submitSearch();

            Thread.sleep(2000);

            logger.info("Clicking Three Dots");
            drivePage.clickThreeDots();

            Thread.sleep(2000);

            logger.info("Selecting Clone Drive Option");
            drivePage.clickCloneDriveOption();

            Thread.sleep(2000);

            logger.info("Selecting From Date");
            drivePage.openFromCalendar();

            Thread.sleep(2000);

            drivePage.selectFromDate();

            Thread.sleep(2000);

            logger.info("Selecting To Date");
            drivePage.openToCalendar();

            Thread.sleep(2000);

            drivePage.openTofrwddate();

            Thread.sleep(2000);

            drivePage.selectToDate();

            Thread.sleep(2000);

            logger.info("Scrolling Down");
            drivePage.scrollDown();

            Thread.sleep(2000);

            logger.info("Clicking Clone Button");
            drivePage.clickCloneButton();
            Thread.sleep(4000);

            logger.info("Navigating Back to Home");
            drivePage.clickbacktohome();

            Thread.sleep(3000);

            logger.info("Clone Drive Test Passed");

            Assert.assertTrue(true);

        } catch (Exception e) {

            logger.error("Clone Drive Test Failed");
            logger.error("Reason: {}", e.getMessage(), e);

            Assert.fail("Clone Drive Test Failed: " + e.getMessage(), e);
        }

        logger.info("========== Clone Drive Test Completed ==========");
    }
}