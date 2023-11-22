package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.*;

public class getUserId {
    int userId;

    @Then("the user gets user id from response")
    public void theUserGetsUserIdFromResponse() {
        System.out.println("phpSessId = " + phpSessId);

        response=given()
                .contentType(ContentType.JSON)
                .header("content-type", "application/x-www-form-urlencoded")
                .header("cookie",  "PHPSESSID=" + phpSessId)
                .post("https://test.hypnotes.net/api/dashboard/getUser");

        response.prettyPrint();

        userId=response.jsonPath().getInt("id");
        System.out.println("userId = " + userId);
    }
}
