Feature: Transfer ownership
 As a user,
  I want to transfer ownership of an account
  In order to assign a new owner to the account
@regression
  Scenario: Transfer Ownership of Account Scenario
    Given an account with ID 12345 exists
    And the account has a current owner
    When the user initiates a transfer of ownership
    And selects a new owner for the account
    Then the ownership of the account should be successfully transferred
    And the new owner should receive a confirmation
