@API @US_207
Feature: Hypnotes-API api/dashboard/refer/send-invitation functionality
  Scenario: Verify that send invitation api is executed with valid payload, it returns 200 success code
    When user sends POST request to api/dashboard/refer/send-invitation
    Then user see 200 status code for api/dashboard/refer/send-invitation end point

  Scenario: Verify that status returned as false when the send invitation api is executed with invalid email address
    When user sends POST request to api/dashboard/refer/send-invitation with invalid payload
    Then status returned as false
