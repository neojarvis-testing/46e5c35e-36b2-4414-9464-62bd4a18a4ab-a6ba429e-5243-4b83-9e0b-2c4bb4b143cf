Feature: Apply for Credit Offers

  Scenario: Complete the Credit Offers Application
        When I click on Credit Offers
        And I verify the text for Credit Offers
        And I click on Apply Now
        And I send data for the First Name
        And I send data for the Last Name
        And I send data for the Email Address
        And I send data for the Mobile Number
        And I click on Continue Contact
        And I click on Continue Contact again
        And I send data for the Street Address
        And I send data for the City
        And I send data for the State
        And I send data for the Zip Code
        And I click on Continue Review
        And I send data for the Residential Status
        And I send data for the Monthly Income
        And I send data for the Annual Income
        Then I click on Continue Review again