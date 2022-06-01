package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage {
    public static final By USER_TITLE=By.cssSelector("[id='profile-link']");


    public DashBoardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(USER_TITLE);
    }

    @Step("Opening DashBoardPage")
    public void openDashBoardPage() {
        driver.get(startUrl + "app/dashboard");
        PageFactory.initElements(driver, this);
    }


    public void addFood() {
        driver.get(startUrl + "app/dashboard");
        driver.findElement(By.xpath("(//a[contains(@class,'add')])[1]")).click();
        waitForElement(By.xpath("//strong[contains(text(),'Search')]"));

    }


    public void addActivity() {
        driver.findElement(By.xpath("(//a[contains(@class,'add')])[2]")).click();
        waitForElement(By.xpath("//select[@id='activity-browse']"));


    }




}
