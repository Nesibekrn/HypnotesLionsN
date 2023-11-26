@UI @Therapist @US_063
Feature: As a user (Therapist), I should be able to perform various actions in the Get Payment section

  Background:
    Given user clicks on Client button

  @UI @Therapist @US_063
  Scenario: US_063_TC_01
    Given the view details button should be clickable
    Then user verifies the payment button is clickable
    And user clicks on the Receive Payment button and sees payment options
    Then user can see category options
    Then user can use the payment sections