package pages;


import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HomeDepotCreditOffersPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotCreditOffersPage {
    WebDriverHelper helper;
    ExtentTest test;
    public HomeDepotCreditOffersPage(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test=test;
    }
    /*
    * a. Method Name: clickOnCreditOffers
    * b. Author Name: Vansh Vijay
    * c. Description: This method waits for the 'Credit Offers' link to be visible, scrolls to the end of the page, clicks the link, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void clickOnCreditOffers(){
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.creditOffers, 10);
            helper.scrollToEnd();
            Reporter.attachHighlightedScreenshotToReport("Clicked on Credit Offers", test, HomeDepotCreditOffersPageLocator.creditOffers);
            helper.clickOnElement(HomeDepotCreditOffersPageLocator.creditOffers);
            LoggerHandler.info("Clicked on Credit Offers");
            test.log(Status.PASS, "Clicked on Credit Offers");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Credit Offers");
            test.log(Status.FAIL, "Not Clicked on Credit Offers");
            Screenshot.errorScreenShot("Not Clicked on Credit Offers");
        }
    }
    /*
    * a. Method Name: verifyTextForCreditOffers
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads expected text data from an Excel file, retrieves the text from a specific element on the page (presumably related to Credit Card Services), asserts that the texts match, and logs the verification result.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void verifyTextForCreditOffers(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 0, 3);
        try {
            Assert.assertEquals(helper.getText(HomeDepotCreditOffersPageLocator.verifyCreditCardServices),excelData);
            LoggerHandler.info("Verified text CREDIT CARD SERVICES");
            test.log(Status.PASS, "Verified text CREDIT CARD SERVICES");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified text CREDIT CARD SERVICES");
            test.log(Status.FAIL, "Not Verified text CREDIT CARD SERVICES");
        }
    }
    /*
    * a. Method Name: clickOnApplyNow
    * b. Author Name: Vansh Vijay
    * c. Description: This method scrolls down the page by a fixed value, waits for the 'Apply Now' button to be visible, clicks the button, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void clickOnApplyNow(){
        try {
            helper.scrollByValue(0, 1000);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.applyNow, 10);
            Reporter.attachHighlightedScreenshotToReport("Clicked on Apply Now", test, HomeDepotCreditOffersPageLocator.applyNow);
            helper.clickOnElement(HomeDepotCreditOffersPageLocator.applyNow);
            LoggerHandler.info("Clicked on Apply Now");
            test.log(Status.PASS, "Clicked on Apply Now");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Apply Now");
            test.log(Status.FAIL, "Not Clicked on Apply Now");
            Screenshot.errorScreenShot("Not Clicked on Apply Now");
        }
    }
    /*
    * a. Method Name: sendDataForFirstName
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads the first name from an Excel file, waits for the first name input field to be visible, enters the retrieved data into the field, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForFirstName(String value){
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.firstName, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.firstName,value);
            LoggerHandler.info("Data inserted for First Name");
            test.log(Status.PASS, "Data inserted for First Name");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for First Name");
            test.log(Status.FAIL, "Data not inserted for First Name");
        }
    }
    /*
    * a. Method Name: sendDataForLastName
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads the last name from an Excel file, waits for the last name input field to be visible, enters the retrieved data into the field, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForLastName(String value){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 2, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.lastName, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.lastName,value);
            Assert.assertEquals(helper.getUrl(),excelValue);
            LoggerHandler.info("Data inserted for Last Name");
            test.log(Status.PASS, "Data inserted for Last Name");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Last Name");
            test.log(Status.FAIL, "Data not inserted for Last Name");
        }
    }
    /*
    * a. Method Name: sendDataForEmailAddress
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads an email address from an Excel file, waits for the email input field to be visible, enters the retrieved data into the field, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForEmailAddress(String value){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.email, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.email,value);
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Data inserted for Email Address");
            test.log(Status.PASS, "Data inserted for Email Address");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Email Address");
            test.log(Status.FAIL, "Data not inserted for Email Address");
        }
    }
    /*
    * a. Method Name: sendDataForMobileNumber
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads a mobile phone number from an Excel file, waits for the phone number input field to be visible, enters the retrieved data into the field, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForMobileNumber(String value){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.phoneNumber, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.phoneNumber,value);
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Data inserted for Mobile Number");
            test.log(Status.PASS, "Data inserted for Mobile Number");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Mobile Number");
            test.log(Status.FAIL, "Data not inserted for Mobile Number");
        }
    }
    /*
    * a. Method Name: clickOnContinueContact
    * b. Author Name: Vansh Vijay
    * c. Description: This method waits for the 'Continue' button (likely after filling contact information) to be visible, clicks the button, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void clickOnContinueContact(){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.continueContact, 10);
            Reporter.attachHighlightedScreenshotToReport("Clicked on Continue", test, HomeDepotCreditOffersPageLocator.continueContact);
            helper.clickOnElement(HomeDepotCreditOffersPageLocator.continueContact);
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Clicked on Continue");
            test.log(Status.PASS, "Clicked on Continue");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Continue");
            test.log(Status.FAIL, "Not Clicked on Continue");
            Screenshot.errorScreenShot("Not Clicked on Continue");
        }
    }
    /*
    * a. Method Name: sendDataForStreetAddress
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads a street address from an Excel file, waits for the street address input field to be visible, enters the retrieved data into the field, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForStreetAddress(String value){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.streetAddress, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.streetAddress,value);
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Data inserted for Street Address");
            test.log(Status.PASS, "Data inserted for Street Address");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Street Address");
            test.log(Status.FAIL, "Data not inserted for Street Address");
        }
    }
    /*
    * a. Method Name: sendDataForCity
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads a city name from an Excel file, waits for the city input field to be visible, enters the retrieved data into the field, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForCity(String value){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.city, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.city,value);
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Data inserted for City");
            test.log(Status.PASS, "Data inserted for City");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for City");
            test.log(Status.FAIL, "Data not inserted for City");
        }
    }
    /*
    * a. Method Name: sendDataForState
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads a state name from an Excel file, waits for the state dropdown element to be visible, selects the specified state from the dropdown, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForState(String value){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.state, 10);
            helper.selectFromDropdown(HomeDepotCreditOffersPageLocator.state,value);
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Data inserted for State");
            test.log(Status.PASS, "Data inserted for State");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for State");
            test.log(Status.FAIL, "Data not inserted for State");
        }
    }
    /*
    * a. Method Name: sendDataForZipCode
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads a zip code from an Excel file, waits for the zip code input field to be visible, enters the retrieved data into the field, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForZipCode(String value){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.zipCode, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.zipCode,value);
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Data inserted for Zip Code");
            test.log(Status.PASS, "Data inserted for Zip Code");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Zip Code");
            test.log(Status.FAIL, "Data not inserted for Zip Code");
        }
    }
    /*
    * a. Method Name: clickOnContinueReview
    * b. Author Name: Vansh Vijay
    * c. Description: This method waits for the 'Continue' button (likely proceeding to the review step) to be visible, clicks the button, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void clickOnContinueReview(){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.continueReview, 10);
            Reporter.attachHighlightedScreenshotToReport("Clicked on Continue", test, HomeDepotCreditOffersPageLocator.continueReview);
            helper.clickOnElement(HomeDepotCreditOffersPageLocator.continueReview);
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Clicked on Continue");
            test.log(Status.PASS, "Clicked on Continue");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Continue");
            test.log(Status.FAIL, "Not Clicked on Continue");
            Screenshot.errorScreenShot("Not Clicked on Continue");
        }
    }
    /*
    * a. Method Name: sendDataForResidentialStatus
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads a residential status value from an Excel file, waits for the residential status dropdown element to be visible, selects the specified status from the dropdown, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForResidentialStatus(String value){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.residentialStatus, 10);
            helper.selectFromDropdown(HomeDepotCreditOffersPageLocator.residentialStatus,value);
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Data inserted for Residential Status");
            test.log(Status.PASS, "Data inserted for Residential Status");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Residential Status");
            test.log(Status.FAIL, "Data not inserted for Residential Status");
        }
    }
    /*
    * a. Method Name: sendDataForMonthlyIncome
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads a monthly income value from an Excel file, waits for the monthly income input field to be visible, enters the retrieved data into the field, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForMonthlyIncome(String value){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.monthlyIncome, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.monthlyIncome,value);
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Data inserted for Monthly Income");
            test.log(Status.PASS, "Data inserted for Monthly Income");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Monthly Income");
            test.log(Status.FAIL, "Data not inserted for Monthly Income");
        }
    }
    /*
    * a. Method Name: sendDataForAnnualIncome
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads a total annual income value from an Excel file, waits for the total income input field to be visible, enters the retrieved data into the field, captures a screenshot, and logs the action.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void sendDataForAnnualIncome(String value){
        String excelValue = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 3);
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.totalIncome, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.totalIncome,value);
            Screenshot.captureScreenShot("Annual Income");
            Assert.assertEquals(helper.getTitle(),excelValue);
            LoggerHandler.info("Data inserted for Total Income");
            test.log(Status.PASS, "Data inserted for Total Income");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Total Income");
            test.log(Status.FAIL, "Data not inserted for Total Income");
        }
    }
   }
