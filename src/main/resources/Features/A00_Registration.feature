@Run
Feature: Registration | user should be able to sign up with new account

  Scenario: User could register with valid data


    Given user click on register link
    When user fills in his Personal Details with valid data
    And  user fills in his Password with valid data
    And user clicks on register button
    Then success message is displayed