package stepDefinitions.DB_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DB_utilities;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static base_url.BaseUrlQuestionner.spec;
import static io.restassured.RestAssured.given;
import static utilities.API_utilities.response;
import static utilities.DB_utilities.*;

public class US_303 {
    private Map<String, String> expectedBody = new HashMap<>();
    Faker faker =new Faker();
    int idClient;

    @When("user sends post request request to add new  client")
    public void userSendsPostRequestRequestToAddNewClient() {
        String firstName= faker.name().firstName();
        String lastName= faker.name().lastName();
        String email= faker.internet().emailAddress();
        String zone="Europe/London";

        spec.pathParams("p1","dashboard","p2","client","p3","add");
        expectedBody.put("firstName",firstName);
        expectedBody.put("lastName",lastName);
        expectedBody.put("email",email);
        expectedBody.put("timezone",zone);

        response=given(spec).
               formParams(expectedBody).
                post("{p1}/{p2}/{p3}");
        response.prettyPrint();
         idClient=response.jsonPath().getInt("clientId");
        System.out.println("idClient = " + idClient);
        //Assert.assertEquals(200,response.statusCode);
        Assert.assertEquals(true,response.jsonPath().getBoolean("success"));
    }



    @Then("user find Client")
    public void userFindClient() throws SQLException {

            statement=connection.createStatement();
            resultSet =statement.executeQuery("select * from client order by id desc limit 1");
            resultSet.next();




    }

    @Then("user Validate data")
    public void userValidateData() throws SQLException {
        Assert.assertEquals(idClient,resultSet.getInt(1));
    }

    @And("user delete client in API")
    public void userDeleteClientInAPI() {
        spec.pathParams("p1","dashboard","p2","client","p3","delete");
        response = given(spec)
                .body("clientId=" + idClient)
                .post("{p1}/{p2}/{p3}");
        response.prettyPrint();

    }

}
