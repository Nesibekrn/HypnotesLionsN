package stepDefinitions.API_StepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;
public class US_212StepDef  {

    Response response;
    JsonPath jsonPath;
    Map<String, Object> payload = new HashMap<>();
    static String phpSessId ;
    static Integer dateIntervalID;
    static  List<Integer> intervalDateBlockID= new ArrayList<>();

    @Given("user take token from api")
    public void user_take_token_from_api() {
        payload.put("username","test_trpst_basic@yopmail.com");
        payload.put("password","Trpst13.");
        response=given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();
        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
        phpSessId=response.cookie("PHPSESSID");
      //  System.out.println("phpSessId = " + phpSessId);

    }
    @Then("user creates a date interval time from Api")
    public void user_creates_a_date_interval_time_from_api() {
        payload.put("startAt","12-28-2023");
        payload.put("finishAt","12-29-2023");
        payload.put("title","Online");
        payload.put("isAll",false);
        response=given()
                .header("cookie","PHPSESSID="+phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/hypnotherapist/timeoff-period/create");
        response.prettyPrint();
        dateIntervalID=response.jsonPath().getInt("data[0].id");
       // System.out.println("dateIntervalID = " + dateIntervalID);


    }
    @Then("user verifies status is True")
    public void user_verifies_status_is_true() {
        Assert.assertTrue(response.jsonPath().getBoolean("status"));

    }
    @Then("user verifies that response is expected")
    public void user_verifies_that_response_is_expected() {
        Assert.assertEquals("12-28-2023",response.jsonPath().getString("data[0].startAt"));
        Assert.assertEquals("12-29-2023",response.jsonPath().getString("data[0].finishAt"));
        Assert.assertEquals("Online",response.jsonPath().getString("data[0].locationTitle"));


    }


}
