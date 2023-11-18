Feature: US_212 As a user, I should be able to add block time with using API end point

  Scenario: TC_001
    Given the user login from api utilities
    Given user send postRequest to add block time at dateInterval
    Then  the user verify that status code is 200


