package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_045 extends CommonPage {
    @When("user clicks  yes button  on popup page")
    public void userClicksYesButtonOnPopupPage() {
        ReusableMethods.hover(calendarPage.popupPageYes);
        getCalendarPage().popupPageYes.click();
        ReusableMethods.waitFor(2);
    }
    @When("user moves to the Documents button with the mouse")
    public void userMovesToTheDocumentsButtonWithTheMouse() {
        ReusableMethods.hover(calendarPage.documents_button);
    }
    @Then("user clicks the Documents button")
    public void userClicksTheDocumentsButton() {
    getCalendarPage().documents_button.click();
    ReusableMethods.waitFor(3);
   }

    @Then("user verifies the Documents page")
    public void userVerifiesTheDocumentsPage() {
        Assert.assertEquals("https://test.hypnotes.net/dashboard/documents",driver.getCurrentUrl());

    }


    @Then("user is login as a therapist")
    public void userIsLoginAsATherapist() {

    }

    @When("user goes to login page")
    public void userGoesToLoginPage() {

    }
}
