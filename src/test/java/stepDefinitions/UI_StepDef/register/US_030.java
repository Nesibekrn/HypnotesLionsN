
//package stepDefinitions.UI_StepDef.register;
//
//import com.github.javafaker.Faker;
//import io.cucumber.java.en.*;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import pages.CommonPage;
//import utilities.ReusableMethods;
//
//import java.time.Duration;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static stepDefinitions.Hooks.driver;
//
//public class US_030 extends CommonPage {
//    Faker faker = new Faker();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//    @Given("user goes to therapist register page")
//    public void userGoesToTherapistRegisterPage() {
//      driver.get("https://test.hypnotes.net/register");
//    }
//
//    @When("user submits a valid name to the Full Name section")
//    public void userSubmitsAValidNameToTheFullNameSection() {
//        getRegisterPage().input_fullName.sendKeys(faker.name().fullName());
//    }
//
//    @And("user submits a valid email to the Email section")
//    public void userSubmitsAValidEmailToTheEmailSection() {
//        getRegisterPage().input_email.sendKeys(faker.internet().emailAddress());
//
//    }
//
//    @And("user submits a valid passowrd to the Password section")
//    public void userSubmitsAValidPassowrdToThePasswordSection() {
//
//        getRegisterPage().inputPassword.sendKeys("Adam.123");
//    }
//
//    @Then("user clicks on Sign Up button")
//    public void userClicksOnSignUpButton() {
//        getRegisterPage().button_signUp.click();
//    }
//
//    @And("user verifies {string} header is displayed")
//    public void userVerifiesVerifyEmailHeaderIsDisplayed(String header) {
//        wait.until(ExpectedConditions.visibilityOf(getRegisterPage().header_verifyEmail));
//        assertEquals(header, getRegisterPage().header_verifyEmail.getText());
//    }
//
//    @But("user submits an invalid email to the Email section")
//    public void userSubmitsAnInvalidEmailToTheEmailSection() {
//        getRegisterPage().input_email.sendKeys("adam123gmail.com");
//    }
//
//
//    @And("user verifies a warning message contains {string}")
//    public void userVerifiesAWarningMessageContains(String message) {
//        assertTrue(getRegisterPage().input_email.getAttribute("validationMessage").contains(message));
//
//    }
//
//    @But("user submits another invalid email to the Email section")
//    public void userSubmitsAnotherInvalidEmailToTheEmailSection() {
//        getRegisterPage().input_email.sendKeys("john123@gmail");
//
//    }
//
//    @And("user verifies the pop-up message is {string}")
//    public void userVerifiesThePopUpMessageIsValidationError(String message) {
//        ReusableMethods.waitForVisibility(getRegisterPage().popUp_validationError, 5);
//        assertEquals("Pop-up message was not true", message, getRegisterPage().popUp_validationError.getText());
//
//
//    }
//}

package stepDefinitions.UI_StepDef.register;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;

public class US_030 extends CommonPage {
    /*
    Faker faker = new Faker();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @Given("user goes to therapist register page")
    public void userGoesToTherapistRegisterPage() {
      driver.get("https://test.hypnotes.net/register");
    }

    @When("user submits a valid name to the Full Name section")
    public void userSubmitsAValidNameToTheFullNameSection() {
        getRegisterPage().input_fullName.sendKeys(faker.name().fullName());
    }

    @And("user submits a valid email to the Email section")
    public void userSubmitsAValidEmailToTheEmailSection() {
        getRegisterPage().input_email.sendKeys(faker.internet().emailAddress());

    }

    @And("user submits a valid passowrd to the Password section")
    public void userSubmitsAValidPassowrdToThePasswordSection() {

        getRegisterPage().inputPassword.sendKeys("Adam.123");
    }

    @Then("user clicks on Sign Up button")
    public void userClicksOnSignUpButton() {
        getRegisterPage().button_signUp.click();
    }

    @And("user verifies {string} header is displayed")
    public void userVerifiesVerifyEmailHeaderIsDisplayed(String header) {
        wait.until(ExpectedConditions.visibilityOf(getRegisterPage().header_verifyEmail));
        assertEquals(header, getRegisterPage().header_verifyEmail.getText());
    }

    @But("user submits an invalid email to the Email section")
    public void userSubmitsAnInvalidEmailToTheEmailSection() {
        getRegisterPage().input_email.sendKeys("adam123gmail.com");
    }


    @And("user verifies a warning message contains {string}")
    public void userVerifiesAWarningMessageContains(String message) {
        assertTrue(getRegisterPage().input_email.getAttribute("validationMessage").contains(message));

    }

    @But("user submits another invalid email to the Email section")
    public void userSubmitsAnotherInvalidEmailToTheEmailSection() {
        getRegisterPage().input_email.sendKeys("john123@gmail");

    }

    @And("user verifies the pop-up message is {string}")
    public void userVerifiesThePopUpMessageIsValidationError(String message) {
        ReusableMethods.waitForVisibility(getRegisterPage().popUp_validationError, 5);
        assertEquals("Pop-up message was not true", message, getRegisterPage().popUp_validationError.getText());


    }

     */
}

