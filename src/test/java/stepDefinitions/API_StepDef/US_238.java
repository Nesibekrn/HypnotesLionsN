package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.*;

public class US_238 {

    Faker faker=new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
   // String firstName2= faker.name().firstName();
   //String lastName2 = faker.name().lastName();
    String timeZone = "Europe/London";

    int clientID;


    @Given("the user request to add a new client from api")
    public void theUserRequestToAddANewClientFromApi() {
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);
        payload.put("timeZone", timeZone);

        response = given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .formParams(payload)
                .post("/dashboard/client/add");
        response.prettyPrint();
        clientID = response.jsonPath().getInt("client.id");
        System.out.println("clientID = " + clientID);


    }

    @And("the user validates the response for add new client")
    public void theUserValidatesTheResponseForAddNewClient() {
        Assert.assertTrue(response.jsonPath().getBoolean("success"));
        Assert.assertEquals(firstName, response.jsonPath().getString("client.name"));
        Assert.assertEquals(clientID, response.jsonPath().getInt("client.id"));

    }


    @Then("the user request to update the client from api")
    public void theUserRequestToUpdateTheClientFromApi() {
        payload.put("name","ALI");
        payload.put("surname", "VELI");
        payload.put("email",email);
        payload.put("country", "England");
        payload.put("gender", "Female");
        payload.put("clientId", clientID);
        payload.put("timeZone", timeZone);
        response = given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .formParams(payload)
                .post("/dashboard/client/update");
        response.prettyPrint();


    }
    @Then("the user verifies client is updated")
    public void theUserVerifiesClientIsUpdated() {
        Assert.assertTrue(response.jsonPath().getBoolean("success"));
    }

}