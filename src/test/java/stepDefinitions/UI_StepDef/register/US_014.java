package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;


public class US_014 extends CommonPage {
   @Given("User enters the URL")
   public void user_enters_the_url() {
       driver.get("https://test.hypnotes.net/");
   }
   @Then("User should go homepage")
   public void user_should_go_homepage() {
       System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
       Assert.assertEquals("https://test.hypnotes.net/", driver.getCurrentUrl());
   }
   @Then("Sign Up button should be clickable")
    public void sign_up_button_should_be_clickable() {
        Assert.assertTrue(getRegisterPage().signUpForFree.isEnabled());
    }
    @Then("I am a Client and Already have an account buttons should be visible")
    public void i_am_a_client_and_already_have_an_account_buttons_should_be_visible() throws InterruptedException {
        getRegisterPage().signUpForFree.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getRegisterPage().ButtonIAmAClient.isDisplayed());
        Assert.assertTrue(getRegisterPage().ButtonAlreadyHaveAnAccount.isDisplayed());
    }
    @Then("I am a Client button should be clickable")
    public void i_am_a_client_button_should_be_clickable() {
        Assert.assertTrue(getRegisterPage().ButtonIAmAClient.isEnabled());
    }
    @When("I am Client button is clicked")
    public void the_i_am_client_button_is_clicked() throws InterruptedException {
        getRegisterPage().ButtonIAmAClient.click();
        ReusableMethods.waitFor(2);
    }
    @Then("the url of the page should be correct")
    public void theUrlOfThePageShouldBeCorrect() {
        Assert.assertEquals("https://test.hypnotes.net/register/client", driver.getCurrentUrl());
        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }
    @Then("Already have an account must be clickable")
    public void already_have_an_account_must_be_clickable() {
        Assert.assertTrue(getRegisterPage().ButtonAlreadyHaveAnAccount.isEnabled());
    }
    @When("User clicks the Already have an account button")
    public void user_clicks_the_already_have_an_account_button() {
        getRegisterPage().ButtonAlreadyHaveAnAccount.click();
    }
    @Then("Therapist login menu should appear")
    public void therapist_login_menu_should_appear() {
        Assert.assertTrue(getRegisterPage().ButtonTherapistLogin.isDisplayed());
    }
}




