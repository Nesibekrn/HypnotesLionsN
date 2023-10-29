@UI
  Feature:US38_TC001
    Scenario: US38_TC001 Positive scenario for Login with LikendIn
      Given user goes to home page
      When clicks the login button
      And clicks to Sign in with linkedIn
      When enters the LinkedIn e-mail address and password
      Then assert for LinkedIn that the user is logged in


    Scenario: US38_TC002 Negative scenario for Login with LikendIn
      Given user goes to home page
      When clicks the login button
      And clicks to Sign in with linkedIn
      When enters a incorrect "hh@gmail.com" and "123456" for LinkedIn
      Then verify the error message for LinkedIn


      Scenario Outline: US38_TC003 Negative scenario for Login with LikendIn
        Given user goes to home page
        When clicks the login button
        And clicks to Sign in with linkedIn
        When enters a incorrect <"email"> and <"password"> for LinkedIn
        Then verify the error message for LinkedIn
        Examples:
          | "email"        | "password" |
          | "kk@gmail.com" | "123456"   |
          | "kk@gmail"     | "123456"   |
          | "@gmail.com"   | "123456"   |


