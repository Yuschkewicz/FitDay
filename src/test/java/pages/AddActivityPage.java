package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

public class AddActivityPage extends BasePage {

    public AddActivityPage(WebDriver driver) {
        super(driver);
    }


    public void chooseActivityLikeBicycling(String activity) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='activity-browse']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(activity);
       // waitForElement(By.xpath(String.format("//a[normalize-space()='%s']",activity)));
    }

    public void chooseTypeOfRide(String speed) {
        WebElement dropdown = driver.findElement(By.xpath("(//select[@name='pkey'])[1]"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(speed);
    }

    public void chooseHourOfRacing(String hour) {

        driver.findElement(By.xpath("(//input[@name='hours'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@name='hours'])[2]")).sendKeys(hour);
    }

    public void chooseDistanceOfRacing(String distance) {
        driver.findElement(By.xpath("(//input[@name='distance'])[2]")).sendKeys(distance);
    }

    public void chooseUnit(String unit) {
        WebElement dropdown = driver.findElement(By.xpath("(//select[@name='unit'])[2]"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(unit);
    }

    public void clickAdd() {
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]" +
                "/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[7]/a[1]")).click();
        waitForElement(By.xpath("//div[@id='activity-add-top']//span[contains(text(), 'Add to Activity Log')]"));
        driver.findElement(By.xpath("//div[@id='activity-add-top']//span[contains(text(), " +
                "'Add to Activity Log')]")).click();
        waitForElement(By.xpath("//td[@class='name']"));
    }

    public void checkActivity(String activity) {
        String text = driver.findElement(By.xpath(String.format("//div[@id='activity-log']//td[contains(text(), '%s')]", activity))).getText();
        assertEquals(activity, text);
    }


    public void addActivityLikeRunning(String activity) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='activity-browse']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(activity);
        waitForElement(By.xpath(String.format("(//a[normalize-space()='%s'])[1]", activity)));
    }

    public void chooseSpeedOfRunning(String speedRun) {
        WebElement dropRun = driver.findElement(By.xpath("//select[@name='pkey']"));
        dropRun.click();
        Select run = new Select(dropRun);
        run.selectByVisibleText(speedRun);
    }

    public void timeOfRunning(String time) {
        driver.findElement(By.xpath("(//input[@name='hours'])[5]")).clear();
        driver.findElement(By.xpath("(//input[@name='hours'])[5]")).sendKeys(time);
    }

    public void distanceOfRunning(String distance) {
        driver.findElement(By.xpath("(//input[@name='distance'])[5]")).sendKeys(distance);
    }

    public void chooseUnitToRunning(String unit) {
        WebElement dropRun = driver.findElement(By.xpath("(//select[@name='unit'])[5]"));
        dropRun.click();
        Select run = new Select(dropRun);
        run.selectByVisibleText(unit);
    }

    public void clickAddRunning() {
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[7]/a[1]")).click();
        waitForElement(By.xpath("//div[@id='activity-add-top']//span[contains(text(), 'Add to Activity Log')]"));
        driver.findElement(By.xpath("//div[@id='activity-add-top']//span[contains(text(), " +
                "'Add to Activity Log')]")).click();
        waitForElement(By.xpath("//div[@id='activity-log']//td[contains(text(), 'running')]"));
    }

    public void checkRunningAvailable(String activity) {
        String text = driver.findElement(By.xpath("//div[@id='activity-log']//td[contains(text(), 'running')]")).getText();
        assertEquals(activity, text);
    }


    public void addActivityLikeSkiing(String winter) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='activity-browse']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(winter);
    }

    public void chooseTypeOfWinterActivities(String type) {
        waitForElement(By.xpath("//td[contains(text(),'downhill skiing')]"));
    }

    public void crazyDownhillChooseType(String speedToDeath) {
        WebElement downhillSkinng = driver.findElement(By.xpath("(//select[@name='pkey'])[3]"));
        downhillSkinng.click();
        Select speed = new Select(downhillSkinng);
        speed.selectByVisibleText(speedToDeath);
    }

    public void chooseTimeToSkiing(String hour) {
        driver.findElement(By.xpath("(//input[@name='hours'])[8]")).clear();
        driver.findElement(By.xpath("(//input[@name='hours'])[8]")).sendKeys(hour);
    }

    public void clickAddButton() {
        driver.findElement(By.xpath("(//a[@class='add icon'])[8]")).click();
        waitForElement(By.xpath("//span[contains(text(),'Add to Activity Log')]"));
        driver.findElement(By.xpath("//span[contains(text(),'Add to Activity Log')]")).click();
        waitForElement(By.xpath("//a[contains(text(),'Activity Log')]"));
        waitForElement(By.xpath("//div[@id='activity-log']//td[contains(text(), 'downhill skiing')]"));

    }

    public void checkDownHillAvailable(String activity) {
        String death = driver.findElement(By.xpath("//div[@id='activity-log']//td[contains(text(), 'downhill skiing')]")).getText();
        assertEquals(activity, death);
    }

    public void addActivityBySearch(String activity) {
        driver.findElement(By.cssSelector("[value='What did you do today?']")).sendKeys(activity);
    }

    public void chooseAvailableVariant(String available) {
        waitForElement(By.xpath(String.format("//td[contains(text(),'flying airplane')]",available)));
    }

    public void chooseFlightHour(String hour) {
        driver.findElement(By.xpath("(//input[@name='hours'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@name='hours'])[1]")).sendKeys(hour);
    }


    public void clickAddFlight() {
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]" +
                "/div[2]/div[3]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();
        waitForElement(By.xpath("//div[@id='activity-add-top']//span[contains(text(), 'Add to Activity Log')]"));
        driver.findElement(By.xpath("//div[@id='activity-add-top']//span[contains(text(), " +
                "'Add to Activity Log')]")).click();
        waitForElement(By.xpath("//div[@id='activity-log']//td[contains(text(), 'flying airplane')]"));

    }

    public void checkFlightAvailable(String flight) {
        String death = driver.findElement(By.xpath("//div[@id='activity-log']//td[contains(text(), 'flying airplane')]")).getText();
        assertEquals(flight, death);

    }

    public void deleteActivityBike() {

        driver.findElement(By.xpath(" //div[@id='activity-log']//td[contains(text(), 'biking')]/../.." +
                "//a[contains(@class,'edit icon')]")).click();
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='activity-bottom']" +
                "/div[@id='activity-log']/div[1]/a[1]")).click();
    }

    public void deleteActivityRun() {

        driver.findElement(By.xpath(" //div[@id='activity-log']//td[contains(text(), 'running')]/../.." +
                "//a[contains(@class,'edit icon')]")).click();
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='activity-bottom']" +
                "/div[@id='activity-log']/div[1]/a[1]")).click();
    }

    public void deleteActivityDownhill() {

        driver.findElement(By.xpath(" //div[@id='activity-log']//td[contains(text(), 'downhill skiing')]/../.." +
                "//a[contains(@class,'edit icon')]")).click();
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='activity-bottom']" +
                "/div[@id='activity-log']/div[1]/a[1]")).click();
    }

    public void deleteFlight() {

        driver.findElement(By.xpath(" //div[@id='activity-log']//td[contains(text(), 'flying airplane')]/../.." +
                "//a[contains(@class,'edit icon')]")).click();
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='activity-bottom']" +
                "/div[@id='activity-log']/div[1]/a[1]")).click();
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }
}
