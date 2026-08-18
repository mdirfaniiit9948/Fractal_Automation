package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;


    // Locators
    private By usernameField = By.xpath("//input[@type='email']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By loginButton = By.xpath("//button[normalize-space()='Login']");

    // Update this xpath according to your application error message
    private By errorMessage = By.xpath("//*[contains(text(),'Invalid') or contains(text(),'incorrect')]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void setUserName(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField))
                .clear();
        driver.findElement(usernameField).sendKeys(username);
    }


    public void setPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField))
                .clear();
        driver.findElement(passwordField).sendKeys(password);
    }


    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton))
                .click();
    }


    public boolean isErrorDisplayed() {

        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(errorMessage)
            ).isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }


    public boolean isDashboardDisplayed() {

        return driver.getCurrentUrl()
                .contains("/hr/drive-dashboard");
    }


    // Optional: clear fields after failed login
    public void clearLoginFields() {

        driver.findElement(usernameField).clear();
        driver.findElement(passwordField).clear();

    }
}