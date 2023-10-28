package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import pages.CommonPage;
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
        getRegisterPage().InputEmail.sendKeys("nurcanka6@yopmail.com");
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
    public void user_should_be_able_to_see_verify_email_text_in_mailbox() {driver.switchTo().newWindow(WindowType.WINDOW);
       driver.get("https://yopmail.com");
       driver.findElement(By.xpath("//input[@class='ycptinput']")).sendKeys("nurcanka6");
       driver.findElement(By.xpath("//button[@class='md']")).click();
       ReusableMethods.waitFor(4);
    }
    @When("User click verify email in mailbox")
    public void userClickVerifyEmailInMailbox() {
        WebElement emailiframe=driver.findElement(By.xpath("//iframe[@id='ifmail']"));
        driver.switchTo().frame(emailiframe);
        driver.findElement(By.xpath("//a[contains(text(),'VERIFY EMAIL')]")).click();
        ReusableMethods.waitFor(2);
        driver.switchTo().parentFrame();
        ReusableMethods.waitFor(2);
        ReusableMethods.switchToWindow(2);
        ReusableMethods.waitFor(4);
    }
    @Then("User should go login page")
    public void userShouldGoLoginPage() {
        String ExpectedUrl="https://test.hypnotes.net/login?email_verified=Your%20email%20successfully%20verified.%20Please%20login.";
        Assert.assertEquals(ExpectedUrl,driver.getCurrentUrl());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }
}
