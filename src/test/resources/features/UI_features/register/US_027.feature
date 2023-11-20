@UI @US27
Feature:US27
  Scenario: US27_TC001 Positive scenario for Login with Apple account
    Given User goes to "https://test.hypnotes.net"
    When  clicks the login button
    And clicks to Sign in with apple
    When enters the e-mail address and password
    Then assert that the user is logged in

    @US27_TC2
  Scenario Outline: US27_TC002 Negative scenario for Login with Apple account
    Given User goes to "https://test.hypnotes.net"
    When  clicks the login button
    And clicks to Sign in with apple
    When enters a incorrect <"email"> and <"password">
    Then verify the error message
    Examples:
      | "email"        | "password" |
      | "kk@gmail.com" | "123456"   |
      | "kk@gmail.com" | ".?!??,,"  |
      | "@gmail.com"   | "1"        |

      @US27_TC3
  Scenario: US27_TC003 Negative scenario for Login with Apple account
      Given User goes to "https://test.hypnotes.net"
      When  clicks the login button
      And clicks to Sign in with apple
      When enters a incorrect "kk" and "123456"
      Then verify the error message

