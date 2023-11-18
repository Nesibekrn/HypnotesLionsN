Feature: Send a document

  Scenario: Send a new document

    Given the user navigates Hypnotes web page
    Then Login as a "Therapist"
    Then the user clicks on "Clients" title on Dashboard menu
    Then the user clicks on First Client
    Then the user confirms "Send a New Document" button and clicks
    Then the user click on "Return" button


