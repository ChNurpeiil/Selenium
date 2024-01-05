Feature: Create application

  Scenario: updating profile
    Given the user go to login page
    And the user navigate to sign in page and register a new user
    And once done, login into the app
    Then navigate to the Update Profile page by hitting profile picture and selecting "My profile"
    And try updating few fields with valid data and submit it
    When validate the success message is displayed
    And validate that the data is saved
