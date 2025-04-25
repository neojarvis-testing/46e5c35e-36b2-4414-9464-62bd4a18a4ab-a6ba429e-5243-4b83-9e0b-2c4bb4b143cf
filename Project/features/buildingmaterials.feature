Feature: Explore Building Materials and Verify Items

  Scenario: Navigate through various categories and verify their contents
    Given I scroll to Shop By Category
    When I click on Building Materials
    Then I verify Building Materials page
    And I navigate back to the Home page1
    When I click on Building Materials again
    And I click on Concrete
    Then I verify Concrete page
    And I navigate back to the Home page2
    When I click on Decking
    Then I verify Decking page
    And I navigate back to the Home page3
    When I click on Insulation
    Then I verify Insulation page
    And I navigate back to the Home page4
    When I click on Drywall
    Then I verify Drywall page
    And I click on Shop All Drywall
    And I click on All Filters