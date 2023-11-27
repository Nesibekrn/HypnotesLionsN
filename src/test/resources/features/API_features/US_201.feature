Feature: Login As Client
  @ApiLoginAsClient
  Scenario: As a user, I should be able to log in with API end point as a client
    Given user sends a post request to login Hypnotes as client
    Then the user verifies that status code is 200
    Then the user verifies that authenticated is true
    Then the user verifies that type is client
    Then the user verifies that isVerified is true