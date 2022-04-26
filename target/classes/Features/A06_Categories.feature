@Run
  Feature: Categories | User must be already registered on the application

    Background: User could log in with valid email and password
      Given user click on Login link
      When user fills in his valid email and password
      And user clicks on Login button

      Scenario: Logged user could select different Categories
        Given user click on computer category
        When user choose sub categories like a notebooks