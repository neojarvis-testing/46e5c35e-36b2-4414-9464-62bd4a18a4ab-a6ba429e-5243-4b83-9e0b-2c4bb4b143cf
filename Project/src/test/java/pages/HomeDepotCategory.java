package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotCategoryLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotCategory {
    WebDriverHelper helper;
    ExtentTest test;

    /*
     * a. Method Name: HomeDepotCategory
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Constructor for the HomeDepotCategory
     *                 initialize the WebDriverHelper and assign ExtentTest
     * d. Return Type: void
     * e. Parameters: 
     *      - ExtentTest test - For logging test steps
     */
    public HomeDepotCategory(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /*
     * a. Method Name: clickOnSearchInputBar
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on search input bar on the top of the homepage
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnSearchInputBar() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.searchInputBar, 10);
            Reporter.attachHighlightedScreenshotToReport("Input Search Bar", test, HomeDepotCategoryLocators.searchInputBar);
            helper.clickOnElement(HomeDepotCategoryLocators.searchInputBar);
            test.log(Status.PASS, "Clicked on Input Search Bar");
            LoggerHandler.info("Clicked on Input Search Bar");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Input Search Bar");
            test.log(Status.FAIL, "Failed to click on Input Search Bar");
            LoggerHandler.error("Failed to click on Input Search Bar");
        }
    }

    /*
     * a. Method Name: enterValueOnInputBar
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Enters value on search input bar
     * d. Return Type: void
     * e. Parameters: none
     */
    public void enterValueOnInputBar(String value) {
        try {
            helper.sendData(HomeDepotCategoryLocators.searchInputBar, value);
            test.log(Status.PASS,  "Entered wrench on Input Search Bar");
            LoggerHandler.info("Entered wrench on Input Search Bar");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to enter value on Input Search Bar");
            test.log(Status.FAIL, "Failed to enter value on Input Search Bar");
            LoggerHandler.error("Failed to enter value on Input Search Bar");
        }
    }
    
    /*
    * a. Method Name: clickOnSearchIcon
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on search icon on the input bar
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnSearchIcon() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.searchIcon, 10);
            Reporter.attachHighlightedScreenshotToReport("Search Icon", test, HomeDepotCategoryLocators.searchIcon);
            helper.clickOnElement(HomeDepotCategoryLocators.searchIcon);
            test.log(Status.PASS, "Clicked on Search Icon");
            LoggerHandler.info("Clicked On Search Icon");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Search Icon");
            test.log(Status.FAIL, "Failed to click on Search Icon");
            LoggerHandler.error("Failed to click On Search Icon"); 
        }
    }
    
    /*
    * a. Method Name: verifyWrenchLabel
    * b. Author Name: Jaya vardhan Raju G
    * c. Description: Verifies wrench label with Assertion
    * d. Return Type: void
    * e. Parameters: none
    */
    public void verifyWrenchLabel() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 0, 0);
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.wrenchLabel, 10);
            Reporter.attachHighlightedScreenshotToReport("Wrench Label", test, HomeDepotCategoryLocators.wrenchLabel);
            String actualValue = helper.getText(HomeDepotCategoryLocators.wrenchLabel);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified wrench label");
            LoggerHandler.info("Verified wrench label");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to verify wrench label");
            test.log(Status.FAIL, "Failed to verify wrench label");
            LoggerHandler.error("Failed to verify wrench label");
        }
    }
    
    /*
     * a. Method Name: clickOnCategory
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on catergory dropdown filter
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnCategory() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.category, 10);
            Reporter.attachHighlightedScreenshotToReport("Category", test, HomeDepotCategoryLocators.category);
            helper.clickOnElement(HomeDepotCategoryLocators.category);
            test.log(Status.PASS, "Clicked on Category");
            LoggerHandler.info("Clicked on Category");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on category");
            test.log(Status.FAIL, "Failed to click on Category");
            LoggerHandler.error("Failed to click on Category");
        }
    }
    
    /*
     * a. Method Name: clickOnWrenchSets
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on Wrench Sets from category dropdown filter
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnWrenchSets() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.wrenchSets, 10);
            Reporter.attachHighlightedScreenshotToReport("Wrench Sets", test, HomeDepotCategoryLocators.wrenchSets);
            helper.clickOnElement(HomeDepotCategoryLocators.wrenchSets);
            test.log(Status.PASS, "Clicked on Wrench Sets");
            LoggerHandler.info("Clicked on Wrench Sets");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Wrench Sets");
            test.log(Status.FAIL, "Failed to click on Wrench Sets");
            LoggerHandler.error("Failed to click on Wrench Sets");
        }
    }
    
    /*
     * a. Method Name: verifyWrenchSetsLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verifies Wrench Sets label with Assertion
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyWrenchSetsLabel() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 1, 0);
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.wrenchSetsLabel, 10);
            Reporter.attachHighlightedScreenshotToReport("Wrench Sets Label", test, HomeDepotCategoryLocators.wrenchSetsLabel);
            String actualValue = helper.getText(HomeDepotCategoryLocators.wrenchSetsLabel);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified Wrench Sets label");
            LoggerHandler.info("Verified Wrench Sets label");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to verify Wrench Sets label");
            test.log(Status.FAIL, "Failed to verify Wrench Sets label");
            LoggerHandler.error("Failed to verify Wrench Sets label");
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
     * a. Method Name: clickOnRatchetingWrenches
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on Ratcheting Wrenches from category dropdown filter
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnRatchetingWrenches() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.ratchetingWrenches, 10);
            Reporter.attachHighlightedScreenshotToReport("Ratcheting Wrenches", test, HomeDepotCategoryLocators.ratchetingWrenches);
            helper.clickOnElement(HomeDepotCategoryLocators.ratchetingWrenches);
            test.log(Status.PASS, "Clicked on Ratcheting Wrenches");
            LoggerHandler.info("Clicked on Ratcheting Wrenches");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Ratcheting Wrenches");
            test.log(Status.FAIL, "Failed to click on Ratcheting Wrenches");
            LoggerHandler.error("Failed to click on Ratcheting Wrenches");
        }
    }
    
    /*
     * a. Method Name: verifyRatchetingWrenchesLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verifies Ratcheting Wrenches label with Assertion
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyRatchetingWrenchesLabel() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 2, 0);
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.ratchetingWrenchesLabel, 10);
            Reporter.attachHighlightedScreenshotToReport("Ratecheting Wrenches Label", test, HomeDepotCategoryLocators.ratchetingWrenchesLabel);
            String actualValue = helper.getText(HomeDepotCategoryLocators.ratchetingWrenchesLabel);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified Ratcheting Wrenches label");
            LoggerHandler.info("Verified Ratcheting Wrenches label");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to verify Ratcheting Wrenches label");
            test.log(Status.FAIL, "Failed to verify Ratcheting Wrenches label");
            LoggerHandler.error("Failed to verify Ratcheting Wrenches label");
        } 
    }

    /*
     * a. Method Name: clickOnAdjustableWrenches
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on Adjustable Wrenches from category dropdown filter
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnAdjustableWrenches() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.adjustableWrenches, 10);
            Reporter.attachHighlightedScreenshotToReport("Adjustable Wrenches", test, HomeDepotCategoryLocators.adjustableWrenches);
            helper.clickOnElement(HomeDepotCategoryLocators.adjustableWrenches);
            test.log(Status.PASS, "Clicked on Adjustable Wrenches");
            LoggerHandler.info("Clicked on Adjustable Wrenches");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Adjustable Wrenches");
            test.log(Status.FAIL, "Failed to click on Adjustable Wrenches");
            LoggerHandler.error("Failed to click on Adjustable Wrenches");
        }
    }
    
    /*
     * a. Method Name: verifyAdjustableWrenchesLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verifies Adjustable Wrences label with Assertion
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyAdjustableWrenchesLabel() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 3, 0);
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.adjustableWrenchesLabel, 10);
            Reporter.attachHighlightedScreenshotToReport("Adjustable Wrenches Label", test, HomeDepotCategoryLocators.adjustableWrenchesLabel);
            String actualValue = helper.getText(HomeDepotCategoryLocators.adjustableWrenchesLabel);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified Adjustable Wrenches label");
            LoggerHandler.info("Verified Adjustable Wrenches label");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to verify Adjustable Wrenches label");
            test.log(Status.FAIL, "Failed to verify Adjustable Wrenches label");
            LoggerHandler.error("Failed to verify Adjustable Wrenches label");
        } 
    }

    /*
     * a. Method Name: clickOnAdjustableWrenches
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on Impact Wrenches from category dropdown filter
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnImpactWrenches() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.impactWrenches, 10);
            Reporter.attachHighlightedScreenshotToReport("Adjustable Wrenches", test, HomeDepotCategoryLocators.impactWrenches);
            helper.clickOnElement(HomeDepotCategoryLocators.impactWrenches);
            test.log(Status.PASS, "Clicked on Adjustable Wrenches");
            LoggerHandler.info("Clicked on Adjustable Wrenches");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to click on Adjustable Wrenches");
            test.log(Status.FAIL, "Failed to click on Adjustable Wrenches");
            LoggerHandler.error("Failed to click on Adjustable Wrenches");
        }
    }
    
    /*
     * a. Method Name: verifyImpactWrenchesLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verifies Impact Wrenches label with Assertion
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyImpactWrenchesLabel() {
        try {
            String expectedValue = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/jay_test_data.xlsx", "Sheet1", 4, 0);
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.impactWrenchesLabel, 10);
            Reporter.attachHighlightedScreenshotToReport("Impact Wrenches Label", test, HomeDepotCategoryLocators.impactWrenchesLabel);
            String actualValue = helper.getText(HomeDepotCategoryLocators.impactWrenchesLabel);
            Assert.assertEquals(actualValue, expectedValue);
            test.log(Status.PASS, "Verified Impact Wrenches label");
            LoggerHandler.info("Verified Impact Wrenches label");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed to verify Impact Wrenches label");
            test.log(Status.FAIL, "Failed to verify Impact Wrenches label");
            LoggerHandler.error("Failed to verify Impact Wrenches label");
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
            Screenshot.captureScreenShot("Impact Wrenches");
            Reporter.attachScreenshotToReport("Impact Wrenches", test, "Details of Wrenches");
            test.log(Status.PASS, "Took screenshot of Impact Wrenches page");
            LoggerHandler.info("Took screenshot of Impact Wrenches page");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to take the screenshot of Impact Wrenches page");
            LoggerHandler.error("Failed to take screenshot of Impact Wrenches page");
        }
    }
}