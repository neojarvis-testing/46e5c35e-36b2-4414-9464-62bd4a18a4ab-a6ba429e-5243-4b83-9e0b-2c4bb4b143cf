package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDepotAboutUsFooterPage;

public class HomeDepotAboutUsFooterStep {
    ExtentTest test = Hooks.reports.createTest("Home Depot About Us Footer TestCase");
    HomeDepotAboutUsFooterPage homeDepotAboutUsFooterPage = new HomeDepotAboutUsFooterPage(test);

    @When("I click on Careers")
    public void i_click_on_careers() {
        homeDepotAboutUsFooterPage.clickOnCareers();
    }
    @When("I verify the Careers URL")
    public void i_verify_the_careers_url() {
        // homeDepotAboutUsFooterPage.verifyUrlCareers();
    }
    @When("I click on Corporate Information")
    public void i_click_on_corporate_information() {
        homeDepotAboutUsFooterPage.clickOnCorporateInformation();
    }
    @When("I verify the Corporate Information URL")
    public void i_verify_the_corporate_information_url() {
        // homeDepotAboutUsFooterPage.verifyUrlCorporateInformation();
    }
    @When("I click on Digital Newsroom")
    public void i_click_on_digital_newsroom() {
        homeDepotAboutUsFooterPage.clickOnDigitalNewsroom();
    }
    @When("I verify the Digital Newsroom URL")
    public void i_verify_the_digital_newsroom_url() {
        // homeDepotAboutUsFooterPage.verifyUrlDigitalNewsroom();
    }
    @When("I click on Home Depot Foundation")
    public void i_click_on_home_depot_foundation() {
        homeDepotAboutUsFooterPage.clickOnHomeDepotFoundation();
    }
    @When("I verify the Home Depot Foundation URL")
    public void i_verify_the_home_depot_foundation_url() {
        // homeDepotAboutUsFooterPage.verifyUrlHomeDepotFoundation();
    }
    @When("I click on Investor Relations")
    public void i_click_on_investor_relations() {
        homeDepotAboutUsFooterPage.clickOnInvestorRelation();
    }
    @When("I verify the Investor Relations URL")
    public void i_verify_the_investor_relations_url() {
        // homeDepotAboutUsFooterPage.verifyUrlInvestorRelation();
    }
    @When("I click on Government Customers")
    public void i_click_on_government_customers() {
        homeDepotAboutUsFooterPage.clickOnGovernmentCustomers();
    }
    @When("I verify the Government Customers URL")
    public void i_verify_the_government_customers_url() {
        // homeDepotAboutUsFooterPage.verifyUrlGovernmentCustomers();
    }
    @When("I click on Supplier Providers")
    public void i_click_on_supplier_providers() {
        homeDepotAboutUsFooterPage.clickOnSupplierProviders();
    }
    @When("I verify the Supplier Providers URL")
    public void i_verify_the_supplier_providers_url() {
        // homeDepotAboutUsFooterPage.verifyUrlSupplierProviders();
    }
    @When("I click on Affiliate Program")
    public void i_click_on_affiliate_program() {
        homeDepotAboutUsFooterPage.clickOnAffiliateProgram();
    }
    @When("I verify the Affiliate Program URL")
    public void i_verify_the_affiliate_program_url() {
        // homeDepotAboutUsFooterPage.verifyUrlAffiliateProgram();
    }
    @When("I click on Eco Actions")
    public void i_click_on_eco_actions() {
        homeDepotAboutUsFooterPage.clickOnEcoActions();
    }
    @Then("I verify the Eco Actions URL")
    public void i_verify_the_eco_actions_url() {
        homeDepotAboutUsFooterPage.verifyUrlEcoActions();
    }
}
