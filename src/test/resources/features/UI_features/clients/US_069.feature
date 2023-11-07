@UI
@Therapist
Feature: As a user(therapist), I should be able to see the various headings when I click Sessions button
Background:

@UI
  @Therapist
  Scenario: Viewing Sessions
   Given the user clicks on Client Log in
    When the user clicks on the "View Details" button
    Then "Sessions" button should be visible
    When the user clicks on the "Sessions" button
    Then the "Add new Sessions" button should be visible
    And the user clicks the "Add new session" button
    Then the following headings should be visible:
      | Headings                            |
      | Date                                |
      | Associated Problems                 |
      | Key Points                          |
      | After Thoughts                      |
      | Hypnotic techniques and suggestions |
      | Attachments                         |
      | Voice Notes                         |



