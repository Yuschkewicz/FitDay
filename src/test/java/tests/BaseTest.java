package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import pages.AddActivityPage;
import pages.AddFoodPage;
import pages.DashBoardPage;
import pages.LoginPage;
import steps.LoginSteps;

public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    LoginSteps loginSteps;
    DashBoardPage dashBoardPage;
    AddFoodPage addFoodPage;
    AddActivityPage addActivityPage;
    String user;
    String password;

    @BeforeMethod
    public void setup(@Optional("chrome") String browser, ITestContext testContext) {
        if (System.getProperty("browser", "chrome").equalsIgnoreCase("chrome")) {
            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                if (System.getProperty("headless", "false").equals("true"))
                    options.addArguments("--headless");
                driver = new ChromeDriver(options);
            } else if (browser.equalsIgnoreCase("EDGE")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("Opera")) {
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("FireFox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            } else if (System.getProperty("browser", "chrome").equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }

        }
        loginPage = new LoginPage(driver);
        loginSteps = new LoginSteps(driver);
        dashBoardPage = new DashBoardPage(driver);
        addFoodPage = new AddFoodPage(driver);
        addActivityPage = new AddActivityPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
