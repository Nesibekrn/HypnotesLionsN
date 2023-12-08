package stepDefinitions.API_StepDef;

import enums.Enum_Fy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import utilities.API_utilities;
import utilities.ConfigurationReader;


import static io.restassured.RestAssured.given;
import static utilities.API_utilities.phpSessId;
import static utilities.API_utilities.response;

public class US_202 {

    @Given("user should be able access as therapist")
    public void userShouldBeAbleAccessAsTherapist() {
        API_utilities.loginWithEnum(Enum_Fy.GUL);

    }

    @When("user send get request for all report")
    public void userSendGetRequestForAllReport() {
        response = given()
                .contentType(ContentType.URLENC)
                .header("cookie", "PHPSESSID=" + phpSessId)
                .post("https://test.hypnotes.net/api/dashboard/getAllReport");
        response.prettyPrint();

    }

    @Then("user assert body")
    public void userAssertBody() {
       
        JsonPath jsonPath = response.jsonPath();
        String actueluserName = jsonPath.getString("allUserReport.userName");
        String actueluserType = jsonPath.getString("type");
        String actueluserId = jsonPath.getString("allUserReport.userId");

        //Assert.assertTrue(jsonPath.getBoolean("authenticated"));

        Assert.assertTrue(actueluserName.contains(ConfigurationReader.getProperty("userName")));
        actueluserId.contains("1055");
        //Assert.assertEquals("therapist", actueluserType);
        Assert.assertEquals(200, response.getStatusCode());


    }


}

