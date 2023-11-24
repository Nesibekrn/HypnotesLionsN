package stepDefinitions.UI_StepDef.services;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import static stepDefinitions.Hooks.actions;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

import pages.CommonPage;
import utilities.ReusableMethods;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class US_083 extends CommonPage {

    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) driver;


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
        //Assert.assertEquals("Switch button is open", "true", getServicesPage().inputPrice.getAttribute("aria-checked"));

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

        ReusableMethods.scrollAndClickWithJS(getServicesPage().selectDocumentSessionForm);

        getServicesPage().selectDocumentSessionForm.click();

        ReusableMethods.waitForClickability(getServicesPage().selectDownloadFile, 5);
        getServicesPage().selectDownloadFile.click();

        Assert.assertTrue("User should select required documents from the Required Forms and eSign Documents menu.", getServicesPage().verifySelectDownloadFile.getAttribute("title").contains("download.pdf"));
        Assert.assertEquals(true, getServicesPage().selectDownloadFile.getAttribute("title").isEmpty());
    }

    @And("checks the Would you like this service to be provided online? menu")
    public void checksTheWouldYouLikeThisServiceToBeProvidedOnlineMenu() {

        // Check if checkbox is selected
        Assert.assertTrue("Checkbox is not selected.", getServicesPage().checkboxOnline.isSelected());

    }

    @And("enters a location in the Session Locations field")
    public void entersALocationInTheSessionLocationsField() {

        getServicesPage().checkboxOnline.click();
        Assert.assertFalse("Online menu selected. If the online menu is selected user can not able to select Session Location.", getServicesPage().checkboxOnline.isSelected());

        ReusableMethods.scrollAndClickWithJS(getServicesPage().selectLocationButton);

        ReusableMethods.waitForClickability(getServicesPage().selectLocationButton2, 5);
        actions.moveToElement(getServicesPage().selectLocationButton2).click().build().perform();

        ReusableMethods.waitForClickability(getServicesPage().sessionLocationFirstLocation, 5);
        actions.moveToElement(getServicesPage().sessionLocationFirstLocation).click().build().perform();

        Assert.assertTrue("User able to select Session Locations from the Session Locations menu.", getServicesPage().verifySessionLocationFirstLocation.getAttribute("title").contains("Home"));
        Assert.assertEquals(false, getServicesPage().verifySessionLocationFirstLocation.getAttribute("title").isEmpty());

    }

    @And("enters attendees in the Maximum Number Of Attendees field")
    public void entersAttendeesInTheMaximumNumberOfAttendeesField() {

        getServicesPage().inputAttendeeLimitButton.sendKeys("5");
    }

    @And("adjusts the cursors on the right of the menus for increasing and decreasing numbers")
    public void adjustsTheCursorsOnTheRightOfTheMenusForIncreasingAndDecreasingNumbers() {

        getServicesPage().maximumNumberOfAttendeesIncreaseArrow.isDisplayed();
        getServicesPage().maximumNumberOfAttendeesIncreaseArrow.isEnabled();

        getServicesPage().maximumNumberOfAttendeesIncreaseArrow.click();

        getServicesPage().maximumNumberOfAttendeesDecreaseArrow.isDisplayed();
        getServicesPage().maximumNumberOfAttendeesDecreaseArrow.isEnabled();

        getServicesPage().maximumNumberOfAttendeesDecreaseArrow.click();

    }

    @And("selects a Date from the Date calender menu")
    public void selectsADateFromTheDateCalenderMenu() {

        getServicesPage().selectSessionDate.click();
        getServicesPage().dateSectionTodayButton.click();

    }

    @And("selects a Time from the Time panel")
    public void selectsATimeFromTheTimePanel() {

        ReusableMethods.waitForClickability(getServicesPage().inputSessionTime, 5);
        getServicesPage().inputSessionTime.click();

        getServicesPage().hoursForSelectTimeSection.click();

        ReusableMethods.waitForClickability(getServicesPage().minutesForSelectTimeSection, 5);
        getServicesPage().minutesForSelectTimeSection.click();

        getServicesPage().pmSelectTimeSection.click();

    }

    @And("adds various notes to the Session Description optional section")
    public void addsVariousNotesToTheSessionDescriptionOptionalSection() {

        getServicesPage().inputDescriptionButton.sendKeys("See you!");
    }


    @When("the user clicks the Save button")
    public void theUserClicksTheSaveButton() {

        getServicesPage().saveButton.click();

    }

    @And("the Group Session has been added message should appear")
    public void theGroupSessionHasBeenAddedMessageShouldAppear() {

        ReusableMethods.waitForVisibility(getServicesPage().groupSessionHasBeenAddedMessage, 7);
        ReusableMethods.scrollToElement(getServicesPage().groupSessionHasBeenAddedMessage);
        Assert.assertTrue("The Group Session could not be created.", getServicesPage().groupSessionHasBeenAddedMessage.getText().contains("Group Session has been added"));
    }

    @Given("the user is on the Add New Group Session page")
    public void theUserIsOnTheAddNewGroupSessionPage() {

        Assert.assertTrue("URL was :", driver.getCurrentUrl().contains("services"));


    }

    @Then("the Add New Group Session page should appear")
    public void theAddNewGroupSessionPageShouldAppear() {

        ReusableMethods.waitForVisibility(getServicesPage().addNewGroupSessionButton, 5);
        ReusableMethods.verifyElementDisplayed(getServicesPage().addNewGroupSessionButton);
        Assert.assertTrue(getServicesPage().addNewGroupSessionButton.getText().contains("Add New Group Session"));

    }

    @When("the user clicks the Cancel button")
    public void theUserClicksTheCancelButton() {

        ReusableMethods.scrollToElement(getServicesPage().cancelButton);
        getServicesPage().cancelButton.click();
    }

    @Given("the user is on the Adding Group Session page")
    public void theUserIsOnTheAddingGroupSessionPage() {

        Assert.assertTrue("URL was :", driver.getCurrentUrl().contains("services"));
        ReusableMethods.waitForVisibility(getServicesPage().availableGroupSessionButton, 5);
        Assert.assertEquals("Available Group Session Button", getServicesPage().availableGroupSessionButton);

    }

    @When("the user leaves the Group Session fields as empty")
    public void theUserLeavesTheGroupSessionFieldsAsEmpty() {

        getServicesPage().groupSessionFormInputList.stream()
                .forEach(t -> t.sendKeys(Keys.BACK_SPACE));

    }

    @When("the user clicks on the save button on the Adding Group Session page without entering necessary information")
    public void theUserClicksOnTheSaveButtonOnTheAddingGroupSessionPageWithoutEnteringNecessaryInformation() {

        getServicesPage().saveButton.click();

    }

    @Then("warning messages are displayed under the relevant fields for")
    public void warningMessagesAreDisplayedUnderTheRelevantFieldsFor(io.cucumber.datatable.DataTable dataTable) {

        List<String> errorList = dataTable.column(1);
        AtomicInteger index = new AtomicInteger(0);

        for (WebElement a : getServicesPage().warningMessageList) {
            System.out.println(a.getText());
            waitFor(2);

        }
        errorList.stream().forEach(t -> {

            Assert.assertEquals(t, getServicesPage().warningMessageList.get(index.get()).getText());
            index.getAndIncrement();
        });
    }

    @Then("the added Group Session should appear in the session table")
    public void theAddedGroupSessionShouldAppearInTheSessionTable() {

        boolean sessionCreated = false;

        for (int i = 0; i < getServicesPage().availableGroupSessionTitle.size(); i++) {
            String sessionTitle = getServicesPage().availableGroupSessionTitle.get(i).getText();
            String inputFormName = getServicesPage().inputFormName.getText();

            if (sessionTitle.equals(inputFormName)) {
                System.out.println("Successfully created: " + sessionTitle);
                sessionCreated = true;
                break; // Exit the loop since the session was found
            }
        }

        if (!sessionCreated) {
            System.out.println("Group Session was not created or not found.");
        }
    }
}
