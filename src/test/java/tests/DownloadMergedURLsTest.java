package tests;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Download_Merged_URLs;

public class DownloadMergedURLsTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(DownloadMergedURLsTest.class);

    @Test
    public void downloadMergedURLs() {

        logger.info("========== Download Merged URLs Test Started ==========");

        try {

            Download_Merged_URLs dm = new Download_Merged_URLs(driver);

            logger.info("Navigating to Candidates Page");
            dm.clickCandidatespage();

            Thread.sleep(2000);

            logger.info("Navigating to Drives Page");
            dm.clickDrivespage();

            Thread.sleep(2000);

            logger.info("Opening Filter");
            dm.btnfilterBy();

            Thread.sleep(2000);

            logger.info("Selecting Filter Column");
            dm.dropdowncolumn();

            Thread.sleep(2000);

            logger.info("Selecting Drive ID Filter");
            dm.optionid();

            Thread.sleep(2000);

            logger.info("Entering Drive ID : 349032");
            dm.txtEnterValue("349032");

            Thread.sleep(2000);

            logger.info("Applying Filter");
            dm.applyFilter();

            Thread.sleep(2000);

            logger.info("Clicking Three Dots");
            dm.clickThreeDots();

            Thread.sleep(2000);

            logger.info("Downloading Merged URLs");
            dm.Download_Mergedurls();

            logger.info("Merged URLs downloaded successfully.");

            Assert.assertTrue(true);

        } catch (Exception e) {

            logger.error("Download Merged URLs Test Failed");
            logger.error("Reason: {}", e.getMessage(), e);

            Assert.fail("Download Merged URLs Test Failed: " + e.getMessage(), e);
        }

        logger.info("========== Download Merged URLs Test Completed ==========");
    }
}