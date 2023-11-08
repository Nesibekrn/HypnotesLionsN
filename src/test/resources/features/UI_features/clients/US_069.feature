@UI
@Therapist
Feature: As a user(therapist), I should be able to see Sessions button

@US_069

  Scenario: US_069
  Given user clicks on Client button
    When the user clicks on the View Details button
    When the user clicks on the Sessions button
    Then the Add new Sessions button should be visible
    And the user clicks the Add new session button
   Then the following headings should be visible:
      | Headings                            |
     | Date                                |
      | Associated Problems                 |
      | Key Points                          |
     | After Thoughts                      |
      | Hypnotic techniques and suggestions |
     | Attachments                         |
     | Voice Notes                         |



