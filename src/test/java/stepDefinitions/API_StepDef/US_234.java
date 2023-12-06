package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import org.junit.Assert;
import utilities.API_utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.phpSessId;
import static utilities.API_utilities.response;

public class US_234 {
    Map<String ,Object> payload = new HashMap<>();
    Faker faker=  new Faker();
    String title=faker.name().title();
    String newTitle=faker.name().title();

    List<Integer> allCategoryIds;
    int categroyId;


    @When("user send Post Request to add Group Category")
    public void userSendPostRequestToAddGroupCategory() {
        System.out.println(title);
        payload.put("title",title);
        payload.put("categoryMainType","groupSession");


        response=given().header("cookie","PHPSESSID="+ phpSessId).
                formParams(payload).post("https://test.hypnotes.net/api/settings/meeting/categoryType/addCategoryType");
           response.prettyPrint();
           allCategoryIds=response.jsonPath().get("id");
           categroyId=allCategoryIds.get(allCategoryIds.size()-1);
    }
    @And("user send Post Request to update Group Category")
    public void userSendPostRequestToUpdateGroupCategory() {
        payload.put("title", newTitle);
        payload.put("categoryMainType", "groupSession");
        payload.put("id", categroyId);
        response = given().header("cookie", "PHPSESSID=" + phpSessId).
                formParams(payload).post("https://test.hypnotes.net/api/settings/meeting/categoryType/updateCategoryType");
        response.prettyPrint();
    }

    @Then("user verifies response body from update request")
    public void userVerifiesResponseBodyFromUpdateRequest() {
        List<String> allMainType=response.jsonPath().get("mainType");
        String lastType = allMainType.get(allMainType.size()-1);
        Assert.assertEquals("groupSession",lastType);
        List<String> allTitle=response.jsonPath().get("title");
        String lastTitle = allTitle.get(allTitle.size()-1);
        Assert.assertEquals(newTitle,lastTitle);

    }
    @When("user send Post Request to delete Group Session")
    public void userSendPostRequestToDeleteGroupSession() {
        payload.put("id",categroyId);
        response=given().header("cookie","PHPSESSID="+ phpSessId).
                formParams(payload).post("https://test.hypnotes.net/api/settings/meeting/categoryType/deleteCategoryType");
        response.prettyPrint();

    }

    @Then("user verifies response from delete request")
    public void userVerifiesResponseFromDeleteRequest() {
        List<String> allTitle2=response.jsonPath().get("title");
        Assert.assertTrue(!allTitle2.contains(newTitle));


    }


}
