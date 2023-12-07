package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.API_utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_232_StepDefs {
    Faker faker=new Faker();
    String phpSessId232;
    Response response;
    Map<String, Object> SessionBody = new HashMap<>();
    String titleName;
    String categoryType;

    @Given("User login to the system as therapist")
    public void user_login_to_the_system_as_a_therapist() {
        phpSessId232 = API_utilities.login("therapist2023@mailsac.com", "12ASDasd.,asdASD34");

        System.out.println(phpSessId232);


        //  System.out.println("response.getStatusCode() = " + response.getStatusCode());
    }

    @Then("The User verifies that status code is {int}")
    public void theUserVerifiesThatStatusCodeIs(int int1) {
        Assert.assertEquals(int1, response.getStatusCode());
    }



    @When("User sent a Post request to the {string}")
    public void userSentAPostRequestTo(String arg0) {
        titleName= faker.name().title();
        SessionBody.put("title", titleName);
        SessionBody.put("categoryMainType", "groupSession");
        response = given()
                .header("accept", "application/json")
                .header("cookie", "PHPSESSID=" + phpSessId232)
                .formParams(SessionBody)
                .post(arg0);
        response.prettyPrint();

    }


    @And("verify that title is Group Session")
    public void verifyThatTitleIsGroupSession() {
        ArrayList<String>titlelist=response.jsonPath().get("title");
        Assert.assertTrue(titlelist.contains(titleName));

    }

}


