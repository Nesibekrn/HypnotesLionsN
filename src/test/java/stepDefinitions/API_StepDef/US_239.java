package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import enums.Enum_Fy;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.API_utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.*;

public class US_239 {
    Faker faker=new Faker();
    String name=faker.name().firstName();
    String lastName=faker.name().lastName();
    String email=faker.internet().emailAddress();
    Map<String,Object> payload1=new HashMap<>();
List<Integer> clientIdList=new ArrayList<>();
int clientId;
    @Given("the user takes token from login  api")
    public void the_user_takes_token_from_login_api() {
        API_utilities.loginWithEnum(Enum_Fy.THERAPIST_2);
    }

    @Given("user adds a client with api\\/dashboard\\/client\\/add")
    public void user_adds_a_client_with_api_dashboard_client_add() {
        payload1.put("firstName",name);
        payload1.put("lastName",lastName);
        payload1.put("email",email);
        payload1.put("timeZone","America/New_York");

        response=given().
                header("cookie","PHPSESSID=" + phpSessId).
                formParams(payload1).
                post("https://test.hypnotes.net/api/dashboard/client/add");
        response.prettyPrint();
        clientId=response.path("client.id");

        System.out.println("clentId"+clientId);

    }
    @Given("the user sends a valid endpoint for api\\/dashboard\\/client\\/delete")
    public void the_user_sends_a_valid_endpoint_for_api_dashboard_client_delete() {
        payload.put("clientId",clientId);
        response=given().
                header("cookie","PHPSESSID=" + phpSessId).
                formParams(payload).
                post("https://test.hypnotes.net/api/dashboard/client/delete");
        response.prettyPrint();

    }
    @Given("the user verifies that the client is deleted")
    public void the_user_verifies_that_the_client_is_deleted() {
        Assert.assertTrue(response.jsonPath().getBoolean("success"));
    }
    @Given("the  status code is {int} success")
    public void the_status_code_is_success(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());
    }

}
