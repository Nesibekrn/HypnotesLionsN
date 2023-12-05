package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import enums.Enum_Fy;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

import static utilities.API_utilities.*;

public class Client_API {
    public void createClientString() {
        API api = new API(Enum_Fy.THERAPIST_2);
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress().toLowerCase();

        response = given()
                .contentType(ContentType.URLENC)
                .header("cookie", "PHPSESSID=" + phpSessId)
                .body(
                        "firstName=" + firstName +
                                "&lastName=" + lastName +
                                "&email=" + email +
                                "&timezone=Europe/London"
                )
                .post("/dashboard/client/add");


    }

    public PCreateClientInfo createClient() {
        API api = new API(Enum_Fy.THERAPIST_2);
        Faker faker = new Faker();


        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress().toLowerCase();
        Map<String, String> mapBody = new HashMap<>();
        mapBody.put("firstName", firstName);
        mapBody.put("lastName", lastName);
        mapBody.put("email", email);
        mapBody.put("timezone", "Europe/London");

        response = given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .formParams(mapBody)
                .post("/dashboard/client/add");
        JsonPath jsonPath = response.jsonPath();
        response.prettyPrint();



        return new PCreateClientInfo(
                jsonPath.getBoolean("success"),
                jsonPath.getInt("client.id"),
                jsonPath.getString("client.email"),
                jsonPath.getList("client.roles"),
                response.statusCode()
        );

    }


    public void updateClient() {
        API api = new API(Enum_Fy.THERAPIST_2);
        Faker faker = new Faker();
        int clientID;



        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress().toLowerCase();
        Map<String, String> mapBody = new HashMap<>();
        mapBody.put("firstName", firstName);
        mapBody.put("lastName", lastName);
        mapBody.put("email", email);
        mapBody.put("timezone", "Europe/London");

        response = given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .formParams(mapBody)
                .post("/dashboard/client/update");
        JsonPath jsonPath = response.jsonPath();
        response.prettyPrint();

        clientID=response.jsonPath().getInt("client.id");






    }


    public record PCreateClientInfo(boolean isSuccessTrue, int createdClientId, String email, List<String> clientsRole,
                                    int statusCode) {
    }


}

