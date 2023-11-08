@UI @smoke
@US_014
Feature: Client Register Feature
  Scenario: Sign Up as a Client
    Given User enters the URL
    Then User should go homepage
    And Sign Up button should be clickable
    When the user clicks on Sign up for free  button
    Then I am a Client and Already have an account buttons should be visible
    And I am a Client button should be clickable
    When I am Client button is clicked
    Then the url of the page should be correct
    And Already have an account must be clickable
    When User clicks the Already have an account button
    Then Therapist login menu should appear

