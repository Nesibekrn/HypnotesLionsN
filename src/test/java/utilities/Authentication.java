package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {
    // public static String csrfToken;
    public static String phpSessid;
    static Response response;
    static Map<String, Object> body = new HashMap<>();

    public static String generatePhpSessid() {
        body.put("username", "ftmcglr@yopmail.com");
        body.put("password", "Test123456!");
        response = given().body(body).post("https://hypnotes.net/api/login");
        phpSessid = response.cookies().get("PHPSESSID");
        System.out.println("phpSessid = " + phpSessid);
        response.prettyPrint();
        return phpSessid;
    }
}
