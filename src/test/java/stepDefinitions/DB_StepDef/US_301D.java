package stepDefinitions.DB_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import junit.framework.TestCase;
import org.junit.Assert;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_301D {
    Response responseD;
    Map<String,Object> payloadD=new HashMap<>();
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    Faker faker =new Faker();

    String emailD = "creigrusejega-7689@yopmail.com";

    @Given("the user register to the system")
    public void theUserRegisterToTheSystem() {
        payloadD.put("client_registration_form[email]",emailD);
        payloadD.put("client_registration_form[surname]",faker.name().lastName());
        payloadD.put("client_registration_form[name]",faker.name().firstName());
        payloadD.put("client_registration_form[plainPassword]","Test123.");

        responseD=given().formParams(payloadD)
                .post("https://test.hypnotes.net/api/register/client-api");

        Assert.assertTrue(responseD.jsonPath().getBoolean("status"));
    }
    @Given("the user connect to the database")
    public void theUserConnectToTheDatabase() throws SQLException {
        String url = "jdbc:mysql://212.47.242.13:6336/hypnotes";
        String username = "hypnotes";
        String password = "hypnotes";


            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to Hypnotes Database");

            statement = connection.createStatement();
            String query = "select * from `client` order by id desc limit 1";
            resultSet = statement.executeQuery(query);
            resultSet.next();

        }




    @Then("the user verifies the last client is the same with database")
    public void theUserVerifiesTheLastClientIsTheSameWithDatabase() throws SQLException {
        String email = resultSet.getString(2);
        System.out.println(email);
        Assert.assertEquals(emailD,email);
    }


}
