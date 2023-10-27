Feature:Testimonials section

  Background:
    When User goes to "https://test.hypnotes.net"
    Then User should be able to see 'Real People, Real Feedback'

  Scenario:
    When User should see next button
    Then next button should be clickable
    And User clicks on next button
    Then assert testimonials has changed by next button


  Scenario:
    When User should see prev button
    Then prev button should be clickable
    And User clicks on prev button
    Then assert testimonials has changed by prev button

  Scenario Outline:
    When theraphyst SC accounts should be unique
    Examples:
      | tName           |
      | Merve Yalcin    |
      | Jane Nash       |
      | Emily Hylan     |
      | Amy Oviatt      |
      | Gene Pennington |

  Scenario Outline:
    When User should see the Hypnotherapist's name <tName>
    Examples:
      | tName           |
      | Merve Yalcin    |
      | Jane Nash       |
      | Emily Hylan     |
      | Amy Oviatt      |
      | Gene Pennington |










#    """
#    US_008_When I go to the home page as a user, I should be able to see the Testimonials section
#
#    Testimonials
#The feedback in the Real People, Real Feedback section should be read
#and the relevant person's Facebook, LinkedIn, etc. addresses should be displayed.
#The buttons in this section must be functional
#< > buttons must be present, clickable and give correct results
#    """