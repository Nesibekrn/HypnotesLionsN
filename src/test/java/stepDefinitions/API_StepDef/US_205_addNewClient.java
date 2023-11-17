package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;
import pages.CommonPage;

import static io.restassured.RestAssured.given;

public class US_205_addNewClient  {
    private String baseUrl = "https://test.hypnotes.net/api/dashboard/client/add";
    private Response response;

    @Given("endpoint")
    public void givenApiEndpoint() {
        String baseUrl="https://test.hypnotes.net/api/dashboard/client/add";
    }

    @When("add new client POST API")
    public void whenUserSendsPostRequest() {
        RequestSpecification request = RestAssured.given();
        request.header("accept", "application/json");
        request.header("Content-Type", "multipart/form-data");

        // Curl komutundan gelen parametreleri burada kullanabilirsiniz
        response = request
                .multiPart("firstName", "ali")
                .multiPart("lastName", "yildirim")
                .multiPart("timeZone", "Europe/Paris ")
                .post(baseUrl);
    }

    @Then("assert response statuscode")
    public void thenVerifyResponseStatus() {
        Assert.assertEquals(200, response.getStatusCode());  // Bu durum kodu API'nin başarılı bir yanıt döndüğünü varsayar
    }

    @Then("assert responseBody")
    public void thenVerifyResponseContent() {
        String responseBody = response.getBody().asString();
        // Burada API'nin döndüğü yanıtın içeriğini kontrol edebilirsiniz
        Assert.assertTrue(responseBody.contains("ali"));
        Assert.assertTrue(responseBody.contains("yildirim"));
        Assert.assertTrue(responseBody.contains("Eastern Standard Time"));
    }
}

