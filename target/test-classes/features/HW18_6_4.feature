Feature: HW18_6_4
  Scenario:  Negative test cases for creating a checking account.
    Given the user going to login page
    And new login into the app
    And navigate to the Checking page
    And clicks new checking button
    Then leave account type field not selected
    And click the a "Reset" button
    When validate that the error message is displayed
    And validate that the new account was NOT created