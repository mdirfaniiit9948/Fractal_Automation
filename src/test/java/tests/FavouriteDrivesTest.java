package tests;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Favourite_Drives;

public class FavouriteDrivesTest extends BaseTest {

    private static final Logger logger =
            LogManager.getLogger(FavouriteDrivesTest.class);

    @Test(priority = 0)
    public void verifyAddDriveToFavourite() throws InterruptedException {

        Favourite_Drives favourite = new Favourite_Drives(driver);

        logger.info("===== Favourite Drive Test Started =====");

        // Search for Drive
        favourite.clickSearchIcon();
        logger.info("Clicked on Search Icon");

        favourite.enterSearchText("645946");
        logger.info("Entered Drive ID");

        favourite.submitSearch();
        Thread.sleep(2000);

        favourite.clickThreeDots();
        Thread.sleep(2000);

        // Mark as Favourite
        favourite.clickmarkasfavourite();
        logger.info("Clicked on Mark as Favourite");
        Thread.sleep(2000);
        favourite.clickaddtofavourite();
        logger.info("Clicked on Add to Favourites");

        Thread.sleep(2000);

        // Navigate to Favourite Drives
        favourite.clickdropdown();
        logger.info("Clicked on Dropdown");
        Thread.sleep(2000);
        favourite.clickfavouritedrives();
        logger.info("Opened Favourite Drives");

        Thread.sleep(2000);

        // Validation

        Assert.assertTrue(
                favourite.isDriveDisplayed(),
                "Favourite Drive is not displayed.");

        logger.info("Favourite Drive displayed successfully.");
        logger.info("===== Favourite Drive Test Passed =====");
        Thread.sleep(3000);
    }

    @Test (priority = 1)
    public void verifyRemoveFromFavourite() throws InterruptedException {

        Favourite_Drives favourite = new Favourite_Drives(driver);

        logger.info("===== Remove Favourite Drive Test Started =====");

        // Navigate to scheduledrives Drives
        favourite.clickdropdown();
        logger.info("Clicked on Dropdown");
        Thread.sleep(2000);
        favourite.clickscheduledrives();
        Thread.sleep(2000);
        logger.info("Opened scheduledrives Drives");

        Thread.sleep(2000);

        favourite.clickSearchIcon();
        logger.info("Clicked on Search Icon");

    //    favourite.enterSearchText("645946");
    //    logger.info("Entered Drive ID");

     //   favourite.submitSearch();
     //   Thread.sleep(2000);

        // Click three dots
        favourite.clickThreeDots();
        logger.info("Clicked on Three Dots");

        Thread.sleep(1000);

        // Remove from Favourite
        favourite.clickRemoveFromFavourite();
        logger.info("Clicked on Remove from Favourites");
        Thread.sleep(2000);
        favourite.clickconfirmRemoveFromFavourite();
        logger.info("Clicked on confirm Remove from Favourites");

        Thread.sleep(2000);

        // Navigate to Favourite Drives
        favourite.clickdropdown();
        logger.info("Clicked on Dropdown");
        Thread.sleep(2000);
        favourite.clickfavouritedrives();
        logger.info("Opened Favourite Drives");

        Thread.sleep(2000);
        // Validation


        Assert.assertFalse(
                favourite.isDriveDisplayed(),
                "Drive is still displayed in Favourite Drives."
        );

        logger.info("Drive removed successfully from Favourite Drives");
        Thread.sleep(2000);

        favourite.clickdropdown();
        logger.info("Clicked on Dropdown");
        favourite.clickscheduledrives();
        Thread.sleep(2000);
        favourite.clickcandidates();
        Thread.sleep(2000);
        favourite.clickDrives();
        Thread.sleep(2000);
    }



}