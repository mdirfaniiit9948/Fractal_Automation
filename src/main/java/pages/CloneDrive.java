package pages;
import base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloneDrive  extends BasePage {
    public CloneDrive (WebDriver driver) {
        super(driver);
    }
    //Web Elements
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[2]/div[1]/div[2]/div[1]/img[1]")
    WebElement searchIcon;

    @FindBy(xpath = "//input[@type='text']")
    WebElement searchBox;

    @FindBy(xpath = "//tbody/div[1]/tr[1]/td[7]/div[1]/div[1]/button[1]/img[1]")
    WebElement threeDots;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[2]/div[2]/table[1]/tbody[1]/div[1]/tr[1]/td[7]/div[1]/div[2]/div[1]/p[1]")
    WebElement cloneDriveOption;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-schedule-drive[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/app-date-time-picker[1]/div[1]/input[2]")
    WebElement fromCalendar;

    @FindBy(xpath = "//div[@class='flatpickr-calendar hasTime animate open arrowBottom arrowLeft']//span[@aria-label='August 12, 2026'][normalize-space()='12']")
    WebElement fromDate;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-schedule-drive[1]/div[1]/form[1]/div[1]/div[5]/div[2]/div[1]/app-date-time-picker[1]/div[1]/input[2]")
    WebElement toCalendar;

    @FindBy(xpath = "//div[contains(@class,'flatpickr-calendar') and contains(@class,'open')]//span[@class='flatpickr-next-month']")
    WebElement date_frwd;

    @FindBy(xpath = "//span[@aria-label='September 30, 2026']")
    WebElement toDate;

    @FindBy(xpath = "//button[normalize-space()='Clone']")

    WebElement cloneButton;

    @FindBy(xpath = "//p[@class='text-card_Border_Color cursor-pointer']")
    WebElement btn_backtohome;


    //Action methods
    public void clickSearchIcon() throws InterruptedException {
        searchIcon.click();
        Thread.sleep(2000);

    }

    public void enterSearchText(String text) throws InterruptedException {
        searchBox.clear();
        searchBox.sendKeys(text);
        Thread.sleep(2000);

    }

    public void submitSearch() throws InterruptedException {
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }

    public void clickThreeDots() throws InterruptedException {
        threeDots.click();
        Thread.sleep(2000);

    }

    public void clickCloneDriveOption() throws InterruptedException {
        cloneDriveOption.click();
        Thread.sleep(2000);

    }

    public void openFromCalendar() throws InterruptedException {
        fromCalendar.click();
        Thread.sleep(2000);

    }

    public void selectFromDate() throws InterruptedException {
        fromDate.click();
        Thread.sleep(2000);

    }

    public void openToCalendar() throws InterruptedException {
        toCalendar.click();
        Thread.sleep(2000);

    }

    public void openTofrwddate() {
        date_frwd.click();
    }

    public void selectToDate() throws InterruptedException {
        toDate.click();
        Thread.sleep(2000);

    }

    //public void scrollDown(int pixels) {
    //  ((JavascriptExecutor) driver)
    //        .executeScript("window.scrollBy(0, arguments[0]);", pixels);

    public void scrollDown() throws InterruptedException {

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(4000);
    }
    public void clickCloneButton() throws InterruptedException {
        cloneButton.click();
        Thread.sleep(2000);
    }


    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.documentElement.scrollHeight);");
    }

    public void clickbacktohome() throws InterruptedException {
        btn_backtohome.click();
        Thread.sleep(3000);

    }

}
