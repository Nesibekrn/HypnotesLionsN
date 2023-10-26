package stepDefinitions.UI_StepDef.login;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_034_TherapistLogin extends CommonPage {
    Faker faker = new Faker();

    @Then("user verify Login button is clickable")
    public void user_verify_login_button_is_clickable() {
        Assert.assertTrue(getHomePage().loginButton.isEnabled());
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        getHomePage().loginButton.click();
    }

    @Then("user can see The Therapist Login menu")
    public void user_can_see_the_therapist_login_menu() {
        ReusableMethods.waitForVisibility(getLoginPage().email_login, 2);
        Assert.assertEquals("https://test.hypnotes.net/login", driver.getCurrentUrl());
    }

    @Then("user verify Client Login is clickable")
    public void user_verify_client_login_is_clickable() {
        Assert.assertTrue(getLoginPage().clientLogin_link.isEnabled());
    }

    @Then("user verify Forgot your password is clickable")
    public void user_verify_forgot_your_password_is_clickable() {
        Assert.assertTrue(getLoginPage().forgotYourPassword_link.isEnabled());
    }

    @Then("user verify Need an account is clickable")
    public void user_verify_need_an_account_is_clickable() {
        Assert.assertTrue(getLoginPage().needAnAccount_link.isEnabled());
    }

    @When("user types password on password field")
    public void user_types_password_on_password_field() {
        getLoginPage().password_Login.sendKeys(faker.internet().password());
    }

    @When("user clicks on show password icon")
    public void user_clicks_on_show_password_icon() {
        getLoginPage().showPassword_icon.click();
        ReusableMethods.waitFor(3);
    }

    @Then("user verify password is visible")
    public void user_verify_password_is_visible() {
        Assert.assertEquals("text", getLoginPage().password_Login.getAttribute("type"));
    }

    @When("user clicks Client Login link")
    public void user_clicks_client_login_link() {
        getLoginPage().clientLogin_link.click();
    }

    @Then("user can see Client Login Page")
    public void user_can_see_client_login_page() {
       // ReusableMethods.waitForVisibility(getLoginPage().email_login, 2);
        ReusableMethods.waitFor(1);
        Assert.assertEquals("https://test.hypnotes.net/login/client", driver.getCurrentUrl());
    }

    @When("user clicks Forgot your password link")
    public void user_clicks_forgot_your_password_link() {
        getLoginPage().forgotYourPassword_link.click();
    }

    @Then("user can see Forgot your password Page")
    public void user_can_see_forgot_your_password_page() {
        ReusableMethods.waitFor(1);
        Assert.assertEquals("https://test.hypnotes.net/reset-password", driver.getCurrentUrl());
    }

    @When("user clicks Need an account link")
    public void user_clicks_need_an_account_link() {
        getLoginPage().needAnAccount_link.click();
    }

    @Then("user can see Need an account Page")
    public void user_can_see_need_an_account_page() {
        ReusableMethods.waitFor(1);
        Assert.assertEquals("https://test.hypnotes.net/register", driver.getCurrentUrl());
    }
}
