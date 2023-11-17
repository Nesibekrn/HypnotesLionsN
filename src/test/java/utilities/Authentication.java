package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static String phpSessid;
    public static String cookie;

    public static String generatePhpSessid() {
        Map<String, Object> body = new HashMap<>();
        body.put("username", "ftmcglr@yopmail.com");
        body.put("password", "Test123456!");
        Response response = given().contentType(ContentType.JSON).body(body).post("https://test.hypnotes.net/api/login");
        cookie = "PHPSESSID="+response.cookies().get("PHPSESSID");
        System.out.println("phpSessid = " + phpSessid);
        response.prettyPrint();
       /* Map<String, String> cookieAsMap = new HashMap<>(response.getCookies());
        for (Map.Entry<String, String> entry : cookieAsMap.entrySet()) {
            if (entry.getKey().equals("PHPSESSID")) {
                cookie = entry.getKey() + "=" + entry.getValue();
            }
        }*/
        return cookie;
    }
}
