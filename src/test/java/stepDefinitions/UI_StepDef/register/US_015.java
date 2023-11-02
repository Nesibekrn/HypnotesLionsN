package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.clickWithTimeOut;


public class US_015 extends CommonPage {


    @Given("the user navigates Hypnotes web page")
    public void the_user_navigates_hypnotes_web_page() {
        driver.get("https://test.hypnotes.net/");
    }
    @Given("the user clicks on Sign up for free  button")
    public void the_user_clicks_on_sign_up_for_free_button() {
        getRegisterPage().signUpForFree.click();
    }

    @And("the user clicks on Client login")
    public void theUserClicksOnClientLogin() throws InterruptedException {

        //Thread.sleep(2000);
        clickWithTimeOut(getRegisterPage().clientLogin,5);
        getRegisterPage().clientLogin.click();
        Thread.sleep(2000);
    }

    @Given("the user clicks on the Sign with Google button")
    public void the_user_clicks_on_the_sign_with_google_button() throws InterruptedException {

        getRegisterPage().signWithGoogle.click();

    }

    @Given("the user enter an email address")
    public void the_user_enter_an_email_address() {
        clickWithTimeOut(getRegisterPage().emailOrPhone,6);
        getRegisterPage().emailOrPhone.sendKeys("yavuztest94@gmail.com");

    }
    @Given("the user clicks on next button")
    public void the_user_clicks_on_next_button() {
        getRegisterPage().nextButton.click();
    }
    @Given("the user enter an password")
    public void the_user_enter_an_password() throws InterruptedException {
        getRegisterPage().passwordGoogle.sendKeys("Ingolstadt49,");
        Thread.sleep(2000);
    }

    @When("the user clicks on next button for password")
    public void the_user_clicks_on_next_button_for_password() throws InterruptedException {
        getRegisterPage().nextButton.click();
        Thread.sleep(454000);
    }

    @Then("User is registered successfully")
    public void User_is_registered_successfully() throws InterruptedException {
        Thread.sleep(2000);
        String clientDasboardUrl="https://test.hypnotes.net/dashboard/calendar";
        Assert.assertEquals(driver.getCurrentUrl(),clientDasboardUrl);
    }


}
