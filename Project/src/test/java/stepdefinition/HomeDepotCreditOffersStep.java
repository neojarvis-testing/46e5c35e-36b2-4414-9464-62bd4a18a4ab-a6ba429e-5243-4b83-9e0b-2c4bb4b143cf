package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDepotCreditOffersPage;

public class HomeDepotCreditOffersStep {
    ExtentTest test = Hooks.reports.createTest("Home Depot Credit Offer TestCase");
    HomeDepotCreditOffersPage homeDepotCreditOffersPage = new HomeDepotCreditOffersPage(test);

    @When("I click on Credit Offers")
    public void i_click_on_credit_offers() {
        homeDepotCreditOffersPage.clickOnCreditOffers();
    }
    @When("I verify the text for Credit Offers")
    public void i_verify_the_text_for_credit_offers() {
        // homeDepotCreditOffersPage.verifyTextForCreditOffers();
    }
    @When("I click on Apply Now")
    public void i_click_on_apply_now() {
        homeDepotCreditOffersPage.clickOnApplyNow();
    }
    @When("I send data for the First Name")
    public void i_send_data_for_the_first_name() {
        homeDepotCreditOffersPage.sendDataForFirstName();
    }
    @When("I send data for the Last Name")
    public void i_send_data_for_the_last_name() {
        homeDepotCreditOffersPage.sendDataForLastName();
    }
    @When("I send data for the Email Address")
    public void i_send_data_for_the_email_address() {
        homeDepotCreditOffersPage.sendDataForEmailAddress();
    }
    @When("I send data for the Mobile Number")
    public void i_send_data_for_the_mobile_number() {
        homeDepotCreditOffersPage.sendDataForMobileNumber();
    }
    @When("I click on Continue Contact")
    public void i_click_on_continue_contact() {
        homeDepotCreditOffersPage.clickOnContinueContact();
    }
    @When("I click on Continue Contact again")
    public void i_click_on_continue_contact_again() {
        homeDepotCreditOffersPage.clickOnContinueContact();
    }
    @When("I send data for the Street Address")
    public void i_send_data_for_the_street_address() {
        homeDepotCreditOffersPage.sendDataForStreetAddress();
    }
    @When("I send data for the City")
    public void i_send_data_for_the_city() {
        homeDepotCreditOffersPage.sendDataForCity();
    }
    @When("I send data for the State")
    public void i_send_data_for_the_state() {
        homeDepotCreditOffersPage.sendDataForState();
    }
    @When("I send data for the Zip Code")
    public void i_send_data_for_the_zip_code() {
        homeDepotCreditOffersPage.sendDataForZipCode();
    }
    @When("I click on Continue Review")
    public void i_click_on_continue_review() {
        homeDepotCreditOffersPage.clickOnContinueReview();
    }
    @When("I send data for the Residential Status")
    public void i_send_data_for_the_residential_status() {
        homeDepotCreditOffersPage.sendDataForResidentialStatus();
    }
    @When("I send data for the Monthly Income")
    public void i_send_data_for_the_monthly_income() {
        homeDepotCreditOffersPage.sendDataForMonthlyIncome();
    }
    @When("I send data for the Annual Income")
    public void i_send_data_for_the_annual_income() {
        homeDepotCreditOffersPage.sendDataForAnnualIncome();
    }
    @Then("I click on Continue Review again")
    public void i_click_on_continue_review_again() {
        homeDepotCreditOffersPage.clickOnContinueReview();
    }
}
