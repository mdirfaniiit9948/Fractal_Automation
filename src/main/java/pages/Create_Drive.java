package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Create_Drive extends BasePage {
    public Create_Drive(WebDriver driver) {
        super(driver);
    }

    //Locators
    @FindBy(xpath ="//button[normalize-space()='Schedule Drive']")//
            WebElement txt_ScheduleDrive;
    @FindBy(xpath ="//span[normalize-space()='Create Assessment Drive']")

    WebElement txt_scdaassmtdrv;
    @FindBy(xpath = "//input[@placeholder='Enter Drive Name']")
    WebElement txt_drivename;

    @FindBy(xpath = "//input[@placeholder='Enter Role']")
    WebElement txt_role;

    @FindBy(xpath = "//input[@id='assessmentConfigId']")
    WebElement ddl_assessment;

    @FindBy(xpath = "//li[normalize-space()='Video essay custom testing - FR202607067']")
    WebElement opt_assessment;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-schedule-drive[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/app-date-time-picker[1]/div[1]/input[2]")
    WebElement txt_fromDate;

    @FindBy(xpath = "//div[@class='flatpickr-calendar hasTime animate open arrowBottom arrowLeft']//span[@aria-label='August 12, 2026'][normalize-space()='12']")
    WebElement date_fromDate;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-schedule-drive[1]/div[1]/form[1]/div[1]/div[5]/div[2]/div[1]/app-date-time-picker[1]/div[1]/input[2]")
    WebElement txt_toDate;

    @FindBy(xpath = "//div[contains(@class,'flatpickr-calendar') and contains(@class,'open')]//span[@class='flatpickr-next-month']")
    WebElement date_frwd;

    @FindBy(xpath = "//span[@aria-label='September 25, 2026']")
    WebElement date_toDate;

    @FindBy(xpath = "//label[@for='ng-toggle-5']//div[@class='ng-toggle-switch-core']")
    WebElement toggle_registration;

    @FindBy(xpath = "//input[@id='mailTemplate']")
    WebElement ddl_emailTemplate;

    @FindBy(xpath = "//li[normalize-space()='send drive registration email']")
    WebElement opt_emailTemplate;

    @FindBy(xpath = "//button[normalize-space()='Schedule']")
    WebElement btn_schedule;

    @FindBy(xpath = "//p[@class='text-card_Border_Color cursor-pointer']")
    WebElement btn_backtohome;



    //*********************** Action Methods ************************//

    //*********************** Action Methods ************************//

    // Click on Schedule New button
    public void clickScheduleNew() throws InterruptedException {
        txt_ScheduleDrive.click();
        Thread.sleep(2000);
    }

    // Click on Scheduled Assessment Drive
    public void clickScheduledAssessmentDrive() throws InterruptedException {
        txt_scdaassmtdrv.click();
        Thread.sleep(2000);
    }
    // Enter Drive Name
    public void enterDriveName(String driveName) throws InterruptedException {
        txt_drivename.sendKeys(driveName);
        Thread.sleep(2000);
    }

    // Enter Role
    public void enterRole(String role) throws InterruptedException {
        txt_role.sendKeys(role);
        Thread.sleep(2000);
    }

    // Click Assessment Dropdown
    public void clickAssessmentDropdown() throws InterruptedException {
        ddl_assessment.click();
        Thread.sleep(2000);
    }

    // Select Assessment
    public void selectAssessment() throws InterruptedException {
        opt_assessment.click();
        Thread.sleep(2000);
    }

    // Click From Date Calendar
    public void clickFromDate() throws InterruptedException {
        txt_fromDate.click();
        Thread.sleep(2000);
    }

    // Select From Date
    public void selectFromDate() throws InterruptedException {
        date_fromDate.click();
        Thread.sleep(2000);
    }

    // Click To Date Calendar
    public void clickToDate() throws InterruptedException {
        txt_toDate.click();
        Thread.sleep(3000);
    }

    // Click forward To Date Calendar
    public void clickForwardToDate() throws InterruptedException {

        date_frwd.click();
        Thread.sleep(3000);

    }

    // Select To Date
    public void selectToDate() throws InterruptedException {
        date_toDate.click();
        Thread.sleep(2000);
    }

    // Scroll Down
    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(4000);
    }

    // Click Registration Toggle
    public void clickRegistrationToggle() throws InterruptedException {
        toggle_registration.click();
        Thread.sleep(2000);
    }

    // Click Email Template Dropdown
    public void clickEmailTemplateDropdown() throws InterruptedException {
        ddl_emailTemplate.click();
        Thread.sleep(2000);
    }

    // Select Email Template
    public void selectEmailTemplate() throws InterruptedException {
        opt_emailTemplate.click();
        Thread.sleep(2000);
    }

    // Click Schedule Button
    public void clickSchedule() throws InterruptedException {
        btn_schedule.click();
        Thread.sleep(7000);
    }


    // Click back to home Button
    public void clickbacktohome() throws InterruptedException {
        btn_backtohome.click();
        Thread.sleep(3000);
    }


}
