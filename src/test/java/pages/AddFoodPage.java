package pages;

import io.qameta.allure.Step;
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
        driver.findElement(By.cssSelector("[value='What did you eat today?']")).sendKeys(type);
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
        waitForElement(By.xpath("(//td[@class='name'])[12]")); //ЧТО ЭТО И МОЖНО ЛИ НАЙТИ ЛУЧШЕ???
    }


    public void checkPosition(String selectedFood) {

        String featuredFood = driver.findElement(By.xpath("//*[@class='ib-list']//td[@class='name']")).getText();
        assertEquals(selectedFood, featuredFood);
    }

    @Step("click button Browse")
    public void addFoodByBrowse() {

        driver.findElement(By.xpath("//a[contains(text(),'Browse')]")).click();
        waitForElement(By.xpath("//a[contains(text(),'All Foods')]"));
    }

    @Step("choice of food type")
    public void chooseTypeOfFood(String type) {
        driver.findElement(By.xpath(String.format("//div[@id='food-top']//td[normalize-space()='%s']", type))).click();

    }

    @Step("choice of food subtype")
    public void chooseSubTypeOfFood(String type) {
        driver.findElement(By.xpath(String.format("//div[@id='food-top']//td[normalize-space()='%s']", type))).click();

    }

    @Step("choice kind of Food")
    public void chooseKindOfFood(String kindOf) {

        driver.findElement(By.xpath(String.format("//div[@id='food-top']//td[normalize-space()='%s']", kindOf))).click();

    }

    @Step(" choise portion of food")
    public void choosePortionOfFood(String amount, String unit) {
        driver.findElement(By.xpath("(//input[@name='amount'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@name='amount'])[1]")).sendKeys(amount);
        WebElement dropdown = driver.findElement(By.xpath("(//select[@name='unit'])[1]"));
        dropdown.click();
        Select gram = new Select(dropdown);
        gram.selectByVisibleText(unit);
        driver.findElement(By.xpath("(//a[@class='add icon'])[1]")).click();


    }

    @Step("checking the availability of the selected food")
    public void checkPositionBrowseFood(String selectedFood) {
        String text = driver.findElement(By.xpath(String.format("//div[@id='food-bottom']//a[normalize-space()='%s']", selectedFood))).getText();
        assertEquals(text, selectedFood);

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
