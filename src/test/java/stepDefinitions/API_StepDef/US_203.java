package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.API_utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.phpSessId;
import static utilities.API_utilities.response;

public class US_203 {
    @Given("user get token with ApiUtilities")
    public void userGetTokenWithApiUtilities() {
        API_utilities.login("threapistlions@yopmail.com","Test123.");

    }
    @When("user send request to get all client info")
    public void userSendRequestToGetAllClientInfo() {
        response=given()
                .header("cookie","PHPSESSID="+ phpSessId)
                .post("https://test.hypnotes.net/api/dashboard/getClientBasicInfo");
        response.prettyPrint();

    }



    @Then("user verifies response body")
    public void userVerifiesResponseBody() {
        Assert.assertEquals("true",response.jsonPath().getString("success"));
        List<String> list= new ArrayList<>();
        list.add("isPhoneVerified");
        list.add("clientId");
        list.add("clientInfosName");
        list.add("clientInfosSurname");
        list.add("clientInfosEmail");
        list.add("clientInfosTimeZone");
       List<Map<String,Object>> responseMap=response.jsonPath().get("ClientInfo");
        System.out.println(responseMap.get(0).keySet());
        for (int i = 0; i < list.size(); i++) {
            Assert.assertTrue(responseMap.get(0).keySet().contains(list.get(i)));

        }


    }
}
