@UI
  Feature: After logging in as User (Therapist), I should be able to see the Services page

    @Therapist @US_43
      Scenario: US_43
        Then user verifies the Services button is clickable
        When user clicks on Services button
        Then user sees the Services page