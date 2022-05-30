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

    }


    public void addActivity() {
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[1]" +
                "/table[1]/tbody[1]/tr[3]/td[2]/a[1]/span[2]")).click();
        waitForElement(By.xpath("//select[@id='activity-browse']"));


    }

//under reconstruction


    public void weight() {
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/a[1]/span[2]")).click();
        waitForElement(By.xpath("//th[contains(text(),'WEIGHT GOAL')]"));
        waitForElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/a[1]/span[2]"));
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/a[1]/span[2]")).click();
        waitForElement(By.xpath("//tbody/tr[2]/td[1]/form[1]/input[1]"));
        driver.findElement(By.xpath("//tbody/tr[2]/td[1]/form[1]/input[1]")).clear();
        driver.findElement(By.xpath("//tbody/tr[2]/td[1]/form[1]/input[1]")).sendKeys("88");
        driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
        // waitForElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/a[1]/span[2]"));
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]")).click();
//        waitForElement(By.xpath("//span[contains(text(),'Delete')]"));
//        waitForElement(By.xpath("//input[@id='goaldate']"));
        driver.findElement(By.xpath("//input[@id='startweight']")).clear();
        driver.findElement(By.xpath("//input[@id='startweight']")).sendKeys("86");
        //driver.findElement(By.xpath("//body[1]/div[4]/table[1]/tbody[1]/tr[5]/td[3]/a[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();


    }


}
