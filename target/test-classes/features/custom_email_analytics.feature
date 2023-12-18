Feature: Custom Email Analytics
Feature: Custom Email Analytics

As a user of an email analytics tool,
I want to analyze email performance
In order to make informed decisions for email campaigns

  Scenario: Custom Email Analytics Scenario
    Given the user has access to an email analytics dashboard
    And the user is logged into the email analytics tool

    When the user selects a specific email campaign for analysis
    When applies filters for the desired date range and recipient demographics

    Then the analytics tool should display open rates, click-through rates, and engagement metrics
    Then the user should be able to generate a report based on the analytics data
    Then the user can export the analytics report in PDF or CSV format