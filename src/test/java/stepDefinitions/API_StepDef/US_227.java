package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import enums.Enum_Fy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.API_utilities;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.*;

public class US_227 {


    int addSessionId;


    @Given("the user take token from api")
    public void theUserTakeTokenFromApi() {
        API_utilities.loginWithEnum(Enum_Fy.THERAPIST_2);
    }

    @Given("the user request to add new individual session")
    public void theUserRequestToAddNewIndividualSession() {

        payload.put("title","HAN");
        payload.put("meetingType","standartMeeting");
        payload.put("price","45");
        payload.put("duration","30");
        payload.put("blockBefore","10");
        payload.put("blockAfter","5");
        payload.put("bufferTime","0");
        payload.put("online",true);
        payload.put("categoryTypeId","1328");

        response=given().
                header("cookie","PHPSESSID="+phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/settings/meeting/category/add");
        response.prettyPrint();
        addSessionId=response.jsonPath().getInt("category.id");


    }

    @And("the user verify that response is success")
    public void theUserVerifyThatResponseIsSuccess() {
        Assert.assertTrue(response.jsonPath().getBoolean("success"));
    }

    @And("the user deletes individual session")
    public void theUserDeletesIndividualSession() {
      payload.put("categoryId",addSessionId);
      response=given()
              .header("cookie","PHPSESSID="+phpSessId)
              .formParams(payload)
              .post("https://test.hypnotes.net/api/settings/meeting/category/remove");
      response.prettyPrint();
    }


    @Then("the user verifes session is deleted from api")
    public void theUserVerifesSessionIsDeletedFromApi() {
        Assert.assertTrue(response.jsonPath().getBoolean("success"));

    }
}
