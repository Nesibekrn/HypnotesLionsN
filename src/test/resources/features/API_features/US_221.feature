 @US221
Feature:Recurring Date and Time get all blocks time
   Background:
      Given user take token from api

   Scenario: Recurring Day Block Time get
      Then user creates a Recurring Block Time from api
      And user verifies status is true
      Then user gets all Recurring Block Times from api
      And user verifies created Block Time is exist in response

