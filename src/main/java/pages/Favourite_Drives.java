package pages;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Favourite_Drives extends BasePage {

    public Favourite_Drives (WebDriver driver)
    {
        super(driver);
    }


    //Web Elements

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[2]/div[1]/div[2]/div[1]/img[1]")
    WebElement searchIcon;

    @FindBy(xpath = "//input[@type='text']")
    WebElement searchBox;

    @FindBy(xpath = "//img[@alt='three_dots']")
    WebElement threeDots;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[2]/div[2]/table[1]/tbody[1]/div[1]/tr[1]/td[7]/div[1]/div[2]/div[6]/p[1]")
    WebElement Markasfavourite;

    @FindBy(xpath = "//button[normalize-space()='Add to Favourites']")
    WebElement addtofavourites;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[2]/div[1]/div[1]/button[1]/div[1]")
    WebElement Dropdown;

    @FindBy(xpath = "//p[normalize-space()='Favourite Drives']")
    WebElement favouritedrives;
    @FindBy(xpath = "//p[normalize-space()='Scheduled Drives']")
    WebElement scheduledrives;

    @FindBy(xpath = "//span[normalize-space()='645946']")
    WebElement drivedisplay;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[2]/div[2]/table[1]/tbody[1]/div[1]/tr[1]/td[7]/div[1]/div[2]/div[6]/p[1]")
    WebElement removeFromFavourite;

    @FindBy(xpath = "//button[normalize-space()='Remove from Favourites']")
    WebElement confirmremoveFromFavourite;

    @FindBy(xpath = "//p[normalize-space()='Candidates']")
    WebElement btn_candidates;
    @FindBy(xpath = "//p[normalize-space()='Drives']")
    WebElement btn_Drives;



    //Action methods

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void enterSearchText(String driveId) {
        searchBox.clear();
        searchBox.sendKeys(driveId);
    }
    public void submitSearch() {
        searchBox.sendKeys(Keys.ENTER);
    }

    public void clickThreeDots() {
        threeDots.click();
    }

    public void clickmarkasfavourite() {
        Markasfavourite.click();
    }

    public void clickaddtofavourite() {
        addtofavourites.click();
    }

    public void clickdropdown() {
        Dropdown.click();
    }

    public void clickfavouritedrives() {
        favouritedrives.click();
    }

    public boolean isDriveDisplayed() {

        try {
            return drivedisplay.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickRemoveFromFavourite() {
        removeFromFavourite.click();
    }
    public void clickscheduledrives() {
        scheduledrives.click();
    }

    public void clickconfirmRemoveFromFavourite() {
        confirmremoveFromFavourite.click();
    }


    public void clickcandidates() {
        btn_candidates.click();
    }

    public void clickDrives() {
        btn_Drives.click();
    }









}
