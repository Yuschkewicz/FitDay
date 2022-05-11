package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalendarPage extends BasePage{
    public CalendarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(By.cssSelector("[id='calendar']"));
    }


}
