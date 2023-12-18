Feature: Transfer

  Scenario: Money transfer with insufficient funds
    Given User with account number 4210 is registered
    And User with account number 4210 deposited $1000
    When User with account number 4210 transfers $1100
    Then User with account number 4210 should have $1000 in balance
    And User should see Insufficient Funds message

    #when the is not highlighted it means it already has an implementation(step def)