@UI
Feature:Testimonials section


  Background:
    When User goes to "https://test.hypnotes.net"
    Then User should be able to see 'Real People, Real Feedback'

  @UI @HL-225 @HL-8
  Scenario: Verify the Next button is functioning
    When User should see next button
    Then next button should be clickable
    And User clicks on next button
    Then assert testimonials has changed by next button

  @UI  @HL-226 @HL-8
  Scenario: Verify the Prev button is functioning
    When User should see prev button
    Then prev button should be clickable
    And User clicks on prev button
    Then assert testimonials has changed by prev button

  @UI  @HL-228 @HL-8
  Scenario Outline: Verify Hypnotherapist's Names:<tName>
    When User should see the Hypnotherapist's "<tName>" <slide>
    Examples:
      | tName           | slide |
      | Merve Yalcin    | 0     |
      | Jane Nash       | 1     |
      | Emily Hylan     | 2     |
      | Amy Oviatt      | 3     |
      | Gene Pennington | 4     |

  @UI  @HL-229 @HL-8
  Scenario Outline:Verify Hypnotherapist's SC accounts should include:<tName>
    When theraphyst SC accounts should be unique with "<tName>" <slide>
    Examples:
      | tName           | slide |
      | Merve Yalcin    | 0     |
      | Jane Nash       | 1     |
      | Emily Hylan     | 2     |
      | Amy Oviatt      | 3     |
      | Gene Pennington | 4     |





