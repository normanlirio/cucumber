Feature: Login

  Scenario: Valid user is able to successfully login
    Given User is on home page
    When User clicks on Sign in link and redirects to Login page
    And Enters valid Username and Password
    Then User is successfully logged in

