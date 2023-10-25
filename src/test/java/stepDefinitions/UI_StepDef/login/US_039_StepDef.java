package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;

public class US_039_StepDef extends CommonPage {

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
    }


    @When("the user enters a valid email address {string}")
    public void theUserEntersAValidEmailAddress(String email) {
        //getLoginPage()..sendKeys(email);
    }

    @And("the user enters a valid password {string}")
    public void theUserEntersAValidPassword(String arg0) {
    }

    @And("clicks the login")
    public void clicksTheLoginButton() {
       // getLoginPage().
    }

    @Then("the user should be successfully logged in")
    public void theUserShouldBeSuccessfullyLoggedIn() {
    }

}

   // @When("user clicks on login button")
    //public void userClicksOnLoginButton() {
      //  getLoginPage().loginAsClientPage_loginButton.click();


