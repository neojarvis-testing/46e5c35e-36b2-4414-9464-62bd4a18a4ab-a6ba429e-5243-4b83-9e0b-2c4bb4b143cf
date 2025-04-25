Feature: Navigate Services and Verify Sections

  Scenario: Explore Services and Installation Options
    When I click on the Services icon
    Then I verify the Services text
    And I click on Installation
    And I click on View All Installation
    Then I verify the Home Services text
    And I click on Flooring
    Then I verify the Flooring text
    And I navigate back to the previous Home page
    And I click on Bathroom
    Then I verify the Bathroom text
    And I navigate back to the Recent page
    And I click on Doors and Windows
    Then I verify the Window Services text
    And I navigate back to the previous page
    And I click on Heating
    Then I verify the Heating text
    And I navigate back to the Home page