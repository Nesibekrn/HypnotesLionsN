package stepDefinitions.UI_StepDef.services;

import com.github.javafaker.Faker;
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

    Faker faker = new Faker();

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
        Assert.assertTrue(getServicesPage().addingGroupSessionTitle.getText().contains("Adding Group Session"));

    }

    @When("the user enters a valid name in the Name field")
    public void theUserEntersAValidNameInTheNameField() {

        ReusableMethods.verifyElementDisplayed(getServicesPage().inputFormName);
        ReusableMethods.verifyElementEnabled(getServicesPage().inputFormName);

        getServicesPage().inputFormName.sendKeys(faker.name().fullName());

        //Assert.assertTrue(getServicesPage().inputFormName.getText().contains(????));
        //assertion nasil yapicam?

    }

    @And("enters a valid price in the Price field")
    public void entersAValidPriceInThePriceField() {

        ReusableMethods.waitForVisibility(getServicesPage().inputPrice, 5);
        //Assert.assertEquals("Switch button is open", "false", getServicesPage().inputPrice.getAttribute("aria-checked"));

        ReusableMethods.verifyElementDisplayed(getServicesPage().inputPrice);
        ReusableMethods.verifyElementEnabled(getServicesPage().inputPrice);

        getServicesPage().inputPrice.sendKeys("100");

    }

    @And("activates the Show service price on the initial scheduler page button")
    public void activatesTheShowServicePriceOnTheInitialSchedulerPageButton() {

        ReusableMethods.verifyElementEnabled(getServicesPage().priceSwitchButton);
        String ariaCheckedValue = getServicesPage().priceSwitchButton.getAttribute("aria-checked");
        Assert.assertEquals("Switch button is closed", "true", ariaCheckedValue);

        System.out.println(getServicesPage().priceSwitchButton.getAttribute("aria-checked"));
        Assert.assertTrue(getServicesPage().priceSwitchButton.getAttribute("aria-checked").contains("true"));

    }

    @And("selects any duration from the Duration drop-down menu")
    public void selectsAnyDurationFromTheDurationDropDownMenu() {

        ReusableMethods.verifyElementDisplayed(getServicesPage().inputDuration);
        ReusableMethods.verifyElementEnabled(getServicesPage().inputDuration);

        getServicesPage().inputDuration.click();

        ReusableMethods.waitForClickability(getServicesPage().clickDurationTime, 5);

        getServicesPage().clickDurationTime.click();

        Assert.assertTrue(getServicesPage().inputDuration.getAttribute("value").contains("90"));

    }


    @And("adjusts the cursors on the right of the menu for increasing and decreasing numbers")
    public void adjustsTheCursorsOnTheRightOfTheMenuForIncreasingAndDecreasingNumbers() {

        ReusableMethods.waitFor(5);

    }

    @And("activates the Payment Required button")
    public void activatesThePaymentRequiredButton() {

        ReusableMethods.verifyElementEnabled(getServicesPage().paymentRequiredSwitchButton);

        getServicesPage().paymentRequiredSwitchButton.click();
        String ariaCheckedValue = getServicesPage().paymentRequiredSwitchButton.getAttribute("aria-checked");
        Assert.assertEquals("Switch button is closed", "true", ariaCheckedValue);

        System.out.println(getServicesPage().paymentRequiredSwitchButton.getAttribute("aria-checked"));
        Assert.assertTrue(getServicesPage().paymentRequiredSwitchButton.getAttribute("aria-checked").contains("true"));

    }

    @And("activates the Service Active button")
    public void activatesTheServiceActiveButton() {

        ReusableMethods.verifyElementEnabled(getServicesPage().serviceActiveSwitch);

        String ariaCheckedValue = getServicesPage().serviceActiveSwitch.getAttribute("aria-checked");
        Assert.assertEquals("Switch button is closed", "true", ariaCheckedValue);

        getServicesPage().serviceActiveSwitch.click();

        getServicesPage().serviceActiveSwitch.click();

        Assert.assertEquals("Switch button is closed", "true", ariaCheckedValue);


    }

    @And("selects required documents from the Required Forms and eSign Documents menu")
    public void selectsRequiredDocumentsFromTheRequiredFormsAndESignDocumentsMenu() {

        getServicesPage().selectDocumentSessionForm.click();
        getServicesPage().selectDownloadFile.click();

        Assert.assertTrue("User should select required documents from the Required Forms and eSign Documents menu..", getServicesPage().verifySelectDownloadFile.getAttribute("title").contains("download.pdf"));
        Assert.assertEquals(true, getServicesPage().selectDownloadFile.getAttribute("title").isEmpty());
    }

    @And("checks the Would you like this service to be provided online? menu")
    public void checksTheWouldYouLikeThisServiceToBeProvidedOnlineMenu() {

        // Check if checkbox is selected
        Assert.assertTrue(getServicesPage().checkboxOnline.isSelected());

    }

    @And("enters a location in the Session Locations field")
    public void entersALocationInTheSessionLocationsField() {


    }

    @And("enters attendees in the Maximum Number Of Attendees field")
    public void entersAttendeesInTheMaximumNumberOfAttendeesField() {

        getServicesPage().inputAttendeeLimitButton.sendKeys("5");
    }

    @And("adjusts the cursors on the right of the menus for increasing and decreasing numbers")
    public void adjustsTheCursorsOnTheRightOfTheMenusForIncreasingAndDecreasingNumbers() {
    }

    @And("selects a Date from the Date calender menu")
    public void selectsADateFromTheDateCalenderMenu() {

        getServicesPage().selectSessionDate.click();

    }

    @And("selects a Time from the Time panel")
    public void selectsATimeFromTheTimePanel() {

        getServicesPage().inputSessionTime.click();

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

        Assert.assertTrue(getServicesPage().groupSessionHasBeenAddedMessage.getText().contains("Group Session has been added"));
    }

    @Given("the user is on the Add New Group Session page")
    public void theUserIsOnTheAddNewGroupSessionPage() {

        Assert.assertTrue("URL was :", driver.getCurrentUrl().contains("services"));

    }

    @Then("the user clicks the Edit button in Group Session page")
    public void theUserClicksTheEditButtonInGroupSessionPage() {

        getServicesPage().editButtonInGroupSession.click();

    }

    @When("the user clicks the Cancel button")
    public void theUserClicksTheCancelButton() {

        getServicesPage().cancelButton.click();
    }

    @Then("the Add New Group Session page should appear")
    public void theAddNewGroupSessionPageShouldAppear() {

        String expectedAddingGroupSessionTitle = "Adding Group Session";

        Assert.assertEquals("Adding Group Session Title should be visible on the Form menu", getServicesPage().addingGroupSessionTitle, expectedAddingGroupSessionTitle);

    }

    @Given("the user is on the Adding Group Session page")
    public void theUserIsOnTheAddingGroupSessionPage() {

        Assert.assertTrue("URL was :", driver.getCurrentUrl().contains("services"));
        Assert.assertEquals("Available Group Session Button", getServicesPage().availableGroupSessionButton);

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
