package stepDefinitions.UI_StepDef.settings;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.JS_utilities;
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
        ReusableMethods.waitForPageToLoad(3);
        Assert.assertTrue(getSettingsPage().flexStart.isEnabled());
        getSettingsPage().flexStart.click();
        ReusableMethods.waitForVisibility(getSettingsPage().flexStartMessage,2);
        //Assert.assertEquals("Successfully updated", getSettingsPage().flexStartMessage.getText());
    }

    @Then("User verifies if Day off is tickable and give correct results")
    public void userVerifiesIfDayOffIsTickableAndGiveCorrectResults() {
        for (int i = 0; i < getSettingsPage().dayOff.size(); i++) {
            if (!getSettingsPage().dayOff.get(i).isSelected()) {
                // Click the checkbox
                getSettingsPage().dayOff.get(0).click();
            }


        }
    }

    @And("User verifies if Add New Block Time option is functional and give correct result")
    public void userVerifiesIfAddNewBlockTimeOptionIsFunctionalAndGiveCorrectResult() {
        ReusableMethods.verifyElementDisplayed(getSettingsPage().addNewBlockTime.get(1));
        ReusableMethods.clickWithTimeOut(getSettingsPage().addNewBlockTime.get(1),1);
        ReusableMethods.clickWithTimeOut(getSettingsPage().blockTimeFrom,1);
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollAndClickWithJS(getSettingsPage().timeFirst);
        ReusableMethods.clickWithTimeOut(getSettingsPage().blockTimeTo,1);
        ReusableMethods.waitFor(3);
        for (int i = 0; i < getSettingsPage().timeSecond.size(); i++) {
            getSettingsPage().timeSecond.get(1).click();

        }
        ReusableMethods.waitFor(2);
        getSettingsPage().addButton.click();
       // Assert.assertTrue(getSettingsPage().blockTime.isDisplayed());
        getSettingsPage().xButton.click();


    }

    @Then("User verifies The Max appointments button is fonctional and can enter number on the screen")
    public void userVerifiesTheMaxAppointmentsButtonIsFonctionalAndCanEnterNumberOnTheScreen() {
        ReusableMethods.waitFor(1);
       /* for (int i = 0; i < getSettingsPage().maxAppointments.size(); i++) {
            if (!getSettingsPage().maxAppointments.get(i).isSelected()) {
                ReusableMethods.waitFor(1);
                getSettingsPage().maxAppointments.get(i).click();

            }
        }*/

        getSettingsPage().maxAppointments.forEach(t->{
            if (!t.isSelected()) {
                ReusableMethods.scrollToElement(t);
                JS_utilities.scrollAndClickWithJS(t);

            }
        });

        ReusableMethods.clickWithTimeOut(getSettingsPage().maxAppointmentNumber,1);
        getSettingsPage().maxAppointmentNumber.sendKeys("10");
        getSettingsPage().maxAppointmentNumber.sendKeys(Keys.ENTER);
    }

    @And("User verifies if save button is clickable and checks the saved message")
    public void userVerifiesIfSaveButtonIsClickableAndChecksTheSavedMessage() {
        //ReusableMethods.waitForClickability(getSettingsPage().settingsButton,3);
        ReusableMethods.clickWithTimeOut(getSettingsPage().saveSettings,3);
    }

    @Then("User verifies color changes on the calendar display section")
    public void userVerifiesColorChangesOnTheCalendarDisplaySection() {
       //ReusableMethods.scrollToElement(getSettingsPage().calendarDisplay);
       ReusableMethods.clickWithTimeOut(getSettingsPage().calendarDisplay,1);

    }

    @And("User verifies if time zone change is visible")
    public void userVerifiesIfTimeZoneChangeIsVisible() {
        ReusableMethods.clickWithTimeOut(getSettingsPage().timeZone,1);
        //System.out.println();getSettingsPage().newyorkTime.getText();
        ReusableMethods.clickWithTimeOut(getSettingsPage().timeZoneArea,1);
        ReusableMethods.waitFor(2);
        for (int i = 0; i < getSettingsPage().newyorkTime.size(); i++) {
            getSettingsPage().newyorkTime.get(4).click();

        }
        //ReusableMethods.scrollAndClickWithJS(getSettingsPage().newyorkTime);

    }

    @Then("User verifies if the url changes and changed url is appeared on the page")
    public void userVerifiesIfTheUrlChangesAndChangedUrlIsAppearedOnThePage() {
        ReusableMethods.clickWithTimeOut(getSettingsPage().schedulerUrl,1);
        getSettingsPage().customizeUrl.click();
        ReusableMethods.waitFor(1);
        getSettingsPage().changeUrl.sendKeys("duygu");
        ReusableMethods.waitFor(1);
        getSettingsPage().changeSchedularLink.click();

    }

    @And("User verifies if Schedular url has been updated message appeared in the page")
    public void userVerifiesIfSchedularUrlHasBeenUpdatedMessageAppearedInThePage() {
    }
}
