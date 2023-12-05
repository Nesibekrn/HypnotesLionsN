package stepDefinitions.API_StepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.json.Json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class US_225 {

    Response response;
    JsonPath jsonPath;
    static String phpSessId ;
    static List<Integer> categoryID = new ArrayList<>();
    static Integer    createdCategoryID;


    Map<String, Object> payload = new HashMap<>();
    @Given("user take token from website")
    public void user_take_token_from_website() {
        payload.put("username", "threapistlions@yopmail.com");
        payload.put("password", "Test123.");

        response = given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();
        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
        phpSessId = response.cookie("PHPSESSID");
       // System.out.println("phpSessId = " + phpSessId);
    }

    @Then("User get all individual session")
    public void user_get_all_individual_session() {
        response=given()
                .contentType("application/json")
                .header("cookie","PHPSESSID="+phpSessId)
                .post("https://test.hypnotes.net/api/settings/meeting/categoryType/getCategoryTypes");
        categoryID = response.jsonPath().get("id");
        createdCategoryID = categoryID.get(categoryID.size()-1);
        response.prettyPrint();
        System.out.println("createdCategoryID = " + createdCategoryID);
        System.out.println("CategoryID = " + categoryID);



    }

    @Then("Verify that all individual sessions are exist in returned response")
    public void verify_that_all_individual_sessions_are_exist_in_returned_response() {
        System.out.println(categoryID.contains(createdCategoryID));
        Assert.assertTrue(categoryID.contains(createdCategoryID));

    }
}
