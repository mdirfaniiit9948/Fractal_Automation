package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sort_and_Filters extends BasePage {

    public Sort_and_Filters(WebDriver driver){
        super(driver);
    }

    // Sort By Locators
    @FindBy(xpath = "//button[normalize-space()='Sort by']")
    WebElement btn_sortBy;

    @FindBy(xpath = "//span[normalize-space()='Oldest First']")
    WebElement option_oldestFirst;

    @FindBy(xpath = "//span[normalize-space()='Latest First']")
    WebElement option_latestFirst;

    // Filter By Date Locators
    @FindBy(xpath = "//button[normalize-space()='Filter by Date']")
    WebElement btn_filterByDate;

    @FindBy(xpath = "//app-date-time-picker[@placeholder='Select Start Date']//input[2]")
    WebElement txt_startDate;

    @FindBy(xpath = "//div[@class='flatpickr-calendar animate open arrowTop arrowLeft']//span[@aria-label='August 1, 2026'][normalize-space()='1']")
    WebElement date_startDate;

    @FindBy(xpath = "//app-date-time-picker[@placeholder='Select End Date']//input[2]")
    WebElement txt_endDate;

    @FindBy(xpath = "//div[@class='flatpickr-calendar animate open arrowBottom arrowLeft']//span[@aria-label='August 10, 2026'][normalize-space()='10']")
    WebElement date_endDate;

    @FindBy(xpath = "//button[normalize-space()='Apply Filter']")
    WebElement btn_applyFilter;

    @FindBy(xpath = "//button[normalize-space()='Reset All']")
    WebElement btn_resetfilters;



    // Filter By Locators
    @FindBy(xpath = "//button[normalize-space()='Filter by']")
    WebElement btn_filterBy;

    @FindBy(xpath = "//input[@id='column']")
    WebElement dropdown_column;

    @FindBy(xpath = "//li[normalize-space()='ID']")
    WebElement option_id;

    @FindBy(xpath = "//li[normalize-space()='Name']")
    WebElement option_name;

    @FindBy(xpath = "//li[normalize-space()='Assessment Id']")
    WebElement option_assessmentId;

    @FindBy(xpath = "//li[normalize-space()='Assessment Name']")
    WebElement option_assessmentName;

    @FindBy(xpath = "//input[@placeholder='Enter']")
    WebElement txt_enterValue;

    @FindBy(xpath = "//button[normalize-space()='Reset All']")
    WebElement txt_resetfilterby;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-hr[1]/app-drive-dashboard[1]/div[1]/app-drive-details[1]/div[2]/div[1]/div[2]/form[1]/div[1]/img[1]")
    WebElement txt_closefilterby;


    // Sort By Action Methods
    public void clickSortBy() {
        btn_sortBy.click();
    }

    public void selectOldestFirst() {
        option_oldestFirst.click();
    }

    public void selectLatestFirst() {
        option_latestFirst.click();
    }

    public void sortByOldestFirst() throws InterruptedException {
        clickSortBy();
        Thread.sleep(2000);
        selectOldestFirst();
        Thread.sleep(2000);
    }

    public void sortByLatestFirst() throws InterruptedException {
        clickSortBy();
        Thread.sleep(2000);
        selectLatestFirst();
        Thread.sleep(2000);
    }

    // Filter By Date Action Methods
    public void clickFilterByDate() throws InterruptedException {
        btn_filterByDate.click();

    }


    public void clickStartDateField() throws InterruptedException {
        txt_startDate.click();
        Thread.sleep(1000);
    }

    public void selectStartDate() throws InterruptedException {
        date_startDate.click();

    }

    public void clickEndDateField() throws InterruptedException {
        txt_endDate.click();

    }

    public void selectEndDate() throws InterruptedException {
        date_endDate.click();

    }

    public void clickApplyFilter() throws InterruptedException {
        btn_applyFilter.click();

    }

    public void clickresetfilters() throws InterruptedException {
        btn_resetfilters.click();

    }

    public void applyDateFilter() throws InterruptedException {
        clickFilterByDate();
        Thread.sleep(2000);
        clickStartDateField();
        Thread.sleep(2000);
        selectStartDate();
        Thread.sleep(3000);
        clickEndDateField();
        Thread.sleep(3000);
        selectEndDate();
        Thread.sleep(3000);
        clickApplyFilter();
        Thread.sleep(3000);
    }

    // Filter By Action Methods
    public void clickFilterBy() throws InterruptedException {
        btn_filterBy.click();
        Thread.sleep(2000);
    }

    public void clickColumnDropdown() throws InterruptedException {
        dropdown_column.click();
        Thread.sleep(2000);
    }

    public void selectIdColumn() throws InterruptedException {
        option_id.click();
        Thread.sleep(2000);
    }

    public void selectNameColumn() throws InterruptedException {
        option_name.click();
        Thread.sleep(2000);
    }

    public void selectAssessmentIdColumn() throws InterruptedException {
        option_assessmentId.click();
        Thread.sleep(2000);
    }

    public void selectAssessmentNameColumn() throws InterruptedException {
        option_assessmentName.click();
        Thread.sleep(2000);
    }

    public void Clear_Filterby() throws InterruptedException {
        txt_resetfilterby.click();
        Thread.sleep(2000);
    }

    public void Close_Filterby() throws InterruptedException {
        txt_closefilterby.click();
        Thread.sleep(2000);
    }



    public void enterFilterValue(String value) {
        txt_enterValue.clear();
        txt_enterValue.sendKeys(value);
    }

    public void filterById(String id) throws InterruptedException {
        clickFilterBy();
        clickColumnDropdown();
        selectIdColumn();
        enterFilterValue(id);
        clickApplyFilter();
    }

    public void filterByName(String name) throws InterruptedException {
        clickFilterBy();
        clickColumnDropdown();
        selectNameColumn();
        enterFilterValue(name);
        clickApplyFilter();
    }

    public void filterByAssessmentId(String assessmentId) throws InterruptedException {
        clickFilterBy();
        clickColumnDropdown();
        selectAssessmentIdColumn();
        enterFilterValue(assessmentId);
        clickApplyFilter();
    }

    public void filterByAssessmentName(String assessmentName) throws InterruptedException {
        clickFilterBy();
        clickColumnDropdown();
        selectAssessmentNameColumn();
        enterFilterValue(assessmentName);
        clickApplyFilter();
    }


}



