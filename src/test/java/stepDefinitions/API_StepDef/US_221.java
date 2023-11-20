package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;

public class US_221 {
    Response response;


    @When("the user sends post request to get all block times")
    public void theUserSendsPostRequestToGetAllBlockTimes() {
        specFormData.pathParams("first", "api", "second", "hypnotherapist", "third", "timeoff", "fourth", "all");
        Map<String, Object> payloadAll = new HashMap<>();
        payloadAll.put("title", "Online");
        response = given(specFormData).formParams(payloadAll).post("{first}/{second}/{third}/{fourth}");
        response.prettyPrint();
    }


    @Then("the user validates the response for all block times")
    public void theUserValidatesTheResponseForAllBlockTimes() {
        Assert.assertTrue(response.jsonPath().getBoolean("status"));
        Assert.assertTrue(response.headers().getValue("Content-Type").equals("application/json"));
    }

}
