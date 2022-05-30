package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddFoodPage extends BasePage {
    public AddFoodPage(WebDriver driver) {
        super(driver);
    }

    public void addFoodBySearch() {

        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/a[1]/span[2]")).click();
        waitForElement(By.xpath("//strong[contains(text(),'Search')]"));
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='food-top']" +
                "/div[@id='food-search-bar']/form[1]/input[1]")).sendKeys("Lard");
        waitForElement(By.xpath("//a[contains(text(),'Lard')]"));
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]/div[1]" +
                "/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).clear();
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]/div[1]" +
                "/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).sendKeys("13");
        WebElement dropdown = driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]" +
                "/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/select[1]"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("tablespoon");
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]" +
                "/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")).click();
        waitForElement(By.xpath("//body[1]/div[1]/div[5]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[4]"));
    }

    public void addFoodByBrowse() {

        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/a[1]/span[2]")).click();
        waitForElement(By.xpath("//strong[contains(text(),'Search')]"));
        driver.findElement(By.xpath("//a[contains(text(),'Browse')]")).click();
        waitForElement(By.xpath("//a[contains(text(),'All Foods')]"));
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]" +
                "/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
        waitForElement(By.xpath("//a[contains(text(),'Beans, Peas, Nuts')]"));
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]/div[1]" +
                "/table[1]/tbody[1]/tr[1]/td[2]/a[1]")).click();
        waitForElement(By.xpath("//a[contains(text(),'Dried Beans, Mixtures')]"));
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]" +
                "/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("10");
        WebElement dropdown = driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/select[1]"));
        dropdown.click();
        Select gram = new Select(dropdown);
        gram.selectByVisibleText("grams");
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/a[1]")).click();
        waitForElement(By.xpath("//body[1]/div[1]/div[5]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]"));

    }

    public void deleteFood() {
        driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]")).click();
        waitForElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='food-bottom']/div[@id='food-log']/div[1]/a[1]"));
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']" +
                "/div[@id='food-bottom']/div[@id='food-log']/div[1]/a[1]")).click();

    }

    @Override
    public boolean isPageOpened() {
        return false;
    }
}
