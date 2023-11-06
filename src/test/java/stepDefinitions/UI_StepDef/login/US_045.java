package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_045 extends CommonPage {
//   @When("user moves to the Documents button with the mouse")
//   public void userMovesToTheDocumentsButtonWithTheMouse() {
//        ReusableMethods.verifyElementDisplayed(getDocumentsPage().documents_button);
//   }
    @Then("user clicks the Documents button")
    public void userClicksTheDocumentsButton() {
    getDocumentsPage().documents_button.click();
    ReusableMethods.waitFor(6);
   }

    @Then("user verifies the Documents page")
    public void userVerifiesTheDocumentsPage() {
        Assert.assertEquals("https://test.hypnotes.net/dashboard/documents",driver.getCurrentUrl());

    }
}
