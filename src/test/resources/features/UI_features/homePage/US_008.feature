@UI
Feature:Testimonials section


  @UI
  Scenario:
    When User goes to "https://test.hypnotes.net"
    Then User should be able to see 'Real People, Real Feedback'
    When User click on next button
    Then assert testimonials has changed



#    """
#    US_008_When I go to the home page as a user, I should be able to see the Testimonials section
#
#    Testimonials
#The feedback in the Real People, Real Feedback section should be read
#and the relevant person's Facebook, LinkedIn, etc. addresses should be displayed.
#The buttons in this section must be functional
#< > buttons must be present, clickable and give correct results
#    """