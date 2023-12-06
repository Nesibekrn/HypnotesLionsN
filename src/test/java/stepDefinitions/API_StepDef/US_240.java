package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import utilities.API_utilities;

import java.lang.reflect.Array;
import java.util.*;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static utilities.API_utilities.phpSessId;

public class US_240 {
    Response response;//1. adim
    Map<String,Object> payload=new HashMap<>();//2. adim
   // String PhpSessid;//3. adim
    private String promoCode= Faker.instance().name().name();
    private String startedAt = "Mon, 04 Dec 2023 17:02:48 GMT";
    private String enddedAt ="Wed, 06 Dec 2023 01:03:18 GMT";
    private int usersLimit = 10;
    private String discountType = "percentage";
    private int discountRate=5;
    private String category = "8030";

    private String description = "Wed, 06 Dec 2023 01:03:18 GMT";

    @Given("user login to hypnotes website")
    public void userLoginToHypnotesWebsite() {
        API_utilities.login("threapistlions@yopmail.com","Test123.");
    }


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


        response = given()//.contentType("application/json")
                .header("Cookie","PHPSESSID="+phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/promoCode/add");
        response.prettyPrint();




    }


}
