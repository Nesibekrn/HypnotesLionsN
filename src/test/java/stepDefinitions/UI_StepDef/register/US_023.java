package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WindowType;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.switchToWindow;
import static utilities.ReusableMethods.waitFor;

public class US_023 extends CommonPage {
    @And("user enters a valid email")
    public void userEntersAValidEmail() {
        getRegisterPage().inputEmail.sendKeys("zeyno1234@yopmail.com");
    }

    @And("user enters a valid  Password")
    public void userEntersAValidPassword() {
        getRegisterPage().inputPassword.sendKeys("Test123.");
    }

    @And("User receives  verify email request in the mailbox")
    public void userReceivesVerifyEmailRequestInTheMailbox() {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://yopmail.com");
        waitFor(3);
        getRegisterPage().yopmailEmail.sendKeys("zeyno1234");
        getRegisterPage().yopmailEmailInbox.click();
        driver.switchTo().frame(getRegisterPage().verifyEmailFrame);
        waitFor(10);



    }
    @And("user clicks verify email button")
    public void userClicksVerifyEmailButton() {
        getRegisterPage().verifyEmailYopmailInbox.click();
        Assert.assertTrue(getRegisterPage().verifyEmailYopmailInbox.isDisplayed());
        System.out.println(getRegisterPage().verifyEmailYopmailInbox.getText());
        waitFor(3);
       driver.switchTo().parentFrame();
        waitFor(3);
        switchToWindow(2);

    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
        getLoginPage().clientLogin_link.click();
        waitFor(3);
        getLoginPage().email_login.sendKeys("zeyno1234@yopmail.com");
    }

    @And("user enters verified email address and password")
    public void userEntersVerifiedEmailAddressAndPassword() {
        getLoginPage().password_Login.sendKeys("Test123.");
        waitFor(2);
    }

    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() throws InterruptedException {
        getLoginPage().ClientloginButton.click();
Thread.sleep(2000);
        //ReusableMethods.waitForPageToLoad(5);
    }

    @Then("user verifies  that it's account is opened")
    public void userVerifiesThatItSAccountIsOpened() {

String expectedUrl="https://test.hypnotes.net/client-dashboard/appointments";
waitFor(2);
Assert.assertEquals(expectedUrl,driver.getCurrentUrl());
    }


}
