@HomePageTest
Feature: User Login Functionality

  Scenario Outline: Validate user is able to login

    Given :User navigates to login page.
    When : User enters <username> and <password>
    Then : User should be navigate to home page.

    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |

