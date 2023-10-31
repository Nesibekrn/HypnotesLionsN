package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.LoginPage;


import static org.junit.Assert.*;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class US_027 {

    LoginPage loginPage = new LoginPage();

    @When("clicks the login button")
    public void clicks_the_login_button() throws InterruptedException {
        loginPage.loginButton.click();
        Thread.sleep(2000);
    }

    @When("clicks to Sign in with apple")
    public void clicks_to_sign_in_with_apple() {
        loginPage.loginWithApple.click();
        //waitFor(2);

    }

    @When("enters the e-mail address and password")
    public void enters_the_e_mail_address_and_password() {
        waitFor(2);
        loginPage.emailApple.sendKeys("k@gmail.com");
        loginPage.emailSend.click();
        loginPage.passwordApple.sendKeys("!!!!", Keys.ENTER);
        loginPage.continuerButton.click();
        //Apple dogrulamasi basarili oldu, sifreyi gizledim

    }

    @Then("assert that the user is logged in")
    public void assert_that_the_user_is_logged_in() {
        String actuelTitle = driver.getTitle();
        String expectedTitle = "https://test.hypnotes.net/dashboard/calendar";
        assertEquals(actuelTitle, expectedTitle);

    }

    @When("enters a incorrect {string} and {string}")
    public void enters_a_incorrect_and(String email, String password) {
        waitFor(2);
        loginPage.emailApple.sendKeys(email);
        loginPage.emailSend.click();
        loginPage.passwordApple.sendKeys(password, Keys.ENTER);
        loginPage.continuerButton.click();
        waitFor(2);

    }

   @Then("verify the error message")
    public void verify_the_error_message() {
        assertTrue(loginPage.errorMessage_Apple.isDisplayed());

    }


}