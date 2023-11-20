Feature: As a user, I should be able to make various controls in the Newsletter section at the bottom of the home page
  @UI
  Scenario: TC_01
    Given User goes to "https://test.hypnotes.net"
    When user scroll to bottom of the page
    And user enters valid email in the Newsletter section
    And users clicks on signUp button at the bottom of the home page
@UI
    Scenario: TC_02 checking social media icon
      Given User goes to "https://test.hypnotes.net"
      When user scroll to bottom of the page
      Then user verifies that social media icon visible and clickable
      And user verifies that each social media button leads to the company's official related social media page
