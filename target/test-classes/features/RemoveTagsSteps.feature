Feature: Post Management
  Scenario: User removes tags from a post
    Given the user is logged in and has a post with tags
    And the user navigates to the post edit page
    And the user selects the option to remove tags
    When the user confirms the removal
    And the user saves the changes
    Then the post should be updated successfully
    Then the post should no longer have tags