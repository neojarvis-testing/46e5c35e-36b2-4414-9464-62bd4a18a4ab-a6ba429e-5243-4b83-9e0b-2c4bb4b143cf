package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDepotFooterResources;

public class HomeDepotResourcesStep {
    ExtentTest test = Hooks.reports.createTest("Resources");
    HomeDepotFooterResources homeDepotFooterResources = new HomeDepotFooterResources(test);


    @Given("Landed on the page.")
    public void landed_on_the_page() {

    }
    @When("I click on special and offers.")
    public void i_click_on_special_and_offers() {
    homeDepotFooterResources.clickOnSpecialsOffers();
    }
    @When("I verify savings center.")
    public void i_verify_savings_center() {
    homeDepotFooterResources.verifySavingsCenter();
    }
    @When("I click on military discount benefit.")
    public void i_click_on_military_discount_benefit() {
    homeDepotFooterResources.clickOnMilitaryDiscountBenefit();
    }
    @When("I verify military.")
    public void i_verify_military() {
    homeDepotFooterResources.verifyMilitary();
    }
    @When("I click on DIY projects and ideas.")
    public void i_click_on_diy_projects_and_ideas() {
    homeDepotFooterResources.clickOnDIYProjectsAndIdeas();
    }
    @When("I verify DIY project.")
    public void i_verify_diy_project() {
    homeDepotFooterResources.verifyDIYProject();
    }
    @When("I click on truck and tool rental.")
    public void i_click_on_truck_and_tool_rental() {
    homeDepotFooterResources.clickOnTruckAndToolRental();
    }
    @When("I verify tool and truck.")
    public void i_verify_tool_and_truck() {
    homeDepotFooterResources.verifyToolAndTruck();
    }
    @When("I click on installation and services.")
    public void i_click_on_installation_and_services() {
    homeDepotFooterResources.clickOnInstallationAndServices();
    }
    @When("I verify services.")
    public void i_verify_services() {
    homeDepotFooterResources.verifyServices();
    }
    @When("I click on moving supplies and rentals.")
    public void i_click_on_moving_supplies_and_rentals() {
    homeDepotFooterResources.clickOnMovingSuppliesAndRentals();
    }
    @When("I click on protection plans.")
    public void i_click_on_protection_plans() {
    homeDepotFooterResources.verifyProtectionPlans();
    }
    @When("I verify protection plans.")
    public void i_verify_protection_plans() {
    homeDepotFooterResources.verifyProtectionPlans();
    }
    @When("I click on rebate center.")
    public void i_click_on_rebate_center() {
    homeDepotFooterResources.clickOnRebateCenter();
    }
    @When("I verify rebate.")
    public void i_verify_rebate() {
    homeDepotFooterResources.verifyRebate();
    }
    @When("I click on gift cards.")
    public void i_click_on_gift_cards() {
    homeDepotFooterResources.clickOnGiftCards();
    }
    @Then("I verify gift card.")
    public void i_verify_gift_card() {
    homeDepotFooterResources.verifyGiftCard();
    }
}
