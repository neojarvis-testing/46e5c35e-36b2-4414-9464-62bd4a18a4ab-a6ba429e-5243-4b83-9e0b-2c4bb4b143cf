package uistore;

import org.openqa.selenium.By;

public class HomeDepotShopAllLocators {
    /*
     * Author: Jaya vardhan Raju G
     */
    // Shop All button on the navigation bar
    public static By shopAll = By.cssSelector("div[class = 'sui-flex sui-justify-around sui-mx-3 sui-my-4 sui-h-fit lg:sui-gap-6 lg:sui-mx-0 lg:sui-my-0'] button:nth-child(1)");
    // Savings button from the dropdown menu
    public static By savings = By.xpath("//span[text() = 'Savings']");
    // Shop All Savings button in the expanded menu
    public static By shopAllSavings = By.xpath("//span[text() = 'Shop All Savings']");
    // SAVINGS CENTER header label
    public static By savingsCenter = By.xpath("//h1[text() = 'SAVINGS CENTER']");
    // Shop By Department from the dropdown menu
    public static By shopByDepartment = By.xpath("//span[text() = 'Shop By Department']");
    // Appliances button in the expanded menu
    public static By appliances = By.xpath("//span[text() = 'Appliances']");
    // Shop All Appliances button in the expanded menu
    public static By shopAllAppliances = By.xpath("//span[text() = 'Shop All Appliances']");
    // APPLIANCES header label
    public static By appliancesLabel = By.xpath("//h1[text() = 'Appliances']");
    // Kitchen Appliance Packages button in side menu bar
    public static By kitchenAppliancePackages = By.xpath("//a[text() = 'Kitchen Appliance Packages']");
    // KITCHEN APPLIANCE PACKAGES header label
    public static By kitchenAppliancePackagesLabel = By.xpath("//h1[text() = 'KITCHEN APPLIANCE PACKAGES']");
    // View Package button from the first displayed result
    public static By viewPackage = By.xpath("(//a[text() = 'View Package'])[1]");
    
}

 