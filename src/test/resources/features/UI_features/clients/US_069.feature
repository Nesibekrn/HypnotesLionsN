Feature: As a user(therapist), I should be able to see the various headings when I click Sessions button

  Background:
    And the user clicks on Client Log in
    And th

Scenario: Creating a New Session
Given the user is on the Sessions page
When the user clicks the "Add new session" button
Then the button should be clickable

Scenario: Session Creation
Given the user wants to create a new session
When the user clicks on the "Add new session" button
Then a new session should be created

Scenario: New Session Page Elements
Given the user is creating a new session
When the user navigates to the "Add new session" page
Then the headings for "Date", "Associated Problems", "Key Points", "After Thoughts", "Hypnotic techniques and suggestions", "Attachments", and "Voice Notes" should be visible