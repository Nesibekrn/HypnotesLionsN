@UI  @TherapistLoginUSA
Feature: US_57 User performs various actions in the profile section.

  Scenario: TC_01
    Given User verify name button is enabled
    When User clicks name button
    Then User clicks profile button
    And User verify specialties button is enabled
    Then User clicks specialties button
    And User verify Add New Specialty buuton is enabled
    Then User clicks Add New Specialty button
    And User verify all specialities are clickable
    Then User clicks and save some specialities
    And User clicks X button
    Then User remove some specialities from the list
    And User verify if Specialities section is updated







