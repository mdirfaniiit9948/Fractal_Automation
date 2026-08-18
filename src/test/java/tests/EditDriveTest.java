package tests;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EditDrive;

public class EditDriveTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(EditDriveTest.class);

    @Test
    public void editDrive() {

        logger.info("========== Edit Drive Test Started ==========");

        try {

            EditDrive ed = new EditDrive(driver);

            logger.info("Clicking Search Icon");
            ed.clickSearchIcon();

            logger.info("Searching Drive ID : 119088");
            ed.enterSearchText("119088");

            logger.info("Submitting Search");
            ed.pressEnterInSearch();

            Thread.sleep(3000);

            logger.info("Clicking Three Dots Menu");
            ed.clickThreeDots();

            logger.info("Selecting Edit Drive Option");
            ed.clickEditDrive();

            logger.info("Opening Calendar");
            ed.clickCalendar();

            logger.info("Selecting New Date");
            // ed.clickFrwddate(); // Uncomment if required
            ed.selectDate();

            logger.info("Updating Reattempt Count to 5");
            ed.setReattemptCount("5");

            logger.info("Saving Edited Drive");
            ed.clickEditSave();

            logger.info("Navigating Back to Home");
            ed.clickbacktohome();

            Thread.sleep(3000);

            logger.info("Edit Drive Test Passed");

            Assert.assertTrue(true);

        } catch (Exception e) {

            logger.error("Edit Drive Test Failed");
            logger.error("Reason: {}", e.getMessage(), e);

            Assert.fail("Edit Drive Test Failed: " + e.getMessage(), e);
        }

        logger.info("========== Edit Drive Test Completed ==========");
    }
}