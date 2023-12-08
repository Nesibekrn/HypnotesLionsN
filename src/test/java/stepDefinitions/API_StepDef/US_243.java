package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_243 {

    Response response1;

    Map<String,Object> payload= new HashMap<>();

    String cookie;

    JsonPath jsonPath;

    private int createdCouponId;
    static List<Integer> couponId = new ArrayList<>();


    @Given("therapist user logs in")
    public void therapistUserLogsIn() {

//        String baseUrl = "https://test.hypnotes.net/api/login";
//
//        payload.put("username", "hypnotes2022tr1@gmail.com");
//        payload.put("password", "Aydinlik123/");
//
//        response = given().contentType(ContentType.JSON).body(payload).post(baseUrl);
//        response.prettyPrint();
//        cookie = "PHPSESSID=" + response.cookies().get("PHPSESSID");
//        System.out.println(cookie);
//       jsonPath=response.jsonPath();
//       response.prettyPrint();

        payload.put("username", "hypnotes2022tr1@gmail.com");
        payload.put("password", "Aydinlik123/");

        response1 = given().body(payload).post("https://test.hypnotes.net/api/login");
        response1.prettyPrint();
        Assert.assertTrue(response1.jsonPath().getBoolean("authenticated"));
        cookie = response1.cookie("PHPSESSID");
        // System.out.println("phpSessId = " + phpSessId);
        System.out.println(cookie);
    }
    @And("user adds coupons")
    public void userAddsCoupons() {

        payload.put("promoCode", "hello6");
        payload.put("startedAt", "11 Dec 2023");
        payload.put("enddedAt", "12 Dec 2023");
        payload.put("usersLimit", 3);
        payload.put("discountType", "percentage");
        payload.put("discountRate",5 );
        payload.put("category", 8216);
        payload.put("description", "undefined");
        response1=given().header("cookie",  "PHPSESSID=" + cookie).formParams(payload).post("https://test.hypnotes.net/api/promoCode/add");
       response1.prettyPrint();
        createdCouponId=response1.jsonPath().getInt("promoCode.id");
        System.out.println("createdCouponId = " + createdCouponId);


    }

   @And("user hits the delete coupon end points")
   public void userHitsTheDeleteCouponEndPoints() {

       payload.put("id", createdCouponId);
       response1 = given().header("cookie", "PHPSESSID=" + cookie).formParams(payload).post("https://test.hypnotes.net/api/promoCode/deleteCoupon");

       jsonPath = response1.jsonPath();
       response1.prettyPrint();
   }

       @Then("user verifies if the coupon is deleted")
       public void userVerifiesIfTheCouponIsDeleted () {

           Assert.assertTrue(jsonPath.getBoolean("status"));

       }
   }