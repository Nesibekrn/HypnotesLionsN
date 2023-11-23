package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WindowType;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;


public class US_040_StepDef {

    LoginPage loginPage = new LoginPage();
    US_040_Mail_And_CreateAnAccount Us040_Mail=new US_040_Mail_And_CreateAnAccount();



    @Given("user take an valid Email and Create An Account")
    public void userTakeAnValidEmailAndCreateAnAccount() {
        Us040_Mail.takeValidEmail();//burda yeni bir mail hesabi ve ardindan hypnotes de yeni bir account olusturduk
        ReusableMethods.waitFor(5);
    }




    @Given("User is on the home page")
    public void user_is_on_the_home_page() {

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(ConfigurationReader.getProperty("hypnotes"));
        ReusableMethods.waitFor(5);


    }

    @When("Click Login")
    public void click_login() {
        loginPage.Login.click();


    }

    @Then("User click Forgot Your Password")
    public void userClickForgotYourPassword() {
        loginPage.ForgotYourPassword.click();
        ReusableMethods.waitFor(5);

    }

    @Then("Forgot Password window should be functional")
    public void window_should_be_functional() {
        loginPage.ForgotYourPasswordWindow.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Then("User enters a valid email")
    public void user_enters_a_valid_email() {
        loginPage.ButtonEmail.sendKeys(Us040_Mail.randomNameyeni+"@yopmail.com");
        ReusableMethods.waitFor(5);

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


    }

    @Then("User receives email reset request in the mailbox")
    public void user_receives_email_reset_request_in_the_mailbox() {

        //2.YOL
        ReusableMethods.switchToWindow(0);//2.YOL
        ReusableMethods.waitFor(5);
        loginPage.MailSaissirRefresh.click();
        ReusableMethods.waitFor(1);

     /*sayfalar arasi gecis icin

      1.YOL
      Set<String> windowHandels = Driver.getDriver().getWindowHandles();
        String HypnotesEmailUrl = Driver.getDriver().getWindowHandle();
        for (String tab : windowHandels) {
            if (!tab.equals(HypnotesEmailUrl)) {
                Driver.getDriver().switchTo().window(tab);
                break;
            }
        }

      */


    }

    @Then("New Password  screen should appear")
    public void new_password_screen_should_appear() {
        driver.switchTo().frame(loginPage.IframeYopmail);
        loginPage.PasswordResetButton.click();
        ReusableMethods.waitFor(2);
    }

    //yeni sayfaya gectik
    @Then("User enter valid email for New Password")
    public void user_enter_valid_email_for_new_password() {
        ReusableMethods.switchToWindow(2);//bu satir 'da onemli tekrar sayfa gecisi yaptik
        ReusableMethods.waitFor(3);
        loginPage.EmailAddressForNewPassword.sendKeys(Us040_Mail.randomNameyeni+"@yopmail.com");
        ReusableMethods.waitFor(3);
    }

    @Then("User enter new Password")
    public void user_enter_new_password() {
        loginPage.NewPasswordforRESET.click();
        loginPage.NewPasswordforRESET.sendKeys(ConfigurationReader.getProperty("resetpassword"));
        ReusableMethods.waitFor(1);

    }


    @Then("User enter comfirm Password")
    public void user_enter_comfirm_password() {
        loginPage.ComfirmPassword.click();
        loginPage.ComfirmPassword.sendKeys(ConfigurationReader.getProperty("resetpassword"));
        ReusableMethods.waitFor(1);


    }

    @Then("Click button Submit")
    public void click_button_submit() {
        loginPage.Submitbutton.click();
    }


    @Then("user should be able to see Password has been updated")
    public void user_should_be_able_to_see() {
        loginPage.MessagePasswordHasBeenUpdated.isDisplayed();
        ReusableMethods.waitFor(1);



    }

    @Then("Click Go to Login Page")
    public void click_go_to_login_page() {
        loginPage.ButtonGoToLoginPage.click();


    }

    @Then("Therapist Login  should be seen")
    public void therapist_login_should_be_seen() {
        ReusableMethods.waitFor(2);
        loginPage.Login.isDisplayed();



    }



}
