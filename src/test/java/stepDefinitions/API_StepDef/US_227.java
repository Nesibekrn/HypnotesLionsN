package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import enums.Enum_Fy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.internal.mapping.JohnzonMapper;
import org.junit.Assert;
import utilities.API_utilities;

import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.*;

public class US_227 {

    Faker faker = new Faker();
    String fileName = faker.name().firstName();
    int categoryId;



    @Given("the user take token from api")
    public void theUserTakeTokenFromApi() {
        API_utilities.loginWithEnum(Enum_Fy.THERAPIST_2);
    }

    @Given("the user request to add individual session category")
    public void theUserRequestToAddIndividualSessionCategory() {
        payload.put("title",fileName);
        payload.put("categoryMainType","individual");

        response = given().
                header("cookie",  "PHPSESSID=" + phpSessId).
                formParams(payload).
                post("/settings/meeting/categoryType/addCategoryType");
        response.prettyPrint();
        List<Integer> allIds = response.jsonPath().get("id");
        categoryId = allIds.get(allIds.size()-1);
        System.out.println(categoryId);



    }

    @And("the user verify that category is added")
    public void theUserVerifyThatCategoryIsAdded() {
       // Assert.assertTrue(response.prettyPrint().contains("mainType"));
        Assert.assertEquals(response.statusCode(), 200);

    }


    @And("the user deletes individual session category")
    public void theUserDeletesIndividualSessionCategory() {
        payload.put("id",categoryId);
        response=given()
                . header("cookie",  "PHPSESSID=" + phpSessId)
                .formParams(payload)
                .post("/settings/meeting/categoryType/deleteCategoryType");
        response.prettyPrint();
    }


    @Then("the user verifies session is deleted from api")
    public void theUserVerifiesSessionIsDeletedFromApi() {
        List<Integer> LastId = response.jsonPath().get("id");
        Assert.assertFalse(LastId.contains(categoryId));

        System.out.println(categoryId);
        System.out.println("LastId = " + LastId);

    }



}
