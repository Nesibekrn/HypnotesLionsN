package stepDefinitions.UI_StepDef.register;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;


public class US_019_StepDef extends CommonPage {

    Faker faker = new Faker();

    @Given("user goes to client register page")
    public void userGoesToClientRegisterPage() {
        driver.get("https://test.hypnotes.net/register/client");

    }
    @When("user enters a valid Name")
    public void user_enters_a_valid_name() {
        getRegisterPage().inputName.sendKeys(faker.name().firstName());

    }
    @When("user enters a valid Surname")
    public void user_enters_a_valid_surname() {
        getRegisterPage().inputSurname.sendKeys(faker.name().lastName());
    }
    @When("user enters a valid Email")
    public void user_enters_a_valid_email() {
        getRegisterPage().inputEmail.sendKeys(faker.internet().emailAddress());
    }
    @When("user enters a valid Password")
    public void user_enters_a_valid_password() {
        getRegisterPage().inputPassword.sendKeys(faker.internet().password(8, 50, true, true, true));
    }
    @When("the user clicks the Sign Up button")
    public void the_user_clicks_the_sign_up_button() {
        getRegisterPage().signUpButton.click();
        ReusableMethods.waitForClickability(getRegisterPage().signUpButton,3);
    }
    @Then("user is on the Verify Email page")
    public void userIsOnTheVerifyEmailPage() {
        assertTrue(getRegisterPage().verifyEmail.isDisplayed());
    }
    @When("user leaves the Name field blank")
    public void userLeavesTheNameFieldBlank() {
        getRegisterPage().inputName.sendKeys("");
    }
    @Then("user verifies Name warning message contains {string}")
    public void userVerifiesNameWarningMessageContains(String nameWarningMessage) {
        assertTrue(getRegisterPage().inputName.getAttribute("validationMessage").contains(nameWarningMessage));
    }
    @And("user leaves the Surname field blank")
    public void userLeavesTheSurnameFieldBlank() {
        getRegisterPage().inputSurname.sendKeys("");
    }
    @And("user clicks the Sign Up button")
    public void userClicksTheSignUpButton() {
        getRegisterPage().signUpButton.click();
    }
    @And("user leaves the Email field blank")
    public void userLeavesTheEmailFieldBlank() {
        getRegisterPage().inputEmail.sendKeys("");
    }
    @And("user leaves the Password field blank")
    public void userLeavesThePasswordFieldBlank() {
        getRegisterPage().inputPassword.sendKeys("");
    }
    @Then("the Sign Up button should not be clickable")
    public void theSignUpButtonShouldNotBeClickable() {
        Assert.assertFalse(getRegisterPage().signUpButton.isEnabled());
    }
    @Then("user verifies Surname warning message contains {string}")
    public void userVerifiesSurnameWarningMessageContains(String surnameWarningMessage) {
        assertTrue(getRegisterPage().inputSurname.getAttribute("validationMessage").contains(surnameWarningMessage));
    }
    @Then("user verifies Email warning message contains {string}")
    public void userVerifiesEmailWarningMessageContains(String emailWarningMessage) {
        assertTrue(getRegisterPage().inputEmail.getAttribute("validationMessage").contains(emailWarningMessage));
    }
}

