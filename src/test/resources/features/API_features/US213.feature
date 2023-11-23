@US212
Feature: US_212 As a user, I should be able to add block time with using API end point
  Background:
    Given user take token from api

  Scenario: Blocked date interval time create
    Then user creates a date interval time from Api
    Then user verifies status is True
   Then user verifies that response is expected

  Scenario: Blocked date interval time get

    Then user gets all interval date block times from api
    And user verifies created interval date block is exist in response


