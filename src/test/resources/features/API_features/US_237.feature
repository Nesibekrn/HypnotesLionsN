@API_F @US237
Feature:As a user, I should be able to get all info  on therapist client Api section

  Scenario: User needs to be get all info on therapist client Api section
   # When user sends Post request to add new client
  #  Then user validates the response for add new client
    When user sends a request for getting all info therapist client
    Then user verifies success is true for get all info for  client
    Then user verifies that response is as expected for get all info therapist client
  #  When user sends Post request to updating added any client on therapist client Api section
   # When user sends Post request to delete client
  #  Then user verifies the response for delete client

  Scenario: User needs
    When user adds coupons
    Then user delete coupons
