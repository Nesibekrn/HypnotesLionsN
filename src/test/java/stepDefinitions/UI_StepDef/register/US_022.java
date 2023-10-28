package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitForVisibility;

public class US_022 extends CommonPage {

    @Then("User clicks Sign in button on nav-bar.")
    public void UserclicksSigninbuttononnavbar() {
        getRegisterPage().signUpFreeButton.click();
    }


    @And("User enters valid credentials,then clicks Sign up button.")
    public void userEntersValidCredentialsThenClicksSignUpButton() {
        getRegisterPage().creatingValidCredentials();
    }

    @Then("User verifies Verify Email warning window displayed.")
    public void userVerifiesVerifyEmailWarningWindowDisplayed() {
        Assert.assertTrue(getRegisterPage().verifyEmailText.isDisplayed());
    }

    @Then("User verifies all warning texts are visible on Verify Email section.")
    public void userVerifiesAllWarningTextsAreVisibleOnVerifyEmailSection() {
        getRegisterPage().verifyEmailAllTexts();
    }

    @And("User verifies Send again button is clickable.")
    public void userVerifiesSendAgainButtonIsClickable() {
        getRegisterPage().sendAgain.click();
        ReusableMethods.waitFor(1);
    }

    @And("User verifies that warning message is pops up after clicking Send again button.")
    public void userVerifiesThatWarningMessageIsPopsUpAfterClickingSendAgainButton() {

        waitForVisibility(getRegisterPage().popUpMessage,2000);
        assert getRegisterPage().popUpMessage.isDisplayed();
        System.out.println(getRegisterPage().popUpMessage.getText());
    }
}
