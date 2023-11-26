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
    JsonPath jsonPath;
    Map<String, Object> payload = new HashMap<>();
    static String phpSessId ;
    static Integer dateIntervalID;
    static List<Integer> intervalDateBlockID= new ArrayList<>();

    /*@Given("user take token from api")
    public void user_take_token_from_api() {
        payload.put("username","test_trpst_basic@yopmail.com");
        payload.put("password","Trpst13.");
        response=given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();
        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
        phpSessId=response.cookie("PHPSESSID");
        //  System.out.println("phpSessId = " + phpSessId);

    }*/
   /* @Then("user creates a date interval time from Api")
    public void user_creates_a_date_interval_time_from_api() {
        payload.put("startAt","12-25-2023");
        payload.put("finishAt","12-26-2023");
        payload.put("title","Online");
        payload.put("isAll",false);
        response=given()
                .header("cookie","PHPSESSID="+phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff-period/create");
        response.prettyPrint();
        dateIntervalID=response.jsonPath().getInt("data[0].id");
         System.out.println("dateIntervalID = " + dateIntervalID);


    }*/
   /* @Then("user verifies status is True")
    public void user_verifies_status_is_true() {
        Assert.assertTrue(response.jsonPath().getBoolean("status"));

    }*/
       /* @Then("user verifies that response is expected")
    public void user_verifies_that_response_is_expected() {
        Assert.assertEquals("12-25-2023",response.jsonPath().getString("data[0].startAt"));
        Assert.assertEquals("12-26-2023",response.jsonPath().getString("data[0].finishAt"));
        Assert.assertEquals("Online",response.jsonPath().getString("data[0].locationTitle"));


    }*/
    @Then("user gets all interval date block times from api")
    public void     user_gets_all_interval_date_block_times_from_api() {
        response=given()
                .header("cookie","PHPSESSID="+ phpSessId)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff-period/all");
        response.prettyPrint();
        intervalDateBlockID = response.jsonPath().getList("data.id");
           System.out.println("intervalDateBlockID = " + intervalDateBlockID);


    }
    @Then("user verifies created interval date block is exist in response")
    public void user_verifies_created_interval_date_block_is_exist_in_response() {
        Assert.assertTrue(intervalDateBlockID.contains(dateIntervalID));
    }
}
