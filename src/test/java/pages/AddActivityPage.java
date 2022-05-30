package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddActivityPage extends BasePage {
    public AddActivityPage(WebDriver driver) {
        super(driver);
    }


    public void addActivityBicycling() {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='activity-browse']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Bicycling");
        waitForElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]/div[1]" +
                "/form[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]"));
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]/div[1]" +
                "/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).clear();
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]/div[1]" +
                "/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).sendKeys("13");
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]" +
                "/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")).sendKeys("20");
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]/div[1]" +
                "/form[1]/table[1]/tbody[1]/tr[1]/td[7]")).click();
        waitForElement(By.xpath("//body/div[@id='container']/div[@id='main']/h1[1]"));
        driver.findElement(By.xpath("//span[contains(text(),'Add to Activity Log')]")).click();
        waitForElement(By.xpath(" //body[1]/div[1]/div[5]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]"));
    }

    public void addActivityRunning() {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='activity-browse']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Running");
        waitForElement(By.xpath("//a[contains(text(),'running')]"));
        WebElement dropRun = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/select[1]"));
        dropRun.click();
        Select run = new Select(dropRun);
        run.selectByVisibleText("8.5 min/mile (7 mph)");
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]" +
                "/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[3]/input[1]")).clear();
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]" +
                "/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[3]/input[1]")).sendKeys("13");
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]" +
                "/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[4]/input[1]")).sendKeys("9");
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]" +
                "/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[7]/a[1]")).click();
        waitForElement(By.xpath("//span[contains(text(),'Add to Activity Log')]"));
        driver.findElement(By.xpath("//span[contains(text(),'Add to Activity Log')]")).click();
        waitForElement(By.xpath(" //body[1]/div[1]/div[5]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]"));
    }

    public void addActivitySkiing() {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='activity-browse']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Winter activities");
        waitForElement(By.xpath("//td[contains(text(),'downhill skiing')]"));

        WebElement downhillSkinng = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/select[1]"));
        downhillSkinng.click();
        Select speed = new Select(downhillSkinng);
        speed.selectByVisibleText("vigorous effort, racing");
        driver.findElement(By.xpath("//tbody/tr[8]/td[3]/input[1]")).clear();
        driver.findElement(By.xpath("//tbody/tr[8]/td[3]/input[1]")).sendKeys("13");
        driver.findElement(By.xpath("//tbody/tr[8]/td[7]/a[1]")).click();
        waitForElement(By.xpath("//span[contains(text(),'Add to Activity Log')]"));
        driver.findElement(By.xpath("//span[contains(text(),'Add to Activity Log')]")).click();
        waitForElement(By.xpath("//a[contains(text(),'Activity Log')]"));
        waitForElement(By.xpath(" //body[1]/div[1]/div[5]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]"));

    }

    public void addActivityBySearch() {
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']" +
                "/div[@id='activity-top']/div[@id='activity-search-bar']/form[1]/input[1]")).sendKeys("fly");
        waitForElement(By.xpath("//td[contains(text(),'flying airplane')]"));
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]" +
                "/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).clear();
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]" +
                "/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).sendKeys("13");
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]" +
                "/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();
        waitForElement(By.xpath("//span[contains(text(),'Add to Activity Log')]"));
        driver.findElement(By.xpath("//span[contains(text(),'Add to Activity Log')]")).click();
        waitForElement(By.xpath(" //body[1]/div[1]/div[5]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]"));

    }

    public void deleteActivity() {

        driver.findElement(By.xpath(" //body[1]/div[1]/div[5]/div[3]" +
                "/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']" +
                "/div[@id='activity-bottom']/div[@id='activity-log']/div[1]/a[1]")).click();
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }
}
