package stepDefinitions.API_StepDef;

import enums.USER_INFO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.API_utilities;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static stepDefinitions.Hooks.response;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.phpSessId;

public class US_220 {
    int createdRecurringDateId;
    Map<String,Object> payload=new HashMap<>();


    @Given("user gets phpSessid for authentication")
    public void userGetsPhpSessidForAuthentication() {
        API_utilities.login(USER_INFO.THERAPIST_CREDENTIALS.getTherapist_email(),
                            USER_INFO.THERAPIST_CREDENTIALS.getTherapist_password());
    }


    @When("user sends a request to create recurring date and time")
    public void userSendsARequestToCreateRecurringDateAndTime() {

        payload.put("startAt","19:30");
        payload.put("finishAt","20:30");
        payload.put("isRecurring",true);
        payload.put("recurringDays[0]","Monday");
        payload.put("title","Online");


        response=given()
                       .header("Cookie","PHPSESSID="+phpSessId)
                       .formParams(payload)
                       .post("https://test.hypnotes.net/api/hypnotherapist/timeoff/create");
         response.prettyPrint();
         createdRecurringDateId=response.jsonPath().getInt("data[0].id");
    }

    @And("the user verifies response body is expected.")
    public void theUserVerifiesResponseBodyIsExpected() {
        assertTrue(response.path("status"));
        assertTrue(response.path("data[0].isRecurring"));
       // assertFalse(response.path("data[0].isAllDay"));
        int actualId=response.path("data[0].id");
        System.out.println("actualId = " + actualId);
        assertEquals(createdRecurringDateId,actualId);
        assertEquals(payload.get("startAt"),response.path("data[0].startAt"));
        assertEquals(payload.get("finishAt"),response.path("data[0].finishAt"));
        assertEquals(payload.get("recurringDays[0]"),response.path("data[0].recurringDays[0]"));
        assertEquals("Online",response.path("data[0].locationTitle"));



       // assertEquals(createdRecurringDateId,response.path("data[0].id"));

    }

    @And("user sends a request to delete the created recurring date and time")
    public void userSendsARequestToDeleteTheCreatedRecurringDateAndTime() {
        response=given()
                .header("Cookie","PHPSESSID="+phpSessId)
                .formParam("id",createdRecurringDateId)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff/delete");
        response.prettyPrint();
    }
}
