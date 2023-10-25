package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.Driver;
import utilities.JS_utilities;
import utilities.ReusableMethods;

public class US008_StepDef extends CommonPage {

    @Then("User should be able to see {string}")
    public void userShouldBeAbleToSee(String webElementText) {

        JS_utilities.scrollIntoViewJS(getHomePage().testimonialsSectionText);
        String actualText = getHomePage().testimonialsSectionText.getText();
        Assert.assertEquals(webElementText,actualText);
    }

    @When("User click on next button")
    public void userClickOnNextButton() {
        JS_utilities.scrollAndClickWithJS(getHomePage().nextButton);
    }

    @Then("assert testimonials has changed")
    public void assertTestimonialsHasChanged() {

    }


}
