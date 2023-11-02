package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_044 extends CommonPage {
    @Given("a Therapist User is logged in")
    public void aTherapistUserIsLoggedIn() {
        driver.get(ConfigurationReader.getProperty("login_url"));
        getLoginPage().email_login.sendKeys(ConfigurationReader.getProperty("therapistEmail"));
        getLoginPage().password_Login.sendKeys(ConfigurationReader.getProperty("therapistPassword"));
        getLoginPage().login_button.click();
    }
    @Then("user verifies the Client button is clickable")
    public void userVerifiesTheClientButtonIsClickable() {
        Assert.assertTrue(getClientsPage().clients_button.isEnabled());

    }

    @When("user clicks on Client button")
    public void userClicksOnClientButton() {
        getClientsPage().clients_button.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user sees the Client page")
    public void userSeesTheClientPage() {
        Assert.assertEquals("https://test.hypnotes.net/dashboard/clients",driver.getCurrentUrl());

    }
}
