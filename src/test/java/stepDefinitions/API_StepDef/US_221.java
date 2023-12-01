package stepDefinitions.API_StepDef;

import enums.Enum_Fy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.API_utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_221 {
    Response response;
    Map<String, Object> payload = new HashMap<>();
    String phpSessId;
    private int recurringBlockId;
    private List<Integer> recurringIds = new ArrayList<>();

    private int recurringBlockId;
    private List<Integer> recurringIds = new ArrayList<>();

    @Given("user take token from api")
    public void userTakeTokenFromApi() {
        payload.put("username", "test_trpst_basic@yopmail.com");
        payload.put("password", "Trpst13.");

        response = given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();
        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
        phpSessId = response.cookie("PHPSESSID");
        System.out.println("phpSessId = " + phpSessId);


    }

    @Then("user creates a Recurring Block Time from api")
    public void userCreatesARecurringBlockTimeFromApi() {
        payload.put("startAt", "09:50");
        payload.put("finishAt", "11:45");
        payload.put("isRecurring", true);
        payload.put("recurringDays[0]", "thursday");
        payload.put("title", "Online");

        response = given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff/create");

        response.prettyPrint();
        recurringBlockId =response.jsonPath().getInt("data[0].id");
        System.out.println("recurringBlockId = " + recurringBlockId);

    }

    @And("user verifies status is true")
    public void userVerifiesStatusIsTrue() {
        Assert.assertTrue(response.jsonPath().getBoolean("status"));

    }



    @Then("user gets all Recurring Block Times from api")
    public void userGetsAllRecurringBlockTimesFromApi() {
        response = given().header("cookie", "PHPSESSID=" + phpSessId)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff/all");
        response.prettyPrint();
        recurringIds = response.jsonPath().getList("data.id");
        System.out.println("recurringIds = " + recurringIds);
    }

    @And("user verifies created Block Time is exist in response")
    public void userVerifiesCreatedBlockTimeIsExistInResponse() {
        Assert.assertTrue(recurringIds.contains(recurringBlockId));
    }

}
