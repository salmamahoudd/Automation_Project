@Run
Feature: Shopping Cart | User must be already registered on the application

  Background: User could log in with valid email and password
    Given user click on Login link
    When user fills in his valid email and password
    And user clicks on Login button

    Scenario: Logged user could add different products to Shopping cart
      Given user click on Jewelry category
      When user add different products to Shopping cart
      And user go to Shopping cart
      Then count number of quantities
