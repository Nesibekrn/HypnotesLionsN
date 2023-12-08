package stepDefinitions.DB_StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;
import org.junit.Assert;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import static base_url.BaseUrlQuestionner.spec;
import static io.restassured.RestAssured.given;
import static utilities.API_utilities.response;
import static utilities.DB_utilities.*;
import static utilities.DB_utilities.resultSet;


public class US300 {
    public static Connection connection;
    public static Statement statement;
    public static PreparedStatement preparedStatement;
    public static ResultSet resultSet;
    private Map<String, String> expectedBody = new HashMap<>();
    Faker faker = new Faker();

    String name = faker.name().name();
    String emailAddress = faker.internet().emailAddress();
    String password = faker.internet().password();
    int UserId;

    @Given("User connects to the database")
    public void userConnectsToTheDatabase() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://212.47.242.13:6336/hypnotes",
                    "hypnotes",
                    "hypnotes"

            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @When("User signs up to the site as a therapist")
    public void userSignsUpToTheSiteAsATherapist() {

        expectedBody.put("registration_form[email]", emailAddress);
        expectedBody.put("registration_form[fullname]", name);
        expectedBody.put("registration_form[plainPassword]", password);

        response = given().
                formParams(expectedBody).
                post("https://test.hypnotes.net/api/register-api");
        response.prettyPrint();
        Assert.assertEquals(true, response.jsonPath().getBoolean("status"));
        System.out.println("email = " + emailAddress);
    }

    @Then("User verifies the new user information exists in the user table")
    public void User_verifies_the_new_user_information_exists_in_the_user_table() throws SQLException {

        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from user");

        boolean found = false;

        while (resultSet.next()) {
            String email = resultSet.getString("email");
            if (email != null && email.contains(emailAddress)) {
                found = true;
                break;
            }
        }
    }

    @Then("User verifies that its role is therapist in the user table")
    public void userVerifiesTheNewUserInformationExistsInTheUserTable() throws SQLException {

        String query = "select * from user where email=?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, emailAddress);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            Assert.assertTrue(resultSet.getString("roles").contains("ROLE_HYPNOTHERAPIST"));
            Assert.assertNotNull(resultSet.getString("fullname"));
            Assert.assertNotNull(resultSet.getString("password"));
            Assert.assertNotNull(resultSet.getString("id"));
            Assert.assertNotNull(resultSet.getString("created"));

        }
    }
}
