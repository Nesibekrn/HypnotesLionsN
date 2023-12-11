package stepDefinitions.API_StepDef;

import base_url.baseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import org.junit.Assert;
import pojos.LocationInfo;

import java.util.Map;

import static TestData.TestDataGeneration.*;
import static enums.EndPointPaths.*;
import static stepDefinitions.Hooks.response;


public class US_250 {
    Map<String, Object> locationInput;

    @Given("therapist user logs in to page and gets authentication")
    public void therapistUserLogsInToPageAndGetsAuthentication() {
        baseUrl.hypnotesSetUp();
    }

    @Given("when payload has been generated")
    public void whenPayloadHasBeenGenerated() {
        locationInput = LocationInfoData.generateLocationInput();
        baseUrl.request.contentType(ContentType.URLENC)
                .formParams(locationInput);
    }

    @When("therapist user hits the add a new location end point")
    public void therapistUserHitsTheAddANewLocationEndPoint() {
        response = baseUrl.request.when().post(ADD_LOCATION.getPath());
        response.prettyPrint();
    }

    @Then("therapist user verify the new location is added")
    public void therapistUserVerifyTheNewLocationIsAdded() {

        Assert.assertTrue(response.jsonPath().getBoolean("success"));
        LocationInfo locationInfoCreated = response.jsonPath().getObject("locationInfo", LocationInfo.class);
        Assert.assertEquals(locationInfoCreated.getAddress(), locationInput.get("address"));
        Assert.assertEquals(locationInfoCreated.getCity(), locationInput.get("city"));
        Assert.assertEquals(locationInfoCreated.getZipCode(),locationInput.get("zipCode"));
        Assert.assertEquals(locationInfoCreated.getTimeZone(),locationInput.get("timeZone"));
        Assert.assertEquals(locationInfoCreated.getCountry(),locationInput.get("country"));
        Assert.assertEquals(locationInfoCreated.getState(),locationInput.get("state"));


    }


}
