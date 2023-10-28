package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_017 extends CommonPage {
    String currentUrl="";

    @Given("the user goes to hypnotes web page")
    public void the_User_Goes_To_Hypnotes_WebPage() {
        driver.get("https://test.hypnotes.net/");
    }

    @And("the user clicks Sign Up free button")
    public void the_User_Clicks_SignUpFree_Button() {
        getRegisterPage().signUpForFree.click();
    }

    @And("the user clicks on Client Log in")
    public void the_User_Clicks_On_Client_LogIn() {
        getRegisterPage().iAmClientButton.click();
        ReusableMethods.waitFor(1);
    }

    @Given("the user clicks Sign in with Apple button")
    public void the_user_clicks_sign_in_with_apple_button() {
        getRegisterPage().signInWithApple.click();

    }

    @Given("the user enters a valid  email in the email field")
    public void the_user_enters_a_valid_email_in_the_email_field() {
        ReusableMethods.waitFor(1);
        getRegisterPage().inputMail.sendKeys("kesf@gmail.com");
        ReusableMethods.waitFor(1);
        getRegisterPage().next_button.click();

    }
    @Given("the user enters a  password in the password fields.")
    public void the_user_enters_a_password_in_the_password_fields() {
        ReusableMethods.waitFor(1);
        getRegisterPage().enterPassword.sendKeys("12hk&99");
        ReusableMethods.waitFor(1);
        getRegisterPage().next_button.click();

    }

    @And("the user verifies alert message")
    public void the_User_Verifies_AlertMessage() {
     Assert.assertTrue(getRegisterPage().alertPage.isDisplayed());
     ReusableMethods.waitFor(2);
    }











}
