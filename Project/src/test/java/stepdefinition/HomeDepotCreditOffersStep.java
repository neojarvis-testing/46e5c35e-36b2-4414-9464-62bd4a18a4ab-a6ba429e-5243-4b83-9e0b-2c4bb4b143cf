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
        homeDepotCreditOffersPage.verifyTextForCreditOffers();
    }
    @When("I click on Apply Now")
    public void i_click_on_apply_now() {
        homeDepotCreditOffersPage.clickOnApplyNow();
    }
    @When("I send data for the First Name {string}")
    public void i_send_data_for_the_first_name(String string) {
        homeDepotCreditOffersPage.sendDataForFirstName(string);
    }
    @When("I send data for the Last Name {string}")
    public void i_send_data_for_the_last_name(String string) {
        homeDepotCreditOffersPage.sendDataForLastName(string);
    }
    @When("I send data for the Email Address {string}")
    public void i_send_data_for_the_email_address(String string) {
        homeDepotCreditOffersPage.sendDataForEmailAddress(string);
    }
    @When("I send data for the Mobile Number {string}")
    public void i_send_data_for_the_mobile_number(String string) {
        homeDepotCreditOffersPage.sendDataForMobileNumber(string);
    }
    @When("I click on Continue Contact")
    public void i_click_on_continue_contact() {
        homeDepotCreditOffersPage.clickOnContinueContact();
    }
    @When("I click on Continue Contact again")
    public void i_click_on_continue_contact_again() {
        homeDepotCreditOffersPage.clickOnContinueContact();
    }
    @When("I send data for the Street Address {string}")
    public void i_send_data_for_the_street_address(String string) {
        homeDepotCreditOffersPage.sendDataForStreetAddress(string);
    }
    @When("I send data for the City {string}")
    public void i_send_data_for_the_city(String string) {
        homeDepotCreditOffersPage.sendDataForCity(string);
    }
    @When("I send data for the State {string}")
    public void i_send_data_for_the_state(String string) {
        homeDepotCreditOffersPage.sendDataForState(string);
    }
    @When("I send data for the Zip Code {string}")
    public void i_send_data_for_the_zip_code(String string) {
        homeDepotCreditOffersPage.sendDataForZipCode(string);
    }
    @When("I click on Continue Review")
    public void i_click_on_continue_review() {
        homeDepotCreditOffersPage.clickOnContinueReview();
    }
    @When("I send data for the Residential Status {string}")
    public void i_send_data_for_the_residential_status(String string) {
        homeDepotCreditOffersPage.sendDataForResidentialStatus(string);
    }
    @When("I send data for the Monthly Income {string}")
    public void i_send_data_for_the_monthly_income(String string) {
        homeDepotCreditOffersPage.sendDataForMonthlyIncome(string);
    }
    @When("I send data for the Annual Income {string}")
    public void i_send_data_for_the_annual_income(String string) {
        homeDepotCreditOffersPage.sendDataForAnnualIncome(string);
    }
    @Then("I click on Continue Review again")
    public void i_click_on_continue_review_again() {
        homeDepotCreditOffersPage.clickOnContinueReview();
    }
}
