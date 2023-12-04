package stepDefinitions.API_StepDef;

import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.lang.reflect.Array;
import java.util.*;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class US_240 {
    Response response;//1. adim
    Map<String,Object> payload=new HashMap<>();//2. adim
    String PhpSessid;//3. adim
    private String promoCode="hypnotes";
    private String startedAt = "Mon, 04 Dec 2023 17:02:48 GMT";
    private String enddedAt ="Wed, 06 Dec 2023 01:03:18 GMT";
    private int usersLimit = 10;
    private String discountType = "percentage";
    private int discountRate=5;
    private String category = "8030";

    private String description = "Wed, 06 Dec 2023 01:03:18 GMT";

    @When("user makes a post request to add new coupon on therapist coupon")
    public void userMakesAPostRequestToAddNewCouponOnTherapistCoupon() {
        payload.put("promoCode",promoCode);
        payload.put("startedAt",startedAt);
        payload.put("enddedAt",enddedAt);
        payload.put("usersLimit",usersLimit);
        payload.put("discountType",discountType);
        payload.put("discountRate",discountRate);
        payload.put("category",category);
        payload.put("description",description);


        response = given().contentType("application/json")
                .header("Cookie","PHPSESSID="+PhpSessid)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/promoCode/add");
        response.prettyPrint();




    }
}
