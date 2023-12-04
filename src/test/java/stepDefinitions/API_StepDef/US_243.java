package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_243 {

    Response response;

    Map<String,Object> payload= new HashMap<>();

    String cookie;

    JsonPath jsonPath;

    private int couponId;
    @Given("therapist user logs in")
    public void therapistUserLogsIn() {

        String baseUrl = "https://test.hypnotes.net/api/login";

        payload.put("username", "hypnotes2022tr1@gmail.com");
        payload.put("password", "Aydinlik123/");

        response = given().contentType(ContentType.JSON).body(payload).post(baseUrl);
        response.prettyPrint();
        cookie = "PHPSESSID=" + response.cookies().get("PHPSESSID");
        System.out.println(cookie);
       jsonPath=response.jsonPath();
       response.prettyPrint();

    }

    @And("user hits the delete coupon end points")
    public void userHitsTheDeleteCouponEndPoints() {
        couponId = jsonPath.getInt("category.id");

        payload.put("id",couponId);
        response = given().body(couponId).formParams(payload).post("https://test.hypnotes.net/api/promoCode/deleteCoupon");

        jsonPath=response.jsonPath();
    }

    @Then("user verifies if the coupon is deleted")
    public void userVerifiesIfTheCouponIsDeleted() {

        Assert.assertTrue(jsonPath.getBoolean("status"));
    }

}
