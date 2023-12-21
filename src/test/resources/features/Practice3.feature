Feature: Call System Configuration
  Scenario: User turns on the audio message feature
    Given the user is an administrator logged into the call system configuration
    And the user selects the system settings option
    And the user chooses the audio messaging feature from the available options
    And the audio message feature is currently turned off
    When the user toggles the audio message feature to "on"
    And confirms the change
    Then the system should save the configuration successfully
    And the audio message feature should be turned on