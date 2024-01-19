@SmokeScenario
Feature: User Login Functionality

  @SmokeTest
  Scenario: Validate user is able to login

    Given :User navigates to login page.
    When : User successfully enters the login details.
    Then : User should be navigate to home page.

# Scenario Outline: Check login is successful with valid credentials
#
#   Given : user is on login page
#   When : user enters <username> and <password>
#   Then : user navigated to homepage
#
#   Examples:
#     |username  |password|
#     |user1     |pass1   |
#     |user2     |pass2   |
