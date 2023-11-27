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
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;

public class US_210 extends CommonPage {

    Response response;
    Map<String, Object> payload = new HashMap<>();
    String phpSessid;
    public static String eventId;

    @Given("the user has API base URL")
    public void theUserHasAPIBaseURL() {

        // Base URL for the API
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

        response = given().contentType(ContentType.JSON).body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();

    }

    @Then("the API responds with a status code {int}")
    public void theAPIRespondsWithAStatusCode(int expectedStatusCode) {

        // Validate response status code
        int actualStatusCode = response.getStatusCode();
        Assert.assertEquals(expectedStatusCode, actualStatusCode);

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

        specFormData.pathParams("1", "api", "2", "event", "3", "setEvent");

        Map<String, Object> requestFormData = new HashMap<>();
        requestFormData.put("title", "Set Event 3");
        requestFormData.put("location", "Online");
        requestFormData.put("date", "Wed Dec 06 2023 09:30:00 GMT-0800");
        requestFormData.put("start", "Thu Nov 25 2023 11:00:00 GMT-0800");
        requestFormData.put("end", "Thu Nov 25 2023 12:00:00 GMT-0800");
        requestFormData.put("description", "");
        requestFormData.put("timeStart", "2023-12-01 13:00");
        requestFormData.put("timeEnd", "2023-12-01 14:00");

        response = given(specFormData).formParams(requestFormData).post("{1}/{2}/{3}");
        response.prettyPrint();

    }

    @And("the event should be successfully created in the system")
    public void theEventShouldBeSuccessfullyCreatedInTheSystem() {

        String setEventBodyDescr = "Event created success";
        boolean isEventCreated = response.jsonPath().getBoolean("success");

        // Validate event creation success in the response body
        Assert.assertTrue("Event should be successfully created", isEventCreated);

        // Validate the description of event creation
        Assert.assertEquals("Event creation description should match", setEventBodyDescr, response.jsonPath().getString("descr"));

    }

    @When("the user makes a POST request to get all events")
    public void theUserMakesAPOSTRequestToGetAllEvents() {

        specFormData.pathParams("1", "api", "2", "event", "3", "getAllEvents");

        Map<String, Object> formDataMap = new HashMap<>();
        formDataMap.put("location", "all");
        formDataMap.put("date","2023-12-01");

        response = given(specFormData).formParams(formDataMap).post("{1}/{2}/{3}");
        response.prettyPrint();

    }

    @And("the response should contain a list of events")
    public void theResponseShouldContainAListOfEvents() {

        eventId = response.jsonPath().getString("[0].id");

    }

    @When("the user makes a POST request to update event details")
    public void theUserMakesAPOSTRequestToUpdateEventDetails() {

        specFormData.pathParams("1", "api", "2", "event", "3", "updateEvent");

        Map<String, Object> updsteRequestFormData = new HashMap<>();
        updsteRequestFormData.put("title", "Set Event 10");
        updsteRequestFormData.put("location", "Online");
        updsteRequestFormData.put("date", "Wed Dec 06 2023 09:30:00 GMT-0800");
        updsteRequestFormData.put("start", "Thu Nov 25 2023 11:00:00 GMT-0800");
        updsteRequestFormData.put("end", "Thu Nov 25 2023 12:00:00 GMT-0800");
        updsteRequestFormData.put("description", "");
        updsteRequestFormData.put("timeStart", "2023-12-01 13:00");
        updsteRequestFormData.put("timeEnd", "2023-12-01 14:00");
        updsteRequestFormData.put("eventId", eventId);


        response = given(specFormData).formParams(updsteRequestFormData).post("{1}/{2}/{3}");
        response.prettyPrint();

    }

    @And("the event should be successfully updated in the system")
    public void theEventShouldBeSuccessfullyUpdatedInTheSystem() {

        String updateEventBodyDescr = "Event updated success";
        boolean isEventUpdated = response.jsonPath().getBoolean("success");

        // Validate event creation success in the response body
        Assert.assertTrue("Event should be successfully updated", isEventUpdated);

        // Validate the description of event creation
        Assert.assertEquals("Event creation description should match", updateEventBodyDescr, response.jsonPath().getString("descr"));

    }

    @When("the user makes a POST request to delete a specific event")
    public void theUserMakesAPOSTRequestToDeleteASpecificEvent() {

        specFormData.pathParams("1", "api", "2", "event", "3", "deleteEvent");

        Map<String, Object> deleteRequestFormData = new HashMap<>();
        deleteRequestFormData.put("title", "Set Event 10");
        deleteRequestFormData.put("location", "Online");
        deleteRequestFormData.put("date", "Wed Dec 06 2023 09:30:00 GMT-0800");
        deleteRequestFormData.put("start", "Thu Nov 25 2023 11:00:00 GMT-0800");
        deleteRequestFormData.put("end", "Thu Nov 25 2023 12:00:00 GMT-0800");
        deleteRequestFormData.put("description", "");
        deleteRequestFormData.put("timeStart", "2023-12-01 13:00");
        deleteRequestFormData.put("timeEnd", "2023-12-01 14:00");
        deleteRequestFormData.put("eventId", eventId);


        response = given(specFormData).formParams(deleteRequestFormData).post("{1}/{2}/{3}");
        response.prettyPrint();

    }

    @And("the event should be successfully deleted from the system")
    public void theEventShouldBeSuccessfullyDeletedFromTheSystem() {

        String deleteEventBodyDescr = "Event deleted success";
        boolean isEventDeleted = response.jsonPath().getBoolean("success");

        // Validate event creation success in the response body
        Assert.assertTrue("Event should be successfully deleted", isEventDeleted);

        // Validate the description of event creation
        Assert.assertEquals("Event creation description should match", deleteEventBodyDescr, response.jsonPath().getString("descr"));

    }
}
