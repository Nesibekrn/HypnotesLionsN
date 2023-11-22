package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication_Fy {
    public static String cookie;
    public static String generateCookie(){

        //cookie donduren bir method
        //Payload olusturalim

        Map<String, Object> body = new HashMap<String, Object>();//login icin
        String endPoint = "https://test.hypnotes.net/api/login";
        body.put("username", "fatihfrance@gmail.com");
        body.put("password", "123456789Aa@");


        Response response = given().contentType(ContentType.JSON).body(body).when().post(endPoint);

        Map<String, String> cookiesASMap = new HashMap<>(response.getCookies());//response'un icindeki cookies leri al ve bir map'in icine koy
        for (Map.Entry<String, String> entry : cookiesASMap.entrySet()) {
            if (entry.getKey().equals("PHPSESID")) {//normale if olusturmamiza gerek yoktu fakat biz if koyduk cunku site bize iki adet token veriyor bizim ihtiyacimiz olan PHPSESID
                cookie = entry.getKey() + "=" + entry.getValue();//key=PHPSESID value=aa...  VE Bunu cookiye koy
            }
             /*
             olusturdugumuz map'i bir Entry 'e ceviriyoruz,mapKey methodlarinda sadece value'yu handle edebildigimiz icin,
             biz Entry'sini aldik ki hem key hem value degerini almis olacagiz.
             Postman de header kisminda bize PHPSESID(key)=ku....(value) bir cookie veriyor.bunu map entry sayesinde aldik
              */
        }
        return cookie;


    }
}

