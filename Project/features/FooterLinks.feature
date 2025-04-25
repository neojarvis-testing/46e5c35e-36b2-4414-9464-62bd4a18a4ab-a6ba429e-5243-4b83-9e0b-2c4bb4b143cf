
Feature: Verify Store and Site Navigation

  Scenario: Navigate and validate various sections of the site
    Given I click on Store Locator
    Then I verify the Store Locator page
    And I navigate back to the Home1
    When I click on Privacy
    Then I verify the Privacy page
    And I navigate back to the Home2
    When I click on Terms
    Then I verify the Terms page
    And I navigate back to the Home3
    When I click on Preference
    Then I verify the Preference page
    And I navigate back to the Home4
    When I click on Site Map
    Then I verify the Site Map page
    And I navigate back to the Home5
    When I click on Store Directory
    Then I verify the Store Directory page