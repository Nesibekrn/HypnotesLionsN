package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import stepDefinitions.Hooks;
import utilities.API_utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.phpSessId;
import static utilities.API_utilities.response;

public class US_204_API {
    Response response;//1. adim
    Map<String,Object> payload=new HashMap<>();//2. adim


    private int id;

    @Given("the user sends a request to get all meeting info on the Hypnotes calendar page")
    public void theUserSendsARequestToGetAllMeetingInfoOnTheHypnotesCalendarPage() {
        API_utilities.login("threapistlions@yopmail.com","Test123.");


    }

    @And("the user verifies id of client")
    public void theUserVerifiesIdOfClient() {
        response=given()
                .contentType(ContentType.JSON)
                .header("content-type", "application/x-www-form-urlencoded")
                .header("cookie",  "PHPSESSID=" + phpSessId)
                .post("https://test.hypnotes.net/api/notification/getAllNotification");

        response.prettyPrint();
        List<Integer>allIds = response.jsonPath().get("notification.id");
        id = allIds.getFirst();
        System.out.println("id = " + id);

    }


}
