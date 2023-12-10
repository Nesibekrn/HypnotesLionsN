package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.API_utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.phpSessId;
import static utilities.API_utilities.response;

public class US_222 {

    Map<String,Object> payload=new HashMap<>();//2. adim


    private int id;

    @Given("the user login to the website")
    public void theUserLoginToTheWebsite() {

        API_utilities.login("threapistlions@yopmail.com","Test123.");
    }
    @When("the user create a new block time")
    public void theUserCreateANewBlockTime() {
        payload.put("startAt", "01:22");
        payload.put("finishAt", "07:00");
        payload.put("isRecurring", true);
        payload.put("recurringDays[0]", "tuesday");
        payload.put("title", "Online");
        payload.put("isAll",false);

        response= given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff/create");

        response.prettyPrint();
        id=response.jsonPath().getInt("data[0].id");

    }

    @Then("the user verify if the rspond is correct")
    public void theUserVerifyIfTheRspondIsCorrect() {
        Assert.assertTrue(response.jsonPath().getBoolean("status"));
        Assert.assertEquals(id,response.jsonPath().getInt("data[0].id"));
    }
    @And("the user update the block time")
    public void theUserUpdateTheBlockTime() {
        payload.put("startAt", "14:00");
        payload.put("finishAt", "16:00");
        payload.put("isRecurring", true);
        payload.put("recurringDays[0]", "wednesday");
        payload.put("id",id);

        response= given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                //.contentType(ContentType.JSON)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff/update");

        response.prettyPrint();
    }



    @And("the user compares the results and respond body")
    public void theUserComparesTheResultsAndRespondBody() {
        Assert.assertTrue(response.jsonPath().getBoolean("status"));
        Assert.assertEquals(id,response.jsonPath().getInt("data[0].id"));



    }






}

