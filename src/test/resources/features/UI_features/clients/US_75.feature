Feature: US 75_ client Information adding
  @UI
    @TherapistLoginUSA @US_75
  Scenario: Verify that the user is able to add client info to invoice field successfully
    Given the user clicks on client title on the left menu
    And the user clicks on the View Details button
    And the user clicks on the Invoices button
    Then user is able enter valid values on the below fields
      | Alex                  |
      | 444555666             |
      | 500 MAIN ST           |
      | Pittsburgh, Pa, 15108 |
    Then the user is able to select a country from country dropdown






