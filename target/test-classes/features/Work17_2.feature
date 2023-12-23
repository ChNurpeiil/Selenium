Feature: Dental System Patient Registration and Appointment Booking

  Background:
    Given the patient is on the dental system website

  Scenario: Positive Scenario - Adult Patient with Routine Cleaning

    And the patient is logged in as an adult with name "John Doe" and password "Password123"
    And the patient navigates to the registration page
    And the patient provides personal details with "123 Main St, Cityville" and age "30"
    And the patient selects a "Routine Cleaning" appointment
    When the patient confirms the appointment for "2023-11-15 10:00"
    And the patient receives a confirmation with an approximate time of "1 hour" and a cost estimate of $100
    Then the appointment is successfully scheduled

  Scenario: Positive Scenario - Child Patient with Braces Adjustment

    And the patient is logged in as a child with name "Sarah Johnson" and password "ChildPass1"
    And the patient navigates to the registration page
    And the patient provides personal details with "456 Oak Ave, Smalltown" and age "12"
    And the patient selects a "Braces Adjustment" appointment
    When the patient confirms the appointment for "2023-11-20 15:30"
    And the patient receives a confirmation with an approximate time of "30 minutes" and a cost estimate of $50
    Then the appointment is successfully scheduled

  Scenario: Negative Scenario - Patient with Missing Personal Details

    And the patient is logged in as an adult with name "Alice Smith" and password "UserPass123"
    And the patient navigates to the registration page
    And the patient attempts to book an appointment
    Then the patient receives an error message about missing personal details

  Scenario: Negative Scenario - Invalid Age for Child Patient

    And the patient is logged in as a child with name "Tom Wilson" and password "ChildUser1"
    And the patient navigates to the registration page
    And the patient provides personal details with "789 Elm St, Childville" and an invalid age "5"
    When the patient attempts to book an appointment
    Then the patient receives an error message about the invalid age

  Scenario: Negative Scenario - Invalid Procedure Selection

    And the patient is logged in as an adult with name "Emily White" and password "PassWordUser2"
    And the patient navigates to the registration page
    And the patient provides personal details with "234 Pine St, Woodtown" and age "25"
    And the patient selects an invalid or unavailable procedure "Tooth Whitening"
    When the patient attempts to book an appointment
    Then the patient receives an error message about the invalid procedure selection