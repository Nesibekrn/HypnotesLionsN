Feature:Therapist needs to delete any coupons on coupons on the page

  Scenario: Verify user is able to get or delete all coupons info on therapist coupons Api section
    Given  therapist user is authenticated
    When user hits the get coupon end points
    Then user should be able to get coupons

















  #As a user, I should be able to get all coupons info  on therapist coupons Api section
  #Therapist - Dashboard - Coupons
  #
  #https://test.hypnotes.net/api/promoCode/deleteCoupon
  #Therapist  needs to delete any coupons on coupons page