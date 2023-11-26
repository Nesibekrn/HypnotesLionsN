package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.phpSessId;


public class US_210 extends CommonPage {

    Response response;
    Map<String, Object> payload = new HashMap<>();
    String phpSessid;
    int eventId;
    Boolean responseBodySuccess;

    @Given("the user has API base URL")
    public void theUserHasAPIBaseURL() {

        //set URL
        RestAssured.baseURI = "https://test.hypnotes.net/";

    }

    @And("the user has valid login credentials")
    public void theUserHasValidLoginCredentials() {

        payload.put("username", ConfigurationReader.getProperty("therapistEmailUSA"));
        payload.put("password", ConfigurationReader.getProperty("therapistPasswordUSA"));
    }

    @When("the user sends a POST request to the valid username and password")
    public void theUserSendsAPOSTRequestToTheValidUsernameAndPassword() {

        //form-data -> formParams()
        //JSON -> body()
        //post() -> endpoint
        response = given().contentType(ContentType.JSON).body(payload).post("api/login");
        response.prettyPrint();

    }

    @Then("the API responds with a status code {int}")
    public void theAPIRespondsWithAStatusCode(int statusCode) {

        int actualStatusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, response.getStatusCode());

    }

    @And("the response contains an authentication token")
    public void theResponseContainsAnAuthenticationToken() {

        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));

    }

    @And("the user gets phpSessid")
    public void theUserGetsPhpSessid() {

        //we need cookie. we dont need to get inside body.
        phpSessid = response.cookies().get("PHPSESSID");
        System.out.println("phpSessid = " + phpSessid);

    }


    @When("the user makes a POST request to create event details")
    public void theUserMakesAPOSTRequestToCreateEventDetails() {

        //Map<String, Object> createEventBodyList = new HashMap<>();
        payload.put("title", "Set Event 3");
        payload.put("location", "Online");
        payload.put("date", "Fri Dec 05 2023 09:30:00 GMT-0800");
        payload.put("start", "Thu Nov 25 2023 11:00:00 GMT-0800");
        payload.put("end", "Thu Nov 25 2023 12:00:00 GMT-0800");
        payload.put("description", "");
        payload.put("timeStart", "2023-12-01 13:00");
        payload.put("timeEnd", "2023-12-01 14:00");

        response = given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/event/setEvent");
        response.prettyPrint();

        response = given().contentType(ContentType.JSON).body(payload).post("https://test.hypnotes.net/api/event/setEvent");
        response.prettyPrint();

    }

    @And("the event should be successfully created in the system")
    public void theEventShouldBeSuccessfullyCreatedInTheSystem() {
        String setEventBodyDescr = "Event created success";

        Assert.assertTrue("success should be equal to true", response.jsonPath().getBoolean("success"));
        Assert.assertEquals("Event cant created.", setEventBodyDescr, response.jsonPath().getString("descr"));
    }

    @When("the user makes a POST request to get all events")
    public void theUserMakesAPOSTRequestToGetAllEvents() {
        response = given().body(payload).post("api/event/getAllEvents");
        response.prettyPrint();
    }

    @And("the response should contain a list of events")
    public void theResponseShouldContainAListOfEvents() {

        List<Integer> listOfEvents = response.jsonPath().getList("id");
        System.out.println(listOfEvents);

    }

    @When("the user makes a POST request to update event details")
    public void theUserMakesAPOSTRequestToUpdateEventDetails() {

        response = given().body(payload).post("api/event/updateEvent");
        response.prettyPrint();

        eventId = response.jsonPath().getInt("id");
        System.out.println("eventId " + eventId);

    }

    @And("the event should be successfully updated in the system")
    public void theEventShouldBeSuccessfullyUpdatedInTheSystem() {

        Assert.assertTrue(response.jsonPath().getBoolean("success"));

    }

    @When("the user makes a POST request to delete a specific event")
    public void theUserMakesAPOSTRequestToDeleteASpecificEvent() {

        response = given().body(payload).post("api/event/deleteEvent");
        response.prettyPrint();

    }

    @And("the event should be successfully deleted from the system")
    public void theEventShouldBeSuccessfullyDeletedFromTheSystem() {

        Assert.assertTrue(response.jsonPath().getBoolean("success"));

    }


}
