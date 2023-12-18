Feature: Open Supervision
  As s supervisor,
  I want to monitor a team agents working in a call center
  In order to ensure efficient operations and provide assistance
  Scenario: Team Supervision Scenario
    Given a team of agents is working in a call center
    And the team is handling incoming customer calls

    Given the current status is active

    When the supervisor initiates a supervision session
    Then the supervisor should be able to view live statistics of ongoing calls
    And the supervisor can listen in to angoing calls for quality assessment