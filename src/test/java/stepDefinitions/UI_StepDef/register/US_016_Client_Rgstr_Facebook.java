package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class US_016_Client_Rgstr_Facebook extends CommonPage {

    @Given("the user navigates hypnotes web page")
    public void the_user_navigates_hypnotes_web_page() {
        driver.get("https://test.hypnotes.net/");
    }
    @Given("the user clicks on Sign Up free button")
    public void the_user_clicks_on_sign_up_free_button() {
        getRegisterPage().signUpForFree.click();
    }
    @Given("the user clicks on the Client Log in")
    public void the_user_clicks_on_the_client_log_in() {
        getRegisterPage().clientLogin.click();
        waitFor(2);
    }
    @Given("the user verifies Sign in with Facebook button")
    public void the_user_verifies_sign_in_with_facebook_button()throws InterruptedException {
       getRegisterPage().signWithFacebook.click();
       waitFor(3);

    }
    @Given("user enters a valid Facebook email in the email field.")
    public void user_enters_a_valid_facebook_email_in_the_email_field() {


    }
    @Given("user enters a valid Facebook password in the password fields.")
    public void user_enters_a_valid_facebook_password_in_the_password_fields() {

    }
    @Then("Click the Log in button.")
    public void click_the_log_in_button() {

    }
    @Then("user verifies related pages are visible")
    public void user_verifies_related_pages_are_visible() {

    }


}
