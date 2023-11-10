package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import java.sql.Driver;

import static stepDefinitions.Hooks.driver;

public class US_043 extends CommonPage {
    @Then("user verifies the Services button is clickable")
    public void user_verifies_the_services_button_is_clickable() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(getClientsPage().services_button.isEnabled());
    }
    @When("user clicks on Services button")
    public void user_clicks_on_services_button() {
        ReusableMethods.waitFor(4);
        getClientsPage().services_button.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user sees the Services page")
    public void user_sees_the_services_page() {
        Assert.assertEquals("https://test.hypnotes.net/dashboard/services",driver.getCurrentUrl());
    }


}
