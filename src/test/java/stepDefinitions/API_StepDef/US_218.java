package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;
//import static utilities.API_utilities.phpSessId;
import static utilities.Authentication.phpSessid;

public class US_218 {
    Response response;
    int id;
    JsonPath jsonPath;

    @When("user sends Post request to update block times")
    public void userSendsPostRequestToUpdateBlockTimes() {
        //Set the URL
        //  specFormData.pathParams("first", "api", "second", "hypnotherapist", "third", "timeoff", "fourth", "create");
        //specFormData.pathParams("first", "api", "second", "hypnotherapist", "third", "timeoff", "fourth", "all");
        specFormData.pathParams("first", "api", "second", "hypnotherapist", "third", "timeoff", "fourth", "update");
        // Set the expected Data

        // response = given(specFormData).when().post("{first}/{second}/{third}/{fourth}");
        Map<String, Object> payloadUpdate = new HashMap<>();
        payloadUpdate.put("id", id);
        payloadUpdate.put("specificDate", "2023-11-19");
        payloadUpdate.put("isRecurring", false);
        payloadUpdate.put("startAt", "2023-11-19 17:30");
        payloadUpdate.put("finishAt", "2023-11-19 18:00");
        payloadUpdate.put("isAllDay", false);

        // response = given(specFormData).formParams(payloadCreate).post("{first}/{second}/{third}/{fourth}");
        // response = given(specFormData).formParams(payloadUpdate).post("{first}/{second}/{third}/{fourth}");
        //  response = given(specFormData).body(payloadUpdate).post("{first}/{second}/{third}/{fourth}");
        // response= given().formParams(payloadCreate).post("https://test.hypnotes.net/api/hypnotherapist/timeoff/create");
        response = given().header("Cookie", phpSessid).formParams(payloadUpdate).post("https://test.hypnotes.net/api/hypnotherapist/timeoff/update");
        response.prettyPrint();
        /*id = response.jsonPath().getInt("data[0].id");
        System.out.println("id = " + id);*/
    }

    @Then("user validates the response")
    public void userValidatesTheResponse() {
        Assert.assertTrue(response.jsonPath().getBoolean("status"));
    }

    @When("user sends Post request to add block times")
    public void userSendsPostRequestToAddBlockTimes() {
        Map<String, Object> payloadCreate = new HashMap<>();
        payloadCreate.put("specificDate", "2023-11-18");
        payloadCreate.put("startAt", "2023-11-18 12:00");
        payloadCreate.put("finishAt", "2023-11-18 12:30");
        payloadCreate.put("isRecurring", false);
        payloadCreate.put("isAllDay", false);
        payloadCreate.put("title", "Online");
        payloadCreate.put("isAll", false);

        response = given().header("Cookie", phpSessid).formParams(payloadCreate).post("https://test.hypnotes.net/api/hypnotherapist/timeoff/create");
        jsonPath = response.jsonPath();
        id = jsonPath.getInt("data[0].id");
        System.out.println("id = " + id);
        response.prettyPrint();
    }

    @When("user sends Post request to delete block times")
    public void userSendsPostRequestToDeleteBlockTimes() {
        Map<String, Object> payloadDelete = new HashMap<>();
        payloadDelete.put("id", id);
        response=given().header("Cookie",phpSessid).formParams(payloadDelete).post("https://test.hypnotes.net/api/hypnotherapist/timeoff/delete");
        response.prettyPrint();
    }

    @When("user sends Post request to all block times")
    public void userSendsPostRequestToAllBlockTimes() {
        Map<String, Object> payloadAll = new HashMap<>();
        payloadAll.put("title","Online");

        specFormData.pathParams("first", "api", "second", "hypnotherapist", "third", "timeoff", "fourth", "all");

        response=given(specFormData).when().post("{first}/{second}/{third}/{fourth}");
        response.prettyPrint();
    }
}
