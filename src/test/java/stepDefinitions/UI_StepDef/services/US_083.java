package stepDefinitions.UI_StepDef.services;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_083 extends CommonPage {
    @And("the user clicks on the Services page")
    public void theUserClicksOnTheServicesPage() {

        getServicesPage().servicesButton.click();
    }

    @When("the user clicks on the Group Session button")
    public void theUserClicksOnTheGroupSessionButton() {

        getServicesPage().groupSessionButton.click();
    }

    @Then("the user clicks on the Add New Group Session button")
    public void theUserClicksOnTheAddNewGroupSessionButton() {
        Assert.assertTrue(getServicesPage().addNewGroupSessionButton.isDisplayed());
        getServicesPage().addNewGroupSessionButton.click();
    }

    @Then("the Adding Group Session page should appear")
    public void theAddingGroupSessionPageShouldAppear() {

        Assert.assertTrue(getServicesPage().addingGroupSessionTitle.isDisplayed());
    }

    @When("the user enters a valid name in the Name field")
    public void theUserEntersAValidNameInTheNameField() {

        Assert.assertTrue(getServicesPage().inputFormName.isDisplayed());
        Assert.assertTrue(getServicesPage().inputFormName.isEnabled());

        getServicesPage().inputFormName.sendKeys("Gulseren Budayicioglu");

    }

    @And("selects a meeting type from the meeting type menu")
    public void selectsAMeetingTypeFromTheMeetingTypeMenu() {
    }

    @And("enters a valid price in the Price field")
    public void entersAValidPriceInThePriceField() {

        Assert.assertEquals("Switch button is open", "false", getServicesPage().inputPrice.getAttribute("aria-checked"));

        Assert.assertTrue(getServicesPage().inputPrice.isDisplayed());
        Assert.assertTrue(getServicesPage().inputPrice.isEnabled());
        getServicesPage().inputPrice.sendKeys("100");

    }

    @And("activates the Show service price on the initial scheduler page button")
    public void activatesTheShowServicePriceOnTheInitialSchedulerPageButton() {

        String ariaCheckedValue = getServicesPage().inputPrice.getAttribute("aria-checked");
        Assert.assertEquals("Switch button is closed", "true", ariaCheckedValue);


    }

    @And("selects any duration from the Duration drop-down menu")
    public void selectsAnyDurationFromTheDurationDropDownMenu() {
    }

    @And("enters a number value in the Buffer Time Before Appointment min field")
    public void entersANumberValueInTheBufferTimeBeforeAppointmentMinField() {
    }

    @And("enters a number value in the Buffer Time After Appointment min field")
    public void entersANumberValueInTheBufferTimeAfterAppointmentMinField() {
    }

    @And("selects a value from the Advance Notice menu")
    public void selectsAValueFromTheAdvanceNoticeMenu() {
    }

    @And("adjusts the cursors on the right of the menu for increasing and decreasing numbers")
    public void adjustsTheCursorsOnTheRightOfTheMenuForIncreasingAndDecreasingNumbers() {
    }

    @And("activates the Payment Required button")
    public void activatesThePaymentRequiredButton() {
    }

    @And("activates the Service Active button")
    public void activatesTheServiceActiveButton() {
    }

    @And("selects required documents from the Required Forms and eSign Documents menu")
    public void selectsRequiredDocumentsFromTheRequiredFormsAndESignDocumentsMenu() {
    }

    @And("checks the Would you like this service to be provided online? menu")
    public void checksTheWouldYouLikeThisServiceToBeProvidedOnlineMenu() {
    }

    @And("enters values in the Total Sessions and Session Interval Weeks menus")
    public void entersValuesInTheTotalSessionsAndSessionIntervalWeeksMenus() {
    }

    @And("adjusts the cursors on the right of the menus for increasing and decreasing numbers")
    public void adjustsTheCursorsOnTheRightOfTheMenusForIncreasingAndDecreasingNumbers() {
    }

    @And("adds various notes to the Description section")
    public void addsVariousNotesToTheDescriptionSection() {
    }

    @And("adds various notes to the Terms & Conditions section")
    public void addsVariousNotesToTheTermsConditionsSection() {
    }

    @When("the user clicks the Save button")
    public void theUserClicksTheSaveButton() {
    }

    @Then("an individual session should be created")
    public void anIndividualSessionShouldBeCreated() {
    }

    @And("the Group Session has been added message should appear")
    public void theGroupSessionHasBeenAddedMessageShouldAppear() {
    }

    @Given("the user is on the Add New Group Session page")
    public void theUserIsOnTheAddNewGroupSessionPage() {
    }

    @Then("the user clicks the Edit button")
    public void theUserClicksTheEditButton() {
    }

    @When("the user clicks the Cancel button")
    public void theUserClicksTheCancelButton() {
    }

    @Then("the Add New Group Session page should appear")
    public void theAddNewGroupSessionPageShouldAppear() {
    }

    @Given("the user is on the Adding Group Session page")
    public void theUserIsOnTheAddingGroupSessionPage() {
    }

    @When("the user tries to save without entering {string}, {string}, {string}, and {string} information")
    public void theUserTriesToSaveWithoutEnteringAndInformation(String arg0, String arg1, String arg2, String arg3) {
    }

    @Then("a validation message should appear stating that the group session cannot be created without entering the required information")
    public void aValidationMessageShouldAppearStatingThatTheGroupSessionCannotBeCreatedWithoutEnteringTheRequiredInformation() {
    }

    @Then("the added Group Session should appear in the session table")
    public void theAddedGroupSessionShouldAppearInTheSessionTable() {
    }

}
