Feature: Footer Navigation - About Us Section
 
  Scenario: Verify navigation for all About Us footer links sequentially
        When I click on Careers
        And I verify the Careers URL
        And I click on Corporate Information
        And I verify the Corporate Information URL
        And I click on Digital Newsroom
        And I verify the Digital Newsroom URL
        And I click on Home Depot Foundation
        And I verify the Home Depot Foundation URL
        And I click on Investor Relations
        And I verify the Investor Relations URL
        And I click on Government Customers
        And I verify the Government Customers URL
        And I click on Supplier Providers
        And I verify the Supplier Providers URL
        And I click on Affiliate Program
        And I verify the Affiliate Program URL
        And I click on Eco Actions
        Then I verify the Eco Actions URL