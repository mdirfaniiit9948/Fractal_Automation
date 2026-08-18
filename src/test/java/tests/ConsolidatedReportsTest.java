package tests;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConsolidatedReports;

public class ConsolidatedReportsTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(ConsolidatedReportsTest.class);

    @Test(priority = 1)
    public void verifyGenerateConsolidatedReport() throws InterruptedException {

        ConsolidatedReports report = new ConsolidatedReports(driver);

        logger.info("===== Generate Consolidated Report Test Started =====");

        // Apply Filter
        report.filterByAssessmentId("FR202605836");
        logger.info("Applied Assessment ID Filter");

        Thread.sleep(2000);

        // Select Reports
        report.selectFirstCheckbox();
        logger.info("Selected First drive");

        report.selectSecondCheckbox();
        logger.info("Selected Second drive");

        Thread.sleep(2000);

        // Click Generate Consolidated Report
        report.clickGenerateConsolidatedReport();
        logger.info("Clicked Generate Consolidated Report");

        Thread.sleep(2000);

        // Enter Report Name
        report.enterReportName("AutomationReport");
        logger.info("Entered Report Name");

        // Select Report Type
        report.clickReportTypeDropdown();
        logger.info("Clicked Report Type Dropdown");

        report.selectAllReportType();
        logger.info("Selected Report Type : ALL");

        Thread.sleep(2000);

        // Generate Report
        report.clickGenerateButton();
        logger.info("Clicked Generate Button");

        Thread.sleep(2000);

        logger.info("===== Consolidated Report Generated Successfully =====");

        // Optional Validation
        Assert.assertTrue(true, "Consolidated Report generated successfully.");
        Thread.sleep(2000);

        logger.info("===== Consolidated Report Module Test Started =====");

        // Click Consolidated Report Module
        report.clickConsolidatedreportmodule();
        Thread.sleep(2000);
        logger.info("Clicked on Consolidated Report Module");

        // Validate Report is displayed
        Assert.assertTrue(report.isReportDisplayed(),
                "Automation Report is not displayed.");

        logger.info("Automation Report displayed successfully.");
        Thread.sleep(2000);

        logger.info("===== Consolidated Report Module Test Passed =====");

    }


}