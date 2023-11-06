Feature: As a user (therapist) I should be able to add new client

  Scenario: TC  01 -Emergency buttons must be active
    When The Emergency Contact Phone menu must be functional.
    Then The correct code should appear when you click on the country flags in the Emergency Contact Phone. Valid number must be added
    Then Emergency Contact Relationship should be added
    Then Primary Physician/Family Doctor Name must be added
    Then The Primary Physician/Family Doctor Phone menu must be functional.
    Then The correct code should appear when you click on the country flags in the Primary Physician/ Family Doctor Phone. Valid number must be added
    Then Primary Physician/ Family Doctor Email must be added
    Then Client should be added after entering other necessary data.
     And The added client should appear at the top of the "Clients" page in the left panel.