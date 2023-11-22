Feature: As a user I should be able to add some information to the Invoice field

  @UI @TherapistLoginUSA
  Scenario: User can add some information last part of Invoice field
    Given the user clicks on client title on the left menu
    When user clicks clients name
    And the user clicks on the Invoices button
    Then user verifies item description,Qty,Rate field is functional
    And user verifies Amount,Sub Total Sale Tax and Total field is functional and giving correct result
    When user clicks Add Line Item
    Then user verifies that a new item description field is created
    And user verifies that Notes area The Terms & Conditions field is functional and writable
