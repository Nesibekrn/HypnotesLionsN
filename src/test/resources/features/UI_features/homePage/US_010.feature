Feature: Features section functionality in footer by the homepage
  Background:
    Given User goes to "https://test.hypnotes.net"
    And the user navigates to the footer section

  @US_010
  @UI
  Scenario: Verify that Features titles are displayed when the user is on footer section
    Then user is able to view each <titles>
      | Calendar                                  |
      | Services                                  |
      | eSign and Document Storage                |
      | Notification&Reminders                    |
      | Multiple Payment Service Options          |
      | Billing and Invoicing                     |
      | Free Secure Telehealth Video Conferencing |
      | Customize Your Scheduler & URL            |
      | Custom Forms & Document                   |
      | Multiple Locations                        |
      | Multiple Providers                        |
      | Dashboard & Reporting                     |
      | Client Portal                             |
      | Biofeedback/Emotion-Detection             |
      | Handwriting to Text Conversion            |
      | 3rd Party Integration                     |
      | Industry Required Client Notes            |
  @US_010
  @UI
  Scenario: Verify that Calendar page  in the feature section is opened when the user clicks on the Calendar  in the footer section
    When the user clicks on the  Calendar title
    Then Calendar page is opened

  @US_010  @UI
  Scenario: Verify that  Services page  in the feature section is opened when the user clicks on the Services  in the footer section
    When the user clicks on the  Services title
    Then Services page is opened
  @US_010  @UI
  Scenario: Verify that  eSign and Document Storage page  in the feature section is opened when the user clicks on the eSign and Document Storage  in the footer section
    When the user clicks on the  eSign and Document Storage title
    Then eSign and Document Storage page is opened
  @US_010  @UI
  Scenario: Verify that  Notifications & Reminders page  in the feature section is opened when the user clicks on the Notifications & Reminders  in the footer section
    When the user clicks on the  Notifications & Reminders title
    Then Notifications & Reminders page is opened
  @US_010  @UI
  Scenario: Verify that  Multiple Payment Service Options page  in the feature section is opened when the user clicks on the Multiple Payment Service Options  in the footer section
    When the user clicks on the  Multiple Payment Service Options title
    Then Multiple Payment Service Options page is opened

  Scenario: Verify that  Billing and Invoicing page  in the feature section is opened when the user clicks on the Billing and Invoicing  in the footer section
    When the user clicks on the  Billing and Invoicing title
    Then Billing and Invoicing page is opened

  Scenario: Verify that  Free Secure Telehealth Video Conferencing page  in the feature section is opened when the user clicks on the Free Secure Telehealth Video Conferencing  in the footer section
    When the user clicks on the  Free Secure Telehealth Video Conferencing title
    Then Free Secure Telehealth Video Conferencing page is opened


  Scenario: Verify that  Customize Your Scheduler & URL page  in the feature section is opened when the user clicks on the Customize Your Scheduler & URL in the footer section
    When the user clicks on the  Customize Your Scheduler & URL title
    Then Customize Your Scheduler & URL page is opened

  Scenario: Verify that  Custom Forms & Documents page  in the feature section is opened when the user clicks on the Custom Forms & Documents in the footer section
    When the user clicks on the  Custom Forms & Documents title
    Then Custom Forms & Documents page is opened

  Scenario: Verify that  Multiple Locations page  in the feature section is opened when the user clicks on the Multiple Locations in the footer section
    When the user clicks on the  Multiple Locations title
    Then Multiple Locations page is opened

  Scenario: Verify that  Multiple Providers page  in the feature section is opened when the user clicks on the Multiple Providers in the footer section
    When the user clicks on the  Multiple Providers title
    Then Multiple Providers page is opened

  Scenario: Verify that  Dashboard & Reporting page  in the feature section is opened when the user clicks on the Dashboard & Reporting in the footer section
    When the user clicks on the  Dashboard & Reporting title
    Then Dashboard & Reporting page is opened

  Scenario: Verify that  Client Portal page  in the feature section is opened when the user clicks on the Client Portal in the footer section
    When the user clicks on the  Client Portal title
    Then Client Portal page is opened

  Scenario: Verify that  Biofeedback/Emotion-Detection page  in the feature section is opened when the user clicks on the Biofeedback/Emotion-Detection in the footer section
    When the user clicks on the  Biofeedback/Emotion-Detection title
    Then Biofeedback/Emotion-Detection page is opened

  Scenario: Verify that  Handwriting to Text Conversion page  in the feature section is opened when the user clicks on the Handwriting to Text Conversion in the footer section
    When the user clicks on the  Handwriting to Text Conversion title
    Then Handwriting to Text Conversion page is opened

  Scenario: Verify that 3rd Party Integration page  in the feature section is opened when the user clicks on the 3rd Party Integration in the footer section
    When the user clicks on the  3rd Party Integration title
    Then 3rd Party Integration page is opened

  Scenario: Verify that Industry Required Client Notes page  in the feature section is opened when the user clicks on the Industry Required Client Notes in the footer section
    When the user clicks on the  Industry Required Client Notes title
    Then Industry Required Client Notes page is opened