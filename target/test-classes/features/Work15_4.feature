Scenario: Configure Models
  Given the need to configure new computer models
  When the following computer models are configured:
| Capacity    | Color  | Availability | Price     | Screen Dimensions | RAM Size | Processor      | Graphics Card            | Operating System | Warranty |
| 512 GB      | Silver | In Stock     | $999.99   | 15.6 inches       | 8 GB     | Intel Core i7  | NVIDIA GeForce RTX 3080 | Windows 10       | 2 years  |
| 256 GB      | Black  | Out of Stock | $799.99   | 14 inches         | 16 GB    | AMD Ryzen 9    | AMD Radeon RX 6800      | Linux            | 1 year   |
| 1 TB        | White  | In Stock     | $1499.99  | 17 inches         | 32 GB    | Apple M1       | Apple M1 GPU            | macOS            | 3 years  |
  Then new computer models should be successfully configured with the provided details.