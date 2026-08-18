package tests;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Create_Drive;

public class CreateDriveTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(CreateDriveTest.class);

    @Test
    public void createDrive() {

        logger.info("========== Create Drive Test Started ==========");

        try {

            Create_Drive cd = new Create_Drive(driver);
            logger.info("Clicking Schedule Drive button");
            cd.clickScheduleNew();

            logger.info("Selecting Assessment Drive");
            cd.clickScheduledAssessmentDrive();


            logger.info("Entering Drive Name");
            cd.enterDriveName("Test drive August");

            logger.info("Entering Role");
            cd.enterRole("QA");

            logger.info("Selecting Assessment");
            cd.clickAssessmentDropdown();
            cd.selectAssessment();

            logger.info("Selecting From Date");
            cd.clickFromDate();
            cd.selectFromDate();

            logger.info("Selecting To Date");
            cd.clickToDate();
            cd.clickForwardToDate();
            cd.selectToDate();

            logger.info("Scrolling down");
            cd.scrollDown();

            logger.info("Enabling Registration");
            cd.clickRegistrationToggle();

            logger.info("Selecting Email Template");
            cd.clickEmailTemplateDropdown();
            cd.selectEmailTemplate();
            logger.info("Clicking Schedule button");
            cd.clickSchedule();
            Thread.sleep(4000);
            logger.info("Navigating back to Home");
            cd.clickbacktohome();
            Thread.sleep(3000);

            logger.info("Create Drive Test Passed");

            Assert.assertTrue(true);

        } catch (Exception e) {

            logger.error("Create Drive Test Failed");
            logger.error("Reason: {}", e.getMessage(), e);

            Assert.fail("Create Drive Test Failed: " + e.getMessage(), e);
        }

        logger.info("========== Create Drive Test Completed ==========");
    }
}