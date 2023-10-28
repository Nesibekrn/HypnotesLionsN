@UI
Feature:US_009 When I enter the home page as a user
Background:Home Page
   Given User Navigates to "https://test.hypnotes.net/"
  Scenario: TC-01 I should be able to see various titles and perform various controls."Our Platform
    When The user sees our platform section at the button of the page
    When The user verifies that the product demo button is visible and clickable,the user sees the relevant page.
    Then The user verifies that the How Does Hypnotes Work button is visible and clickable,the user sees the relevant page
    Then The user verifies that the Pricing button is visible and clickable,the user sees the relevant page.
    Then The user verifies that the HIPAA Compliance button is visible and clickable,the user sees the relevant page.
    Then The user verifies that the Secure Login, Account Verification & Data Storage button is visible and clickable, the user sees the relevant page.
    Then The user verifies that the Reviews Testimonials button is visible and clickable,the user sees the relevant page.
    Then The user verifies that the Get Started For Free button is visible and clickable,the user sees the relevant page.


