Feature: Therapist Login Functionality

  @UI
  @Therapist
  @US_048
  Scenario: User must log in as therapist and see Email-sms side bar
    Then user should see Email-sms side bar on the therapist page
    And user verifies Email-sms link is clickable on the page
    When user clicks on Email-sms links
    Then user should be able navigate relavent page