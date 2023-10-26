package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import utilities.Driver;

public class US_36_StepDef extends CommonPage {
    @Then("The user clicks on the login button")
    public void the_user_clicks_on_the_button() {
        getLoginPage().loginButton.click();

    }

    @Then("The user verifies the sign-in with the Facebook button is visible and clickable.")
    public void the_user_verifies_the_sign_in_with_the_facebook_button_is_visible_and_clickable() {
        assert getLoginPage().signInWithFacebook.isDisplayed();
        getLoginPage().signInWithFacebook.click();

    }

    @And("user enters the registered {string} in the field.")
    public void userEntersTheRegisteredInTheField(String email) {
        getLoginPage().input_emailFacebook.sendKeys(email);

    }

    @And("user enters the {string} in the fields.")
    public void userEntersTheInTheFields(String password) {
        getLoginPage().input_PassFacebook.sendKeys(password);

    }
    @Then("Click the login button.")
    public void clickTheLoginButton() {

        getLoginPage().loginButtonFacebook.click();
    }


    @Then("user verifies related pages are visible after login.")
    public void userVerifiesRelatedPagesAreVisibleAfterLogin() {

        String expectedUrl= "https://www.facebook.com/";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));
    }




}
