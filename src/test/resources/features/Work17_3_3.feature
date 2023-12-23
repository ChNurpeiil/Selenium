Feature: Growing Different Plants

  Background:
    Given the garden is prepared for planting
    And the gardener is ready to grow peppers

  Scenario Outline: Planting Pepper Seeds
    Given the gardener has "<pepper_quantity>" pepper seeds
    And the gardener prepares the soil with "<soil_preparation>"
    When the gardener plants pepper seeds at a depth of "<planting_depth>" inches
    And the gardener waters the seeds
    Then the "<pepper_quantity>" pepper seeds are planted successfully

    Examples:
      | pepper_quantity | soil_preparation | planting_depth |
      | 40             | well-drained     | 1.5           |
      | 60             | sandy soil       | 1.2           |
      | 30             | loamy soil       | 1.8           |

  Scenario Outline: Tending to Pepper Plants
    Given the pepper plants sprout and grow
    And the gardener applies specialized fertilizer priced at $"<fertilizer_price>"
    And the gardener watches for "<potential_issues>"
    When the pepper plants bear flowers
    Then the pepper plants are well-tended

    Examples:
      | fertilizer_price | potential_issues   |
      | 12              | aphids, mold       |
      | 14              | whiteflies, blight |
      | 10              | yellowing leaves   |

  Scenario Outline: Harvesting Peppers
    Given the pepper fruits are ripe
    And the gardener picks "<ripe_pepper_quantity>" ripe peppers
    And the gardener avoids "<insects_to_avoid>"
    When the "<ripe_pepper_quantity>" peppers are harvested
    Then the harvest is successful

    Examples:
      | ripe_pepper_quantity | insects_to_avoid          |
      | 35                 | aphids, hornworms          |
      | 45                 | whiteflies, fruit flies   |
      | 30                 | mold, pepper weevils      |