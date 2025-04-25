package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDepotFooterPageCustomerService;

public class HomeDepotFooterCustomerServiceStep {
    ExtentTest test = Hooks.reports.createTest("Customer services");
    HomeDepotFooterPageCustomerService homeDepotFooterPageCustomerService = new HomeDepotFooterPageCustomerService(test);


    @Given("I am on the page.")
    public void i_am_on_the_page() {
    }
    @When("I click on check order status.")
    public void i_click_on_check_order_status() {
        homeDepotFooterPageCustomerService.clickOnCheckOrderStatus();
    }
    @When("I verify order status.")
    public void i_verify_order_status() {
        homeDepotFooterPageCustomerService.verifyOrderStatus();
    }
    @When("I click on pay your credit cart.")
    public void i_click_on_pay_your_credit_cart() {
        homeDepotFooterPageCustomerService.clickOnPayYourCreditCard();
    }
    @When("I verify credit center.")
    public void i_verify_credit_center() {
        homeDepotFooterPageCustomerService.verifyCreditCenter();
    }
    @When("I click on order cancellation.")
    public void i_click_on_order_cancellation() {
        homeDepotFooterPageCustomerService.clickOnOrderCancellation();
    }
    @When("I verify customer center.")
    public void i_verify_customer_center() {
        homeDepotFooterPageCustomerService.verifyCustomerCenter();
    }
    @When("I click on return policy.")
    public void i_click_on_return_policy() {
        homeDepotFooterPageCustomerService.clickOnReturnPolicy();
    }
    @When("I verify return policy.")
    public void i_verify_return_policy() {
        homeDepotFooterPageCustomerService.verifyReturnPolicy();
    }
    @When("I click on refund policy.")
    public void i_click_on_refund_policy() {
        homeDepotFooterPageCustomerService.clickOnRefundPolicy();
    }
    @When("I verify refund policy.")
    public void i_verify_refund_policy() {
        homeDepotFooterPageCustomerService.verifyRefundPolicy();
    }
    @When("I click on shipping and delivery.")
    public void i_click_on_shipping_and_delivery() {
        homeDepotFooterPageCustomerService.clickOnShippingAndDelivery();
    }
    @When("I verify online order.")
    public void i_verify_online_order() {
        homeDepotFooterPageCustomerService.verifyOnlineOrder();
    }
    @When("I click on product recalls.")
    public void i_click_on_product_recalls() {
        homeDepotFooterPageCustomerService.clickOnProductRecalls();
    }
    @When("I verify product recalls.")
    public void i_verify_product_recalls() {
        homeDepotFooterPageCustomerService.verifyProductRecalls();
    }
    @When("I click on my preference center.")
    public void i_click_on_my_preference_center() {
        homeDepotFooterPageCustomerService.clickOnMyPreferenceCenter();
    }
    @When("I verify my preference center.")
    public void i_verify_my_preference_center() {
        homeDepotFooterPageCustomerService.verifyMyPreferenceCenter();
    }
    @When("I click on privacy and security center.")
    public void i_click_on_privacy_and_security_center() {
        homeDepotFooterPageCustomerService.clickOnPrivacyAndSecurityCenter();
    }
    @Then("I verify privacy overview.")
    public void i_verify_privacy_overview() {
        homeDepotFooterPageCustomerService.verifyPrivacyOverview();
    }
}
