Feature: HW18_5_1
  Scenario: Create checking - negative case 3
    Given the user going to login page
    And new login into the app
    And navigate to the Checking page
    And clicks new checking button
    Then leave Name field empty
    And click the "Submit" button
    When validate that the error message is displayed
    And validate that the new account was NOT created
