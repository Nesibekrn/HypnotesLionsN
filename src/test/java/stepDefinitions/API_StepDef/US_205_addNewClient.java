package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import static base_url.baseUrl_fy.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_205_addNewClient {
    Response response;
    JsonPath jsonPath;
    Integer idCreated,idSon;
String phpSessionId;



    @Given("kullanici API istegi gonderir create client")
    public void kullaniciAPIIstegiGonderirCreateClient() {//request hazirla
        phpSessionId = RestAssured.given()
                .get("https://test.hypnotes.net")
                .getDetailedCookies()
                .get("PHPSESSID")
                .getValue();

        //spec.pathParams("p1","api","p2","dashboard","p3","client","p4","add");//end point'imizi spec objesi uzerinden belirttik,ayrica key'lere verdigimiz isimlerin cok bir anlamai yok
        Map<String,Object>payload =new HashMap<>();

        payload.put("firstname", "senih");
        payload.put("lastname", "yilmaz");
        payload.put("email", "senih@gmail.com");
        payload.put("timezone", "Europe/Paris");


        response = given(spec) //given 'in icerisine spec objemizi koyduk  // response'umuzu yukarda tanimladik sonraki adimlarda kullanabilmek amaciyla
                .formParams(payload)
                 // .when() //buraya content type eklemedik cunku zaten spec objemizin icinde olusturduk
                .post("https://test.hypnotes.net/api/dashboard/client/add");//28.satirda ekledigimiz key isimlerini burda cagiriyoruz, ve burasi artik bizim end pointimiz olmus oluyor

        jsonPath = response.jsonPath();
        response.prettyPrint();




        //https://test.hypnotes.net/api/dashboard/client/add
        /*
        "status": true,
    "data": [
        {
            "id": 1589,
            "isRecurring": false,
            "startAt": "2023-11-18 16:40",
            "finishAt": "2023-11-18 16:45",
            "recurringDays": [

            ],
            "specificDate": "2023-11-18T00:00:00+00:00",
            "isAllDay": false,
            "locationTitle": "Online"
        }
    ]
}
locationTitle = Online
id = 1589
         */

    }




    @Then("status cod assert edilir")
    public void statuscodassertedilir() {//assert yap
        int gercekDurumKodu = response.getStatusCode();
        System.out.println(gercekDurumKodu);

    }


}

