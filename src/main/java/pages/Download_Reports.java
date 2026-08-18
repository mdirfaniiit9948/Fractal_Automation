package pages;


import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Download_Reports extends BasePage {

    public Download_Reports(WebDriver driver)
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

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[2]/div[2]/table[1]/tbody[1]/div[1]/tr[1]/td[7]/div[1]/div[2]/div[3]/p[1]")
    WebElement Downloadreport;




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

    public void Download_Report() {
        Downloadreport.click();
    }





}
