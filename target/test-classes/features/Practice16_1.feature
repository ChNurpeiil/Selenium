Feature: Demo Order

  Scenario Outline: Process Online Orders : "<orderId>"

Given there is an online order with order ID: "<orderId>"
And the customer's has following details:
| customerName   | address   | productName   | quantity   | totalPrice   | unitPrice   | subtotal   | taxRate   | taxAmount   | totalAmount   |
| <customerName> | <address> | <productName> | <quantity> | <totalPrice> | <unitPrice> | <subtotal> | <taxRate> | <taxAmount> | <totalAmount> |
When the user processes the online order, generating an invoice for Order
Then should be processed successfully
Examples:
| orderId | customerName | address                    | productName | quantity | totalPrice | unitPrice | subtotal | taxRate | taxAmount | totalAmount |
| 12345   | John Doe     | 123 Main Street, Cityville | Product A   | 2        | null     | 25.00     | 50.00    | 5       | 2.50      | 52.50       |

