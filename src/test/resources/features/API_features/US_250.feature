Feature: Location page

  Scenario: As a Therapist user I should be able to add a new location on settings - locations page
    Given therapist user logs in to page and gets authentication
    When when payload has been generated
    When therapist user hits the add a new location end point
    Then therapist user verify the new location is added













#Therapist - Home / Dashboard / Settings / Locations
#
#https://test.hypnotes.net/api/settings/location/add
#Therapist  needs to add new location on settings - locations page