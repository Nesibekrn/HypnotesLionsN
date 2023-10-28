@UI
Feature:Testimonials section
  @US8_TC
  Background:
    When User goes to "https://test.hypnotes.net"
    Then User should be able to see 'Real People, Real Feedback'
  @UI @US8_TC1
  Scenario:
    When User should see next button
    Then next button should be clickable
    And User clicks on next button
    Then assert testimonials has changed by next button

  @UI @US8_TC2
  Scenario:
    When User should see prev button
    Then prev button should be clickable
    And User clicks on prev button
    Then assert testimonials has changed by prev button

  @UI @US8_TC3
  Scenario Outline: Verify Hypnotherapist's Names:<tName>
    When User should see the Hypnotherapist's "<tName>" <slide>
    Examples:
      | tName           |slide|
      | Merve Yalcin    |0    |
      | Jane Nash       |1    |
      | Emily Hylan     |2    |
      | Amy Oviatt      |3    |
      | Gene Pennington |4    |

  @UI @US8_TC4
  Scenario Outline:Verify Hypnotherapist's SC accounts should include:<tName>
    When theraphyst SC accounts should be unique with "<tName>" <slide>
    Examples:
      | tName           |slide|
      | Merve Yalcin    |0    |
      | Jane Nash       |1    |
      | Emily Hylan     |2    |
      | Amy Oviatt      |3    |
      | Gene Pennington |4    |











#    """
#    US_008_When I go to the home page as a user, I should be able to see the Testimonials section
#
#    Testimonials
#The feedback in the Real People, Real Feedback section should be read
#and the relevant person's Facebook, LinkedIn, etc. addresses should be displayed.
#The buttons in this section must be functional
#< > buttons must be present, clickable and give correct results
#    """