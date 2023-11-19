package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Datum;
import pojos.Root;


import java.util.*;
import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;


public class US_217 {

    Response response;
    JsonPath jsonPath;

    Datum data1, data2;

    Root expectedData;


    @When("user sends POST request to get all blocked times")
    public void user_sends_post_request_to_get_all_blocked_times() {
        specFormData.pathParams("p1", "api", "p2", "hypnotherapist", "p3", "timeoff", "p4", "all");

        Map<String, Object> payloadCreate = new HashMap<>();
        payloadCreate.put("userId", "1107");
        payloadCreate.put("title", "online");

        response = given(specFormData).formParams(payloadCreate).post("{p1}/{p2}/{p3}/{p4}");
        jsonPath = response.jsonPath();
        response.prettyPrint();
        //second way with POJO class
//  // set expected data
//        ArrayList<Object> recurringDays=new ArrayList<>();
//        ArrayList<Datum> arrayOfData=new ArrayList<>();
//data1=new Datum(1472,false,"2023-11-18 15:40","2023-11-18 15:45",recurringDays,"2023-11-18T00:00:00+00:00",false,"Online");
//expectedData=new Root(true,arrayOfData );
//        response = given(specFormData).formParams(payloadCreate).post("{p1}/{p2}/{p3}/{p4}");
//        response.prettyPrint();

        jsonPath = response.jsonPath();
        Map<Object, Object> responseBody = response.as(Map.class);
        responseBody.entrySet().stream().forEach(t-> System.out.println("****"+t.getValue())

        );

        }



    @Then("user see {int} status code and response body contains status as true")
    public void user_see_status_code_and_response_body_contains_status_as_true(int statusCode) {
      Assert.assertEquals(statusCode,response.getStatusCode());
        //System.out.println(jsonPath.getBoolean("status"));
      Assert.assertTrue(jsonPath.getBoolean("status"));

      //      Assert.assertEquals(expectedData.status,jsonPath.getBoolean("status"));
    }


    @Then("the response body contains id as {string}")
    public void the_response_body_contains_id_as(String id) {
      String ExpectedId= response.path("data[0].id").toString();
        Assert.assertEquals(id, ExpectedId);
    }

    @Then("the response returns empty array")
    public void the_response_returns_empty_array() {
      //  System.out.println("size"+response.path("data[].size"));
        //Assert.assertTrue(response.path("data[].size"));
    }

}
