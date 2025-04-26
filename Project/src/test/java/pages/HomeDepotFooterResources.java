package pages;


import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotFooterResourcesLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotFooterResources {
    WebDriverHelper helper;
    ExtentTest test;

    public HomeDepotFooterResources(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
    /* a. Method Name: clickOnSpecials&Offers
     * b. Author Name: Kushal
     * c. Description: Clicks on Specials&Offers in the footer section
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnSpecialsOffers() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.specialAndOffers, 10);
            Reporter.attachHighlightedScreenshotToReport("Specials & Offers", test, HomeDepotFooterResourcesLocators.specialAndOffers);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.specialAndOffers);
            LoggerHandler.info("Clicked on Specials & Offers");
            test.log(Status.PASS, "Clicked on Special & Offers");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("Not clicked on Special & Offers");
            test.log(Status.FAIL, "Not clicked on Special & Offers");
        }
    }
    /* a. Method Name: verifySavingsCenter
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Specials&Offers.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifySavingsCenter() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 0, 0);
            Reporter.attachHighlightedScreenshotToReport("Verify Savings Center", test, HomeDepotFooterResourcesLocators.specialAndOffers);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/Savings_Center");
            test.log(Status.PASS, "URL contains /c/Savings_Center");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("URL doesn't contains /c/Savings_Center");
            test.log(Status.FAIL, "URL doesn't contains /c/Savings_Center");
        }
    }
    /* a. Method Name: clickOnMilitaryDiscountBenefit
     * b. Author Name: Kushal
     * c. Description: Clicks on Military Discount Benefit in the footer section
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnMilitaryDiscountBenefit() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.militaryDiscountBenefit, 10);
            Reporter.attachHighlightedScreenshotToReport("Military Discount Benefit", test, HomeDepotFooterResourcesLocators.militaryDiscountBenefit);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.militaryDiscountBenefit);
            LoggerHandler.info("Clicked on Military Discount Benefit");
            test.log(Status.PASS, "Clicked on Military Discount Benefit");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("Not clicked on Military Discount Benefit");
            test.log(Status.FAIL, "Not clicked on Military Discount Benefit");
        }
    }
    /* a. Method Name: verifySavingsCenter
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Military Discount Benefit.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyMilitary() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 1, 0);
            Reporter.attachHighlightedScreenshotToReport("Verify Military", test, HomeDepotFooterResourcesLocators.militaryDiscountBenefit);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/military");
            test.log(Status.PASS, "URL contains /c/military");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("URL doesn't contains /c/military");
            test.log(Status.FAIL, "URL doesn't contains /c/military");
        }
    }
    /* a. Method Name: clickOnDIYProjectsAndIdeas
     * b. Author Name: Kushal
     * c. Description: Clicks on DIY Projects And Ideas in the footer section
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnDIYProjectsAndIdeas() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.dIYProject, 10);
            Reporter.attachHighlightedScreenshotToReport("DIY Project And Ideas", test, HomeDepotFooterResourcesLocators.dIYProject);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.dIYProject);
            LoggerHandler.info("Clicked on DIY Projects And Ideas");
            test.log(Status.PASS, "Clicked on DIY Projects And Ideas");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("Not clicked on DIY Projects And Ideas");
            test.log(Status.FAIL, "Not clicked on DIY Projects And Ideas");
        }
    }
    /* a. Method Name: verifyDIYProject
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the DIY Projects And Ideas.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyDIYProject() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 2, 0);
            Reporter.attachHighlightedScreenshotToReport("Verify DIY Project", test, HomeDepotFooterResourcesLocators.dIYProject);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/diy_projects_and_ideas");
            test.log(Status.PASS, "URL contains /c/diy_projects_and_ideas");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("URL doesn't contains /c/diy_projects_and_ideas");
            test.log(Status.FAIL, "URL doesn't contains /c/diy_projects_and_ideas");
        }
    }
    /* a. Method Name: clickOnTruckAndToolRental
     * b. Author Name: Kushal
     * c. Description: Clicks on Truck And Tool Rental in the footer section
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnTruckAndToolRental() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.truckAndToolRental, 10);
            Reporter.attachHighlightedScreenshotToReport("Truck And Tool Rental", test, HomeDepotFooterResourcesLocators.truckAndToolRental);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.truckAndToolRental);
            LoggerHandler.info("Clicked on Truck and Tool Rental");
            test.log(Status.PASS, "Clicked on Truck and Tool Rental");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("Not clicked on Truck and Tool Rental");
            test.log(Status.FAIL, "Not clicked on Truck and Tool Rental");
        }
    }
    /* a. Method Name: verifyDIYProject
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Truck And Tool Rental.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyToolAndTruck() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 3, 0);
            Reporter.attachHighlightedScreenshotToReport("Verify Tool And Tool", test, HomeDepotFooterResourcesLocators.truckAndToolRental);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/tool_and_truck_rental");
            test.log(Status.PASS, "URL contains /c/tool_and_truck_rental");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("URL doesn't contains /c/tool_and_truck_rental");
            test.log(Status.FAIL, "URL doesn't contains /c/tool_and_truck_rental");
        }
    }
    /* a. Method Name: clickOnInstallationAndServices
     * b. Author Name: Kushal
     * c. Description: Clicks on Installation And Services in the footer section
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnInstallationAndServices() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.installationandServices, 10);
            Reporter.attachHighlightedScreenshotToReport("Installation And Services", test, HomeDepotFooterResourcesLocators.installationandServices);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.installationandServices);
            LoggerHandler.info("Clicked on Installation & Services");
            test.log(Status.PASS, "Clicked on Installation & Services");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("Not clicked on Installation & Services");
            test.log(Status.FAIL, "Not clicked on Installation & Services");
        }
    }
    /* a. Method Name: verifyServices
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Installation And Services.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyServices() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 4, 0);
            Reporter.attachHighlightedScreenshotToReport("Verify Services", test, HomeDepotFooterResourcesLocators.installationandServices);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /services");
            test.log(Status.PASS, "URL contains /services");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("URL doesn't contains /services");
            test.log(Status.FAIL, "URL doesn't contains /services");
        }
    }
    /* a. Method Name: clickOnMovingSuppliesAndRentals
     * b. Author Name: Kushal
     * c. Description: Clicks on Moving Supplies And Rentals in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnMovingSuppliesAndRentals() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.movingSuppliesAndRentals, 10);
            Reporter.attachHighlightedScreenshotToReport("Moving Supplies And Rentals", test, HomeDepotFooterResourcesLocators.movingSuppliesAndRentals);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.movingSuppliesAndRentals);
            LoggerHandler.info("Clicked on Moving Supplies And Rentals");
            test.log(Status.PASS, "Clicked on Moving Supplies And Rentals");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("Not clicked on Moving Supplies And Rentals");
            test.log(Status.FAIL, "Not clicked on Moving Supplies And Rentals");
        }
    }
    /* a. Method Name: verifyServices
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Moving Supplies And Rentals.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyStorageOrganization() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1",5 , 0);
            Reporter.attachHighlightedScreenshotToReport("Verify Storage Organization", test, HomeDepotFooterResourcesLocators.movingSuppliesAndRentals);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
            test.log(Status.PASS, "URL contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("URL doesn't contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
            test.log(Status.FAIL, "URL doesn't contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
        }
    }
    /* a. Method Name: clickOnProtectionPlans
     * b. Author Name: Kushal
     * c. Description: Clicks on Protection Plans in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnProtectionPlans() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.protectionPlans, 10);
            Reporter.attachHighlightedScreenshotToReport("Protection Plans", test, HomeDepotFooterResourcesLocators.protectionPlans);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.protectionPlans);
            LoggerHandler.info("Clicked on Protection Plans");
            test.log(Status.PASS, "Clicked on Protection Plans");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("Not clicked on Protection Plans");
            test.log(Status.FAIL, "Not clicked on Protection Plans");
        }
    }
    /* a. Method Name: verifyProtectionPlans
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Protection Plans.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyProtectionPlans() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 6, 0);
            Reporter.attachHighlightedScreenshotToReport("Verify Protection Plans", test, HomeDepotFooterResourcesLocators.protectionPlans);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/The_Home_Depot_Protection_Plans");
            test.log(Status.PASS, "URL contains /c/The_Home_Depot_Protection_Plans");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("URL doesn't contains /c/The_Home_Depot_Protection_Plans");
            test.log(Status.FAIL, "URL doesn't contains /c/The_Home_Depot_Protection_Plans");
        }
    }
    /* a. Method Name: clickOnRebateCenter
     * b. Author Name: Kushal
     * c. Description: Clicks on Rebate Center in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnRebateCenter(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.rebateCenter, 10);
            Reporter.attachHighlightedScreenshotToReport("Rebate Center", test, HomeDepotFooterResourcesLocators.rebateCenter);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.rebateCenter);
            LoggerHandler.info("Clicked on Rebate center");
            test.log(Status.PASS, "Clicked on Rebate center");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("Not clicked on Rebate center");
            test.log(Status.FAIL, "Not clicked on Rebate center");
        }
    }
    /* a. Method Name: verifyRebate
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on Rebate Center.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyRebate() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 7, 0);
            Reporter.attachHighlightedScreenshotToReport("Verify Rebate", test, HomeDepotFooterResourcesLocators.rebateCenter);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /rebate-center/index.html");
            test.log(Status.PASS, "URL contains /rebate-center/index.html");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("URL doesn't contains /rebate-center/index.html");
            test.log(Status.FAIL, "URL doesn't contains /rebate-center/index.html");
        }
    }
    /* a. Method Name: clickOnGiftCards
     * b. Author Name: Kushal
     * c. Description: Clicks on Gift Cards in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnGiftCards(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.giftCards, 10);
            Reporter.attachHighlightedScreenshotToReport("Gift Cards", test, HomeDepotFooterResourcesLocators.giftCards);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.giftCards);
            LoggerHandler.info("Clicked on Gift Cards");
            test.log(Status.PASS, "Clicked on Gift Cards");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("Not clicked on Gift Cards");
            test.log(Status.FAIL, "Not clicked on Gift Cards");
        }
    }
    /* a. Method Name: verifyGiftCard
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on Gift Cards.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyGiftCard() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 8, 0);
            Reporter.attachHighlightedScreenshotToReport("Verify Gift Card", test, HomeDepotFooterResourcesLocators.giftCards);
            Assert.assertTrue(text.contains(expected));
            Screenshot.captureScreenShot("Resources");
            Reporter.attachScreenshotToReport("Resources", test, "Attached");
            LoggerHandler.info("URL contains /c/gift-cards");
            test.log(Status.PASS, "URL contains /c/gift-cards");
        } catch (Exception e) {
            Screenshot.errorScreenShot("Failed screenshot Resources");
            LoggerHandler.error("URL doesn't contains /c/gift-cards");
            test.log(Status.FAIL, "URL doesn't contains /c/gift-cards");
        }
    }
}
