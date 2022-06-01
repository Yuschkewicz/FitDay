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
        addActivityPage.chooseActivityLikeBicycling("Bicycling");
        addActivityPage.chooseTypeOfRide("20 mph or more not drafting");
        addActivityPage.chooseHourOfRacing("5");
        addActivityPage.chooseDistanceOfRacing("133");
        addActivityPage.chooseUnit("kms");
        addActivityPage.clickAdd();
        addActivityPage.checkActivity("biking");
        addActivityPage.deleteActivityBike();
    }

    @Test
    public void runningActivity() {
        loginSteps.login(user, password);
        dashBoardPage.addActivity();
        addActivityPage.addActivityLikeRunning("Running");
        addActivityPage.chooseSpeedOfRunning("8.5 min/mile (7 mph)");
        addActivityPage.timeOfRunning("5");
        addActivityPage.distanceOfRunning("10");
        addActivityPage.chooseUnitToRunning("kms");
        addActivityPage.clickAddRunning();
        addActivityPage.checkRunningAvailable("running");
        addActivityPage.deleteActivityRun();
    }

    @Test
    public void skiingActivity() {
        loginSteps.login(user, password);
        dashBoardPage.addActivity();
        addActivityPage.addActivityLikeSkiing("Winter activities");
        addActivityPage.chooseTypeOfWinterActivities(" downhill skiing");
        addActivityPage.crazyDownhillChooseType("vigorous effort, racing");
        addActivityPage.chooseTimeToSkiing("8");
        addActivityPage.clickAddButton();
        addActivityPage.checkDownHillAvailable("downhill skiing");
        addActivityPage.deleteActivityDownhill();
    }


    @Test
    public void searchActivity() {
        loginSteps.login(user, password);
        dashBoardPage.addActivity();
        addActivityPage.addActivityBySearch("fly");
        addActivityPage.chooseAvailableVariant("flying airplane");
        addActivityPage.chooseFlightHour("13");
        addActivityPage.clickAddFlight();
        addActivityPage.checkFlightAvailable("flying airplane");
        addActivityPage.deleteFlight();


    }

}
