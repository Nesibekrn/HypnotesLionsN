@UI @us02_UI
Feature: week2
  Scenario: US 002
    Given User goes to "https://test.hypnotes.net"
    Then  assert Features, Pricing, Resources  ,Contact Us ,Language,Login, Sign Up for Free headings should be visible
    And assert Features, Pricing, Resources  ,Contact Us ,Language, Login, Sign Up for Free headings should be clickable