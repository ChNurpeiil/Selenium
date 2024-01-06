Feature: HW18_4_2
  Scenario: negative test cases for creating a checking account.
    Given the user going to login page
    And new login into the app
    And navigate to the Checking page
    And clicks new checking button
    Then leave ownership field not selected
    And another fill the rest with valid data
    And click the "Submit" button
    When validate that the error message is displayed
    And validate that the new account was NOT created