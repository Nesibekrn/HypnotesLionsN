package utilities;

import enums.Enum_Fy;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Before;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_utilities {
public static Response response;

public static String phpSessId;
public static String csrfToken;
static  Map<String,Object> payload=new HashMap<>();

public static String login(String email, String password){
    payload.put("username",email);
    payload.put("password",password);

    response=given().body(payload).post("https://test.hypnotes.net/api/login");
    Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));

    response.prettyPrint();

    phpSessId=response.cookies().get("PHPSESSID");
    csrfToken=response.cookies().get("csrfToken");

    System.out.println("phpSessId = " + phpSessId);
    System.out.println("csrf token:"+ csrfToken);

    return phpSessId;
}

    public static String loginWithEnum(Enum_Fy user){
        payload.put("username",user.getUsername());
        payload.put("password",user.getPassword());

        response=given()
                .body(payload)
                .post("https://test.hypnotes.net/api/login");
        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));

        response.prettyPrint();

        phpSessId=response.cookies().get("PHPSESSID");

        System.out.println("phpSessId = " + phpSessId);

        return phpSessId;
    }



}
