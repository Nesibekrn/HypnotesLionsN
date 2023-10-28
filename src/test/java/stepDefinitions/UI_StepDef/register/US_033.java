package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_033 extends CommonPage {

    @Given("User goes to register page")
    public void user_goes_to_register_page() {
        driver.get("https://test.hypnotes.net/register/");
    }
    @When("User enters the fullname")
    public void user_enters_the_fullname() {
        getRegisterPage().InputFullName.sendKeys("NancyY");
    }
    @When("User enters valid  email")
    public void user_enters_valid_email() {
        getRegisterPage().InputEmail.sendKeys("nurcanka@yopmail.com");
    }
    @When("User enters valid password")
    public void user_enters_valid_password() {
        getRegisterPage().InputPassword.sendKeys("1234Nur%?");
    }
    @When("User clicks sign up button")
    public void user_clicks_sign_up_button() {
        getRegisterPage().ButtonSignUp.click();
        ReusableMethods.waitFor(4);


    }
    @Then("User should be able to see Verify Email text in mailbox")
    public void user_should_be_able_to_see_verify_email_text_in_mailbox() {
driver.get("https://yopmail.com");

        WebElement CheckInboxButton = driver.findElement(By.xpath("//span[text()='Check Inbox']"));
//span[.='Check Inbox']
        ReusableMethods.waitForClickablility(CheckInboxButton,4);
        JS_utilities.scrollAndClickWithJS( CheckInboxButton);
       //CheckInboxButton.click();
        //driver.get("https://yopmail.com/wm");
        ReusableMethods.waitFor(4);

    }

    @When("User click verify email in mailbox")
    public void userClickVerifyEmailInMailbox() {
        driver.switchTo().frame("ifmail");
       // driver.switchTo().frame("ifinbox");
        driver.findElement(By.linkText("VERIFY EMAIL)")).click();
        driver.switchTo().parentFrame();
        ReusableMethods.switchToWindow(2);
        ReusableMethods.waitFor(4);
    }
    @Then("User should go login page")
    public void userShouldGoLoginPage() {
         Assert.assertEquals("https://test.hypnotes.net/login",driver.getCurrentUrl());
         System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

    }
}
