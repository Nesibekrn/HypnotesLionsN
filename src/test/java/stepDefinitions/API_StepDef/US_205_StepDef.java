package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import com.google.gson.JsonObject;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_205_StepDef {

    String cookie;
    String PHPSESID1;
    JsonPath jsonPath;
    static int idCreated, idSon;
    Response response;
    int clientId;


    @Given("user login with post request from API")
    public void user_login_with_post_request_from_API() {
        String baseUrl = "https://test.hypnotes.net/api/login";

        Map<String, Object> payloadLogin = new HashMap<>();
        payloadLogin.put("username", "fatihfrance@yopmail.com");
        payloadLogin.put("password", "123456789Aa@");

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .body(payloadLogin)
                .post(baseUrl);


        Map<String, String> responseCookies = new HashMap<>(response.getCookies());
        for (Map.Entry<String, String> entry : responseCookies.entrySet()) {
            if (entry.getKey().equals("PHPSESSID")) {

                cookie = entry.getKey() + "=" + entry.getValue();
            }
            System.out.println("cookie=" + cookie);


        }
    }


    @Given("user creates a new client")
    public void user_creates_a_new_client() {
        String urlpost = "https://test.hypnotes.net/api/dashboard/client/add";
        Faker faker = new Faker();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();
        String email = faker.internet().emailAddress();


        Map<String, Object> payloadCreerNewClient = new HashMap<>();

        payloadCreerNewClient.put("firstName", firstname);
        payloadCreerNewClient.put("lastName", lastname);
        payloadCreerNewClient.put("email", email);
        payloadCreerNewClient.put("timezone", "Europe/Paris");



         response = given()
                 .header("cookie", cookie)
                .formParams(payloadCreerNewClient)//body yerine bunu yazdik
                .post(urlpost);

        jsonPath = response.jsonPath();
        System.out.println("response= " + response.prettyPrint());
        int clientId = response.jsonPath().getInt("clientId");
        System.out.println("clientId: " + clientId);




    }

    @Given("user verifies status and take clientId")
    public void user_verifies_status_and_take_clientId() {
        clientId = response.jsonPath().getInt("clientId");
        System.out.println("clientId: " + clientId);

        String success= response.jsonPath().getString("success");
        System.out.println("success = " + success);

    }
}




