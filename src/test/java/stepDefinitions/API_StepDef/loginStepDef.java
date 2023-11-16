package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.API_utilities;

import java.util.HashMap;
import java.util.Map;

import static enums.Enum_Fy.NESIBE;
import static enums.Enum_Fy.THERAPIST;
import static io.restassured.RestAssured.given;

public class loginStepDef {
    Response response;
    Map<String,Object> payload=new HashMap<>();
    String phpSessid;

    @Given("the user sends a request to log in to Hypnotes")
    public void theUserSendsARequestToLogInToHypnotes() {
        payload.put("username","test_trpst_basic@yopmail.com");
        payload.put("password","Trpst13.");

        response=given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();
    }

    @Then("the user verify that status code is {int}")
    public void theUserVerifyThatStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());
    }

    @And("the user verify authenticated is true")
    public void theUserVerifyAuthenticatedIsTrue() {
        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
    }

    @And("the user get phpSessId")
    public void theUserGetPhpSessId() {
        phpSessid=response.cookies().get("PHPSESSID");
        System.out.println("phpSessid = " + phpSessid);
    }

    @Given("the user login from api utilities")
    public void theUserLoginFromApiUtilities() {
        API_utilities.login("test_trpst_basic@yopmail.com","Trpst13.");
    }

    @Given("the user login from APIUtilities with Enum")
    public void theUserLoginFromAPIUtilitiesWithEnum() {
        API_utilities.loginWithEnum(NESIBE);
    }
}
