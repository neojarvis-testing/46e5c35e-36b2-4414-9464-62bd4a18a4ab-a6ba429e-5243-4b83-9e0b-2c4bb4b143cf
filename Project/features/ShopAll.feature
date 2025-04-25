Feature: Navigate Shop and Verify Items

  Scenario: Explore shop savings, departments
    When I click on Shop All
    And I click on Savings
    And I click on Shop All Savings
    And I verify the Savings Center
    And I navigate to the previous page
    And I click on Shop All again
    And I verify the Shop by Department Label
    And I click on Shop by Department
    And I verify Appliances
    And I click on Appliances
    And I verify Shop All Appliances
    And I click on Shop All Appliances
    And I verify the Appliances Label
    And I click on Kitchen Appliances Packages
    And I verify the Kitchen Appliances Label
    And I scroll down
    And I click on View Package
    Then I take a screenshot
