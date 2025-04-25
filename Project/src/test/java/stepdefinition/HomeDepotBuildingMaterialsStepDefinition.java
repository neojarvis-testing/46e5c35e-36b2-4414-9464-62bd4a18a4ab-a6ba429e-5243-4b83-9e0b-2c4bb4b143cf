package stepdefinition;
import pages.HomeDepotBuildingMaterials;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeDepotBuildingMaterialsStepDefinition {
    ExtentTest test=Hooks.reports.createTest("Building Materials");
    HomeDepotBuildingMaterials homeDepotBuildingMaterials=new HomeDepotBuildingMaterials(test);
    @Given("I scroll to Shop By Category")
    public void i_scroll_to_shop_by_category() {
        homeDepotBuildingMaterials.scrollToShopByCategory();
    }
    @When("I click on Building Materials")
    public void i_click_on_building_materials() {
        homeDepotBuildingMaterials.clickOnBuildingMaterials();
    }
    @Then("I verify Building Materials page")
    public void i_verify_building_materials_page() {
        homeDepotBuildingMaterials.verifyBuildingMaterials();
    }
    @Then("I navigate back to the Home page1")
    public void i_navigate_back_to_the_home_page1() {
        homeDepotBuildingMaterials.navigateBackToHome();
    }
    @When("I click on Building Materials again")
    public void i_click_on_building_materials_again() {
        homeDepotBuildingMaterials.clickOnBuildingMaterials();
    }
    @When("I click on Concrete")
    public void i_click_on_concrete() {
        homeDepotBuildingMaterials.clickOnConcrete();
    }
    @Then("I verify Concrete page")
    public void i_verify_concrete_page() {
        homeDepotBuildingMaterials.verifyConcrete();
    }
    @Then("I navigate back to the Home page2")
    public void i_navigate_back_to_the_home_page2() {
        homeDepotBuildingMaterials.navigateBackToHome();
    }
    @When("I click on Decking")
    public void i_click_on_decking() {
        homeDepotBuildingMaterials.clickOnDecking();
    }
    @Then("I verify Decking page")
    public void i_verify_decking_page() {
        homeDepotBuildingMaterials.verifyDecking();
    }
    @Then("I navigate back to the Home page3")
    public void i_navigate_back_to_the_home_page3() {
        homeDepotBuildingMaterials.navigateBackToHome();
    }
    @When("I click on Insulation")
    public void i_click_on_insulation() {
        homeDepotBuildingMaterials.clickOnInsulation();
    }
    @Then("I verify Insulation page")
    public void i_verify_insulation_page() {
        homeDepotBuildingMaterials.verifyInsulation();
    }
    @Then("I navigate back to the Home page4")
    public void i_navigate_back_to_the_home_page4() {
        homeDepotBuildingMaterials.navigateBackToHome();;
    }
    @When("I click on Drywall")
    public void i_click_on_drywall() {
        homeDepotBuildingMaterials.clickOnDryWall();
    }
    @Then("I verify Drywall page")
    public void i_verify_drywall_page() {
        homeDepotBuildingMaterials.verifyDryWall();
    }
    @Then("I click on Shop All Drywall")
    public void i_click_on_shop_all_drywall() {
        homeDepotBuildingMaterials.clickOnShopAllDryWall();
    }
    @Then("I click on All Filters")
    public void i_click_on_all_filters() {
        homeDepotBuildingMaterials.clickOnAllFilters();
    }

}
