Scenario: Change Email Address Multiple Times
Given the user is logged in
And the user is on the account settings page
When the user changes the email address to "user1@email.com"
Then the email address should be updated to "user1@email.com"
When the user changes the email address to "user2@email.com"
Then the email address should be updated to "user2@email.com"
When the user changes the email address to "user3@email.com"
Then the email address should be updated to "user3@email.com"
When the user changes the email address to "user4@email.com"
Then the email address should be updated to "user4@email.com"

Scenario: Change Email Address Multiple Times
Given the user is logged in
And the user is on the account settings page
When the user changes the email address to:
| New Email      |
| user1@email.com|
| user2@email.com|
| user3@email.com|
| user4@email.com|
Then the email address should be updated to the new email