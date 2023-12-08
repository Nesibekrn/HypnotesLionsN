Feature:

  As a therapist,
  when i should sign up then Should be able to see new user information
  in the correct user schema and columns

  Background: User connects to the database
    Given User connects to the database

  Scenario: TC_001
    When User signs up to the site as a therapist
    Then User verifies the new user information exists in the user table
    And User verifies that its role is therapist in the user table