Feature: HW18

  Scenario: Update profile negative case
    Given go to login page
    And login into the app
    Then navigate user to the Update Profile page by hitting profile picture and selecting "My profile"
    And full wrong format like phone or region or postal code
    And empty required fields
    And reset the title
    And postal code can be only numeric, check it
    And region can only alphabetic, check it
    And country can only alphabetic, check it
    When validate the error message is displayed after each wrong profile update operation
    And validate that the data is not saved


