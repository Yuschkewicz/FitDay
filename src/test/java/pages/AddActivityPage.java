package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

@Log4j2
public class AddActivityPage extends BasePage {

    public AddActivityPage(WebDriver driver) {
        super(driver);
    }

    @Step("Activity selection. In this method - a bicycle")
    public void chooseActivityLikeBicycling(String activity) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='activity-browse']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(activity);
       // waitForElement(By.xpath(String.format("//a[normalize-space()='%s']",activity)));
    }

    @Step("select the speed of movement")
    public void chooseTypeOfRide(String speed) {
        WebElement dropdown = driver.findElement(By.xpath("(//select[@name='pkey'])[1]"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(speed);
    }

    @Step("select the duration of the workout")
    public void chooseHourOfRacing(String hour) {
        driver.findElement(By.xpath("(//input[@name='hours'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@name='hours'])[2]")).sendKeys(hour);
    }

    @Step("select the duration of the workout")
    public void chooseDistanceOfRacing(String distance) {
        driver.findElement(By.xpath("(//input[@name='distance'])[2]")).sendKeys(distance);
    }

    @Step("choose units of measurement")
    public void chooseUnit(String unit) {
        WebElement dropdown = driver.findElement(By.xpath("(//select[@name='unit'])[2]"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(unit);
    }

    @Step(" click add button")
    public void clickAdd() {
        driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[2]/div[3]/div[1]" +
                "/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[7]/a[1]")).click();
        waitForElement(By.xpath("//div[@id='activity-add-top']//span[contains(text(), 'Add to Activity Log')]"));
        driver.findElement(By.xpath("//div[@id='activity-add-top']//span[contains(text(), " +
                "'Add to Activity Log')]")).click();
        waitForElement(By.xpath("//td[@class='name']"));
    }

    @Step(" checking that the workout has been added")
    public void checkActivity(String activity) {
        String text = driver.findElement(By.xpath(String.format("//div[@id='activity-log']//td[contains(text(), '%s')]", activity))).getText();
        assertEquals(activity, text);
    }

    @Step("Activity selection. In this method - a running")
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

    @Step("select the duration of the workout")
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

    @Step(" click add button")
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

    @Step("Activity selection. In this method - a skiing")
    public void addActivityLikeSkiing(String winter) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='activity-browse']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText(winter);
    }

    @Step("choose type of winter activities")
    public void chooseTypeOfWinterActivities(String type) {
        waitForElement(By.xpath(String.format("//td[contains(text(),'downhill skiing')]", type)));
    }

    public void crazyDownhillChooseType(String speedToDeath) {
        WebElement downhillSkinng = driver.findElement(By.xpath("(//select[@name='pkey'])[3]"));
        downhillSkinng.click();
        Select speed = new Select(downhillSkinng);
        speed.selectByVisibleText(speedToDeath);
    }

    @Step("select the duration of the workout")
    public void chooseTimeToSkiing(String hour) {
        driver.findElement(By.xpath(String.format("(//input[@name='hours'])[8]", hour))).clear();
        driver.findElement(By.xpath("(//input[@name='hours'])[8]")).sendKeys(hour);
    }

    @Step(" click add button")
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

    @Step("select the duration of the workout")
    public void chooseFlightHour(String hour) {
        driver.findElement(By.xpath("(//input[@name='hours'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@name='hours'])[1]")).sendKeys(hour);
    }

    @Step(" click add button")
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

    @Step(" deleting a workout")
    public void deleteActivityBike() {

        driver.findElement(By.xpath(" //div[@id='activity-log']//td[contains(text(), 'biking')]/../.." +
                "//a[contains(@class,'edit icon')]")).click();
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='activity-bottom']" +
                "/div[@id='activity-log']/div[1]/a[1]")).click();
    }

    @Step(" deleting a workout")
    public void deleteActivityRun() {

        driver.findElement(By.xpath(" //div[@id='activity-log']//td[contains(text(), 'running')]/../.." +
                "//a[contains(@class,'edit icon')]")).click();
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='activity-bottom']" +
                "/div[@id='activity-log']/div[1]/a[1]")).click();
    }

    @Step(" deleting a workout")
    public void deleteActivityDownhill() {

        driver.findElement(By.xpath(" //div[@id='activity-log']//td[contains(text(), 'downhill skiing')]/../.." +
                "//a[contains(@class,'edit icon')]")).click();
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='activity-bottom']" +
                "/div[@id='activity-log']/div[1]/a[1]")).click();
    }

    @Step(" deleting a workout")
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
