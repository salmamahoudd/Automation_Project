@Run
Feature: Order | User must be already registered on the application

  Background: User could log in with valid email and password
    Given user click on Login link
    When user fills in his valid email and password
    And user clicks on Login button
    Then user navigated to home page

    Scenario: Create successful Order
      Given user click on Electronics category
      When user choose sub categories like a Cell phones
      And  user Add the product want to buy in cart
      And the user go to Shopping cart
      Then user click on terms
      And user click on checkout button
      When the user fills in his mandatory personal data
      And Ensure that the success message is displayed

