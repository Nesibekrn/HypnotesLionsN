package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;

public class US_218 {
    Response response;
    int id;
    JsonPath jsonPath;

    @When("user sends Post request to update block times")
    public void userSendsPostRequestToUpdateBlockTimes() {
        //Set the URL
        //  specFormData.pathParams("first", "api", "second", "hypnotherapist", "third", "timeoff", "fourth", "create");
        // Set the expected Data
        boolean status = true;

        Map<String, Object> payloadCreate = new HashMap<>();
        payloadCreate.put("specificDate", "2023-11-17");
        payloadCreate.put("startAt", "2023-11-17 12:00");
        payloadCreate.put("finishAt", "2023-11-17 13:00");
        payloadCreate.put("isRecurring", false);
        payloadCreate.put("isAllDay", false);
        payloadCreate.put("title", "Online");
        payloadCreate.put("isAll", false);

        response = given(specFormData).formParams(payloadCreate).post("{first}/{second}/{third}/{fourth}");
        //response= given().contentType(ContentType.JSON).body("https://test.hypnotes.net/api/hypnotherapist/timeoff/create");
        response.prettyPrint();

        jsonPath = response.jsonPath();
        id = jsonPath.get("data[0].id");
    }

    @Then("user validates the response")
    public void userValidatesTheResponse() {
    }
}
