package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class apiStepDef {
    Response response;
    Map<String,Object>payload=new HashMap<>();
    @Given("the user sends a request to log in the system")
    public void theUserSendsARequestToLogInTheSystem() {
        payload.put("username","test_trpst_enterprice@yopmail.com");
        payload.put("password","Trpst13.");

        response=given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();

    }

    @Then("the user verifies that status code is {int}")
    public void theUserVerifiesThatStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode,response.statusCode());
    }

    @And("the user verifies that autanticated is true")
    public void theUserVerifiesThatAutanticatedIsTrue() {
        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
    }

    @And("the user get csrfToken")
    public void theUserGetCsrfToken() {
        String csrfToken=response.cookies().get("csrfToken");
        System.out.println("csrfToken = " + csrfToken);
    }
}
