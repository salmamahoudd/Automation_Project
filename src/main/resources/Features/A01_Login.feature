@Run
Feature: Login| The User must be already registered on the application

  Scenario: User could log in with valid email and password
    Given user click on Login link
    When user fills in his valid email and password
    And user clicks on Login button
    Then user navigated to home page


