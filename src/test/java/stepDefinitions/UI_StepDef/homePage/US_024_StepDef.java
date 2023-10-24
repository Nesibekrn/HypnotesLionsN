package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;

public class US_024_StepDef extends CommonPage {
    @When("the user clicks on the Sign Up for Free button")
    public void theUserClicksOnTheSignUpForFreeButton() {
        getRegisterPage().signupFreeButton.click();

    }

    @Then("the {string} button should be clickable")
    public void theButtonShouldBeClickable(String arg0) {

    }

    @Then("the {string} menu should appear")
    public void theMenuShouldAppear(String arg0) {
    }


}
