package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;
//import static utilities.API_utilities.phpSessId;
import static utilities.API_utilities.response;
import static utilities.Authentication.cookie;
import static utilities.Authentication.phpSessid;

public class US_218 {
    Response response;
    static int idCreated,idSon;
    JsonPath jsonPath;
    String expectStartAt;
    String expectFinishAt;
    Faker faker = new Faker();
    String locationTitle;

    @When("user sends Post request to add block times")
    public void userSendsPostRequestToAddBlockTimes() {
        specFormData.pathParams("p1", "api", "p2", "hypnotherapist", "p3", "timeoff", "p4", "create");
        expectStartAt = "2023-11-18 16:40";
        expectFinishAt = "2023-11-18 16:45";
        Map<String, Object> payloadCreate = new HashMap<>();
        payloadCreate.put("specificDate","2023-11-18 ");
        payloadCreate.put("startAt", expectStartAt);
        payloadCreate.put("finishAt", expectFinishAt);
        payloadCreate.put("isRecurring", false);
        payloadCreate.put("isAllDay", false);
        payloadCreate.put("title", "Online");
        payloadCreate.put("isAll", false);

        response = given(specFormData).formParams(payloadCreate).post("{p1}/{p2}/{p3}/{p4}");
        jsonPath = response.jsonPath();
        response.prettyPrint();
        idCreated = (Integer) jsonPath.getList("data.id").get(0);
        idSon=(int)jsonPath.getList("data.id").get(0);
        locationTitle = (jsonPath.getList("data.locationTitle").get(0)).toString();
        System.out.println("locationTitle = " + locationTitle);//jsonPath.getInt("data[0].id");
        System.out.println("id = " + idCreated);

    }

    @When("user sends Post request to update block times")
    public void userSendsPostRequestToUpdateBlockTimes() {
        //Set the URL
        specFormData.pathParams("first", "api", "second", "hypnotherapist", "third", "timeoff", "fourth", "update");
        // Set the expected Data
        expectStartAt = "2023-11-17 20:30";
        expectFinishAt = "2023-11-17 21:00";
        Map<String, Object> payloadUpdate = new HashMap<>();
        payloadUpdate.put("id", idCreated);
        payloadUpdate.put("specificDate", "2023-11-17");
        payloadUpdate.put("isRecurring", false);
        payloadUpdate.put("startAt", expectStartAt);
        payloadUpdate.put("finishAt", expectFinishAt);
        payloadUpdate.put("isAllDay", false);

        response = given(specFormData).formParams(payloadUpdate).post("{first}/{second}/{third}/{fourth}");
        jsonPath = response.jsonPath();
        response.prettyPrint();
    }

    @Then("user validates the response")
    public void userValidatesTheResponse() {
        Assert.assertTrue(response.jsonPath().getBoolean("status"));
        Assert.assertTrue(response.headers().getValue("Content-Type").equals("application/json"));
        Assert.assertEquals(expectStartAt, jsonPath.getList("data.startAt").get(0));
        Assert.assertEquals(expectFinishAt, jsonPath.getList("data.finishAt").get(0));
       // Assert.assertEquals("Online", locationTitle);
         /* Assert.assertTrue(response.prettyPrint().contains("isAllDay"));
          Assert.assertTrue(response.prettyPrint().contains("locationTitle"));
          Assert.assertTrue(response.prettyPrint().contains("specificDate"));
          Assert.assertTrue(response.prettyPrint().contains("data"));*/
        Assert.assertTrue(jsonPath.getString("data").contains("specificDate"));
        Assert.assertTrue(jsonPath.getString("data").contains("isAllDay"));
        Assert.assertTrue(jsonPath.getString("data").contains("locationTitle"));
        Assert.assertTrue(jsonPath.getList("data").get(0).toString().contains("id"));
        Assert.assertTrue(jsonPath.getList("data").get(0).toString().contains("isRecurring"));
    }

    @Then("user validates the response for delete")
    public void userValidatesTheResponseForDelete() {
        Assert.assertTrue(response.jsonPath().getBoolean("status"));
        Assert.assertTrue(response.headers().getValue("Content-Type").equals("application/json"));
    } @Then("user validates the response for all block times")
    public void userValidatesTheResponseForAllBlockTimes() {
        Assert.assertTrue(response.jsonPath().getBoolean("status"));
        Assert.assertTrue(response.headers().getValue("Content-Type").equals("application/json"));
    }

    @When("user sends Post request to delete block times")
    public void userSendsPostRequestToDeleteBlockTimes() {
        specFormData.pathParams("first", "api", "second", "hypnotherapist", "third", "timeoff", "fourth", "delete");
        Map<String, Object> payloadDelete = new HashMap<>();
        payloadDelete.put("id", idCreated);
        response = given(specFormData).formParams(payloadDelete).post("{first}/{second}/{third}/{fourth}");
        response.prettyPrint();
    }

    @When("user sends Post request to all block times")
    public void userSendsPostRequestToAllBlockTimes() {
        specFormData.pathParams("first", "api", "second", "hypnotherapist", "third", "timeoff", "fourth", "all");
        Map<String, Object> payloadAll = new HashMap<>();
        payloadAll.put("title", "Online");
        response = given(specFormData).formParams(payloadAll).post("{first}/{second}/{third}/{fourth}");
        response.prettyPrint();
    }
}
