package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.junit.Assert;
import utilities.API_utilities;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US213StepDef {

    Response response;
    Map<String, Object> payload = new HashMap<>();
    static String phpSessId ;
    static List<Integer> intervalDateBlockID= new ArrayList<>();
    static Integer lastAddedID;

    @Given("user creates token though API")
    public void user_creates_token_though_API() {
        payload.put("username","test_trpst_basic@yopmail.com");
        payload.put("password","Trpst13.");
        response=given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();
        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
        phpSessId=response.cookie("PHPSESSID");
    }

    @Then("user gets all interval date block times")
    public void     user_gets_all_interval_date_block_times() {
        response=given()
                .header("cookie","PHPSESSID="+ phpSessId)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff-period/all");
        response.prettyPrint();
        intervalDateBlockID = response.jsonPath().getList("data.id");
        lastAddedID = response.jsonPath().getInt("data[-1].id");
           System.out.println("intervalDateBlockID = " + intervalDateBlockID);
           System.out.println("lastID = " + lastAddedID);

    }
    @Then("Verify that block times are exist in returned response")
    public void Verify_that_block_times_are_exist_in_returned_response() {
        Assert.assertTrue(intervalDateBlockID.contains(lastAddedID));
    }
}
