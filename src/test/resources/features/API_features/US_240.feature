#As a user, I should be able to add new coupon on therapist coupon Api section
#Therapist - Dashboard - Coupons
#https://test.hypnotes.net/api/promoCode/add
#Therapist  needs to add new coupon on coupon page
  Feature: US_240
    Scenario: Adding new coupon on therapist coupon section
      Given user login to hypnotes website
      When user makes a post request to add new coupon on therapist coupon
