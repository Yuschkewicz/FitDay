package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

public class AddFoodPage extends BasePage {
    public AddFoodPage(WebDriver driver) {
        super(driver);
    }

    public void addFoodBySearch(String type) {
        driver.findElement(By.cssSelector("[value='What did you eat today?']")).sendKeys("Lard");
        waitForElement(By.xpath("(//td[@class='name'])[1]"));
    }

    public void choosePortion(String amount, String unit) {
        driver.findElement(By.xpath("(//input[@name='amount'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@name='amount'])[1]")).sendKeys(amount);
        WebElement dropdown = driver.findElement(By.xpath("(//select[@name='unit'])[1]"));

        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(unit);
        driver.findElement(By.xpath("//a[contains(@class,'add')]")).click();
        waitForElement(By.xpath("(//td[@class='name'])[12]"));
    }

    public void checkPosition(String amount) {
        String text = driver.findElement(By.xpath("//td[@class='name']")).getText();
        assertEquals(amount, text);
    }

    public void addFoodByBrowse() {


        driver.findElement(By.xpath("//a[contains(text(),'Browse')]")).click();
        waitForElement(By.xpath("//a[contains(text(),'All Foods')]"));
    }

    public void chooseTypeOfFood(String type) {
        driver.findElement(By.xpath("(//td[contains(@class,'name')])[8]")).click();
        waitForElement(By.xpath("(//span)[21]"));
    }

    public void chooseTypeOfFish(String type) {
        driver.findElement(By.xpath("(//*[contains(@class,'name')])[8]")).click();
        waitForElement(By.xpath("(//span)[21]"));
    }

    public void chooseKindOfFinfish(String kindOf) {

        driver.findElement(By.xpath("(//td[contains(@class,'name')])[2]")).click();
        waitForElement(By.xpath("(//span)[16]"));
    }

    public void choosePortionOfFish(String amount, String unit) {
        driver.findElement(By.xpath("(//input[@name='amount'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@name='amount'])[1]")).sendKeys(amount);
        WebElement dropdown = driver.findElement(By.xpath("(//select[@name='unit'])[1]"));
        dropdown.click();
        Select gram = new Select(dropdown);
        gram.selectByVisibleText(unit);
        driver.findElement(By.xpath("(//a[@class='add icon'])[1]")).click();
        waitForElement(By.xpath("(//td[@class='name'])[12]"));

    }

    public void checkPositionOfFish(String amount) {

        String text = driver.findElement(By.xpath("(//td[@class='name'])[12]")).getText();
        assertEquals(amount, text);
    }

    public void deleteFood() {
        driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]")).click();
        waitForElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='food-bottom']/" +
                "div[@id='food-log']/div[1]/a[1]"));
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']" +
                "/div[@id='food-bottom']/div[@id='food-log']/div[1]/a[1]")).click();

    }

    @Override
    public boolean isPageOpened() {
        return false;
    }
}
