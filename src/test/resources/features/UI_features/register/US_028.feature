Feature: Register functionality with LinkedIn account
  @US_028
  @UI
  Scenario: Verify that user is able to register with an Linkedn account
    Given the user navigates Hypnotes web page
    And the user clicks on Sign up for free button
    And the user clicks on the Sign with LinkedIn button
    And the user enter an email address and LinkedIn user password
    When the user clicks on "Oturum Acin" button
    Then  User should be able to see "Hızlıca bir güvenlik kontrolü yapalım" message