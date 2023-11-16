Feature:Login Api
  Scenario: As a user, I should be able to log in with API end point as a therapist
    Given the user sends a request to log in Hypnotess
    Then the user verifies that status code is 200
    And the user verifies authenticated is true
    And the user gets phpsessId