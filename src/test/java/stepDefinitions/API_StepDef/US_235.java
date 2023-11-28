package stepDefinitions.API_StepDef;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormDataGroupSession;

public class US_235 {
    Response response;
    JsonPath jsonPath;

    @When("user sends Post request to add group session")
    public void user_sends_post_request_to_add_group_session() {
        specFormDataGroupSession.formParams("p1", "api", "p2", "settings", "p3", "meeting", "p4", "category", "p5", "add");
        Map<String, Object> payload = new HashMap<>();
        payload.put("title", "New Group Session");
    }

    @Then("user validates the response for add group session")
    public void user_validates_the_response_for_add_group_session() {

    }

    @Then("user sends Post request to update group session")
    public void user_sends_post_request_to_update_group_session() {

    }

    @Then("user validates the response for update group session")
    public void user_validates_the_response_for_update_group_session() {

    }

    @Then("user sends Post request to delete group session")
    public void user_sends_post_request_to_delete_group_session() {

    }

    @Then("user validates the response for delete group session")
    public void user_validates_the_response_for_delete_group_session() {

    }
}
