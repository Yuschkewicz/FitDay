package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public static final By USER_NAME = By.id("username");
    public static final By PASSWORD = By.cssSelector("input[type='password']");
    public static final By LOGIN_BUTTON = By.cssSelector("input[type='submit']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(LOGIN_BUTTON);
    }

    public LoginPage login(String user, String password) {
        driver.get(startUrl + "fitness/Login.html");
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys(user);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
        return this;


    }
}
