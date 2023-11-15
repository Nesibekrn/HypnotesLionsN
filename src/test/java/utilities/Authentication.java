package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static String csrfToken;
    public static String phpSessid;

    public static String generateCsrfToken() {
        Map<String, Object> body = new HashMap<>();
        body.put("username", "ftmcglr@yopmail.com");
        body.put("password", "Test123456!");

        Response response = given().contentType(ContentType.JSON).body(body).post("https://test.hypnotes.net/login");
        Map<String, String> cookieAsMap = new HashMap<>(response.getCookies());
        for (Map.Entry<String, String> entry : cookieAsMap.entrySet()) {
            csrfToken = entry.getKey() + "=" + entry.getValue();
        }
        return csrfToken;
    }
}
