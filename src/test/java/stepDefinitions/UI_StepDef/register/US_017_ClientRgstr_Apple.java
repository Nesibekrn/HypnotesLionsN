package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_017_ClientRgstr_Apple extends CommonPage {
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
        ReusableMethods.waitFor(2);
    }

    @Given("the user clicks Sign in with Apple button")
    public void the_user_clicks_sign_in_with_apple_button() {
        getRegisterPage().signInWithApple.click();

    }

    @Given("the user enters a valid  email in the email field")
    public void the_user_enters_a_valid_email_in_the_email_field() {
        ReusableMethods.waitFor(3);
        getRegisterPage().inputMail.sendKeys("euroasiabazaar@gmail.com");
        ReusableMethods.waitFor(2);
        getRegisterPage().next_button.click();

    }
    @Given("the user enters a  password in the password fields.")
    public void the_user_enters_a_password_in_the_password_fields() {
        ReusableMethods.waitFor(1);
        getRegisterPage().enterPassword.sendKeys("Yasirbera2016&");
        ReusableMethods.waitFor(1);
        getRegisterPage().next_button.click();

    }
    @And("the user clicks on the continue button")
    public void the_User_Clicks_On_The_Continue_Button() {
        getRegisterPage().continueButton.click();

    }

    @Then("user verifies related page")
    public void user_verifies_related_page() {


    }



}
