package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_200 {
    Response response;

    Map<String,Object>payLoad=new HashMap<>();
    String phpSessId;

    @Given("the user sends a request to log in Hypnotess")
    public void theUserSendsARequestToLogInHypnotess() {
        payLoad.put("username","therapist2023@mailsac.com");
        payLoad.put("password","12ASDasd.,asdASD34");

        response= given().body(payLoad).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();

    }

    @Then("the user verifies that status code is {int}")
    public void theUserVerifiesThatStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());

    }

    @And("the user verifies authenticated is true")
    public void theUserVerifiesAuthenticatedIsTrue() {
      Assert.assertTrue( response.jsonPath().getBoolean("authenticated"));

    }

    @And("the user gets phpsessId")
    public void theUserGetsPhpsessId() {
        phpSessId=response.cookies().get("PHPSESSID");
        System.out.println("phpSessId = " + phpSessId);
    }
}
