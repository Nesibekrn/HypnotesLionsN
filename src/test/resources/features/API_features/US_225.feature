Feature:US_225 As a user, I should be able to get all individual sessions with using API endpoints on Services module

  Scenario: User gets an individual session from the services bar.
    Given user take token from website
    Then User get all individual session
    Then Verify that all individual sessions are exist in returned response
