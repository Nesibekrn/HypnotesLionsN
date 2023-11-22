package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_045 extends CommonPage {

    @Then("user verifies the Documents button is clickable")
    public void userVerifiesTheDocumentsButtonIsClickable() {
        Assert.assertTrue(getDocumentsPage().documents_button.isEnabled());
        ReusableMethods.waitFor(1);

    }


    @When("user clicks on Documents button")
    public void userClicksOnDocumentsButton() {
        getDocumentsPage().documents_button.click();
        ReusableMethods.waitFor(5);

    }

    @Then("user sees the Documents page")
    public void userSeesTheDocumentsPage() {
        Assert.assertEquals("https://test.hypnotes.net/dashboard/documents",driver.getCurrentUrl());
        ReusableMethods.waitFor(1);
    }
}

