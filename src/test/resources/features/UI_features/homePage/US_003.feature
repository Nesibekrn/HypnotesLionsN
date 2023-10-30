@UI
Feature: Social Media Icons on Home Page

  Background:
    Given User goes to "https://test.hypnotes.net"
    Then User navigates to the bottom of the page

  @UI @HL-3 @HL-80
  Scenario: Verify the visibility of social media icons
    Then User should see the Facebook icon
    And User see LinkedIn icon
    And User should see the instagram icon
    And User should see the Instagram icon

  @UI @HL-3 @HL-207
  Scenario: Verify the clickability of social media icon
    Then facebook icon should be clickable
    When User clicks facebook icon
    Then User should be taken to the company-related "https://www.facebook.com/hypnotesinc"

  @UI @HL-3 @HL-198
  Scenario: User should see and control social media icons
    Then twitter icon should be clickable
    When User clicks twitter icon
    Then User should be taken to the company-related "https://twitter.com/HypnotesInc"

  @UI @HL-3 @HL-197
  Scenario: User should see and control social media icons
    Then linkedin icon should be clickable
    When User clicks linkedin icon
    Then User should be taken to the company-related "https://www.linkedin.com/company/hypnotes/"

  @UI @HL-3 @HL-208
  Scenario: User should see and control social media icons
    Then instagram icon should be clickable
    When User clicks instagram icon
    Then User should be taken to the company-related "https://www.instagram.com/hypnotesinc/"