package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ClientsPage;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;

public class US_069 extends CommonPage {
    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton() {
        getClientsPage().viewDetailsButton.click();
    }

    @Then("{string} button should be visible")
    public void buttonShouldBeVisible() {
        Assert.assertEquals("https://test.hypnotes.net/dashboard/clients/2767",driver.getCurrentUrl());
    }

    @Then("the {string} button should be visible")
    public void theButtonShouldBeVisible() {
    }

    @And("the user clicks the {string} button")
    public void theUserClicksTheButton() {
        getClientsPage().sessionsButton.click();
        getClientsPage().addNewSessionButton.click();



    }

    @Then("the headings for {string}, {string}, {string}, {string}, {string}, {string}, and {string} should be visible")
    public void theHeadingsForAndShouldBeVisible(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
    }

    @Then("the following headings should be visible:")
    public void theFollowingHeadingsShouldBeVisible() {
    }
}
