package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CommonPage;
import pages.RegisterPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

public class US_028 extends CommonPage {

    @And("the user clicks on Sign up for free button")
    public void theUserClicksOnSignUpForFreeButton() {
        getRegisterPage().signUpForFree.click();
    }

    @And("the user clicks on the Sign with LinkedIn button")
    public void theUserClicksOnTheSignWithLinkedInButton() {
        getRegisterPage().signInWithLinkedin.click();
    }

    @And("the user enter an email address and LinkedIn user password")
    public void theUserEnterAnEmailAddressAndLinkedInUserPassword() {
        getRegisterPage().linkedInUserName.sendKeys(ConfigurationReader.getProperty("user1_email"));
        getRegisterPage().linkedInPassword.sendKeys(ConfigurationReader.getProperty("user1_password"));
        ReusableMethods.waitFor(1);
    }

    @When("the user clicks on {string} button")
    public void the_user_clicks_on_button(String string) {
        getRegisterPage().linkedInSignInButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("User should be able to see {string} message")
    public void user_should_be_able_to_see_message(String string) {
        String actualText = "";

        try {
            actualText = getRegisterPage().linkedInTurkceDogrulamaMesaji.getText();
            Assert.assertEquals(actualText, "Hızlıca bir güvenlik kontrolü yapalım");
        } catch (Exception e) {
            actualText=getRegisterPage().linkedInEnglishVerificationMessage.getText();
            Assert.assertEquals(actualText,"Let's do a quick security check");
        }

    }


}
