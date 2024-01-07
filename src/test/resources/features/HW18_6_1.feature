Feature: HW18_6_1
  Scenario: Create checking - negative case 5
    Given the user going to login page
    And new login into the app
    And navigate to the Checking page
    And clicks new checking button
    Then test deposit amount field
    And The minimum deposit amount is 25$ on the opening stage, provide less
    And click the "Submit" button
    When validate that the error message is displayed
    And validate that the new account was NOT created

