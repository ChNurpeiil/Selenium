Feature: Creating a new checking account

  Scenario: Create a standard individual checking account
    Given the user logged in as "nurasi@gmail.com" "124578N12ch"
#    And the user clicks on the  checking button
#    And the user clicks new checking button
#    When the user selects "Standard Checking" Account type
#    And the user select "Individual" Account Ownership
#    And the user names the account "Nur second checking"
#    And the user makes the initial deposit of $100000.00
#    And the user clicks on submit
    When the user creates a new checking account with the following date
      | checkingAccountType | accountOwnership | accountName         | initialDepositAmount |
      | Standard Checking   | Individual       | Nur second checking | 100000.0             |
    Then  the user should see the green "Successfully created new Standard Checking account named Nur second checking"
    And the user should see newly added account card
      | accountName         | accountType       | ownership  | accountNumber | interestRate | balance   |
      | Nur second checking | Standard Checking | Individual | 486133924     | 0.0%         | 100000.00 |
    And the user should see the following transactions
      | date             | category | description               | amount   | balance  |
      | 2024-01-03 05:28 | Income   | 845325145 (DPT) - Deposit | 100000.0 | 100000.0 |


