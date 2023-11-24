@API @US202
  Feature: US_202 get details of report
    Scenario:As a user, I should be able to get details of report
      Given user should be able access as therapist
      When user send get request for all report
      Then user assert body


