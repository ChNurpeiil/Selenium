Feature: Project Grading

  Scenario: Calculate project grade for one student
    Given the student name is "Alice"
    And the project mark for "Alice" is 90
    When the system calculates the letter grade for "Alice" project mark
    Then the system should display "Alice" grade as "B"