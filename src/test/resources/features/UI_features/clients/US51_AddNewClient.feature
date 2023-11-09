@Therapist
@UI
Feature: As a user (therapist) I should be able to add new client
Background:
  Then The user clicks on the client button.
  Then The user clicks on the add new client button.
  Then The user enters data into the FirstName, LastName, Email

  @UI
  @Therapist
  Scenario: TC  01 -Emergency buttons must be active
    Then The user enters data into the Gender, Phone, Occupation, Zip code, Country, State, City, address.
      | Phone      | 3354666561                    |
      | Occupation | QA                     |
      | Zip code   | 13013                  |
      | Country    | France                 |
      | State      | Bouche Du Rhone        |
      | City       | Marseille              |
      | address    | Marseille Batiment c32 |

  @UI
  @Therapist
  Scenario: TC  02 -User clicks the Show Extra Fields button and fills in the opened fields
    When User clicks the Show Extra Fields field
    Then User enters a phone number in the Emergency Contact Phone field
    Then User enters data in the Emergency Contact Relationship field
    Then User enters email in the Primary Physician Family Doctor Name field
    Then User enters data in the Guardian Name field
    Then User enters phone number in the Guardian Phone field
    Then User enters email address in the Guardian Email field
    Then User clicks the save button
    Then The user should be able to see the customer he added