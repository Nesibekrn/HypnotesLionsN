@UI
Feature: User Interaction with Buttons

  Background:Home Page
    Given User Navigates to "https://test.hypnotes.net"

  Scenario: User interacts with various buttons
    When The user sees the button at the bottom of the page
    Then The user verifies that the  button is visible and clickable
      | Product Demo                                      | https://test.hypnotes.net/register                |
      | How Does Hypnotes Work?                           | https://test.hypnotes.net/how-it-works            |
      | Pricing                                           | https://test.hypnotes.net/pricing                 |
      | HIPAA Compliance                                  | https://test.hypnotes.net/features/hipaa-security |
      | Secure Login, Account Verification & Data Storage | https://test.hypnotes.net/features/hipaa-security |
      | Reviews/Testimonials                              | https://test.hypnotes.net/#reviewRow              |
      | Get Started For Free                              | https://test.hypnotes.net/register                |





