@Run
  Feature: Filter Color| user will be able to search for products with different parameters
    Background: User could log in with valid email and password
      Given user click on Login link
      When user fills in his valid email and password
      And user clicks on Login button



Scenario: Logged user could filter with color
Given user click on Apparel category
When user click on shoes category
Then user choose the Gray color