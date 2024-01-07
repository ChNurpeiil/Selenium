Feature: HW18_6_2
  Scenario: Create checking - negative case 6
    Given the user going to login page
    And new login into the app
    And navigate to the Checking page
    And clicks new checking button
    Then test deposit amount field
    And  the max deposit amount is a trillion $ on the opening stage, provide more
    And click the "Submit" button
    When validate that the error message is displayed
    And validate that the new account was NOT created

