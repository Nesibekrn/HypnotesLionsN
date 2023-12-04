package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import stepDefinitions.Hooks;
import utilities.API_utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.phpSessId;
import static utilities.API_utilities.response;

public class US_204_API {
    Response response;//1. adim
    Map<String,Object> payload=new HashMap<>();//2. adim

    String phpSessId;//3. adim

    String baseUrl = "https://test.hypnotes.net/api/notification/getAllNotification";

    List<Integer> id=new ArrayList<>();

    @Given("the user sends a request to get all meeting info on the Hypnotes calendar page")
    public void theUserSendsARequestToGetAllMeetingInfoOnTheHypnotesCalendarPage() {
    payload.put("username","threapistlions@yopmail.com");
     payload.put("password","Test123.");
        response=given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();

        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
        phpSessId=response.cookies().get("PHPSESSID");
        System.out.println("phpSessId = " + phpSessId);
        //API_utilities.login("threapistlions@yopmail.com","Test123");



    }

   /* @Then("user verifies that status code is {int}")
    public void userVerifiesThatStatusCodeIs(int statusCode) {
       Assert.assertEquals(statusCode,response.getStatusCode());
    }*/

    @And("the user verifies id of client")
    public void theUserVerifiesIdOfClient() {
        response=given()
                .contentType(ContentType.JSON)
                .header("content-type", "application/x-www-form-urlencoded")
                .header("cookie",  "PHPSESSID=" + phpSessId)
                .post("https://test.hypnotes.net/api/notification/getAllNotification");

        response.prettyPrint();
        id=response.jsonPath().getList("id");
        System.out.println("id = " + id);

    }
}
