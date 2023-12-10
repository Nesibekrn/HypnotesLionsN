package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_246 {

    Response response1;

    Map<String,Object> payload= new HashMap<>();

    String cookie;

    JsonPath jsonPath;

    private int categoryId;




    @Given("user adds new catogory to do questionnaries")
    public void user_adds_new_catogory_to_do_questionnaries() {
        payload.put("title", "HI");
        response1=given().header("cookie",  "PHPSESSID=" + cookie).formParams(payload).post("https://test.hypnotes.net/api/question/addQuestionCategory");
        response1.prettyPrint();
        categoryId=response1.jsonPath().getInt("questionCategory.id");
        System.out.println("questionCategoryId = " + categoryId);



    }

    @Given("user requests to update the new catogory from Api")
    public void user_requests_to_update_the_new_catogory_from_api() {
        payload.put("title", "Serpil");
        payload.put("questionCategoryId",categoryId);
        response1=given().header("cookie",  "PHPSESSID=" + cookie).formParams(payload).post("https://test.hypnotes.net/api/question/updateQuestionCategoryy");
        response1.prettyPrint();

    }

        @Then("user verifies new catogory is updated")
        public void user_verifies_new_catogory_is_updated () {
            Assert.assertTrue(response1.jsonPath().getBoolean("success"));
            Assert.assertEquals("Serpil",jsonPath.getString("questionCategory.title"));

        }


    }

