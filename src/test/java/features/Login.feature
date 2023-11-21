Feature: Login

  Background:
    Given User is on home page
    When User clicks on Sign in link and redirects to Login page

  @SmokeTest
  Scenario: Valid user is able to successfully login
    When Enters valid Username and Password
    Then User is successfully logged in

  @Regression
  Scenario Outline: Invalid Username or password shows error message
    When User enters invalid "<username>" or "<password>"
    Then User should see "<error_message>"

    Examples:
      | username | password | error_message |
      | iinvalid@email.com | 231232 | Your email or password is incorrect! |

  @RegressionDataTable
  Scenario: Invalid Username or password shows error message - Data Table
    When User types invalid email or password
      | email | password | id |
      | invalid@mail.com | 4343 | 1 |
      | invalid2@mail.com | 32435 | 2 |
    Then User should see message