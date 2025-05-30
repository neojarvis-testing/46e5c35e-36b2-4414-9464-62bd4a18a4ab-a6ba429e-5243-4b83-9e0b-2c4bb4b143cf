package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotShopAllLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotShopAll {
    WebDriverHelper helper;
    ExtentTest test;

    /*
     * a. Method Name: HomeDepotShopAll
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Constructor for the HomeDepotShopAll
     *                 initialize the WebDriverHelper and assign ExtentTest
     * d. Return Type: void
     * e. Parameters: 
     *      - ExtentTest test - For logging test steps
     */
    public HomeDepotShopAll(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /*
     * a. Method Name: clickOnShopAll
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on Shop All button
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnShopAll() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopAll, 10);
            Reporter.attachHighlightedScreenshotToReport("Shop All", test, HomeDepotShopAllLocators.shopAll);
            helper.clickOnElement(HomeDepotShopAllLocators.shopAll);
            test.log(Status.PASS, "Clicked on Shop All");
            LoggerHandler.info("Clicked on Shop All");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Shop All");
            test.log(Status.FAIL, "Failed to click on Shop All");
            LoggerHandler.error("Failed to click on Shop All");
        }
    }
    
    /*
     * a. Method Name: clickOnSavings
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on Savings from the dropdown menu
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnSavings() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.savings, 10);
            Reporter.attachHighlightedScreenshotToReport("Savings", test, HomeDepotShopAllLocators.savings);
            helper.clickOnElement(HomeDepotShopAllLocators.savings);
            test.log(Status.PASS, "Clicked on Savings");
            LoggerHandler.info("Clicked on Savings");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Savings");
            test.log(Status.FAIL, "Failed to click on Savings");
            LoggerHandler.error("Failed to click on Savings");
        }
    }
    
    /*
     * a. Method Name: clickOnShopAllSavings
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on Shop All Savings button in the expanded menu
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnShopAllSavings() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopAllSavings, 10);
            Reporter.attachHighlightedScreenshotToReport("Shop All Savings", test, HomeDepotShopAllLocators.shopAllSavings);
            helper.clickOnElement(HomeDepotShopAllLocators.shopAllSavings);
            test.log(Status.PASS, "Clicked on Shop All Savings");
            LoggerHandler.info("Clicked on Shop All Savings");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Shop All Savings");
            test.log(Status.FAIL, "Failed to click on Shop All Savings");
            LoggerHandler.error("Failed to click on Shop All Savings");
        }
    }
    
    /*
     * a. Method Name: verifySavingsCenter
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verifies SAVINGS CENTER header label with Assertion
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifySavingsCenter() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 6, 0);
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.savingsCenter, 10);
            Reporter.attachHighlightedScreenshotToReport("SAVINGS CENTER", test, HomeDepotShopAllLocators.savingsCenter);
            String actualValue = helper.getText(HomeDepotShopAllLocators.savingsCenter);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified SAVINGS CENTER label");
            LoggerHandler.info("Verified SAVINGS CENTER label");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to verify SAVINGS CENTER label");
            test.log(Status.FAIL, "Failed to verify SAVINGS CENTER label");
            LoggerHandler.error("Failed to verify SAVINGS CENTER label");
        }
    }
    
    /*
    * a. Method Name: navigateToPreviousPage
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Navigate backs to the previous page 
    * d. Return Type: void
    * e. Parameters: none
    */
    public void navigateToPreviousPage() {
        try {
            helper.navigateBack();     
            test.log(Status.PASS, "Navigated to previous page");
            LoggerHandler.info("Navigated to previous page");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to navigate to previous page");
            test.log(Status.FAIL, "Failed to navigate to previous page");
            LoggerHandler.error("Failed to navigate to previous page");
        }
    }
    
    /*
    * a. Method Name: verifyShopByDepartmentLabel
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Verifies Shop By Department button label with Assertion
    * d. Return Type: void
    * e. Parameters: none
    */
    public void verifyShopByDepartmentLabel() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 7, 0);
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopByDepartment, 10);
            Reporter.attachHighlightedScreenshotToReport("Shop By Department", test, HomeDepotShopAllLocators.shopByDepartment);
            String actualValue = helper.getText(HomeDepotShopAllLocators.shopByDepartment);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified Shop By Department label");
            LoggerHandler.info("Verified Shop By Department label");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to verify Shop By Department label");
            test.log(Status.FAIL, "Failed to verify Shop By Department label");
            LoggerHandler.error("Failed to verify Shop By Department label");
        }
    }
    
    /*
    * a. Method Name: clickOnShopByDepartment
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Clicks on Shop By Department button from the dropdown menu
    * d. Return Type: void
    * e. Parameters: none
    */
    public void clickOnShopByDepartment() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopByDepartment, 10);
            Reporter.attachHighlightedScreenshotToReport("Shop By Department", test, HomeDepotShopAllLocators.shopByDepartment);
            helper.clickOnElement(HomeDepotShopAllLocators.shopByDepartment);
            test.log(Status.PASS, "Clicked on Shop By Department");
            LoggerHandler.info("Clicked on Shop By Department");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Shop By Department");
            test.log(Status.FAIL, "Failed to click on Shop By Department");
            LoggerHandler.error("Failed to click on Shop By Department");
        }
    }
    
    /*
    * a. Method Name: verifyAppliances
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Verifies Appliances button label with Assertion
    * d. Return Type: void
    * e. Parameters: none
    */
    public void verifyAppliances() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 8, 0);
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.appliances, 10);
            Reporter.attachHighlightedScreenshotToReport("Appliances Label", test, HomeDepotShopAllLocators.appliances);
            String actualValue = helper.getText(HomeDepotShopAllLocators.appliances);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified Appliances label");
            LoggerHandler.info("Verified Appliances label");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to verify Appliances label");
            test.log(Status.FAIL, "Failed to verify Appliances label");
            LoggerHandler.error("Failed to verify Appliances label");
        }
    }
    
    /*
    * a. Method Name: clickOnAppliances
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Clicks on Appliances button in the expanded menu
    * d. Return Type: void
    * e. Parameters: none
    */
    public void clickOnAppliances() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.appliances, 10);
            Reporter.attachHighlightedScreenshotToReport("Appliances", test, HomeDepotShopAllLocators.appliances);
            helper.clickOnElement(HomeDepotShopAllLocators.appliances);
            test.log(Status.PASS, "Clicked on Appliances");
            LoggerHandler.info("Clicked on Appliances");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Appliances");
            test.log(Status.FAIL, "Failed to click on Appliances");
            LoggerHandler.error("Failed to click on Appliances");
        }
    }
    
    /*
    * a. Method Name: verifyShopAllAppliances
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Verifies Shop All Appliances button label with Assertion
    * d. Return Type: void
    * e. Parameters: none
    */
    public void verifyShopAllAppliances() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 9, 0);
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopAllAppliances, 10);
            Reporter.attachHighlightedScreenshotToReport("Shop All Appliances label", test, HomeDepotShopAllLocators.shopAllAppliances);
            String actualValue = helper.getText(HomeDepotShopAllLocators.shopAllAppliances);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified Shop All Appliances label");
            LoggerHandler.info("Verified Shop All Appliances label");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to verify Shop All Appliances label");
            test.log(Status.FAIL, "Failed to verify Shop All Appliances label");
            LoggerHandler.error("Failed to verify Shop All Appliances label");
        }
    }
    
    /*
    * a. Method Name: clickOnShopAllAppliances
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Clicks on Shop All Appliances button in the expanded menu
    * d. Return Type: void
    * e. Parameters: none
     */
    public void clickOnShopAllAppliances() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopAllAppliances, 10);
            Reporter.attachHighlightedScreenshotToReport("Shop All Appliances", test, HomeDepotShopAllLocators.shopAllAppliances);
            helper.clickOnElement(HomeDepotShopAllLocators.shopAllAppliances);
            test.log(Status.PASS, "Clicked on Shop All Appliances");
            LoggerHandler.info("Clicked on Shop All Appliances");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Shop All Appliances");
            test.log(Status.FAIL, "Failed to click on Shop All Appliances");
            LoggerHandler.error("Failed to click on Shop All Appliances");
        }
    }
    
    /*
    * a. Method Name: verifyAppliancesLabel
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Verifies APPLIANCES header label with Assertion
    * d. Return Type: void
    * e. Parameters: none
    */
    public void verifyAppliancesLabel() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 10, 0);
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.appliancesLabel, 10);
            Reporter.attachHighlightedScreenshotToReport("Appliances Label", test, HomeDepotShopAllLocators.appliancesLabel);
            String actualValue = helper.getText(HomeDepotShopAllLocators.appliancesLabel);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified Appliances label");
            LoggerHandler.info("Verified Appliances label");
        } catch (AssertionError e) {
            Screenshot.errorScreenShot("Failed to verify Appliances label");
            test.log(Status.FAIL, "Failed to verify Appliances label");
            LoggerHandler.error("Failed to verify Appliances label");
        }
    }
    
    /*
    * a. Method Name: clickOnKitchenAppliancesPackages
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Clicks on Kitchen Appliance Packages button in the side menu bar
    * d. Return Type: void
    * e. Parameters: none
    */
    public void clickOnKitchenAppliancesPackages() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.kitchenAppliancePackages, 10);
            Reporter.attachHighlightedScreenshotToReport("Kitchen Appliance Packages", test, HomeDepotShopAllLocators.kitchenAppliancePackages);
            helper.clickOnElement(HomeDepotShopAllLocators.kitchenAppliancePackages);
            test.log(Status.PASS, "Clicked on Kitchen Appliance Packages");
            LoggerHandler.info("Clicked on Kitchen Appliance Packages");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Kitchen Appliance Packages");
            test.log(Status.FAIL, "Failed to click on Kitchen Appliance Packages");
            LoggerHandler.error("Failed to click on Kitchen Appliance Packages");
        }
    }
    
    /*
    * a. Method Name: verifyKitchenAppliancesLabel
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Verifies KITCHEN APPLIANCE PACKAGES header label with Assertion
    * d. Return Type: void
    * e. Parameters: none
    */
    public void verifyKitchenAppliancesLabel() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 11, 0);
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.kitchenAppliancePackagesLabel, 10);
            Reporter.attachHighlightedScreenshotToReport("KITCHEN APPLIANCES PACKAGES", test, HomeDepotShopAllLocators.kitchenAppliancePackagesLabel);
            String actualValue = helper.getText(HomeDepotShopAllLocators.kitchenAppliancePackagesLabel);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified KITCHEN APPLIANCE PACKAGES label");
            LoggerHandler.info("Verified KITCHEN APPLIANCE PACKAGES label");
        } catch (AssertionError e) {
            Screenshot.errorScreenShot("Failed to verify KITCHEN APPLIANCE PACKAGES label");
            test.log(Status.FAIL, "Failed to verify KITCHEN APPLIANCE PACKAGES label");
            LoggerHandler.error("Failed to verify KITCHEN APPLIANCE PACKAGES label");
        }
    }
    
    /*
     * a. Method Name: scrollDown
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Scrolls down the page 
     * d. Return Type: void
     * e. Parameters: none
     */
    public void scrollDown() {
        try {
            helper.scrollByValue(0, 500);
            test.log(Status.PASS, "Scroll down the page");
            LoggerHandler.info("Scroll down the page");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to scroll down the page");
            test.log(Status.PASS, "Failed to scroll down the page");
            LoggerHandler.info("Failed to scroll down the page");
        }
    }
    
    /*
     * a. Method Name: clickOnKitchenAppliancesPackages
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on View Package on first product
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnViewPackage() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.viewPackage, 10);
            Reporter.attachHighlightedScreenshotToReport("View Package", test, HomeDepotShopAllLocators.viewPackage);
            helper.clickOnElement(HomeDepotShopAllLocators.viewPackage);
            test.log(Status.PASS, "Clicked on View Package on first product");
            LoggerHandler.info("Clicked on View Package on first product");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on View Package on first product");
            test.log(Status.FAIL, "Failed to click on View Package on first product");
            LoggerHandler.error("Failed to click on View Package on first product");
        }
    }
    
    /*
    * a. Method Name: takeScreenshot
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Takes screenshot of the current page and attaches to report
    * d. Return Type: void
    * e. Parameters: none
    */
    public void takeScreenshot() {
        try {    
            Screenshot.captureScreenShot("View Package of the first product");
            Reporter.attachScreenshotToReport("View Pack", test, "Packages details of the first product");
            test.log(Status.PASS, "Took screenshot of first product");
            LoggerHandler.info("Took screenshot of first product");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to take the screenshot of first product");
            LoggerHandler.error("Failed to take screenshot of first product");
        }

    }
}

