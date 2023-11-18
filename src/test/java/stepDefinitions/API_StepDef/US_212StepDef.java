package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;


public class US_212StepDef  {

    Response response;
    JsonPath jsonPath;
    /*
    {
    "status": true,
    "data": [
        {
            "id": 377,
            "startAt": "11-29-2023",
            "finishAt": "11-30-2023",
            "locationTitle": "Online"
        }
    ]
}
     */



    @Given("user send postRequest to add block time at dateInterval")
    public void userSendPostRequestToAddBlockTimeAtDateInterval() {



    }
}
