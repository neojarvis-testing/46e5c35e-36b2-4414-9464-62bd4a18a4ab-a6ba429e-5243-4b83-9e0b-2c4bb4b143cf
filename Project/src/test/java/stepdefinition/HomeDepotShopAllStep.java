package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDepotShopAll;

public class HomeDepotShopAllStep {
    ExtentTest test = Hooks.reports.createTest("Shop All Testcase");
    HomeDepotShopAll homeDepotShopAll = new HomeDepotShopAll(test);


    @When("I click on Shop All")
    public void i_click_on_shop_all() {
        homeDepotShopAll.clickOnShopAll();
    }

    @When("I click on Savings")
    public void i_click_on_savings() {
        homeDepotShopAll.clickOnSavings();
    }

    @When("I click on Shop All Savings")
    public void i_click_on_shop_all_savings() {
        homeDepotShopAll.clickOnShopAllSavings();
    }

    @When("I verify the Savings Center")
    public void i_verify_the_savings_center() {
        homeDepotShopAll.verifySavingsCenter();
    }

    @When("I navigate to the previous page")
    public void i_navigate_to_the_previous_page() {
        homeDepotShopAll.navigateToPreviousPage();
    }

    @When("I click on Shop All again")
    public void i_click_on_shop_all_again() {
        homeDepotShopAll.clickOnShopAll();
    }
    
    @When("I verify the Shop by Department Label")
    public void i_verify_the_shop_by_department_label() {
        homeDepotShopAll.verifyShopByDepartmentLabel();
    }

    @When("I click on Shop by Department")
    public void i_click_on_shop_by_department() {
        homeDepotShopAll.clickOnShopByDepartment();
    }

    @When("I verify Appliances")
    public void i_verify_appliances() {
        homeDepotShopAll.verifyAppliances();
    }

    @When("I click on Appliances")
    public void i_click_on_appliances() {
        homeDepotShopAll.clickOnAppliances();
    }

    @When("I verify Shop All Appliances")
    public void i_verify_shop_all_appliances() {
        homeDepotShopAll.verifyAppliancesLabel();
    }

    @When("I click on Shop All Appliances")
    public void i_click_on_shop_all_appliances() {
        homeDepotShopAll.clickOnShopAllAppliances();
    }

    @When("I verify the Appliances Label")
    public void i_verify_the_appliances_label() {
        homeDepotShopAll.verifyAppliancesLabel();
    }

    @When("I click on Kitchen Appliances Packages")
    public void i_click_on_kitchen_appliances_packages() {
        homeDepotShopAll.clickOnKitchenAppliancesPackages();
    }

    @When("I verify the Kitchen Appliances Label")
    public void i_verify_the_kitchen_appliances_label() {
        homeDepotShopAll.verifyKitchenAppliancesLabel();
    }

    @When("I scroll down")
    public void i_scroll_down() {
        homeDepotShopAll.scrollDown();
    }

    @When("I click on View Package")
    public void i_click_on_view_package() {
        homeDepotShopAll.clickOnViewPackage();
    }

    @Then("I take a screenshot")
    public void i_take_a_screenshot() {
        homeDepotShopAll.takeScreenshot();
    }

}
