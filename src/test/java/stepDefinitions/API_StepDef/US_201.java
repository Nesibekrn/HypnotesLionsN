package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;
import static stepDefinitions.Hooks.response;

public class US_201 {


    @Then("the user verifies that authenticated is true")
    public void theUserVerifiesThatAuthenticatedIsTrue() {
        assertTrue(response.jsonPath().getBoolean("authenticated"));
    }

    @Then("the user verifies that type is client")
    public void theUserVerifiesThatTypeIsClient() {
        assertEquals("client",response.jsonPath().getString("type"));

    }

    @Then("the user verifies that isVerified is true")
    public void theUserVerifiesThatIsVerifiedIsTrue() {
        assertTrue(response.jsonPath().getBoolean("isVerified"));
    }

    @Then("the user verifies that status codes is {int}")
    public void theUserVerifiesThatStatusCodesIs(int expectedStatusCode) {
        assertEquals(expectedStatusCode,response.statusCode());
    }
}
