package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.gl.Logo;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_039_StepDef extends CommonPage {

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
    }


    @When("the user enters a valid email address {string}")
    public void theUserEntersAValidEmailAddress(String email) {
        ReusableMethods.waitFor(2);
        getLoginPage().email_login.sendKeys(email);



    }

    @And("the user enters a valid password {string}")
    public void theUserEntersAValidPassword(String password) {
        ReusableMethods.waitFor(2);
       getLoginPage().password_Login.sendKeys(password);

    }

    @And("clicks the login")
    public void clicksTheLoginButton() {
        ReusableMethods.waitFor(2);
       getLoginPage().login_button.click();
    }


        //Assert.assertTrue(getLoginPage().login_button.isDisplayed());


    @Then("the user should be successful message")
    public void theUserShouldBeSuccessfulMessage() {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(driver.getCurrentUrl(),"https://test.hypnotes.net/dashboard/calendar");
    }
    //String currentGetStarted = "https://test.hypnotes.net/register";
    //        ReusableMethods.waitFor(2);
    //        assertEquals(driver.getCurrentUrl(), currentGetStarted);
}




