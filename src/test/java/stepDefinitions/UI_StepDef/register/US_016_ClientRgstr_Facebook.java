package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_016_ClientRgstr_Facebook extends CommonPage {
    String currentUrl="";
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
        ReusableMethods.waitFor(2);
    }
    @Given("the user verifies Sign in with Facebook button")
    public void the_user_verifies_sign_in_with_facebook_button()throws InterruptedException {
        getRegisterPage().signWithFacebook.click();
        ReusableMethods.waitFor(2);

    }
    @Then("the user verifies related page")
    public void the_user_verifies_related_page() {
        currentUrl= driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com"));
    }



}
