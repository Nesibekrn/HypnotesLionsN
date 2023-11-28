package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.MultiPartSpecification;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pages.CommonPage;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_228 {
    Response response;
    JsonPath jsonPath;

    Map<String, Object> payload = new HashMap<>();
    static String phpSessId ;
    Faker faker = new Faker();
    String packageName = faker.name().fullName();
    @When("the user sends POST request to api\\/settings\\/meeting\\/category\\/add")
    public void the_user_sends_post_request_to_api_settings_meeting_category_add() {
        payload.put("title",packageName);
        payload.put("meetingType","standartMeeting");
        payload.put("price",5);
        payload.put("duration",2);
        payload.put("blockBefore",1);
        payload.put("blockAfter",1);
        payload.put("bufferTime",2);
        payload.put("showPrice",1);
        payload.put("paymentRequired",1);
        payload.put("bookable",1);
        payload.put("documents",303);
        payload.put("online",true);
        payload.put("locationInfos",261);
        payload.put("totalSessions",1);
        payload.put("sessionInterval",1);
        payload.put("description","deneme");
        payload.put("categoryTypeId",1523);
        payload.put("locationInfos[]",261);
        payload.put("documents[]",303);

                response=given()
                .headers("cookie","PHPSESSID="+phpSessId)
                        .formParams(payload)
                .post("https://test.hypnotes.net/api/settings/meeting/categoryType/addCategoryType");
        response.prettyPrint();

    }
    @Then("the  {int} status code is returned for api\\/settings\\/meeting\\/category\\/add")
    public void the_status_code_is_returned_for_api_settings_meeting_category_add(int int1) {
        Assert.assertEquals(int1,response.getStatusCode());
    }

}
