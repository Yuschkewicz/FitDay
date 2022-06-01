package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public static final By USER_NAME = By.id("username");
    public static final By PASSWORD = By.cssSelector("input[type='password']");
    public static final By LOGIN_BUTTON = By.cssSelector("input[type='submit']");
    public static final By ERROR_NAME_MESSAGE = By.xpath("//p[text()='Username is required.']");
    public static final By ERROR_PASSWORD_MESSAGE = By.xpath("//p[text()='Password is required.']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(LOGIN_BUTTON);
    }

    @Step("Opening login page")
    public void openPage() {
        driver.get(startUrl + "fitness/Login.html");
        PageFactory.initElements(driver, this);
    }


    @Step("Log in by user '{user}' with password '{password}'")
    public LoginPage login(String user, String password) {
        driver.get(startUrl + "fitness/Login.html");
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys(user);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
        return this;


    }

    public String getNameError() {
        return driver.findElement(ERROR_NAME_MESSAGE).getText();
    }

    public String getPasswordError() {
        return driver.findElement(ERROR_PASSWORD_MESSAGE).getText();
    }
}
