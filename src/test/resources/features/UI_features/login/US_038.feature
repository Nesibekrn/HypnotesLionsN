@UI
  Feature:US38_TC001
    Scenario: US38_TC001 Positive scenario for Login with LikendIn
      Given User goes to "https://test.hypnotes.net"
      When clicks the login button
      And clicks to Sign in with linkedIn
      When enters the e-mail address and password
      Then assert that the user is logged in


      Scenario Outline: US38_TC002 Negative scenario for Login with LikendIn
        Given User goes to "https://test.hypnotes.net"
        When clicks the login button
        And clicks to Sign in with linkedIn
        When enters a incorrect <"email"> and <"password">
        Then verify the error message
        Examples:
          | "email"        | "password" |
          | "kk@gmail.com" | "0000"     |

