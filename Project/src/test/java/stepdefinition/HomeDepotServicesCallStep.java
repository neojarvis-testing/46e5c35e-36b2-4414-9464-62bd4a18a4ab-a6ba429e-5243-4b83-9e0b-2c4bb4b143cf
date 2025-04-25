package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDepotServicesPage;
import utils.Base;

public class HomeDepotServicesCallStep extends Base{

    ExtentTest test=Hooks.reports.createTest("Home Depot Services");
    HomeDepotServicesPage homeDepotServicesPage=new HomeDepotServicesPage(test);
    
    @When("I click on the Services icon")
    public void i_click_on_the_services_icon() {
        homeDepotServicesPage.clickOnServicesIcon();
    }
    @Then("I verify the Services text")
    public void i_verify_the_services_text() {
        homeDepotServicesPage.verifyServicesText();
    }
    @Then("I click on Installation")
    public void i_click_on_installation() {
        homeDepotServicesPage.clickOnInstallation();
    }
    @Then("I click on View All Installation")
    public void i_click_on_view_all_installation() {
        homeDepotServicesPage.clickOnViewAllInstallation();
    }
    @Then("I verify the Home Services text")
    public void i_verify_the_home_services_text() {
        homeDepotServicesPage.verifyHomeServicesText();
    }
    @Then("I click on Flooring")
    public void i_click_on_flooring() {
        homeDepotServicesPage.clickOnFlooring();
    }
    @Then("I verify the Flooring text")
    public void i_verify_the_flooring_text() {
        homeDepotServicesPage.verifyFlooringText();
    }
    @Then("I navigate back to the previous Home page")
    public void i_navigate_back_to_the_previous_home_page() {
        homeDepotServicesPage.navigateBackToPreviousPage();
    }
    @Then("I click on Bathroom")
    public void i_click_on_bathroom() {
        homeDepotServicesPage.clickOnBathroom();
    }
    @Then("I verify the Bathroom text")
    public void i_verify_the_bathroom_text() {
       homeDepotServicesPage.verifyBathroomText();
    }
    @Then("I navigate back to the Recent page")
    public void i_navigate_back_to_the_recent_page() {
        homeDepotServicesPage.navigateBackToPreviousPage();
    }
    @Then("I click on Doors and Windows")
    public void i_click_on_doors_and_windows() {
        homeDepotServicesPage.clickOnDoorsAndWindows();
    }
    @Then("I verify the Window Services text")
    public void i_verify_the_window_services_text() {
        homeDepotServicesPage.verifyWindowServicesText();
    }
    @Then("I navigate back to the previous page")
    public void i_navigate_back_to_the_previous_page() {
        homeDepotServicesPage.navigateBackToPreviousPage();
    }
    @Then("I click on Heating")
    public void i_click_on_heating() {
       homeDepotServicesPage.clickOnHeating();
    }
    @Then("I verify the Heating text")
    public void i_verify_the_heating_text() {
        homeDepotServicesPage.verifyHeatingText();
    }
    @Then("I navigate back to the Home page")
    public void i_navigate_back_to_the_home_page() {
       homeDepotServicesPage.navigateBackToPreviousPage();
    }
}
