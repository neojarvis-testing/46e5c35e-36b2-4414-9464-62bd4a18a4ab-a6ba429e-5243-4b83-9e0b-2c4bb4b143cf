@vansh
Feature: Apply for Credit Offers

  Scenario Outline: Complete the Credit Offers Application
        When I click on Credit Offers
        And I verify the text for Credit Offers
        And I click on Apply Now
        And I send data for the First Name "demoname"
        And I send data for the Last Name "test"
        And I send data for the Email Address "demotest123@gmail.com"
        And I send data for the Mobile Number "998-877-6653"
        And I click on Continue Contact
        And I click on Continue Contact again
        And I send data for the Street Address "Pennsylvania Avenue NW"
        And I send data for the City "Washington"
        And I send data for the State "DC"
        And I send data for the Zip Code "20004"
        And I click on Continue Review
        And I send data for the Residential Status "Rent"
        And I send data for the Monthly Income "5000"
        And I send data for the Annual Income "60000"
        Then I click on Continue Review again