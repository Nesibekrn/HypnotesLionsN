
Feature:US_009 When I enter the home page as a user

  Scenario: TC-01 I should be able to see various titles and perform various controls."Our Platform
  Footer sections of the site must be viewable.
    Given User goes to home page
    When The user sees our platform section at the bottom of the page
    Then The user verifies that the product demo button is visible and clickable
    Then The user verifies that the How Does Hypnotes Work? button is visible and clickable
    Then The user verifies that the Pricing button is visible and clickable
    Then The user verifies that the HIPAA Compliance button is visible and clickable
    Then The user verifies that the Secure Login, Account Verification & Data Storage button is visible and clickable
    Then The user verifies that the Reviews Testimonials button is visible and clickable
    Then The user verifies that the Get Started For Free button is visible and clickable

  Scenario:TC-02 the relevant pages should be displayed
    And The user clicks on the product demo button, the user sees the relevant page.
    And The user clicks on the product How Does Hypnotes Work?, the user sees the relevant page.
    And The user clicks on the product Pricing, the user sees the relevant page.
    And The user clicks on the product HIPAA Compliance, the user sees the relevant page.
    And The user clicks on the product Secure Login, Account Verification & Data Storage, the user sees the relevant page.
    And The user clicks on the Reviews Testimonials, the user sees the relevant page
    And The user clicks on the Get Started For Free, the user sees the relevant page.
