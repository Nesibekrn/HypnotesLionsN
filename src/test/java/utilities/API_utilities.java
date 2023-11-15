package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_utilities {
public static String csrfToken;
public static String phpSessid;
public static String generateCsrfToken(){
    Map<String,Object> body=new HashMap<>();
    body.put("email","ftmcglr@yopmail.com");
    body.put("password","Test123456!");

    Response response=given().contentType(ContentType.JSON).body(body).post("https://test.hypnotes.net/login");
    JsonPath jsonPath=response.jsonPath();
    csrfToken=jsonPath.getString("csrfToken");
    return  csrfToken;
}

}
