package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDepotCategory;

public class HomeDepotCategoryStep {
    ExtentTest test = Hooks.reports.createTest("Category Test case");
    HomeDepotCategory homeDepotCategory = new HomeDepotCategory(test);

    @When("I click On Search Input Bar")
    public void i_click_on_search_input_bar() {
        homeDepotCategory.clickOnSearchInputBar();
    }

    @When("I enter Value On Input Bar")
    public void i_enter_value_on_input_bar() {
        homeDepotCategory.enterValueOnInputBar();
    }

    @When("I click On Search Icon")
    public void i_click_on_search_icon() {
        homeDepotCategory.clickOnSearchIcon();
    }

    @When("I verify Wrench Label")
    public void i_verify_wrench_label() {
        homeDepotCategory.verifyWrenchLabel();
    }

    @When("I click On Category First Time")
    public void i_click_on_category_first_time() {
        homeDepotCategory.clickOnCategory();
    }

    @When("I click On Wrench Sets")
    public void i_click_on_wrench_sets() {
        homeDepotCategory.clickOnWrenchSets();
    }

    @When("I verify Wrench Sets Label")
    public void i_verify_wrench_sets_label() {
        homeDepotCategory.verifyWrenchSetsLabel();
    }

    @When("I navigate To Previous Page First Time")
    public void i_navigate_to_previous_page_first_time() {
        homeDepotCategory.navigateToPreviousPage();
    }

    @When("I navigate To Previous Page Second Time")
    public void i_navigate_to_previous_page_second_time() {
        homeDepotCategory.navigateToPreviousPage();
    }

    @When("I click On Category Second Time")
    public void i_click_on_category_second_time() {
        homeDepotCategory.clickOnCategory();
    }

    @When("I click On Ratcheting Wrenches")
    public void i_click_on_ratcheting_wrenches() {
        homeDepotCategory.clickOnRatchetingWrenches();
    }

    @When("I verify Ratcheting Wrenches Label")
    public void i_verify_ratcheting_wrenches_label() {
        homeDepotCategory.verifyRatchetingWrenchesLabel();
    }

    @When("I navigate To Previous Page Third Time")
    public void i_navigate_to_previous_page_third_time() {
        homeDepotCategory.navigateToPreviousPage();
    }

    @When("I navigate To Previous Page Fourth Time")
    public void i_navigate_to_previous_page_fourth_time() {
        homeDepotCategory.navigateToPreviousPage();
    }

    @When("I click On Category Third Time")
    public void i_click_on_category_third_time() {
        homeDepotCategory.clickOnCategory();
    }

    @When("I click On Adjustable Wrenches")
    public void i_click_on_adjustable_wrenches() {
        homeDepotCategory.clickOnAdjustableWrenches();
    }

    @When("I verify Adjustable Wrenches Label")
    public void i_verify_adjustable_wrenches_label() {
        homeDepotCategory.verifyAdjustableWrenchesLabel();
    }

    @When("I navigate To Previous Page Fifth Time")
    public void i_navigate_to_previous_page_fifth_time() {
        homeDepotCategory.navigateToPreviousPage();
    }

    @When("I navigate To Previous Page Sixth Time")
    public void i_navigate_to_previous_page_sixth_time() {
        homeDepotCategory.navigateToPreviousPage();
    }

    @When("I click On Category Fourth Time")
    public void i_click_on_category_fourth_time() {
        homeDepotCategory.clickOnCategory();
    }

    @When("I click On Impact Wrenches")
    public void i_click_on_impact_wrenches() {
        homeDepotCategory.clickOnImpactWrenches();
    }

    @When("I verify Impact Wrenches Label")
    public void i_verify_impact_wrenches_label() {
        homeDepotCategory.verifyImpactWrenchesLabel();
    }

    @Then("I take Screenshot")
    public void i_take_screenshot() {
        homeDepotCategory.takeScreenshot();
    }

}
