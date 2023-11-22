package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import stepDefinitions.Hooks;
import utilities.API_utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_204_API {
    Response response;
    Map<String,Object> payload=new HashMap<>();

    String baseUrl = "https://test.hypnotes.net/api/notification/getAllNotification";

    List<Integer> id=new ArrayList<>();

    @Given("the user sends a request to get all meeting info on the Hypnotes calendar page")
    public void theUserSendsARequestToGetAllMeetingInfoOnTheHypnotesCalendarPage() {
        API_utilities.login("threapistlions@yopmail.com","Test123.");















    }

    @Then("user verifies that status code is {int}")
    public void userVerifiesThatStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());
    }

    @And("the user verifies id of client")
    public void theUserVerifiesIdOfClient() {
    }
}
