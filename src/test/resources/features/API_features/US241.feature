Feature:Therapist  needs to delete any coupons on coupons page

  Background: User is on the dashboard
  Given user login as therapist

  Scenario: Verify user is able to get or delete all coupons info on therapist coupons Api section
  When clicks on Coupons section
  Then user should be able to get all coupons info on therapist coupons
  And user should be able to delete any coupons on coupons page
















  #As a user, I should be able to get all coupons info  on therapist coupons Api section
  #Therapist - Dashboard - Coupons
  #
  #https://test.hypnotes.net/api/promoCode/deleteCoupon
  #Therapist  needs to delete any coupons on coupons page