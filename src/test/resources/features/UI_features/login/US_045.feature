#AYSE ARI
  #After logging in as User (Therapist),
  # I should be able to see the Documents page	Documents should be clickable and relevant page should be visible
  #https://test.hypnotes.net/dashboard/documents
@UI @Therapist @US_045
Feature: After logging in as Therapist I should be able to see the Documents page

  Background:
    Given  a Therapist User is logged in
    Scenario: US_045
      When user verifies the Documents button is clickable
      Then user clicks the Documents button
      Then user verifies the Documents page