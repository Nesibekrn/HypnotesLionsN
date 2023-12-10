package stepDefinitions.API_StepDef;

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

import static io.restassured.RestAssured.given;

public class US_231 {
    Response response;//1. adim
    Map<String,Object> payload=new HashMap<>();//2. adim

    private String PhpSesidPromoCode;//3. adim

    private int id;
    private int categoryId;

    private String title = "pazartsi";
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
        PhpSesidPromoCode=response.cookies().get("PHPSESSID");
        System.out.println("phpSessId = " + PhpSesidPromoCode);

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
                header("Cookie","PHPSESSID="+PhpSesidPromoCode)
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
        payload.put("categoryId",id);
        response=given().
                header("Cookie","PHPSESSID="+PhpSesidPromoCode)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/settings/meeting/category/remove");
        response.prettyPrint();
    }


    @Then("the user add new category type")
    public void theUserAddNewCategoryType() {
        payload.put("title","veli");
        payload.put("categoryMainType","packages");

        response=given().
                header("Cookie","PHPSESSID="+PhpSesidPromoCode)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/settings/meeting/categoryType/addCategoryType");
        response.prettyPrint();


        List<Integer>allIds = response.jsonPath().get("id");
        categoryId = allIds.get(allIds.size()-1);
        System.out.println(categoryId);


    }

    @And("user verifies if the category is added")
    public void userVerifiesIfTheCategoryIsAdded() {
        Assert.assertEquals(response.statusCode(), 200);
    }

    @Then("user deletes packages session category")
    public void userDeletesPackagesSessionCategory() {
        payload.put("id",categoryId);
        response=given().
                header("Cookie","PHPSESSID="+PhpSesidPromoCode)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/settings/meeting/categoryType/deleteCategoryType");
        response.prettyPrint();
    }

    @And("user verifies if the session is edeleted")
    public void userVerifiesIfTheSessionIsEdeleted() {
        List<Integer> LastId = response.jsonPath().get("id");
        Assert.assertFalse(LastId.contains(categoryId));
        System.out.println(categoryId);
        System.out.println("LastId = " + LastId);
    }
}
