package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CommonPage;
import utilities.Driver;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class US_18_StepDef extends CommonPage {


    @Then("User clicks I am Client underneath the Sign up button.")
    public void user_clicks_i_am_client_underneath_the_sign_up_button() {
        getRegisterPage().iAmClientButton.click();

    }

    @Then("user verifies Sign in with LinkedIn button is visible and clickable")
    public void user_verifies_sign_in_with_linked_in_button_is_visible_and_clickable() {
        assertTrue(getRegisterPage().signInWithLinkedinButton.isDisplayed());
        getRegisterPage().signInWithLinkedinButton.click();

    }

    @And("user enters a valid LinkedIn {string} in the email field.")
    public void userEntersAValidLinkedInInTheEmailField(String email) {

        getRegisterPage().input_emailLinkedin.sendKeys(email);

    }

    @And("user enters a valid LinkedIn {string} in the password fields.")
    public void userEntersAValidLinkedInInThePasswordFields(String password) {
        getRegisterPage().input_passwordLinkedin.sendKeys(password);

    }
    @And("user clicks sign-in button")
    public void userClicksSignInButton() {
        getRegisterPage().signInButtonLinkedin.click();
        //  getRegisterPage().allowButton.click();
    }


    @Then("user verifies related pages are visible")
    public void user_verifies_related_pages_are_visible() {

        String expectedURl = "https://test.hypnotes.net/dashboard/calendar";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        assertNotEquals("Related pages are not visible!...",expectedURl,actualUrl);



    }

}
