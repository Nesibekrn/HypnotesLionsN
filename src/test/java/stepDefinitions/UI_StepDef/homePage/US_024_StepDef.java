package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_024_StepDef extends CommonPage {
    @When("the user clicks on the Sign Up for Free button")
    public void theUserClicksOnTheSignUpForFreeButton() {
        getRegisterPage().signupFreeButton.click();

    }

    @Then("the Sign Up for Free button should be clickable")
    public void theButtonShouldBeClickable() {
        Assert.assertTrue(getRegisterPage().signupFreeButton.isEnabled());

        }




    @Then("the Register As a Therapist menu should appear")
    public void theMenuShouldAppear() {
        ReusableMethods.waitFor(2);
       Assert.assertEquals("https://test.hypnotes.net/register",driver.getCurrentUrl());
    }


}
