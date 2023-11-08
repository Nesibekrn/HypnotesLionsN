
@UI
  @US_069
Feature: Feature: As a user(therapist), I should be able to see the various headings when I click Sessions button


Background:
Given user goes to home page
Then clicks the login button
Then the user enters a valid email address "hypnotes2022tr1@gmail.com"
Then the user enters a valid password "Aydinlik2023/"
And clicks the login
Then user verifies the Client button is clickable
When user clicks on Client button
Then user sees the Client page


  Scenario: .
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

