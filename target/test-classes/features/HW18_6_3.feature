Feature: HW18_6_3
  Scenario: Create checking - negative case 7
    Given the user going to login page
    And new login into the app
    And navigate to the Checking page
    And clicks new checking button
    Then test deposit amount field
    And the input accepts numbers only, provide some non-numeric values
    And click the "Submit" button
    When validate that the error message is displayed
    And validate that the new account was NOT created