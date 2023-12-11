package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
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
    private String title= Faker.instance().name().title();
    private String newTitle= Faker.instance().name().title();


    @Given("user logs in website")
    public void userLogsInWebsite() {
        payload.put("username", "hypnotes2022tr1@gmail.com");
        payload.put("password", "Aydinlik123/");

        response1 = given().body(payload).post("https://test.hypnotes.net/api/login");
        response1.prettyPrint();
        Assert.assertTrue(response1.jsonPath().getBoolean("authenticated"));
        cookie = response1.cookie("PHPSESSID");
        // System.out.println("phpSessId = " + phpSessId);
        System.out.println(cookie);
    }

    @Given("user adds new category to do questionnaires")
    public void user_adds_new_category_to_do_questionnaires() {
        payload.put("title", title);
        response1=given().contentType(ContentType.URLENC).header("cookie",  "PHPSESSID=" + cookie).formParams(payload).post("https://test.hypnotes.net/api/question/addQuestionCategory");
        response1.prettyPrint();
        categoryId=response1.jsonPath().getInt("questionCategory.id");
        System.out.println("questionCategoryId = " + categoryId);



    }

    @Given("user requests to update the new category from Api")
    public void user_requests_to_update_the_new_category_from_api() {
        payload.put("title", newTitle);
        payload.put("questionCategoryId",categoryId);
        response1=given().header("cookie",  "PHPSESSID=" + cookie).formParams(payload).post("https://test.hypnotes.net/api/question/updateQuestionCategory");
        response1.prettyPrint();

    }

        @Then("user verifies new category is updated")
        public void user_verifies_new_category_is_updated () {
            Assert.assertTrue(response1.jsonPath().getBoolean("success"));
           Assert.assertEquals(newTitle,response1.jsonPath().getString("questionCategory.title"));

        }



}

