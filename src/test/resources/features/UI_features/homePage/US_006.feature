@UI @us06_UI
Feature: US_006

  Background:Connect_homepage
    Given user goes to home page
  Scenario: TC_01_first and second header check

    Then  assert first header color should be white
    And assert first header background color is green
    And assert "Robust Appointment Scheduling" title is visible
    And assert image1 is visible
    When user scroll to second header
    Then  assert first header color should be black
    And assert first header background color should be grey
    Then assert  second header color should be white
    And assert second header background color is green
    And assert "Billing,Invoicing and Payment" title_two is visible
    And assert image2 is visible

  Scenario: TC_02_ headers and images check
    When user scroll to 3. header
    Then assert  3. header color should be white
    And assert 3. header background color is green
    And assert "Included secure video conferencing" title_3 is visible
    And assert image3 is visible

    When user scroll to 4. header
    Then assert  4. header color should be white
    And assert 4. header background color is green
    And assert "Client/Patient Portal" title_4 is visible
    And assert image4 is visible

    When user scroll to 5. header
    Then assert  5. header color should be white
    And assert 5. header background color is green
    And assert "Hypnotes for team" title_5 is visible
    And assert image5 is visible

    When user scroll to 6. header
    Then assert  6. header color should be white
    And assert 6. header background color is green
    And assert "Automation Your Way" title_6 is visible
    And assert image6 is visible

    When user scroll to 7. header
    Then assert  7. header color should be white
    And assert 7. header background color is green
    And assert "Handwriting to Text Conversion" title_7 is visible
    And assert image7 is visible

    When user scroll to 8. header
    Then assert  8. header color should be white
    And assert 8. header background color is green
    And assert "Biofeedback-Emotion Recognition" title_8 is visible
    And assert image8 is visible
@3
    Scenario: TC_03_All buttons in the Automate Your Workflow, Improve Your Life section should be clickable
      Then assert headers are clickable













