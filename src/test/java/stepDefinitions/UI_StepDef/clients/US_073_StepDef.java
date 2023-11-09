package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.JS_utilities;
import utilities.ReusableMethods;


import static stepDefinitions.Hooks.actions;
import static stepDefinitions.Hooks.driver;

public class US_073_StepDef extends CommonPage {
    @When("user login as therapistt")
    public void userLoginAsTherapistt() {
        getLoginPage().loginButton.click();
        getLoginPage().email_login.sendKeys(ConfigurationReader.getProperty("therapistEmailGul"));
        getLoginPage().password_Login.sendKeys(ConfigurationReader.getProperty("therapistPasswordGul"));
        getLoginPage().login_button.click();

        ReusableMethods.waitFor(2);
        driver.navigate().refresh();
        ReusableMethods.waitFor(1);

    }

    @And("user clicks on  client name")
    public void userClicksOnClientName() {
        getClientsPage().clientsNames.get(0).click();
    }

    @When("user clicks on the microphone")
    public void userClicksOnTheMicrophone() {
        getClientsPage().microphone.click();
        Assert.assertTrue(getClientsPage().stopRecording.getText().contains("Stop Recording"));
        ReusableMethods.waitFor(4);


    }

    @Then("recording should appear")
    public void recordingShouldAppear() {
    }

    @When("user clicks on the microphone again and the file should be added")
    public void userClicksOnTheMicrophoneAgainAndTheFileShouldBeAdded() {
        getClientsPage().microphone.click();
        getClientsPage().audioList.get(0).isDisplayed();

    }

    @Then("{string} message should appear")
    public void messageShouldAppear(String message) {
        ReusableMethods.waitForVisibility(getClientsPage().messageRecordingAdd, 10);
        Assert.assertTrue(getClientsPage().messageRecordingAdd.getText().contains(message));

    }

    @And("user must see the attached file")
    public void userMustSeeTheAttachedFile() {
        getClientsPage().audioList.get(0).isDisplayed();
    }

    @When("user Press play the audio file should be played")
    public void userPressPlay() {
        JS_utilities.scrollIntoViewJS(getClientsPage().audioList.get(0));
        Double time1 = getClientsPage().audioList.get(0).getCurrentTime();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();//!!!click hic birsekilde calismiyorsa bunu kullan!!!
        ReusableMethods.waitFor(2);
        Double time2 = getClientsPage().audioList.get(0).getCurrentTime();
        Assert.assertTrue(time2 > time1);
    }


    @Then("Send to client, Convert to Text, Delete Recording buttons should appear")
    public void sendToClientConvertToTextDeleteRecordingButtonsShouldAppear() {

    }

    @Then("Send to client button should give valid results")
    public void sendToClientButtonShouldGiveValidResults() {
    }

    @Then("Convert to Text button should give valid results")
    public void convertToTextButtonShouldGiveValidResults() {
    }

    @Then("Delete Recording button should give valid results")
    public void deleteRecordingButtonShouldGiveValidResults() {
    }
}
