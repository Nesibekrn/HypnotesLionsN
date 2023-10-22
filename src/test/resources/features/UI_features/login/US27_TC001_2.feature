@UI
Feature:US27
  Scenario: US27_TC001 Positive scenario for Login with Apple account
    Given user goes to home page
    When  clicks the login button
    And clicks to Sign in with apple
    When enters the e-mail address and password
    Then assert that the user is logged in



  Scenario Outline: US27_TC002 Negative scenario for Login with Apple account
    Given user goes to home page
    When  clicks the login button
    And clicks to Sign in with apple
    When enters a incorrect <"email"> and <"password">
    Then verify the error message
    Examples:
      | "email" | "password" |
      | "email" | "password" |

