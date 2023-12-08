package stepDefinitions.DB_StepDef;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.response;
import static utilities.DB_utilities.*;

public class US_304 {
    Response response;
    static String phpSessId ;
    private Map<String, Object> reqBody = new HashMap<>();
    int idEdu;

    @Given("user login the website as a therapist")
    public void user_login_the_website_as_a_therapist() {
        reqBody.put("username", "threapistlions@yopmail.com");
        reqBody.put("password", "Test123.");

        response = given().body(reqBody).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();
        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));
        phpSessId = response.cookie("PHPSESSID");
        System.out.println("phpSessId = " + phpSessId);
    }

    @When("user sends post request request to add new education")
    public void user_sends_post_request_request_to_add_new_education() {


        reqBody.put("schoolName","Algonquin College");
        reqBody.put("department","Accounting");
        reqBody.put("startedAt","Thu, 06 Jan 2022 21:00:12 GMT");
        reqBody.put("enddedAt","Sat, 19 Aug 2023 20:00:23 GMT");
        response=given()
                .contentType(ContentType.URLENC)
                .header("cookie",  "PHPSESSID=" +phpSessId )
                .formParams(reqBody).post("https://test.hypnotes.net/api/profile/addEducation");
        response.prettyPrint();
        idEdu=response.jsonPath().getInt("education.id");
        System.out.println("EducationID = " + idEdu);
    }
    @Then("user find the new education")
    public void user_find_the_new_education() throws SQLException {
        statement=connection.createStatement();
        resultSet =statement.executeQuery("select * from education order by id desc limit 1");
        resultSet.next();
    }
    @Then("user validate the data from database")
    public void user_validate_the_data_from_database() throws SQLException {
        Assert.assertEquals(idEdu,resultSet.getInt(1));

    }
    @Then("user delete new education from the api")
    public void user_delete_new_education_from_the_api() {
        reqBody.put("educationId", idEdu);
        response=given().
                header("cookie","PHPSESSID=" + phpSessId).
                formParams(reqBody).
                post("https://test.hypnotes.net/api/profile/removeEducation");
        response.prettyPrint();
    }
}


