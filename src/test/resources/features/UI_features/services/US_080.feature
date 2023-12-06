@UI @US_080
@ProfileGeneral



Feature: User (Therapist) should be able to see various headers on the Services page

  Background: User login to the homepage as Therapist
    Given a Therapist User is logged

  Scenario: User verifies clickability of various headers on Services Page
    When User clicks on the Services button
    Then Headers of Individual Sessions, Packages, Group Session should be visible
    And Individual Sessions should be seen as default page
    When User clicks on the Individual Sessions button
    Then New Individual Sessions and Generate Scheduler URL buttons should be visible
    And New Individual Sessions and Generate Scheduler URL buttons should be clickable
    And If there is a previously created service, it should be listed
    And Table and card buttons should be clickable
    When User clicks on the Packages button
    Then New Package and Generate Scheduler URL buttons should be visible
    And New Package and Generate Scheduler URL buttons should be clickable
    And If there is a previously created service, it should be listed
    And Table and card buttons should be clickable
    When User clicks on the Group Session button
    Then New Group Sessions and Generate Scheduler URL buttons should be visible
    And New Group Sessions and Generate Scheduler URL buttons should be clickable
    And If there is a previously created service, it should be listed
    And Table and card buttons should be clickable