Scenario: Generate Client
Given the need to generate a new client
|Parameter        | Value            |
|Address          | 123 Main Street  |
|Name             | John Smith       |
|Plan             |Premium           |
|Last billing date|2023-01-15        |
|Delivery         |Enabled           |
|Phone number     |+1 (123) 456 -7890|
|Email            |john@example.com  |
|Payment          |Credit Card       |
Then a new client should be successfully generated with the provided details.


Scenario: Generate Clients
Given the need to generate new clients
When the following clients are generated:
| Address          | Name        | Plan    | Last billing date | Delivery | Phone number     | Email            | Payment      |
| 123 Main Street  | John Smith  | Premium | 2023-01-15        | Enabled  | +1 (123) 456-7890| john@example.com| Credit Card  |
| 456 Elm Street   | Jane Doe    | Basic   | 2023-02-20        | Disabled | +1 (987) 654-3210| jane@example.com| PayPal       |
Then new clients should be successfully generated with the provided details.
