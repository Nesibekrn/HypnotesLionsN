#AYSE ARI
  #After logging in as User (Therapist),
  # I should be able to see the Documents page	Documents should be clickable and relevant page should be visible
  #https://test.hypnotes.net/dashboard/documents
@UI @Therapist
Feature: After logging in as Therapist I should be able to see the Documents page

  Scenario: US_045
    #And user clicks  yes button  on popup page
    Then user verifies the Documents button is clickable
    When user clicks on Documents button
    Then user sees the Documents page