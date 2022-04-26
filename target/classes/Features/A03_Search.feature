@Run
Feature: Search | users will be able to search for products with different parameters

  Background: User could log in with valid email and password
    Given user click on Login link
    When user fills in his valid email and password
    And user clicks on Login button


  Scenario: Logged User could search for any product
    Given user clicks on search field
    When user search with name of product
    Then user could find relative results




