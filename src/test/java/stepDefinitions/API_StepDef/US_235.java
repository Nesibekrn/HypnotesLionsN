package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormDataGroupSession;
import static io.restassured.RestAssured.given;
import static utilities.API_utilities.nextDate;
import static utilities.API_utilities.nextTime;

public class US_235 {
    Response response;
    JsonPath jsonPath;
    private String title = Faker.instance().name().title();
    private String newTitle = Faker.instance().name().title();
    private int price = 120;
    private int duration = 45;
    private int attendeeLimit=Faker.instance().number().numberBetween(2, 8);
    
    private String dateF;
    private String timeF ;
    private int groupSessionId;
    Map<String, Object> payload = new HashMap<>();

    @When("user sends Post request to add group session")
    public void user_sends_post_request_to_add_group_session() {
        specFormDataGroupSession.pathParams("p1", "api", "p2", "settings", "p3", "meeting", "p4", "category", "p5", "add");
        dateF = nextDate(2);
        timeF = nextTime(2);
        payload.put("title", title);
        payload.put("price", price);
        payload.put("duration", duration);
        payload.put("attendeeLimit", attendeeLimit);
        payload.put("sessionDate", dateF);
        payload.put("sessionTime", timeF);
        payload.put("isGroupSession", true);
        response = given(specFormDataGroupSession).formParams(payload).post("{p1}/{p2}/{p3}/{p4}/{p5}");
        response.prettyPrint();
        jsonPath = response.jsonPath();
        groupSessionId = jsonPath.getInt("category.id");
    }

    @Then("user validates the response for add group session")
    public void user_validates_the_response_for_add_group_session() {
        Assert.assertTrue(jsonPath.getBoolean("success"));
        Assert.assertEquals(title, jsonPath.getString("category.title"));
        Assert.assertEquals(price, jsonPath.getInt("category.price"));
        Assert.assertEquals(duration, jsonPath.getInt("category.duration"));
        Assert.assertEquals(attendeeLimit, jsonPath.getInt("category.attendeeLimit"));
    }

    @Then("user sends Post request to update group session")
    public void user_sends_post_request_to_update_group_session() {
        specFormDataGroupSession.pathParams("p1", "api", "p2", "settings", "p3", "meeting", "p4", "category", "p5", "update");
        payload.put("title", newTitle);
        payload.put("price", price);
        payload.put("duration", duration);
        payload.put("attendeeLimit", attendeeLimit);
        payload.put("sessionDate", dateF);
        payload.put("sessionTime", timeF);
        payload.put("categoryId",groupSessionId);
        payload.put("isGroupSession", true);
        response=given(specFormDataGroupSession).formParams(payload).post("{p1}/{p2}/{p3}/{p4}/{p5}");
        jsonPath=response.jsonPath();
        response.prettyPrint();
    }

    @Then("user validates the response for update group session")
    public void user_validates_the_response_for_update_group_session() {
        Assert.assertTrue(jsonPath.getBoolean("success"));
        Assert.assertEquals(newTitle, jsonPath.getString("category.title"));
        Assert.assertEquals(price, jsonPath.getInt("category.price"));
        Assert.assertEquals(duration, jsonPath.getInt("category.duration"));
        Assert.assertEquals(attendeeLimit, jsonPath.getInt("category.attendeeLimit"));
    }

    @Then("user sends Post request to delete group session")
    public void user_sends_post_request_to_delete_group_session() {
        specFormDataGroupSession.pathParams("p1", "api", "p2", "settings", "p3", "meeting", "p4", "category", "p5", "remove");
        payload.put("categoryId", groupSessionId);
        response = given(specFormDataGroupSession).formParams(payload).post("{p1}/{p2}/{p3}/{p4}/{p5}");
        jsonPath = response.jsonPath();
        response.prettyPrint();
    }

    @Then("user validates the response for delete group session")
    public void user_validates_the_response_for_delete_group_session() {
        Assert.assertTrue(jsonPath.getBoolean("success"));
    }
}
