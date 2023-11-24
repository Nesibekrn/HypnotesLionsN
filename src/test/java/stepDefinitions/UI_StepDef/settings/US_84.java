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
        for (int i = 0; i < getSettingsPage().addNewBlockTime.size(); i++) {
            ReusableMethods.verifyElementDisplayed(getSettingsPage().addNewBlockTime.get(1));
            ReusableMethods.clickWithTimeOut(getSettingsPage().addNewBlockTime.get(1),1);

        }

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
        ReusableMethods.waitFor(1);
        getSettingsPage().xButton.click();


    }

    @Then("User verifies The Max appointments button is fonctional and can enter number on the screen")
    public void userVerifiesTheMaxAppointmentsButtonIsFonctionalAndCanEnterNumberOnTheScreen() {
        ReusableMethods.waitFor(1);
        for (int i = 1; i < getSettingsPage().maxAppointments.size(); i++) {
            if (!getSettingsPage().maxAppointments.get(i).isSelected()) {
                ReusableMethods.waitFor(1);
            }    getSettingsPage().maxAppointments.get(i).click();

        }
        for (int j = 1; j < getSettingsPage().maxAppointmentNumber.size(); j++) {
            getSettingsPage().maxAppointmentNumber.get(j).sendKeys("10");
            ReusableMethods.waitFor(1);
            //getSettingsPage().maxAppointmentNumber.get(j).sendKeys(Keys.ENTER);


        }
      /*  for (int i = 1; i < getSettingsPage().maxAppointments.size(); i++) {
            if (!getSettingsPage().maxAppointments.get(i).isSelected()) {
                ReusableMethods.waitFor(1);
            }

            getSettingsPage().maxAppointments.get(i).click();

            for (int j = 1; j < getSettingsPage().maxAppointmentNumber.size(); j++) {
                getSettingsPage().maxAppointmentNumber.get(j).sendKeys("10");
                getSettingsPage().maxAppointmentNumber.get(j).sendKeys(Keys.ENTER);
            }
        }*/



    }

    @And("User verifies if save button is clickable and checks the saved message")
    public void userVerifiesIfSaveButtonIsClickableAndChecksTheSavedMessage() {
        //ReusableMethods.waitForClickability(getSettingsPage().settingsButton,3);
        //ReusableMethods.clickWithTimeOut(getSettingsPage().saveSettings,3);
        getSettingsPage().saveSettings.click();
    }

    @Then("User verifies color changes on the calendar display section")
    public void userVerifiesColorChangesOnTheCalendarDisplaySection() {
        ReusableMethods.waitFor(1);
        getSettingsPage().calendarDisplay.click();
        getSettingsPage().individualSessions.click();
        getSettingsPage().colorSkalasi.clear();
        getSettingsPage().colorSkalasi.sendKeys("2F2378");
        getSettingsPage().saveColor.click();
        ReusableMethods.waitFor(1);

    }

    @And("User verifies if time zone change is visible")
    public void userVerifiesIfTimeZoneChangeIsVisible() {
        getSettingsPage().timeZone.click();
        ReusableMethods.waitFor(1);
        getSettingsPage().timeZoneArea.click();
        ReusableMethods.waitFor(2);
        for (int i = 0; i < getSettingsPage().newyorkTime.size(); i++) {
            ReusableMethods.scrollAndClickWithJS(getSettingsPage().newyorkTime.get(1));

        }

        ReusableMethods.waitFor(2);
        getCalendarPage().calendar_buton.click();
        ReusableMethods.waitFor(1);
       Assert.assertTrue(getCalendarPage().location.getText().contains("America"));

    }

    @Then("User verifies if the url changes and changed url is appeared on the page")
    public void userVerifiesIfTheUrlChangesAndChangedUrlIsAppearedOnThePage() {
        getSettingsPage().settingsButton.click();
        getSettingsPage().schedulerUrl.click();
        getSettingsPage().customizeUrl.click();
        ReusableMethods.waitFor(1);
        getSettingsPage().changeUrl.clear();
        getSettingsPage().changeUrl.sendKeys("duygu");
        ReusableMethods.waitFor(1);
        getSettingsPage().changeSchedularLink.click();
        ReusableMethods.waitFor(1);
        String message = "Scheduler URL has been updated";
        Assert.assertEquals(message,getSettingsPage().successMessage.getText());

    }

    @And("User verifies if Schedular url has been updated message appeared in the page")
    public void userVerifiesIfSchedularUrlHasBeenUpdatedMessageAppearedInThePage() {

    }
}
