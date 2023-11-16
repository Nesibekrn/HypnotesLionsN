package stepDefinitions.UI_StepDef.services;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_083 extends CommonPage {
    @And("the user clicks on the Services page")
    public void theUserClicksOnTheServicesPage() {

        ReusableMethods.verifyElementDisplayed(getServicesPage().servicesButton);
        getServicesPage().servicesButton.click();

    }

    @When("the user clicks on the Group Session button")
    public void theUserClicksOnTheGroupSessionButton() {

        ReusableMethods.verifyElementDisplayed(getServicesPage().groupSessionButton);
        ReusableMethods.waitForClickability(getServicesPage().groupSessionButton, 5);

        getServicesPage().groupSessionButton.click();

    }

    @Then("the user clicks on the Add New Group Session button")
    public void theUserClicksOnTheAddNewGroupSessionButton() {

        getServicesPage().regularButton.click();

        ReusableMethods.waitForVisibility(getServicesPage().addNewGroupSessionButton, 5);
        ReusableMethods.verifyElementDisplayed(getServicesPage().addNewGroupSessionButton);
        getServicesPage().addNewGroupSessionButton.click();

    }

    @Then("the Adding Group Session page should appear")
    public void theAddingGroupSessionPageShouldAppear() {

        ReusableMethods.waitForVisibility(getServicesPage().addingGroupSessionTitle, 5);
        ReusableMethods.verifyElementDisplayed(getServicesPage().addingGroupSessionTitle);

    }

    @When("the user enters a valid name in the Name field")
    public void theUserEntersAValidNameInTheNameField() {

        ReusableMethods.verifyElementDisplayed(getServicesPage().inputFormName);
        ReusableMethods.verifyElementEnabled(getServicesPage().inputFormName);

        getServicesPage().inputFormName.sendKeys("Gulseren Budayicioglu");

    }

    @And("enters a valid price in the Price field")
    public void entersAValidPriceInThePriceField() {

        ReusableMethods.waitForVisibility(getServicesPage().inputPrice, 5);
        //Assert.assertEquals("Switch button is open", "false", getServicesPage().inputPrice.getAttribute("aria-checked"));

        ReusableMethods.verifyElementDisplayed(getServicesPage().inputPrice);
        ReusableMethods.verifyElementEnabled(getServicesPage().inputPrice);

        getServicesPage().inputPrice.sendKeys("100");

        ReusableMethods.waitFor(6);

    }

    @And("activates the Show service price on the initial scheduler page button")
    public void activatesTheShowServicePriceOnTheInitialSchedulerPageButton() {

        //String ariaCheckedValue = getServicesPage().inputPrice.getAttribute("aria-checked");
        //Assert.assertEquals("Switch button is closed", "true", ariaCheckedValue);

    }

    @And("selects any duration from the Duration drop-down menu")
    public void selectsAnyDurationFromTheDurationDropDownMenu() {

        ReusableMethods.verifyElementDisplayed(getServicesPage().inputDuration);
        ReusableMethods.verifyElementEnabled(getServicesPage().inputDuration);

        getServicesPage().inputDuration.click();
        getServicesPage().clickDurationTime.click();

        getServicesPage().inputDuration.clear();
        getServicesPage().inputDuration.sendKeys("50");

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

        getServicesPage().selectDocumentSessionForm.click();
        getServicesPage().selectDownloadFile.click();;

    }

    @And("checks the Would you like this service to be provided online? menu")
    public void checksTheWouldYouLikeThisServiceToBeProvidedOnlineMenu() {

        // Check if checkbox is selected
        //Assert.assertTrue(getServicesPage().checkboxOnline.isSelected(), true);
        //isChecked = getServicesPage().checkboxOnline.findElement(By.tagName("input")).isSelected();
        //Assert.assertTrue(driver.findElement(By.xpath("(//input[@id='online'])[3]")).isSelected());
        ReusableMethods.selectCheckBox(getServicesPage().checkboxOnline, true);
        //getServicesPage().checkboxOnline.isSelected();

    }

    @And("enters a location in the Session Locations field")
    public void entersALocationInTheSessionLocationsField() {



    }

    @And("enters attendees in the Maximum Number Of Attendees field")
    public void entersAttendeesInTheMaximumNumberOfAttendeesField() {
    }

    @And("adjusts the cursors on the right of the menus for increasing and decreasing numbers")
    public void adjustsTheCursorsOnTheRightOfTheMenusForIncreasingAndDecreasingNumbers() {
    }

    @And("selects a Date from the Date calender menu")
    public void selectsADateFromTheDateCalenderMenu() {
    }

    @And("selects a Time from the Time panel")
    public void selectsATimeFromTheTimePanel() {
    }

    @And("adds various notes to the Session Description optional section")
    public void addsVariousNotesToTheSessionDescriptionOptionalSection() {

        getServicesPage().inputDescriptionButton.sendKeys("See you!");
    }


    @When("the user clicks the Save button")
    public void theUserClicksTheSaveButton() {

        getServicesPage().saveButton.click();

    }

    @Then("a Group session should be created")
    public void aGroupSessionShouldBeCreated() {
    }

    @And("the Group Session has been added message should appear")
    public void theGroupSessionHasBeenAddedMessageShouldAppear() {
    }

    @Given("the user is on the Add New Group Session page")
    public void theUserIsOnTheAddNewGroupSessionPage() {

        Assert.assertTrue("URL was :", driver.getCurrentUrl().contains("services"));


    }

    @Then("the user clicks the Edit button in Group Session page")
    public void theUserClicksTheEditButtonInGroupSessionPage() {


    }

    @When("the user clicks the Cancel button")
    public void theUserClicksTheCancelButton() {

        getServicesPage().cancelButton.click();
    }

    @Then("the Add New Group Session page should appear")
    public void theAddNewGroupSessionPageShouldAppear() {

        String expectedAddingGroupSessionTitle = "Adding Group Session";

        Assert.assertEquals(getServicesPage().addingGroupSessionTitle, expectedAddingGroupSessionTitle);

    }

    @Given("the user is on the Adding Group Session page")
    public void theUserIsOnTheAddingGroupSessionPage() {

    }

    @When("the user tries to save without entering {string}, {string}, {string}, {string}, {string}, and {string} information")
    public void theUserTriesToSaveWithoutEnteringAndInformation(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
    }

    @Then("a validation message should appear stating that the group session cannot be created without entering the required information")
    public void aValidationMessageShouldAppearStatingThatTheGroupSessionCannotBeCreatedWithoutEnteringTheRequiredInformation() {
    }

    @Then("the added Group Session should appear in the session table")
    public void theAddedGroupSessionShouldAppearInTheSessionTable() {
    }

}
