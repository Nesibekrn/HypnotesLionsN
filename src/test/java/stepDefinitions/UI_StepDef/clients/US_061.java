package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.*;
import pages.CommonPage;
import utilities.ReusableMethods;


public class US_061 extends CommonPage {
    @When("User should see Client section")
    public void userShouldSeeClientSection() {
        ReusableMethods.verifyElementDisplayed(getClientsPage().clientSectionBtn);
    }

    @Then("Client section button should be clickable")
    public void clientSectionButtonShouldBeClickable() {
        ReusableMethods.verifyElementEnabled(getClientsPage().clientSectionBtn);
    }

    @And("User should click on Client section button")
    public void userShouldClicksOnClientSectionButton() {
        ReusableMethods.clickWithTimeOut(getClientsPage().clientSectionBtn, 2);
    }

    @Then("User should see the client's names on the page")
    public void userShouldSeeTheClientSNamesOnThePage() {
        for (int i = 0; i < getClientsPage().clientsNames.size(); i++) {
            ReusableMethods.isElementPresent(getClientsPage().clientsNames.get(i));
        }
    }

    @And("User should see the view details buttons")
    public void userShouldSeeTheViewDetailsButtons() {
        ReusableMethods.verifyElementDisplayed(getClientsPage().viewDetailsBtns.get(0));
    }

    @Then("the view details button should be clickable")
    public void theViewDetailsButtonShouldBeClickable() {
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementEnabled(getClientsPage().viewDetailsBtns.get(0));
    }

    @When("User clicks on the view details button")
    public void userClicksOnTheViewDetailsButton() {
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithTimeOut(getClientsPage().viewDetailsBtns.get(0), 3);
    }

    @Then("User should see the Clients info page")
    public void userShouldSeeTheClientsInfoPage() {
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(getClientsPage().clientInfoSectionBtn.get(0));
    }

    @Given("User should see the Schedule an Appointment option")
    public void userShouldSeeTheScheduleAnAppointmentOption() {
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(getClientsPage().scheduleAnAppointment.get(0));
    }

    @And("Schedule an Appointment option button should be clickable")
    public void scheduleAnAppointmentOptionButtonShouldBeClickable() {
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementEnabled(getClientsPage().scheduleAnAppointment.get(0));
    }

    @When("User clicks on Schedule an Appointment option")
    public void userClicksOnScheduleAnAppointmentOption() {
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithTimeOut(getClientsPage().scheduleAnAppointment.get(0), 3);
    }

    @Then("the relevant page should appear")
    public void theRelevantPageShouldAppear() {
        ReusableMethods.waitForVisibility(getClientsPage().hypnotesSchedulerSection,3);
        ReusableMethods.verifyElementDisplayed(getClientsPage().hypnotesSchedulerSection);
    }
}
