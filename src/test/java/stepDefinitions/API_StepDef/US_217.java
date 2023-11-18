package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;


public class US_217 {

    Response response;
    Integer idCreated,idSon;
    JsonPath jsonPath;


    @When("user sends POST request to get all blocked times")
    public void user_sends_post_request_to_get_all_blocked_times() {
        specFormData.pathParams("p1", "api", "p2", "hypnotherapist", "p3", "timeoff", "p4", "all");

        Map<String, Object> payloadCreate = new HashMap<>();
        payloadCreate.put("userId", "1107");
        payloadCreate.put("title", "online");

        response = given(specFormData).formParams(payloadCreate).post("{p1}/{p2}/{p3}/{p4}");
        jsonPath = response.jsonPath();
        response.prettyPrint();


    }
    @Then("user see {int} status code")
    public void user_see_status_code(int int1) {
      Assert.assertEquals(int1,response.getStatusCode());
    }


}
