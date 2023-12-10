package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static base_url.HypnotesBaseUrl.specFormDataGroupSession;
import static io.restassured.RestAssured.given;
import static utilities.API_utilities.nextDate;
import static utilities.API_utilities.nextTime;
import static utilities.DB_utilities.*;

public class US_235 {
    Response response;
    JsonPath jsonPath;
    private String title = Faker.instance().name().title();
    private String newTitle = Faker.instance().name().title();
    private int price = 120;
    private int duration = 45;
    private int attendeeLimit = Faker.instance().number().numberBetween(2, 8);
    private String firstName = Faker.instance().name().firstName();
    private String email = Faker.instance().internet().emailAddress();
    private String password = Faker.instance().internet().password(8, 12, true, true, true);

    private String dateF;
    private String timeF;
    private int groupSessionId;
    private int categoryTypeGroupSessionId;
    Map<String, Object> payload = new HashMap<>();
    int lastAddedId;
    List<Integer> allIds;

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
        payload.put("categoryId", groupSessionId);
        payload.put("isGroupSession", true);
        response = given(specFormDataGroupSession).formParams(payload).post("{p1}/{p2}/{p3}/{p4}/{p5}");
        jsonPath = response.jsonPath();
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

    @When("user sends Post request to add Category Type Group Session")
    public void user_sends_post_request_to_add_category_type_group_session() {
        specFormData.pathParams("p1", "api", "p2", "settings", "p3", "meeting", "p4", "categoryType", "p5", "addCategoryType");
        payload.put("title", title);
        payload.put("categoryMainType", "groupSession");
        response = given(specFormData).formParams(payload).post("{p1}/{p2}/{p3}/{p4}/{p5}");
        jsonPath = response.jsonPath();
        response.prettyPrint();
        allIds = response.jsonPath().get("id");
        lastAddedId = allIds.get(allIds.size() - 1);
    }

    @Then("user verify the response Category Type Group Session is added")
    public void user_verify_the_response_category_type_group_session_is_added() {
        List<Integer> allTitle = response.jsonPath().get("title");
        List<Integer> allActive = response.jsonPath().get("isActive");
        List<Integer> allGroupSession = response.jsonPath().get("mainType");
        Assert.assertEquals(title, allTitle.get(allTitle.size() - 1));
        // Assert.assertEquals(lastAddedId, allIds.get(allIds.size() - 1));
        Assert.assertEquals(true, allActive.get(allActive.size() - 1));
        Assert.assertEquals("groupSession", allGroupSession.get(allGroupSession.size() - 1));
    }

    @Then("user sends Post request to update Category Type Group Session")
    public void user_sends_post_request_to_update_category_type_group_session() {
        specFormData.pathParams("p1", "api", "p2", "settings", "p3", "meeting", "p4", "categoryType", "p5", "updateCategoryType");
        payload.put("title", newTitle);
        payload.put("categoryMainType", "groupSession");
        payload.put("id", lastAddedId);
        response = given(specFormData).formParams(payload).post("{p1}/{p2}/{p3}/{p4}/{p5}");
        jsonPath = response.jsonPath();
        response.prettyPrint();
    }

    @Then("user verify the response Category Type Group Session is updated")
    public void user_verify_the_response_category_type_group_session_is_updated() {
        List<Integer> allTitle = response.jsonPath().get("title");
        List<Integer> allActive = response.jsonPath().get("isActive");
        List<Integer> allGroupSession = response.jsonPath().get("mainType");
        Assert.assertEquals(newTitle, allTitle.get(allTitle.size() - 1));
        // Assert.assertEquals(lastAddedId, allIds.get(allIds.size() - 1));
        Assert.assertEquals(true, allActive.get(allActive.size() - 1));
        Assert.assertEquals("groupSession", allGroupSession.get(allGroupSession.size() - 1));
    }

    @Then("user sends Post request to delete Category Type Group Session")
    public void user_sends_post_request_to_delete_category_type_group_session() {
        specFormData.pathParams("p1", "api", "p2", "settings", "p3", "meeting", "p4", "categoryType", "p5", "deleteCategoryType");
        payload.put("id", lastAddedId);
        response = given(specFormData).formParams(payload).post("{p1}/{p2}/{p3}/{p4}/{p5}");
        jsonPath = response.jsonPath();
        response.prettyPrint();
    }

    @Then("user verify the response Category Type Group Session is deleted")
    public void user_verify_the_response_category_type_group_session_is_deleted() {
        //  Assert.assertTrue(jsonPath.getString("data").contains("locationTitle"));
        // Assert.assertTrue(jsonPath.getList("data").get(0).toString().contains("id"));
    }

    @Then("user gets All Category Type Group Session")
    public void user_gets_all_category_type_group_session() {
        specFormData.pathParams("p1", "api", "p2", "settings", "p3", "meeting", "p4", "categoryType", "p5", "getCategoryTypes");
        response = given(specFormData).post("{p1}/{p2}/{p3}/{p4}/{p5}");
        jsonPath = response.jsonPath();
        response.prettyPrint();
    }

    @Given("user signs up to the website as a therapist with the API")
    public void userSignsUpToTheWebsiteAsATherapistWithTheAPI() {
        payload.put("registration_form[email]", email);
        payload.put("registration_form[fullname]", firstName);
        payload.put("registration_form[plainPassword]", password);
        payload.put("registration_form[referCode]", false);
        payload.put("registration_form[currency]", "GBP");
        System.out.println("email = " + email);
        response = given().formParams(payload).post("https://test.hypnotes.net/api/register-api");
        jsonPath = response.jsonPath();
        response.prettyPrint();
    }

    @Then("user verifies the new user information exists at the user table in the database")
    public void userVerifiesTheNewUserInformationExistsAtTheUserTableInTheDatabase() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select email from user order by id desc");
        boolean flag = false;
        try {
            resultSet.next();
                if (resultSet.getString("email").equals(email)) {
                  //  System.out.println(resultSet.getString("email") + " in emaili  =  " + resultSet.getString("email"));
                    flag = true;
                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue("Database doesn't contains registered email ", flag);
    }

}
