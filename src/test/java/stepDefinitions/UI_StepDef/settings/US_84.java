package stepDefinitions.UI_StepDef.settings;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US_84 extends CommonPage {
    @Given("User clicks on settings button on dashboard page")
    public void userClicksOnSettingsButtonOnDashboardPage() {
        ReusableMethods.waitForPageToLoad(1);
        Assert.assertTrue(getSettingsPage().settingsButton.isEnabled());
        ReusableMethods.waitForClickability(getSettingsPage().settingsButton,5);
        getSettingsPage().settingsButton.click();

    }

    @When("User verifies if Flex Start button is active and give correct results")
    public void userVerifiesIfFlexStartButtonIsActiveAndGiveCorrectResults() {
        Assert.assertTrue(getSettingsPage().flexStart.isEnabled());
        getSettingsPage().flexStart.click();
        ReusableMethods.waitForVisibility(getSettingsPage().flexStartMessage,3);
        Assert.assertEquals("Successfully updated", getSettingsPage().flexStartMessage.getText());
    }

    @Then("User verifies if Day off is tickable and give correct results")
    public void userVerifiesIfDayOffIsTickableAndGiveCorrectResults() {
        for (int i = 0; i < getSettingsPage().dayOff.size(); i++) {
            if (!getSettingsPage().dayOff.get(i).isSelected()) {
                // Click the checkbox
                getSettingsPage().dayOff.get(i).click();
            }


        }
    }

    @And("User verifies if Add New Block Time option is functional and give correct result")
    public void userVerifiesIfAddNewBlockTimeOptionIsFunctionalAndGiveCorrectResult() {
        ReusableMethods.verifyElementDisplayed(getSettingsPage().addNewBlockTime.get(1));
        ReusableMethods.clickWithTimeOut(getSettingsPage().addNewBlockTime.get(1),1);
        ReusableMethods.clickWithTimeOut(getSettingsPage().blockTimeFrom,2);
        ReusableMethods.scrollAndClickWithJS(getSettingsPage().timeFirst);
        ReusableMethods.clickWithTimeOut(getSettingsPage().blockTimeTo,1);
        ReusableMethods.scrollAndClickWithJS(getSettingsPage().timeSecond);
        getSettingsPage().addButton.click();
        getSettingsPage().xButton.click();

    }

    @Then("User verifies The Max appointments button is fonctional and can enter number on the screen")
    public void userVerifiesTheMaxAppointmentsButtonIsFonctionalAndCanEnterNumberOnTheScreen() {
    }

    @And("User verifies if save button is clickable and checks the saved message")
    public void userVerifiesIfSaveButtonIsClickableAndChecksTheSavedMessage() {
    }

    @Then("User verifies color changes on the calendar display section")
    public void userVerifiesColorChangesOnTheCalendarDisplaySection() {
    }

    @And("User verifies if time zone change is visible")
    public void userVerifiesIfTimeZoneChangeIsVisible() {
    }

    @Then("User verifies if the url changes and changed url is appeared on the page")
    public void userVerifiesIfTheUrlChangesAndChangedUrlIsAppearedOnThePage() {
    }

    @And("User verifies if Schedular url has been updated message appeared in the page")
    public void userVerifiesIfSchedularUrlHasBeenUpdatedMessageAppearedInThePage() {
    }
}
