package pages;

import org.openqa.selenium.WebDriver;

public class AddWeightPage extends BasePage {
    public AddWeightPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }
}
