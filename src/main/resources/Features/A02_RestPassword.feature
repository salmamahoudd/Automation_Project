@Run
Feature: Rest Password| The User must be already registered on the application in valid Email
  Background: : User could log in with valid email and password
    Given user click on Login link


  Scenario: User could reset his password successfully
    Given user clicks on Forgot password link
    When user Enter his valid Email
    And user click on recover button
    Then confirm message is displayed