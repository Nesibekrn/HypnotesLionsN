package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.commonPage;

public class US27_TC001 {

    LoginPage loginPage = new LoginPage();

    @When("clicks the login button")
    public void clicks_the_login_button() throws InterruptedException {
        loginPage.loginButton.click();
        Thread.sleep(2000);
    }

    @When("clicks to Sign in with apple")
    public void clicks_to_sign_in_with_apple()  {
        loginPage.loginWithApple.click();
        ReusableMethods.waitFor(2000);

    }
    @When("enters the e-mail address and password")
    public void enters_the_e_mail_address_and_password() {
        ReusableMethods.waitFor(2000);
        loginPage.emailApple.sendKeys("kubrakurdoglusimsek@gmail.com");
        ReusableMethods.waitFor(2000);
        loginPage.passwordApple.sendKeys("Kubra");

    }
    @Then("assert that the user is logged in")
    public void assert_that_the_user_is_logged_in() {

    }

}
