package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_039_StepDef extends CommonPage {

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
    }


    @When("the user enters a valid email address {string}")
    public void theUserEntersAValidEmailAddress(String email) {
        getLoginPage().email_login.sendKeys(email);
        //getLoginPage().email_login.sendKeys("user1@gmail.com");

    }

    @And("the user enters a valid password {string}")
    public void theUserEntersAValidPassword(String password) {
        getLoginPage().password_Login.sendKeys(password);
       // getLoginPage().password_Login.sendKeys( "user1Passsword");
    }

    @And("clicks the login")
    public void clicksTheLoginButton() {
       getLoginPage().login_button.click();
    }

    @Then("the user should be successfully logged in")
    public void theUserShouldBeSuccessfullyLoggedIn() {
        //Assert.assertTrue
    }

}




