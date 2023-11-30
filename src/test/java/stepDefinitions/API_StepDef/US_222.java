package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_222 {
    Response response;//1. adim

    Response response1;
    Map<String,Object> payload=new HashMap<>();//2. adim

    String phpSessId;//3. adim

    String timeoffEntryId = "your_timeoff_entry_id_here";
    @Given("thes user updates block time")
    public void thesUserUpdatesBlockTime() {
        //login
        payload.put("username","threapistlions@yopmail.com");
        payload.put("password","Test123.");
        response=given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();

        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
        phpSessId=response.cookies().get("PHPSESSID");
        System.out.println("phpSessId = " + phpSessId);

        //create
        payload.put("startAt", "11:00");
        payload.put("finishAt", "13:00");
        payload.put("isRecurring", true);
        payload.put("recurringDays[0]", "tuesday");
        payload.put("title", "Online");

        response = given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff/create");

        response.prettyPrint();

        //update


    }

    @When("user gets results")
    public void userGetsResults() {
        String updatePayload = "{"
                + "\"startAt\": \"09:40\","
                + "\"finishAt\": \"10:40\","
                + "\"isRecurring\": false,"
                + "\"recurringDays\": [\"monday\"],"
                + "\"title\": \"Home\""
                + "}";

       response1= given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .contentType(ContentType.JSON)
                .body(updatePayload)
                .when()
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff/update");

       response1.prettyPrint();

    }
}
