package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Download_Merged_URLs extends BasePage {

    public Download_Merged_URLs(WebDriver driver)
    {

        super(driver);
    }


    //Web Elements
    @FindBy(xpath = "//button[normalize-space()='Filter by']")
    WebElement btn_filterBy;

    @FindBy(xpath = "//input[@id='column']")
    WebElement dropdown_column;

    @FindBy(xpath = "//li[normalize-space()='ID']")
    WebElement option_id;

    @FindBy(xpath = "//input[@placeholder='Enter']")
    WebElement txt_enterValue;


    @FindBy(xpath = "//p[normalize-space()='Candidates']")
    WebElement candidates;

    @FindBy(xpath = "//p[normalize-space()='Drives']")
    WebElement Drives;
    @FindBy(xpath = "//button[normalize-space()='Apply Filter']")
    WebElement btn_applyFilter;

  /*  @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[1]/div[2]/div[1]/div[2]/div[1]/img[1]")
    WebElement searchIcon;

    @FindBy(xpath = "//input[@type='text']")
    WebElement searchBox;
*/

    @FindBy(xpath = "//img[@alt='three_dots']")
    WebElement threeDots;

    @FindBy(xpath = "//div[4]//p[1]")
    WebElement MergedURLs;




    //Action methods
    public void clickCandidatespage() {
        candidates.click();
    }

    public void clickDrivespage() {
        Drives.click();
    }

    public void btnfilterBy() {
        btn_filterBy.click();
    }

    public void dropdowncolumn() {
        dropdown_column.click();
    }
    public void optionid(){
        option_id.click();
    }
    public void txtEnterValue(String Driveid ) {
        txt_enterValue.sendKeys(Driveid);
    }
    public void applyFilter(){
        btn_applyFilter.click();
    }

    public void clickThreeDots() {
        threeDots.click();
    }

    public void Download_Mergedurls() {
        MergedURLs.click();
    }




}
