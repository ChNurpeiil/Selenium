Feature: HW18_3
  Scenario: positive test cases changing password
    Given go to login page
    And login into the app
    Then navigate user to the Update Profile page by hitting profile picture and selecting "Change Password"
    And fill current password
    And fill valid new password in both fields  (valid password must contain at least 8 characters, one uppercase, one lowercase, digits, and special character)
    And hit the "Update Password" button
    When validate that the success message is displayed
    And validate that the new password is applied by signing ot and signing in again with new credentials


