@UI @us02_UI
Feature: week2
  Scenario: US 002
    Given user goes to home page
    Then  assert Features, Pricing, Resources  ,Contact Us ,Language,Login, Sign Up for Free headings should be visible
    And assert Features, Pricing, Resources  ,Contact Us ,Language, Login, Sign Up for Free headings should be clickable