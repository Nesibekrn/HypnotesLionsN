
Feature: US224 - US225 - US226 - US227

  Background:
    Given User logins as a therapist for individual sessions and takes token from api
    And User creates a category type to be able to add an individual session


  Scenario: User adds updates and deletes individual sessions under Services Page with API endpoints
    When User adds a new individual session under Services Page
    Then User verifies if the individual session is added under Services Page
    When User updates the individual session under Services Page
    Then User verifies if individual session is updated under Services Page
    When User deletes the individual session under Services Page
    Then User verifies if the individual session is deleted under Services Page


    Then User deletes the category type created
