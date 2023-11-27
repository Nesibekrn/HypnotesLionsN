package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_215 {

    Response response;
    Map<String, Object> payload = new HashMap<>();

    String cookie;


    @Given("user sends a request to log in to home page")
    public void userSendsARequestToLogInToHomePage() {

        String baseUrl = "https://test.hypnotes.net/api/login";
        // Map<String,Object> payload=new HashMap<>();
        payload.put("username", "threapistlions@yopmail.com");
        payload.put("password", "Test123.");

        // Response response=given().contentType(ContentType.JSON).body(payload).post(baseUrl);
        response = given().contentType(ContentType.JSON).body(payload).post(baseUrl);
        response.prettyPrint();
        cookie = "PHPSESSID=" + response.cookies().get("PHPSESSID");
        System.out.println(cookie);

    }

    @Given("user adds a date into the date interval button")
    public void user_adds_a_date_into_the_date_interval_button() {
        // Map<String,Object> payload=new HashMap<>();
        payload.put("startAt", "12-30-2023");
        payload.put("finishAt", "12-31-2023");
        payload.put("title", "Online");
        payload.put("isAll", false);

        response = given().header("cookie", cookie).formParams(payload).post("https://test.hypnotes.net/api/hypnotherapist/timeoff-period/create");
        response.prettyPrint();


    }

    @Given("user verifies that status code is {int}")
    public void user_verifies_status_code(int statusCode) {

        Assert.assertEquals(statusCode,response.getStatusCode());



    }



    @Given("user deletes date  block times that was created before with using API endpoints")
    public void user_deletes_date_block_times_that_was_created_before_with_using_api_endpoints() {
        String dateBlockId = "478";


        // Send a request to delete the date block
        response = given().header("cookie", cookie)
                .delete("https://test.hypnotes.net/api/hypnotherapist/timeoff-period/delete/" + dateBlockId);

        response.prettyPrint();


    }

    }



