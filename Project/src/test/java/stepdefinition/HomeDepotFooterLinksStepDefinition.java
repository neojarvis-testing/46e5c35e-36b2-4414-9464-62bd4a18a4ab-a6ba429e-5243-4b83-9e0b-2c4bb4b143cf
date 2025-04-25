package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDepotFooterLinksPage;

public class HomeDepotFooterLinksStepDefinition {
    ExtentTest test=Hooks.reports.createTest("Footer Links");
    HomeDepotFooterLinksPage homeDepotFooterLinksPage=new HomeDepotFooterLinksPage(test);
    @Given("I click on Store Locator")
    public void i_click_on_store_locator() {
        homeDepotFooterLinksPage.clickOnStoreLocator();
    }
    @Then("I verify the Store Locator page")
    public void i_verify_the_store_locator_page() {
        homeDepotFooterLinksPage.verifyStoreLocator();

    }
    @Then("I navigate back to the Home1")
    public void i_navigate_back_to_the_home1() {
        homeDepotFooterLinksPage.navigateBackToHome();

    }
    @When("I click on Privacy")
    public void i_click_on_privacy() {
        homeDepotFooterLinksPage.clickOnPrivacy();

    }
    @Then("I verify the Privacy page")
    public void i_verify_the_privacy_page() {
        homeDepotFooterLinksPage.verifyPrivacy();

    }
    @Then("I navigate back to the Home2")
    public void i_navigate_back_to_the_home2() {
        homeDepotFooterLinksPage.navigateBackToHome();

    }
    @When("I click on Terms")
    public void i_click_on_terms() {
        homeDepotFooterLinksPage.clickOnTerm();

    }
    @Then("I verify the Terms page")
    public void i_verify_the_terms_page() {
        homeDepotFooterLinksPage.verifyTerms();

    }
    @Then("I navigate back to the Home3")
    public void i_navigate_back_to_the_home3() {
        homeDepotFooterLinksPage.navigateBackToHome();

    }
    @When("I click on Preference")
    public void i_click_on_preference() {
        homeDepotFooterLinksPage.clickOnPreference();

    }
    @Then("I verify the Preference page")
    public void i_verify_the_preference_page() {
        homeDepotFooterLinksPage.verifyPreference();

    }
    @Then("I navigate back to the Home4")
    public void i_navigate_back_to_the_home4() {
        homeDepotFooterLinksPage.navigateBackToHome();

    }
    @When("I click on Site Map")
    public void i_click_on_site_map() {
        homeDepotFooterLinksPage.clickOnSiteMap();

    }
    @Then("I verify the Site Map page")
    public void i_verify_the_site_map_page() {
        homeDepotFooterLinksPage.verifySiteMap();

    }
    @Then("I navigate back to the Home5")
    public void i_navigate_back_to_the_home5() {
        homeDepotFooterLinksPage.navigateBackToHome();

    }
    @When("I click on Store Directory")
    public void i_click_on_store_directory() {
        homeDepotFooterLinksPage.clickOnStoreDirectory();

    }
    @Then("I verify the Store Directory page")
    public void i_verify_the_store_directory_page() {
        homeDepotFooterLinksPage.verifyStoreDirectory();

    }
}
