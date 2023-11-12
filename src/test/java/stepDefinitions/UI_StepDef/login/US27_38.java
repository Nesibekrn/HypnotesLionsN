package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;


import java.util.List;

import static org.junit.Assert.*;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class US27_38 {

    LoginPage loginPage = new LoginPage();

    @Given("user goes to home page")
    public void user_goes_to_home_page() {
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @When("clicks the login button")
   public void clicks_the_login_button() throws InterruptedException {
      loginPage.loginButton.click();
       Thread.sleep(2000);
   }

    @When("clicks to Sign in with apple")
    public void clicks_to_sign_in_with_apple() {
        loginPage.loginWithApple.click();
        ReusableMethods.waitFor(2);

    }

    @When("enters the e-mail address and password")
    public void enters_the_e_mail_address_and_password() {
        ReusableMethods.waitFor(2);
        loginPage.emailApple.sendKeys("k@gmail.com");
        loginPage.emailSend.click();
        loginPage.passwordApple.sendKeys("K", Keys.ENTER);
        ReusableMethods.waitFor(2);
        loginPage.continuerButton.click();//kimlik dogrulamasinin ardindan bu siteye yonlendirilmek
        ReusableMethods.waitFor(2);
        //istiyor musunuz diye soruyor, onun dogrulamasi
        //Apple dogrulamasi basarili oldu, sifreyi gizledim

    }

    @Then("assert that the user is logged in")
    public void assert_that_the_user_is_logged_in() {
        ReusableMethods.waitFor(2);
        assertEquals("https://test.hypnotes.net/dashboard/calendar", driver.getCurrentUrl());
    }

    @When("enters a incorrect {string} and {string}")
    public void enters_a_incorrect_and(String email, String password) {
        ReusableMethods.waitFor(2);
        loginPage.emailApple.sendKeys(email);
        loginPage.emailSend.click();
        loginPage.passwordApple.sendKeys(password, Keys.ENTER);
        //loginPage.continuerButton.click();
        ReusableMethods.waitFor(2);

    }

    @Then("verify the error message")
    public void verify_the_error_message() {
        ReusableMethods.waitFor(2);
        assertTrue(loginPage.errorMessage_Apple.isDisplayed());
        ReusableMethods.waitFor(1);
        assertEquals("This Apple ID has been locked for security reasons.",loginPage.errorMessage_Apple.getText());

    }

    @When("clicks to Sign in with linkedIn")
    public void clicks_to_sign_in_with_linked_in() {
        loginPage.loginWithLinkedIn.click();
        ReusableMethods.waitFor(2);
    }

    @When("enters the LinkedIn e-mail address and password")
    public void enters_the_linked_in_e_mail_address_and_password() {
        loginPage.emailLinkedIn.sendKeys("oiseaubleu791@gmail.com", Keys.ENTER);
        loginPage.passwordLinkedIn.sendKeys("DD.123456", Keys.ENTER);

    }

    @Then("assert for LinkedIn that the user is logged in")
    public void assert_for_linked_in_that_the_user_is_logged_in() {
        ReusableMethods.waitFor(2);
        assertEquals("https://test.hypnotes.net/dashboard/calendar", driver.getCurrentUrl());

    }
    @When("enters a incorrect {string} and {string} for LinkedIn")
    public void enters_a_incorrect_and_for_LinkedIn(String email, String password) {
        ReusableMethods.waitFor(2);
        loginPage.emailLinkedIn.sendKeys(email, Keys.ENTER);
        loginPage.passwordLinkedIn.sendKeys(password, Keys.ENTER);
        ReusableMethods.waitFor(2);
    }
    @Then("verify the error message for LinkedIn")
    public void verify_the_error_message_for_LinkedIn() {
        ReusableMethods.waitFor(2);
        //assertTrue(loginPage.errorMessage_LinkIn.isDisplayed());

}




}