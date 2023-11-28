package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_231 {
    Response response;//1. adim
    Map<String,Object> payload=new HashMap<>();//2. adim

    String phpSessId;//3. adim
    @Given("user login to website")
    public void userLoginToWebsite() {
        payload.put("username","threapistlions@yopmail.com");
        payload.put("password","Test123.");
        response=given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();

        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
        phpSessId=response.cookies().get("PHPSESSID");
        System.out.println("phpSessId = " + phpSessId);

    }

    @Then("the api responds with a status code {int}")
    public void theApiRespondsWithAStatusCode(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());
    }

    @When("user makes a post request to delete any session on package session")
    public void userMakesAPostRequestToDeleteAnySessionOnPackageSession() {
        payload.put("title", "grup terapi");
        payload.put("meetingType", "standartMeeting");
        payload.put("price", 205);
        payload.put("duration", 45);
        payload.put("blockBefore", 5);
        payload.put("blockAfter", 5);
        payload.put("bufferTime", 0);
        payload.put("showPrice", 1);
        payload.put("paymentRequired", 0);
        payload.put("bookable", 1);
        payload.put("documents", "");
        payload.put("online", true);
        payload.put("locationInfos", "");
        payload.put("sessionInterval", 1);
        payload.put("description", "grup terapi");

        response=given().
                header("cookie","PHPSESSID")
                .formParams(payload)
                .post("https://test.hypnotes.net/api/settings/meeting/category/add");
        response.prettyPrint();
    }

    @And("the package session should be successfully deleted from the website")
    public void thePackageSessionShouldBeSuccessfullyDeletedFromTheWebsite() {
    }


}
