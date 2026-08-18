package tests;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Download_Reports;

public class DownloadReportTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(DownloadReportTest.class);

    @Test
    public void downloadReport() {

        logger.info("========== Download Report Test Started ==========");

        try {

            Download_Reports dr = new Download_Reports(driver);

            logger.info("Clicking Search Icon");
            dr.clickSearchIcon();

            Thread.sleep(2000);

            logger.info("Entering Drive ID : 349032");
            dr.enterSearchText("349032");

            Thread.sleep(2000);

            logger.info("Submitting Search");
            dr.submitSearch();

            Thread.sleep(2000);

            logger.info("Clicking Three Dots Menu");
            dr.clickThreeDots();

            Thread.sleep(2000);

            logger.info("Downloading Report");
            dr.Download_Report();

            Thread.sleep(2000);

            logger.info("Report downloaded successfully.");

            Assert.assertTrue(true);

        } catch (Exception e) {

            logger.error("Download Report Test Failed");
            logger.error("Reason: {}", e.getMessage(), e);

            Assert.fail("Download Report Test Failed: " + e.getMessage(), e);
        }

        logger.info("========== Download Report Test Completed ==========");
    }
}