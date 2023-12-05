package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.API_utilities;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_208_StepDef {
    String phpSessId208;
    Response response;
    Map<String, Object> eventbody = new HashMap<>();

    @Given("User login to the system as a therapist")
    public void user_login_to_the_system_as_a_therapist() {
        phpSessId208 = API_utilities.login("therapist2023@mailsac.com", "12ASDasd.,asdASD34");

        System.out.println(phpSessId208);


        //  System.out.println("response.getStatusCode() = " + response.getStatusCode());
    }

    @Then("The user verifies that status code is {int}")
    public void theUserVerifiesThatStatusCodeIs(int arg0) {
        Assert.assertEquals(arg0, response.getStatusCode());
    }

    @Then("verify that success is true")
    public void verify_that_success_is_true() {
        Assert.assertTrue(response.body().jsonPath().get("success"));
    }

    @Then("verify descr is {string}")
    public void verify_descr_is(String string) {
        Assert.assertEquals("Event created success", response.body().jsonPath().get("descr"));
    }

    @When("User sent a Post request to {string}")
    public void userSentAPostRequestTo(String arg0) {
        eventbody.put("title", "N");
        eventbody.put("location", "Online");
        eventbody.put("RepeatOptions", "Weekly");
        eventbody.put("date", "Tue Nov 21 2023 21:35:27 GMT-0500");
        eventbody.put("start", "Sun Nov 19 2023 11:00:00 GMT-0500");
        eventbody.put("end", "Sun Nov 19 2023 12:00:00 GMT-0500");
        eventbody.put("description", "BBB");
        response = given()
                .header("accept", "application/json")
                .header("cookie", "PHPSESSID=" + phpSessId208)
                .formParams(eventbody)
                .post("https://test.hypnotes.net/api/event/setEvent");
        response.prettyPrint();

    }


}
