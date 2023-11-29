package stepDefinitions.API_StepDef;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;

public class US_237 {
    Response response;
    JsonPath jsonPath;
    @When("user sends Post request to add new client")
    public void user_sends_post_request_to_add_new_client() {

    }
    @Then("user validates the response for add new client")
    public void user_validates_the_response_for_add_new_client() {

    }
    @Then("user sends a request for getting all info therapist client")
    public void user_sends_a_request_for_getting_all_info_therapist_client() {
        specFormData.pathParams("p1", "api", "p2", "dashboard", "p3", "getClientBasicInfo");
        response=given(specFormData).post("{p1}/{p2}/{p3}");
        jsonPath=response.jsonPath();
        response.prettyPrint();
    }
    @Then("user verifies success is true for get all info for  client")
    public void user_verifies_success_is_true_for_get_all_info_for_client() {
        Assert.assertTrue(jsonPath.getBoolean("success"));
    }
    @Then("user verifies that response is as expected for get all info therapist client")
    public void user_verifies_that_response_is_as_expected_for_get_all_info_therapist_client() {

    }
    @Then("user sends Post request to updating added any client on therapist client Api section")
    public void user_sends_post_request_to_updating_added_any_client_on_therapist_client_api_section() {

    }
    @Then("user sends Post request to delete client")
    public void user_sends_post_request_to_delete_client() {

    }
    @Then("user verifies the response for delete client")
    public void user_verifies_the_response_for_delete_client() {

    }
}
