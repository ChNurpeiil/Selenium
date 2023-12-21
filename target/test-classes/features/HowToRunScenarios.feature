Feature: Transfer
#one of the main principles of writing cucumber feature files
  #steps have to be as dynamic as possible to promote the step reusiblity within other scenarios as
  #well
  Scenario: Money transfer with insufficient funds
    Given User with account number 4210 is registered
    And User with account number 4210 deposited $1000.00
    When User with account number 4210 transfers $1100.00
    Then User with account number 4210 should have $1000.00 in balance
    And User should see Insufficient Funds message

    #when the is not highlighted it means it already has an implementation(step def)
  Scenario: Money transfer with insufficient funds
    Given User with account number 4210 is registered
