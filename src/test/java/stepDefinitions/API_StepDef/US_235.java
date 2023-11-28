package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.API_utilities;
import utilities.ReusableMethods;

import javax.swing.text.Utilities;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormDataGroupSession;
import static io.restassured.RestAssured.given;
import static utilities.API_utilities.nextDate;
import static utilities.API_utilities.nextTime;

public class US_235 {
    Response response;
    JsonPath jsonPath;
    private String title = Faker.instance().ancient().titan();
    private String price = "100";
    private String duration = "60";
    private int attendeeLimit = Faker.instance().number().numberBetween(3, 8);
    String dateF = nextDate(2);
    String timeF = nextTime(2);
    private int groupSessionId;
    Map<String, Object> payload = new HashMap<>();

    @When("user sends Post request to add group session")
    public void user_sends_post_request_to_add_group_session() {
        specFormDataGroupSession.pathParams("p1", "api", "p2", "settings", "p3", "meeting", "p4", "category", "p5", "add");
        payload.put("title", title);
        payload.put("price", price);
        payload.put("duration", duration);
        payload.put("attendeeLimit", attendeeLimit);
        payload.put("sessionDate", dateF);
        payload.put("sessionTime", timeF);

        response = given(specFormDataGroupSession).formParams(payload).post("{p1}/{p2}/{p3}/{p4}/{p5}");
        jsonPath = response.jsonPath();
        groupSessionId = jsonPath.get("category.id");
        response.prettyPrint();
    }

    @Then("user validates the response for add group session")
    public void user_validates_the_response_for_add_group_session() {
        Assert.assertTrue(jsonPath.getBoolean("success"));
        Assert.assertEquals(title, jsonPath.getString("category.title"));
        Assert.assertEquals(price, jsonPath.getString("category.price"));
        Assert.assertEquals(duration, jsonPath.getString("category.duration"));
    }

    @Then("user sends Post request to update group session")
    public void user_sends_post_request_to_update_group_session() {

    }

    @Then("user validates the response for update group session")
    public void user_validates_the_response_for_update_group_session() {

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
