package tests;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Sort_and_Filters;

public class SortFilterTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(SortFilterTest.class);

    @Test(priority = 1)
    public void sortByDate() {

        logger.info("========== Sort By Date Test Started ==========");

        try {

            Sort_and_Filters sf = new Sort_and_Filters(driver);

            logger.info("Sorting by Oldest First");
            sf.sortByOldestFirst();

            logger.info("Sorting by Latest First");
            sf.sortByLatestFirst();

            logger.info("Sort By Date Test Passed");

            Assert.assertTrue(true);

        } catch (Exception e) {

            logger.error("Sort By Date Test Failed");
            logger.error("Reason: {}", e.getMessage(), e);

            Assert.fail("Sort By Date Test Failed: " + e.getMessage(), e);
        }

        logger.info("========== Sort By Date Test Completed ==========");
    }

    @Test(priority = 2)
    public void filterByDate() {

        logger.info("========== Filter By Date Test Started ==========");

        try {

            Sort_and_Filters sf = new Sort_and_Filters(driver);

            logger.info("Applying Date Filter");
            sf.applyDateFilter();

            Thread.sleep(2000);

            logger.info("Opening Date Filter");
            sf.clickFilterByDate();

            Thread.sleep(2000);

            logger.info("Resetting Date Filter");
            sf.clickresetfilters();

            Thread.sleep(2000);

            logger.info("Filter By Date Test Passed");

            Assert.assertTrue(true);

        } catch (Exception e) {

            logger.error("Filter By Date Test Failed");
            logger.error("Reason: {}", e.getMessage(), e);

            Assert.fail("Filter By Date Test Failed: " + e.getMessage(), e);
        }

        logger.info("========== Filter By Date Test Completed ==========");
    }

    @Test(priority = 3)
    public void filterByFields() {

        logger.info("========== Filter By Fields Test Started ==========");

        try {

            Sort_and_Filters sf = new Sort_and_Filters(driver);

            logger.info("Filtering by Drive ID");
            sf.filterById("623996");

            Thread.sleep(1000);

            logger.info("Filtering by Drive Name");
            sf.filterByName("sql and python");

            Thread.sleep(1000);

            logger.info("Filtering by Assessment ID");
            sf.filterByAssessmentId("FR202605852");

            Thread.sleep(1000);

            logger.info("Filtering by Assessment Name");
            sf.filterByAssessmentName("ide and jupyter");

            Thread.sleep(1000);

            logger.info("Opening Filter Panel");
            sf.clickFilterBy();

            Thread.sleep(2000);

            logger.info("Clearing All Filters");
            sf.Clear_Filterby();

            Thread.sleep(3000);

            logger.info("Closing Filter Panel");
            sf.Close_Filterby();

            Thread.sleep(3000);

            logger.info("Filter By Fields Test Passed");

            Assert.assertTrue(true);

        } catch (Exception e) {

            logger.error("Filter By Fields Test Failed");
            logger.error("Reason: {}", e.getMessage(), e);

            Assert.fail("Filter By Fields Test Failed: " + e.getMessage(), e);
        }

        logger.info("========== Filter By Fields Test Completed ==========");
    }
}