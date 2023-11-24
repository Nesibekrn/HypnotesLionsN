package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import utilities.API_utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_222 {
    Response response;

    Map<String,Object> payload = new HashMap<>();

    String phpSessId;

    private int recurringBlockId;

    private List<Integer> recurringId = new ArrayList<>();
    @Then("user creates a Recurring Block Time from api")
    public void userCreatesARecurringBlockTimeFromApi() {
        payload.put("startAt","15:30");
        payload.put("finishAt","16:30");
        payload.put("isRecurring",true);
        payload.put("recurringDays[0]","sunday");
        payload.put("title","online");

        response=given()
                .header("cookie","PHPSESSID" + phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff/create");
        response.prettyPrint();
        recurringBlockId=response.jsonPath().getInt("data[0].id");
        System.out.println("recurringBlockId = " + recurringBlockId);

    }

    @Then("user updates a Recurring Block Time from api")
    public void userUpdatesARecurringBlockTimeFromApi() {
    }

    @And("user verifies status is true")
    public void userVerifiesStatusIsTrue() {
    }

    @And("user verifies that response is as expected")
    public void userVerifiesThatResponseIsAsExpected() {
    }

    @Then("user deletes the recurring Block Time from api")
    public void userDeletesTheRecurringBlockTimeFromApi() {
    }
}
