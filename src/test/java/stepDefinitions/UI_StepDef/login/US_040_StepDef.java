package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.CommonPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.actions;
import static stepDefinitions.Hooks.driver;

public class US_040_StepDef {

    LoginPage loginPage = new LoginPage();


    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hypnotes"));
        // String hypnotesWindowHandleDegeri= driver.getWindowHandle(); bunu kullanmam gerekebilir
        ReusableMethods.waitFor(5);


    }

    @When("Click Login")
    public void click_login() {
        loginPage.Login.click();


    }

    @Then("User click Forgot Your Password")
    public void userClickForgotYourPassword() {
        loginPage.ForgotYourPassword.click();
        ReusableMethods.waitFor(10);

    }

    @Then("Forgot Password window should be functional")
    public void window_should_be_functional() {
        loginPage.ForgotYourPasswordWindow.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Then("User enters a valid email")
    public void user_enters_a_valid_email() {
        loginPage.ButtonEmail.sendKeys(ConfigurationReader.getProperty("validEmail"));
        ReusableMethods.waitFor(2);

    }

    @Then("Send Email button should be functional Click Send Email")
    public void button_should_be_functional() {
        loginPage.ButtonSendEmail.isSelected();
        ReusableMethods.waitFor(2);
        loginPage.ButtonSendEmail.click();
    }

    @Then("User should receive a successful reset message")
    public void user_should_receive_a_successful_reset_message() {
        loginPage.Alert.isDisplayed();
        ReusableMethods.waitFor(2);
        //Driver.closeDriver();

    }

    @Then("User receives email reset request in the mailbox")
    public void user_receives_email_reset_request_in_the_mailbox() {
        // actions.sendKeys(Keys.chord(Keys.CONTROL,"t")).perform();bunu kullanmadim

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://yopmail.com/fr/");
        ReusableMethods.waitFor(1);
        ReusableMethods.switchToWindow(1);//burayi kapatip birdaha dene
        ReusableMethods.waitFor(1);
        loginPage.MailCookies.click();
        ReusableMethods.waitFor(2);
        loginPage.MailSaissirAdresse.sendKeys("testhypnotes",Keys.ENTER);
        ReusableMethods.waitFor(2);

        /* ((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
        driver.get("https://yopmail.com/fr/");
        burdan itibaren yeni bir tab yaptik tab acildi ve handle yapmam lazim ibrahim hoca ile */
    }

    @Then("New Password  screen should appear")
    public void new_password_screen_should_appear() {
        ReusableMethods.waitFor(3);
        // JS_utilities.clickWithJS(loginPage.PasswordReset);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(ConfigurationReader.getProperty("mailyeniadres"));
        ReusableMethods.waitFor(2);

    }
    //yeni sayfaya gectik
    @Then("User enter valid email for New Password")
    public void user_enter_valid_email_for_new_password() {
        loginPage.EmailAddressForNewPassword.sendKeys(ConfigurationReader.getProperty("validEmail"));
        ReusableMethods.waitFor(3);


    }
    @Then("User enter new Password")
    public void user_enter_new_password() {
        loginPage.NewPasswordforRESET.sendKeys(ConfigurationReader.getProperty("resetpassword"));
        ReusableMethods.waitFor(1);

    }


    @Then("User enter comfirm Password")
    public void user_enter_comfirm_password() {
        loginPage.ComfirmPassword.sendKeys(ConfigurationReader.getProperty("resetpassword"));


    }
    @Then("Click button Submit")
    public void click_button_submit() {
        loginPage.Submitbutton.click();
    }



    @Then("user should be able to see Password has been updated")
    public void user_should_be_able_to_see() {

    }
    @Then("Click Go to Login Page")
    public void click_go_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Therapist Login  should be seen")
    public void therapist_login_should_be_seen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }









}
