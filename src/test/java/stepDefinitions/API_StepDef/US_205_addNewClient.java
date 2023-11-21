package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static baseUrl.baseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.API_StepDef.Authentication_Fy.generateCookie;

public class US_205_addNewClient {
    Response response;
    JSONObject requestBody;


    @Given("kullanici API istegi gonderir create client")
    public void kullaniciAPIIstegiGonderirCreateClient() {//request hazirla

        requestBody.put("firstname", "senih");
        requestBody.put("lastname", "yilmaz");
        requestBody.put("email", "senih@gmail.com");
        requestBody.put("timezone", "Europe/Paris");
    }


    @Then("response alir")
    public void responsealir(int statusCode) {
        spec.pathParams("first","api","second","dashboard","third","client","fourth","add");//end point'imizi spec objesi uzerinden belirttik,ayrica key'lere verdigimiz isimlerin cok bir anlamai yok

        //request gonderip response elde etmek, request given ile gonderilir
         response = given(spec)//given 'in icerisine spec objemizi koyduk  // response'umuzu yukarda tanimladik sonraki adimlarda kullanabilmek amaciyla
                .body(requestBody.toString())
                .when() //buraya content type eklemedik cunku zaten spec objemizin icinde olusturduk
                .post("{first}/{second}/{third}");//28.satirda ekledigimiz key isimlerini burda cagiriyoruz, ve burasi artik bizim end pointimiz olmus oluyor

              response.prettyPrint();
    }

    @Then("status cod assert edilir")
    public void statuscodassertedilir() {//assert yap
        int gercekDurumKodu = response.getStatusCode();
        assertEquals("Beklenen HTTP durum kodu: " + 200 + ", Gerçek durum kodu: " + gercekDurumKodu, 200, gercekDurumKodu);


    }


}

