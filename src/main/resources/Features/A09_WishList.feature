@Run
Feature: Wishlist | User must be already registered on the application

  Background: User could log in with valid email and password
    Given user click on Login link
    When user fills in his valid email and password
    And user clicks on Login button
    Then user navigated to home page

    Scenario: Logged user could add different products to Wishlist
      Given user click on Books category
      When  user add different products to wishlist
      And user go to Wishlist
      Then count numbers of quantities