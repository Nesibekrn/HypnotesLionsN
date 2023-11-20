@API @US221
Feature:Recurring Date and Time get all blocks time

   Scenario: User needs to get all block times into post response through API
      When the user sends post request to get all block times
      Then the user validates the response for all block times