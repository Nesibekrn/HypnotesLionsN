package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static baseUrl.baseUrl_fy.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_205_addNewClient {
    Response response;
    //JSONObject payload; // TODO: 21.11.2023 bunu map e at
    Map<String,Object>payload =new HashMap<>();


    @Given("kullanici API istegi gonderir create client")
    public void kullaniciAPIIstegiGonderirCreateClient() {//request hazirla
       //spec.pathParams("1","api","2","dashboard","3","client","4","add");//end point'imizi spec objesi uzerinden belirttik,ayrica key'lere verdigimiz isimlerin cok bir anlamai yok


        payload.put("firstname", "senih");
        payload.put("lastname", "yilmaz");
        payload.put("email", "senih@gmail.com");
        payload.put("timezone", "Europe/Paris");
        response = given().spec(spec)//given 'in icerisine spec objemizi koyduk  // response'umuzu yukarda tanimladik sonraki adimlarda kullanabilmek amaciyla
                .body(payload.toString())
                .when() //buraya content type eklemedik cunku zaten spec objemizin icinde olusturduk
                .post("https://test.hypnotes.net/api/dashboard/client/add");//28.satirda ekledigimiz key isimlerini burda cagiriyoruz, ve burasi artik bizim end pointimiz olmus oluyor

        response.prettyPrint();
        //https://test.hypnotes.net/api/dashboard/client/add

    }


    @Then("response alir")
    public void responsealir(int statusCode) {
        String clientId=response.jsonPath().getJsonObject("clientId");
        System.out.println("clientId = " + clientId);

        //request gonderip response elde etmek, request given ile gonderilir

    }

    @Then("status cod assert edilir")
    public void statuscodassertedilir() {//assert yap
        int gercekDurumKodu = response.getStatusCode();
        assertEquals("Beklenen HTTP durum kodu: " + 200 + ", Gerçek durum kodu: " + gercekDurumKodu, 200, gercekDurumKodu);


    }


}

