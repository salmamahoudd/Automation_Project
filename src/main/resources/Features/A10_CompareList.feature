@Run
Feature: Compare list | User must be already registered on the application

  Background: User could log in with valid email and password
    Given user click on Login link
    When user fills in his valid email and password
    And user clicks on Login button
    Then user navigated to home page

    Scenario: Logged user could add different products to compare list
      Given user click on Gift Cards Category
      When  user add different products to compare list
      And user go to compare product list
      Then user clicks on clear list button
      And Check for a confirmation message

