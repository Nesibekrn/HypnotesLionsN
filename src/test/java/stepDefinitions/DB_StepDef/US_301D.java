package stepDefinitions.DB_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class US_301D {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("the user connect to the database")
    public void theUserConnectToTheDatabase() {
        String url = "jdbc:mysql://212.47.242.13:6336/hypnotes";
        String username = "hypnotes";
        String password = "hypnotes";

        try {
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to Hypnotes Database");

            statement = connection.createStatement();
            String query = "select * from `client` order by id desc limit 1";
            resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int userID = resultSet.getInt("id");
                String email = resultSet.getString("email");
                System.out.println("ID" + userID + "Email" + email);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @When("the user get client which has created lastly")
    public void theUserGetClientWhichHasCreatedLastly() {


    }
    @Then("the user verifies the last client is the same with database")
    public void theUserVerifiesTheLastClientIsTheSameWithDatabase() {
    }
}
