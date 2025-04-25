package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDepotDIYWorkShopPage;

public class HomeDepotDIYCallStep {
    ExtentTest test=Hooks.reports.createTest("Home Depot DIY Workshops TestCase");
    HomeDepotDIYWorkShopPage homeDepotDIYWorkShopPage=new HomeDepotDIYWorkShopPage(test);

    @When("I click on the DIY Icon")
    public void i_click_on_the_diy_icon() {
       homeDepotDIYWorkShopPage.clickOnDIYIcon();
    }
    @When("I click on Free Workshops")
    public void i_click_on_free_workshops() {
        homeDepotDIYWorkShopPage.clickOnFreeWorkShops();
    }
    @Then("I verify the Free Workshops text")
    public void i_verify_the_free_workshops_text() {
        homeDepotDIYWorkShopPage.verifyFreeWorkShopsText();
    }
    @Then("I click on Kids Workshops")
    public void i_click_on_kids_workshops() {
        homeDepotDIYWorkShopPage.clickOnKidsWorkShops();
    }
    @Then("I verify the Kids Workshops text")
    public void i_verify_the_kids_workshops_text() {
       homeDepotDIYWorkShopPage.verifyKidsWorkShopsText();
    }
    @Then("I click on Learn More")
    public void i_click_on_learn_more() {
        homeDepotDIYWorkShopPage.clickOnRegisterNow();
    }
    @Then("I click on Register Now")
    public void i_click_on_register_now() {
       homeDepotDIYWorkShopPage.clickOnRegisterSubmitButton();
    }

}
