@Run
  Feature: currencies| user will be able to search for products with different parameters

    Background: User could log in with valid email and password
      Given user click on Login link
      When user fills in his valid email and password
      And user clicks on Login button

    Scenario: Logged User could switch between currencies US-Euro
      Given the user click on the hamburger icon in the top left corner of the screen