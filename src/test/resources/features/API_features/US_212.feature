  @US212
Feature: US_212 As a user, I should be able to add block time with using API end point

  Scenario: Blocked date interval time create
    Given user take token from website
    Then user creates a date interval time from Api
    Then user verifies status is true
    Then user verifies that response is expected





