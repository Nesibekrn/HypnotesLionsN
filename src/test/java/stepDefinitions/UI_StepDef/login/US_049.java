package stepDefinitions.UI_StepDef.login;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_049 extends CommonPage{
    @Then("user verifies the Settings button is clickable")
    public void user_verifies_the_settings_button_is_clickable() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(getClientsPage().settings_button.isEnabled());
    }
    @When("user clicks on Settings button")
    public void user_clicks_on_settings_button() {
        ReusableMethods.waitFor(4);
        getClientsPage().settings_button.click();
        ReusableMethods.waitFor(2);

    }
    @Then("user sees the Settings page")
    public void user_sees_the_settings_page() {
        Assert.assertEquals("https://test.hypnotes.net/dashboard/settings",driver.getCurrentUrl());
    }
}
