package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.CommonPage;

import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;

public class US_207 extends CommonPage {
Response response;
JsonPath jsonPath;
    @When("user sends POST request to api\\/dashboard\\/refer\\/send-invitation")
    public void user_sends_post_request_to_api_dashboard_refer_send_invitation() {
        specFormData.pathParams("p1", "api", "p2", "dashboard", "p3", "refer", "p4", "send-invitation");

        Map<String, Object> payloadCreate = new HashMap<>();
        payloadCreate.put("referUrl", "https://test.hypnotes.net/register?referCode=21de8231-01a3-48d6-b3d4-788f1ca5e33d");
        payloadCreate.put("email", "test@yopmail.com");

        response = given(specFormData).formParams(payloadCreate).post("{p1}/{p2}/{p3}/{p4}");
        response.prettyPrint();
        jsonPath = response.jsonPath();
    }
    @Then("user see {int} status code for api\\/dashboard\\/refer\\/send-invitation end point")
    public void user_see_status_code_for_api_dashboard_refer_send_invitation_end_point(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());
        Assert.assertTrue(jsonPath.getBoolean("status"));

    }

    @When("user sends POST request to api\\/dashboard\\/refer\\/send-invitation with invalid payload")
    public void user_sends_post_request_to_api_dashboard_refer_send_invitation_with_invalid_payload() {
        specFormData.pathParams("p1", "api", "p2", "dashboard", "p3", "refer", "p4", "send-invitation");

        Map<String, Object> payloadCreate = new HashMap<>();
        payloadCreate.put("referUrl", "https://test.hypnotes.net/register?referCode=21de8231-01a3-48d6-b3d4-788f1ca5e33d");
        payloadCreate.put("email", "deneme.com");

        response = given(specFormData).formParams(payloadCreate).post("{p1}/{p2}/{p3}/{p4}");
        response.prettyPrint();
        jsonPath = response.jsonPath();
    }
    @Then("status returned as false")
    public void status_returned_as_false() {
        Assert.assertEquals(false,jsonPath.getBoolean("status"));
    }


}
