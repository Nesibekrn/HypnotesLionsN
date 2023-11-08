@UI @US_074
  @TherapistLoginUSA
Feature: Adding Therapist Information to Invoice

  Background:
    Given a Therapist User is logged
    And the user is on the Clients page
    When the user clicks on the View Details button
    And the user clicks on the Invoices button

  @UI @US_074
  @TherapistLoginUSA
  Scenario: Adding Therapist Information to Invoice
    Then a valid logo is uploaded to the Your Logo field
    And a valid company name is entered in the Your Company field
    And a valid name is entered in the Your Name field
    And a valid address is entered in the Company's Address field
    And valid information related to city, state, and zip code is entered in the City, State, Zip field
    And the user selects a country from the Country drop-down menu