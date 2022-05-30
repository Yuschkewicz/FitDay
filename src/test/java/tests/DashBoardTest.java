package tests;

import org.testng.annotations.Test;

public class DashBoardTest extends BaseTest {

    @Test
    public void addFoodBySearch() {
        loginSteps.login("TSM17-user", "minsk1067");
        dashBoardPage.addFood();
        addFoodPage.addFoodBySearch();
        addFoodPage.deleteFood();

    }

    @Test
    public void addFoodByBrowse() {
        loginSteps.login("TSM17-user", "minsk1067");
        dashBoardPage.addFood();
        addFoodPage.addFoodByBrowse();
        addFoodPage.deleteFood();
    }

    @Test
    public void bicyclingActivity() {
        loginSteps.login("TSM17-user", "minsk1067");
        dashBoardPage.addActivity();
        addActivityPage.addActivityBicycling();
        addActivityPage.deleteActivity();
    }

    @Test
    public void runningActivity() {
        loginSteps.login("TSM17-user", "minsk1067");
        dashBoardPage.addActivity();
        addActivityPage.addActivityRunning();
        addActivityPage.deleteActivity();
    }

    @Test
    public void skiingActivity() {
        loginSteps.login("TSM17-user", "minsk1067");
        dashBoardPage.addActivity();
        addActivityPage.addActivitySkiing();
        addActivityPage.deleteActivity();
    }


    @Test
    public void searchActivity() {
        loginSteps.login("TSM17-user", "minsk1067");
        dashBoardPage.addActivity();
        addActivityPage.addActivityBySearch();
        addActivityPage.deleteActivity();


    }
// under reconstruction
    @Test
    public void weight() {
        loginSteps.login("TSM17-user", "minsk1067");
        dashBoardPage.weight();
    }
}
