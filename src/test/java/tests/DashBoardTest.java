package tests;

import org.testng.annotations.Test;

public class DashBoardTest extends BaseTest {

    @Test
    public void addFoodBySearch() {
        loginSteps.login(user, password);
        dashBoardPage.addFood();
        addFoodPage.addFoodBySearch("Lard");
        addFoodPage.choosePortion("13","tablespoon");
        addFoodPage.checkPosition("Lard");
        addFoodPage.deleteFood();

    }

    @Test
    public void addFoodByBrowse() {
        loginSteps.login(user, password);
        dashBoardPage.addFood();
        addFoodPage.addFoodByBrowse();
        addFoodPage.chooseTypeOfFood("Fish");
        addFoodPage.chooseTypeOfFish("FinFish");
        addFoodPage.chooseKindOfFinfish("Barracuda");
        addFoodPage.choosePortionOfFish("400","grams");
        addFoodPage.checkPositionOfFish("Barracuda, baked or broiled");
        addFoodPage.deleteFood();
    }

    @Test
    public void bicyclingActivity() {
        loginSteps.login(user, password);
        dashBoardPage.addActivity();
        addActivityPage.addActivityBicycling();
        addActivityPage.deleteActivity();
    }

    @Test
    public void runningActivity() {
        loginSteps.login(user, password);
        dashBoardPage.addActivity();
        addActivityPage.addActivityRunning();
        addActivityPage.deleteActivity();
    }

    @Test
    public void skiingActivity() {
        loginSteps.login(user, password);
        dashBoardPage.addActivity();
        addActivityPage.addActivitySkiing();
        addActivityPage.deleteActivity();
    }


    @Test
    public void searchActivity() {
        loginSteps.login(user, password);
        dashBoardPage.addActivity();
        addActivityPage.addActivityBySearch();
        addActivityPage.deleteActivity();


    }
// under reconstruction
    @Test
    public void weight() {
        loginSteps.login(user, password);
        dashBoardPage.weight();
    }
}
