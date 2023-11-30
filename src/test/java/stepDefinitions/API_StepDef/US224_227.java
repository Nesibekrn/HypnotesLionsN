package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.*;

import static io.restassured.RestAssured.given;

public class US224_227 {

    Response response;
    JsonPath jsonPath;
    String phpSessId;
    public static int categoryId, CategoryTypeId;
    Map<String, Object> payload = new HashMap<>();

    @Given("User logins as a therapist for individual sessions and takes token from api")
    public void User_logins_as_a_therapist_for_individual_sessions_and_takes_token_from_api() {
        payload.put("username", "hypnotes2022tr1@gmail.com");
        payload.put("password", "Aydinlik123/");

        response = given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();

        phpSessId = response.cookies().get("PHPSESSID");
        System.out.println("phpSessid = " + phpSessId);

    }

    @And("User creates a category type to be able to add an individual session")
    public void userCreatesACategoryTypeToBeAbleToAddAnIndividualSession() {
            payload.put("title", "SonDurumBu");
            payload.put("categoryMainType", "individual");

            response = given().
                    header("cookie",  "PHPSESSID=" + phpSessId).
                    formParams(payload).
                    post("https://test.hypnotes.net/api/settings/meeting/categoryType/addCategoryType");
            //response.prettyPrint();


            List<Integer> allIds = response.jsonPath().get("id");
            CategoryTypeId = allIds.get(allIds.size()-1);

            System.out.println(CategoryTypeId);

    }

    @When("User adds a new individual session under Services Page")
    public void userAddsANewIndividualSessionUnderServicesPage() {
        payload.put("title", "Gulsum");
        payload.put("price", 30);
        payload.put("duration", 90);

        response = given().
                header("cookie",  "PHPSESSID=" + phpSessId).
                formParams(payload).
                post("https://test.hypnotes.net/api/settings/meeting/category/add");
        //response.prettyPrint();

        categoryId = response.jsonPath().get("category.id");
        System.out.println(categoryId);

    }

    @Then("User verifies if the individual session is added under Services Page")
    public void userVerifiesIfTheIndividualSessionIsAddedUnderServicesPage() {

        Assert.assertTrue(response.jsonPath().getBoolean("success"));
        Assert.assertEquals("Gulsum", response.jsonPath().getString("category.title"));
        Assert.assertEquals(30, response.jsonPath().getInt("category.price"));
        Assert.assertEquals(90, response.jsonPath().getInt("category.duration"));
    }

    @When("User updates the individual session under Services Page")
    public void userUpdatesTheIndividualSessionUnderServicesPage() {
        payload.put("title", "Ibrahim");
        payload.put("price", 40);
        payload.put("duration", 100);
        payload.put("categoryId", categoryId);

        response = given().
                header("cookie",  "PHPSESSID=" + phpSessId).
                formParams(payload).
                post("https://test.hypnotes.net/api/settings/meeting/category/update");
        //response.prettyPrint();
    }
    @Then("User verifies if individual session is updated under Services Page")
    public void userVerifiesIfIndividualSessionIsUpdatedUnderServicesPage() {

        Assert.assertTrue(response.jsonPath().getBoolean("success"));
        //Assert.assertTrue(response.prettyPrint().contains("title"));
        Assert.assertTrue(response.getBody().asString().contains("title"));
        Assert.assertEquals("Ibrahim", response.jsonPath().getString("category.title"));
        //Assert.assertTrue(response.prettyPrint().contains("price"));
        Assert.assertEquals(40, response.jsonPath().getInt("category.price"));
        //Assert.assertTrue(response.prettyPrint().contains("duration"));
        Assert.assertEquals(100, response.jsonPath().getInt("category.duration"));
        Assert.assertEquals(categoryId, response.jsonPath().getInt("category.id"));

    }
    @When("User deletes the individual session under Services Page")
    public void userDeletesTheIndividualSessionUnderServicesPage() {

        payload.put("categoryId", categoryId);

        response = given().
                header("cookie",  "PHPSESSID=" + phpSessId).
                formParams(payload).
                post("https://test.hypnotes.net/api/settings/meeting/category/remove");
        //response.prettyPrint();

    }

    @Then("User verifies if the individual session is deleted under Services Page")
    public void userVerifiesIfTheIndividualSessionIsDeletedUnderServicesPage() {

        Assert.assertTrue(response.jsonPath().getBoolean("success"));
        response = given().
                header("cookie",  "PHPSESSID=" + phpSessId).
                post("https://test.hypnotes.net/api/settings/meeting/category/get");
        //response.prettyPrint();

        Assert.assertFalse(response.jsonPath().getList("category.id").contains(categoryId));
    }

    @Then("User deletes the category type created")
    public void userDeletesTheCategoryTypeCreated() {

        payload.put("id", CategoryTypeId);

        response = given().
                header("cookie",  "PHPSESSID=" + phpSessId).
                formParams(payload).
                post("https://test.hypnotes.net/api/settings/meeting/categoryType/deleteCategoryType");
        //response.prettyPrint();

        List<Integer> LastIds = response.jsonPath().get("id");
        Assert.assertFalse(LastIds.contains(CategoryTypeId));
    }
}

