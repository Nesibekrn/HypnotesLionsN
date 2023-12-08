package stepDefinitions.API_StepDef;

import io.cucumber.java.en.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.response;
import static utilities.API_utilities.phpSessId;

public class US_224 {
    Map<String, Object> payload=new HashMap<>();
    int createdIndvSessionId;
    List<Integer> allIndividualSessIds=new ArrayList<>();
    @When("user sends a post request to add a new individual session")
    public void user_sends_a_post_request_to_add_a_new_individual_session() {
        payload.put("title", "Depression7");
        payload.put("meetingType","standartMeeting");
        payload.put("price",50);
        payload.put("duration",60);
        payload.put("blockBefore", 10);
        payload.put("blockAfter",20);
        response=given()
                .header("Cookie","PHPSESSID="+phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/settings/meeting/category/add");
        response.prettyPrint();
        createdIndvSessionId=response.jsonPath().getInt("category.id");
        System.out.println("createdIndvSessionId = " + createdIndvSessionId);


    }
    @Then("user verifies the title,meeting type,duration")
    public void user_verifies_the_title_meeting_type_duration() {
        assertEquals(payload.get("title"),response.jsonPath().getString("category.title"));
        assertEquals(payload.get("meetingType"),response.jsonPath().getString("category.meetingType"));
        assertEquals(payload.get("price"),response.jsonPath().getInt("category.price"));
        assertEquals(payload.get("duration"),response.jsonPath().getInt("category.duration"));
        assertEquals(payload.get("blockBefore"),response.jsonPath().getInt("category.blockBefore"));
        assertEquals(payload.get("blockAfter"),response.jsonPath().getInt("category.blockAfter"));



    }
    @When("user sends the request to get all individiual sessions")
    public void user_sends_the_request_to_get_all_individiual_sessions() {
        response=given()
                .header("Cookie","PHPSESSID="+phpSessId)
                .post("https://test.hypnotes.net/api/settings/meeting/category/get");
        response.prettyPrint();

        allIndividualSessIds=response.jsonPath().get("id");
        System.out.println("allIndividualSessIds = " + allIndividualSessIds);


    }
    @Then("user should see the added session in this list")
    public void user_should_see_the_added_session_in_this_list() {
        assertTrue(allIndividualSessIds.contains(createdIndvSessionId));

    }
    @When("user sends the request to delete added session")
    public void user_sends_the_request_to_delete_added_session() {
        response=given()
                .header("Cookie","PHPSESSID="+phpSessId)
                .formParam("categoryId", createdIndvSessionId)
                .post("https://test.hypnotes.net/api/settings/meeting/category/remove");
        response.prettyPrint();

    }
    @Then("added session should be deleted successfully.")
    public void added_session_should_be_deleted_successfully() {
        assertTrue("Individual session is deleted successfully.",response.jsonPath().getBoolean("success"));

    }
}
