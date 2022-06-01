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
        waitForElement(By.xpath("//a[contains(text(),'Lard')]"));
    }

    public void choosePortion(String amount, String unit) {
        driver.findElement(By.xpath("//div[@id='food-search-all']//a[contains(text(), 'Lard')]/../..//" +
                "*[contains(@class,'amount js-bound')]")).clear();
        driver.findElement(By.xpath("//div[@id='food-search-all']//a[contains(text(), 'Lard')]/../..//" +
                "*[contains(@class,'amount js-bound')]")).sendKeys(amount);
        WebElement dropdown = driver.findElement(By.xpath("//div[@id='food-search-all']//a[contains(text(), " +
                "'Lard')]/../..//*[contains(@class,'unit')]/select"));

        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(unit);
        driver.findElement(By.xpath("//div[@id='food-search-all']//a[contains(text(), 'Lard')]/../..//" +
                "a[contains(@class,'add')]")).click();
        waitForElement(By.xpath("//div[@id='food-log']//a[contains(text(), 'Lard')]"));
    }

    public void checkPosition(String amount) {
        String text = driver.findElement(By.xpath("//div[@id='food-log']//a[contains(text(), 'Lard')]")).getText();
        assertEquals(amount, text);
    }

    public void addFoodByBrowse() {


        driver.findElement(By.xpath("//a[contains(text(),'Browse')]")).click();
        waitForElement(By.xpath("//a[contains(text(),'All Foods')]"));
    }

    public void chooseTypeOfFood(String type) {
        driver.findElement(By.xpath("(//td[contains(@class,'name')])[8]")).click();
        waitForElement(By.xpath("//a[contains(text(),'Fish')]"));
    }

    public void chooseTypeOfFish(String type) {
        driver.findElement(By.xpath("(//*[contains(@class,'name')])[8]")).click();
        waitForElement(By.xpath("//a[contains(text(),'Finfish')]"));
    }

    public void chooseKindOfFinfish(String kindOf) {

        driver.findElement(By.xpath("(//td[contains(@class,'name')])[2]")).click();
        waitForElement(By.xpath("//a[contains(text(),'Barracuda')]"));
    }

    public void choosePortionOfFish(String amount, String unit) {

        driver.findElement(By.xpath("//div[@id='food-search-all']//a[contains(text(), " +
                "'Barracuda, baked or broiled')]/../..//*[contains(@class,'amount')]/input")).sendKeys(amount);
        WebElement dropdown = driver.findElement(By.xpath("//div[@id='food-search-all']//a[contains(text(), " +
                "'Barracuda, baked or broiled')]/../..//*[contains(@class,'unit')]/select"));
        dropdown.click();
        Select gram = new Select(dropdown);
        gram.selectByVisibleText(unit);
        driver.findElement(By.xpath("//div[@id='food-search-all']//a[contains(text(), " +
                "'Barracuda, baked or broiled')]/../..//*[contains(@class,'add')]")).click();
        waitForElement(By.xpath("//body[1]/div[1]/div[5]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]"));

    }

    public void checkPositionOfFish(String amount) {

        String text = driver.findElement(By.xpath("//div[@id='food-log']//a[contains(text(), " +
                "'Barracuda, baked or broiled')]")).getText();
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
