package stepDefinitions.API_StepDef;

import com.google.gson.JsonObject;
import io.cucumber.java.en.Given;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_205_StepDef {

    String cookie;
    String PHPSESID1;


    @Given("kullanici login olur ve token alir")
    public void kullanici_login_olur_ve_token_alir() {
        String baseUrl = "https://test.hypnotes.net/api/login";

        Map<String, Object> payloadLogin = new HashMap<>();
        payloadLogin.put("username", "fatihfrance@yopmail.com");
        payloadLogin.put("password", "123456789Aa@");

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .body(payloadLogin.toString())
                .post(baseUrl);
        //String PHPSESID =response.cookies().get("PHPSESID");
      // String PHPSESID1=PHPSESID;


        Map<String, String> responseCookies = new HashMap<>(response.getCookies());
        for (Map.Entry<String, String> entry : responseCookies.entrySet()) {
            if (entry.getKey().equals("PHPSESSID")) {

                cookie = entry.getValue();
            }
            System.out.println("cookie=" +cookie);


        }
    }


    @Given("kullanici musteri ekler")
    public void kullanici_musteri_ekler() {
        String urlpost="https://test.hypnotes.net/api/dashboard/client/add";
        EncoderConfig encoderConfig = new EncoderConfig().encodeContentTypeAs("application/x-www-form-urlencoded", ContentType.TEXT);


        Map<String,Object>payloadCreerNewClient =new HashMap<>();

        payloadCreerNewClient.put("firstname==", "senih");
        payloadCreerNewClient.put("lastname", "yilmaz");
        payloadCreerNewClient.put("email=", "senih@gmail.com");
        payloadCreerNewClient.put("timezone=", "Europe/Paris");

        Response response = given()
                .contentType(ContentType.URLENC)
                .header("cookie","PHPSESID=" +cookie)
                .formParams(payloadCreerNewClient)//body yerine bunu yazdik
                .post(urlpost);



        System.out.println("Response Status: " + response.getStatusCode());

        System.out.println("Response Body: " + response.getBody().asString());









    }

    @Given("donen cevabda assert islemleri yapar")
    public void donen_cevabda_assert_islemleri_yapar() {

    }
}




