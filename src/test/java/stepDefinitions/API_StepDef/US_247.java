package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static base_url.BaseUrlQuestionner.spec;
import static io.restassured.RestAssured.given;
import static utilities.API_utilities.phpSessId;
import static utilities.API_utilities.response;

public class US_247 {

    Faker faker = new Faker();
    String word = faker.lorem().word();
    int id;


    @When("user sends post request request to add new Questionnaires")
    public void userSendsPostRequestRequestToAddNewQuestionnaires() {

//        response = given()
//                .contentType(ContentType.URLENC)
//                .header("cookie", "PHPSESSID=" + phpSessId)
//                .body("title=" + word)
//                .post("https://test.hypnotes.net/api/question/addQuestionCategory");
//        response.prettyPrint();
//        JsonPath jsonPath = response.jsonPath();
//        id = jsonPath.getInt("questionCategory.id");
//        System.out.println("id = " + id);
//        Assert.assertEquals(200, response.statusCode());
        spec.pathParams("first","question","second","addQuestionCategory");

        response = given(spec)
                .when()
                .body("title=" + word)
                .post("{first}/{second}");
        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        id = jsonPath.getInt("questionCategory.id");
        System.out.println("id = " + id);
        Assert.assertEquals(200, response.statusCode());


    }

    @And("user sends post request request to delete any Questionnaire")
    public void userSendsPostRequestRequestToDeleteAnyQuestionnaire() {
        spec.pathParams("first","question","second","deleteQuestionCategory");
        response = given(spec)
                .body("questionCategoryId=" + id)
                .post("{first}/{second}");
        response.prettyPrint();


    }

    @Then("user assert for delete")
    public void userAssertForDelete() {

        //1. way
        Map <String, Object>deleteBady=new HashMap<>();
        deleteBady.put( "success", true);
        deleteBady.put("descr", "Category removed");
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(deleteBady.get("success"),response.jsonPath().getBoolean("success"));
        Assert.assertEquals(deleteBady.get("descr"),response.jsonPath().getString("descr"));

        // 2. way
        spec.pathParams("first","question","second","getAllQuestionCategory");
        response = given(spec)
                .post("{first}/{second}");
        response.prettyPrint();
       List<Integer> ids=response.jsonPath().getList("questionCategory.id");
        System.out.println("ids = " + ids);
        Assert.assertFalse(ids.contains(id));


    }


}
