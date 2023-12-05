package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import static base_url.HypnotesBaseUrl.specFormData;
import static io.restassured.RestAssured.given;

public class US_237 {
    Response response;
    JsonPath jsonPath;
    private int clientId;
    Map<String, Object> payload = new HashMap<>();
    private String firstName = Faker.instance().name().firstName();
    private String newFirstName = Faker.instance().name().firstName();
    private String lastName = Faker.instance().name().lastName();
    private String newLastName = Faker.instance().name().lastName();
    private String email = Faker.instance().internet().emailAddress();
    private String timeZone = "Turkey Standard Time";

    @When("user sends Post request to add new client")
    public void user_sends_post_request_to_add_new_client() {
        specFormData.pathParams("p1", "api", "p2", "dashboard", "p3", "client", "p4", "add");
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);
        payload.put("timezone", timeZone);
        response = given(specFormData).formParams(payload).post("{p1},{p2},{p3},{p4}");
        jsonPath = response.jsonPath();
        response.prettyPrint();
        System.out.println("jsonPath = " + jsonPath.getInt("client.id"));
        clientId = jsonPath.getInt("client.id");
    }

    @Then("user validates the response for add new client")
    public void user_validates_the_response_for_add_new_client() {
        Assert.assertTrue(jsonPath.getBoolean("success"));
        Assert.assertEquals(email, jsonPath.getString("client.email"));
        Assert.assertEquals(firstName, jsonPath.getString("client.name"));
        Assert.assertEquals(lastName, jsonPath.getString("client.surname"));
        Assert.assertEquals(timeZone, jsonPath.getString("client.clientInfos.id[0]"));
    }

    @Then("user sends a request for getting all info therapist client")
    public void user_sends_a_request_for_getting_all_info_therapist_client() {
        specFormData.pathParams("p1", "api", "p2", "dashboard", "p3", "getClientBasicInfo");//https://test.hypnotes.net/api/dashboard/getClientBasicInfo
        response = given(specFormData).post("{p1}/{p2}/{p3}");
        jsonPath = response.jsonPath();
        response.prettyPrint();
    }

    @Then("user verifies success is true for get all info for  client")
    public void user_verifies_success_is_true_for_get_all_info_for_client() {
        Assert.assertTrue(jsonPath.getBoolean("success"));
    }

    @Then("user verifies that response is as expected for get all info therapist client")
    public void user_verifies_that_response_is_as_expected_for_get_all_info_therapist_client() {
        Assert.assertTrue(jsonPath.getList("ClientInfo").get(0).toString().contains("clientInfosName"));
        Assert.assertTrue(jsonPath.getList("ClientInfo").get(0).toString().contains("clientInfosSurname"));
        Assert.assertTrue(jsonPath.getList("ClientInfo").get(0).toString().contains("clientInfosEmail"));
    }

    @Then("user sends Post request to updating added any client on therapist client Api section")
    public void user_sends_post_request_to_updating_added_any_client_on_therapist_client_api_section() {
        specFormData.pathParams("p1", "api", "p2", "dashboard", "p3", "client", "p4", "update");
        payload.put("firstName", newFirstName);
        payload.put("lastName", newLastName);
        payload.put("gender", "Male");
        payload.put("country", "United Kingdom");
        payload.put("clientId", clientId);
        response = given(specFormData).formParams(payload).post("{p1},{p2},{p3},{p4}");
        jsonPath = response.jsonPath();
        Assert.assertTrue(jsonPath.getBoolean("success"));
    }

    @Then("user sends Post request to delete client")
    public void user_sends_post_request_to_delete_client() {
        specFormData.pathParams("p1", "api", "p2", "dashboard", "p3", "client", "p4", "delete");
        payload.put("clientId", clientId);
        response=given(specFormData).formParams(payload).post("{p1},{p2},{p3},{p4}");
        jsonPath=response.jsonPath();
    }

    @Then("user verifies the response for delete client")
    public void user_verifies_the_response_for_delete_client() {
        Assert.assertTrue(jsonPath.getBoolean("success"));
        Assert.assertTrue(jsonPath.getString("descr").contains("Client deleted"));
        Assert.assertEquals("Client deleted",jsonPath.getString("descr"));
    }
    public static Connection connection;
    public static Statement statement;
    public static PreparedStatement preparedStatement;
    public static ResultSet resultSet;
    public void getConnection() {
        try {
            connection= DriverManager.getConnection("jdbc:mysql://212.47.242.13.6336/hypnotes",
                    "hypnotes",
                    "hypnotes");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void testClient () throws SQLException{
        getConnection();
        statement= connection.createStatement();
        resultSet=statement.executeQuery("select * from user order by id desc limit 1");
        while (resultSet.next()){
            System.out.println("resultSet.getInt(1) = " + resultSet.getInt(1));
            System.out.println("resultSet.getString(2) = " + resultSet.getString(2));
        }

    }
}
