Feature:  Delete any coupons on therapist coupons Api section
  Scenario: Verify Therapist user is able to delete any coupons on therapist coupons Api section
  Given therapist user logs in
    And user adds coupons
    And user hits the delete coupon end points
  Then user verifies if the coupon is deleted












#  Therapist - Dashboard - Coupons
#
#https://test.hypnotes.net/api/promoCode/deleteCoupon
#Therapist  needs to delete any coupons on coupons page

#  As a user, I should be able to delete any coupons on therapist coupons Api section