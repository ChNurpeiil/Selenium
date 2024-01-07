Feature: HW18_5_2
  Scenario: Create checking - negative case 4
    Given the user going to login page
    And new login into the app
    And navigate to the Checking page
    And clicks new checking button
    Then max length of the name should be no longer than 256 characters
    And click the "Submit" button
    When validate that the error message is displayed
    And validate that the new account was NOT created