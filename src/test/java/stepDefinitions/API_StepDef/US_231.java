package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;

public class US_231 {
    Response response;//1. adim
    Map<String,Object> payload=new HashMap<>();//2. adim

    String PhpSesid;//3. adim

    private int id;
    private int categoryId;
    private List<Integer>categoryidList=new ArrayList<>();
    private String title = "CUma";
    private String meetingType="standartMeeting";

    private int price=50;
    private int duration =30;
    private int blockBefore = 5;
    private int blockAfter = 5;
    private int bufferTime=0;
    private boolean showPrice = true;
    private boolean paymentRequired=false;
    private boolean bookable = true;
    private boolean online =true;

    private int categoryTypeId=1524;
    private int totalSessions = 10;
    private int sessionInterval = 1;
    private String description = "grup_terapi";



    @Given("user login to website")
    public void userLoginToWebsite() {
        payload.put("username","threapistlions@yopmail.com");
        payload.put("password","Test123.");
        response=given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();

        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
        PhpSesid=response.cookies().get("PHPSESSID");
        System.out.println("phpSessId = " + PhpSesid);

    }

    @Then("the api responds with a status code {int}")
    public void theApiRespondsWithAStatusCode(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());
    }

    @When("user makes a post request to delete any session on package session")
    public void userMakesAPostRequestToDeleteAnySessionOnPackageSession() {
        payload.put("title", title);
        payload.put("meetingType", meetingType);
        payload.put("price", price);
        payload.put("duration", duration);
        payload.put("blockBefore",blockBefore);
        payload.put("blockAfter", blockAfter);
        payload.put("bufferTime", bufferTime);
        payload.put("showPrice", showPrice);
        payload.put("paymentRequired", paymentRequired);
        payload.put("bookable", bookable);
        payload.put("online", online);
        payload.put("categoryTypeId",categoryId);
        payload.put("totalSessions",totalSessions);
        payload.put("sessionInterval",sessionInterval);
        payload.put("description",description);


        response=given().
                header("Cookie","PHPSESSID="+PhpSesid)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/settings/meeting/category/add");
        response.prettyPrint();

        id=response.jsonPath().getInt("category.id");


        Assert.assertTrue(response.jsonPath().getBoolean("success"));

        Assert.assertEquals(title,response.jsonPath().getString("category.title"));
    }

    @And("the package session should be successfully deleted from the website")
    public void thePackageSessionShouldBeSuccessfullyDeletedFromTheWebsite() {
        //specFormData.pathParams("1", "api", "2", "event", "3", "updateEvent");
        payload.put("categorsId",categoryId);
        response=given().
                header("Cookie","PHPSESSID="+PhpSesid)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/settings/meeting/category/remove");
        response.prettyPrint();
    }


}
