package tests;

import org.testng.annotations.Test;

public class DashBoardTest extends BaseTest {

    @Test(description = "using food search by example Lard")
    public void addFoodBySearch() {
        loginSteps.login(user, password);
        dashBoardPage.addFood();
        addFoodPage.addFoodBySearch("Lard");
        addFoodPage.choosePortion("13","tablespoon");
        addFoodPage.checkPositionBrowseFood("Lard");
        addFoodPage.deleteFood();
    }


    @Test(description = "using food search by example Fish")
    public void addFishUsingSearch() {
        loginSteps.login(user, password);
        dashBoardPage.addFood();
        addFoodPage.addFoodBySearch("Fish, cisco, raw");
        addFoodPage.choosePortionOfFood("1","kg");
        addFoodPage.checkPositionBrowseFood("Fish, cisco, raw");
        addFoodPage.deleteFood();
    }

    @Test(description = "use of selective food by browse")
    public void addFoodByBrowse() {
        loginSteps.login(user, password);
        dashBoardPage.addFood();
        addFoodPage.addFoodByBrowse();
        addFoodPage.chooseTypeOfFood("Fish");
        addFoodPage.chooseSubTypeOfFood("Finfish");
        addFoodPage.chooseKindOfFood("Barracuda");
        addFoodPage.choosePortionOfFood("400","grams");
        addFoodPage.checkPositionBrowseFood("Barracuda, baked or broiled");
        addFoodPage.deleteFood();
    }

    @Test(description = "use of selective food by browse 2")
    public void addFoodByBrowse2() {
        loginSteps.login(user, password);
        dashBoardPage.addFood();
        addFoodPage.addFoodByBrowse();
        addFoodPage.chooseTypeOfFood("Pasta and Cereal Grains");
        addFoodPage.chooseSubTypeOfFood("Flower");
        addFoodPage.chooseKindOfFood("Biscuit mix, dry");
        addFoodPage.choosePortionOfFood("2","lb");
        addFoodPage.checkPositionBrowseFood("Biscuit mix, dry");
        addFoodPage.deleteFood();
    }

    @Test(description = " test bicycling")
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

    @Test(description = "test running")
    public void runningActivity() {
        loginSteps.login(user, password);
        dashBoardPage.addActivity();
        addActivityPage.addActivityLikeRunning("Running");
        addActivityPage.chooseSpeedOfRunning("8.5 min/mile (7 mph)");
        addActivityPage.timeOfRunning("5");
        addActivityPage.distanceOfRunning("10");
        addActivityPage.chooseUnitToRunning("kms");
        addActivityPage.clickAddRunning();
        addActivityPage.checkActivity("running");
        addActivityPage.deleteActivityRun();
    }

    @Test(description = "test skiing")
    public void skiingActivity() {
        loginSteps.login(user, password);
        dashBoardPage.addActivity();
        addActivityPage.addActivityLikeSkiing("Winter activities");
        addActivityPage.chooseTypeOfWinterActivities(" downhill skiing");
        addActivityPage.crazyDownhillChooseType("vigorous effort, racing");
        addActivityPage.chooseTimeToSkiing("8");
        addActivityPage.clickAddButton();
        addActivityPage.checkActivity("downhill skiing");
        addActivityPage.deleteActivityDownhill();
    }


    @Test(description = "test random")
    public void searchActivity() {
        loginSteps.login(user, password);
        dashBoardPage.addActivity();
        addActivityPage.addActivityBySearch("fly");
        addActivityPage.chooseAvailableVariant("flying airplane");
        addActivityPage.chooseFlightHour("13");
        addActivityPage.clickAddFlight();
        addActivityPage.checkActivity("flying airplane");
        addActivityPage.deleteFlight();


    }

}
