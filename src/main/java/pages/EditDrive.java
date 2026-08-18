package pages;

import base.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditDrive extends BasePage {
    public EditDrive(WebDriver driver) {
        super(driver);
    }

    //Locators
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[2]/div[1]/div[2]/div[1]/img[1]")
    WebElement searchIcon;

    @FindBy(xpath = "//input[@type='text']")
    WebElement searchBox;

    @FindBy(xpath = "//tbody/tr[1]/td[9]/button[1]/img[1]")

    WebElement threeDots;

    @FindBy(xpath = "//p[normalize-space()='Edit Drive']")
    WebElement editDrive;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-schedule-drive[1]/div[1]/form[1]/div[1]/div[5]/div[2]/div[1]/app-date-time-picker[1]/div[1]/input[2]")
    WebElement calendar;

  //  @FindBy(xpath = "//div[contains(@class,'flatpickr-calendar') and contains(@class,'open')]//span[@class='flatpickr-next-month']")
  //  WebElement date_frwd;

    @FindBy(xpath = "//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']//span[@aria-label='August 31, 2026'][normalize-space()='31']")
    WebElement selectDate;

    @FindBy(xpath = "//input[@id='noofreattempt']")
    WebElement reattemptCount;

    @FindBy(xpath = "//button[normalize-space()='Edit']")
    WebElement editSave;
    @FindBy(xpath = "//p[@class='text-card_Border_Color cursor-pointer']")
    WebElement btn_backtohome;



//Action methods

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void enterSearchText(String driveId) {
        searchBox.clear();
        searchBox.sendKeys(driveId);
    }

    public void pressEnterInSearch() {
        searchBox.sendKeys(Keys.ENTER);
    }


 //   public void clickThreeDots() {
  //      threeDots.click();
 //   }

public void clickThreeDots() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement threeDots = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//tbody//tr[1]//td[7]//button")));

        threeDots.click();
    }



    public void clickEditDrive() throws InterruptedException {
        editDrive.click();
        Thread.sleep(2000);
    }

    public void clickCalendar() throws InterruptedException {
        calendar.click();
        Thread.sleep(2000);

    }

  //  public void clickFrwddate() throws InterruptedException {
       // date_frwd.click();
   //     Thread.sleep(2000);

  //  }

    public void selectDate() throws InterruptedException {
        selectDate.click();
        Thread.sleep(2000);

    }

    public void setReattemptCount(String count) throws InterruptedException {
        reattemptCount.clear();
        reattemptCount.sendKeys(count);
        Thread.sleep(2000);

    }

    public void clickEditSave() throws InterruptedException {
        editSave.click();
        Thread.sleep(4000);

    }
    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(4000);
    }
    public void clickbacktohome() throws InterruptedException {
        btn_backtohome.click();
        Thread.sleep(3000);
    }

}
