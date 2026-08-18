package pages;

import base.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsolidatedReports extends BasePage {

    public ConsolidatedReports(WebDriver driver) {
        super(driver);
    }

    // Filter By Locators
    @FindBy(xpath = "//button[normalize-space()='Filter by']")
    WebElement btn_filterBy;

    @FindBy(xpath = "//input[@id='column']")
    WebElement dropdown_column;

    @FindBy(xpath = "//li[normalize-space()='Assessment Id']")
    WebElement option_assessmentId;
    @FindBy(xpath = "//input[@placeholder='Enter']")
    WebElement txt_enterValue;

    @FindBy(xpath = "//button[normalize-space()='Apply Filter']")
    WebElement btn_applyFilter;

    @FindBy(xpath = "//tbody/div[1]/tr[1]/td[1]/div[1]/input[1]")
    WebElement checkbox1;
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[2]/div[2]/table[1]/tbody[1]/div[3]/tr[1]/td[1]/div[1]/input[1]")
    WebElement checkbox2;

    @FindBy(xpath = "//button[normalize-space()='Generate Consolidated Report']")
    WebElement btn_generate_consolidated_report;

    @FindBy(xpath = "//input[@placeholder='Enter report name']")
    WebElement txt_enter_reportname;

    @FindBy(xpath = "//input[@id='condition']")
    WebElement drpodown_select_reporttype;

    @FindBy(xpath = "//li[normalize-space()='ALL']")
    WebElement drpodown_select_All;

    @FindBy(xpath = "//button[normalize-space()='Generate']")
    WebElement btn_Generate;

    @FindBy(xpath = "//p[normalize-space()='Consolidated Report']")
    WebElement btn_consolidated_report_module;

    @FindBy(xpath = "//p[@title='Automationreport']")
    WebElement Automationreportdisplay;



    // Filter By Action Methods
    public void clickFilterBy() throws InterruptedException {
        btn_filterBy.click();
        Thread.sleep(2000);
    }

    public void clickColumnDropdown() throws InterruptedException {
        dropdown_column.click();
        Thread.sleep(2000);
    }

    public void selectAssessmentIdColumn() throws InterruptedException {
        option_assessmentId.click();
        Thread.sleep(2000);
    }

    public void enterFilterValue(String value) {
        txt_enterValue.clear();
        txt_enterValue.sendKeys(value);
    }
    public void clickApplyFilter() throws InterruptedException {
        btn_applyFilter.click();

    }

    public void filterByAssessmentId(String assessmentId) throws InterruptedException {
        clickFilterBy();
        clickColumnDropdown();
        selectAssessmentIdColumn();
        enterFilterValue(assessmentId);
        clickApplyFilter();
    }

    // Select First Checkbox
    public void selectFirstCheckbox() throws InterruptedException {
        checkbox1.click();
        Thread.sleep(2000);
    }

    // Select Second Checkbox
    public void selectSecondCheckbox() throws InterruptedException {
        checkbox2.click();
        Thread.sleep(2000);
    }

    // Select Both Checkboxes
    public void selectReports() throws InterruptedException {
        selectFirstCheckbox();
        selectSecondCheckbox();
    }

    // Click Generate Consolidated Report Button
    public void clickGenerateConsolidatedReport() throws InterruptedException {
        btn_generate_consolidated_report.click();
        Thread.sleep(2000);
    }

    // Enter Report Name
    public void enterReportName(String reportName) {
        txt_enter_reportname.clear();
        txt_enter_reportname.sendKeys(reportName);
    }

    // Click Report Type Dropdown
    public void clickReportTypeDropdown() throws InterruptedException {
        drpodown_select_reporttype.click();
        Thread.sleep(2000);
    }

    // Select ALL Report Type
    public void selectAllReportType() throws InterruptedException {
        drpodown_select_All.click();
        Thread.sleep(2000);
    }

    // Click Generate Button
    public void clickGenerateButton() throws InterruptedException {
        btn_Generate.click();
        Thread.sleep(3000);
    }

    //click consolidated report module
    public void clickConsolidatedreportmodule() throws InterruptedException {
        btn_consolidated_report_module.click();
        Thread.sleep(3000);
    }

    //Report check
    public boolean isReportDisplayed() {

        try {
            return Automationreportdisplay.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }



}
