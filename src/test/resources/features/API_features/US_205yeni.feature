#Fatih

Feature:As a user, I should be able to add new client on therapist client Api section


  Scenario: add client

    Given user login with post request from API
    * user creates a new client
    * user verifies status and take clientId