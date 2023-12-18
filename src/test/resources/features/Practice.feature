Feature: Custom Login Feature
  As a user,
  I want to log in to the system
  In order to access my account and use the application

  Scenario: Custom Login Scenario
    Given the user is on the login page
    When the user enters valid login credentials and clicks the login button
    Then the user should be logged in successfully
