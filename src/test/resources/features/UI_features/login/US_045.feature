#AYSE ARI
  #After logging in as User (Therapist),
  # I should be able to see the Documents page	Documents should be clickable and relevant page should be visible
  #https://test.hypnotes.net/dashboard/documents
@UI @Therapist
Feature: After logging in as Therapist I should be able to see the Documents page
    Scenario:
      #When user moves to the Documents button with the mouse
      Then user clicks the Documents button
      Then user verifies the Documents page