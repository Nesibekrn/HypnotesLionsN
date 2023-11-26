@US213
Feature: US_213 As a user, I should be able to get all block times with using API endpoints

  Scenario: User gets all block times under Date Interval section
    Given user creates token though API
    Then user gets all interval date block times
    And Verify that block times are exist in returned response


