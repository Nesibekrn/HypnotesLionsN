package stepDefinitions.UI_StepDef.register;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import pages.CommonPage;
import pages.RegisterPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class US_029_StepDef extends CommonPage {
    Faker faker=new Faker();
    String enteredFullName=faker.name().fullName();
    @When("user enters valid full name.")
    public void userEntersValidFullName() {
        getRegisterPage().input_fullName.clear();
        getRegisterPage().input_fullName.sendKeys(enteredFullName);
        
    }

    @Then("the name is accepted without error.")
    public void theNameIsAcceptedWithoutError() {
        String actualFullName=getRegisterPage().input_fullName.getAttribute("value");
        //if entered name is matching with actaul name It means fullname input functions as expected.
        assertEquals("Not matching names.",enteredFullName,actualFullName);
        
    }

    @When("user leaves empty full name field.")
    public void userLeavesEmptyFullNameField() {
        getRegisterPage().input_fullName.sendKeys("");
        
    }

    @And("user enters a valid email address.")
    public void userEntersAValidEmailAddress() {
        getRegisterPage().input_email.clear();
        getRegisterPage().input_email.sendKeys("hello@gmail.com");
        
    }

    @And("user enters a valid password.")
    public void userEntersAValidPassword() {
        getRegisterPage().inputPassword.clear();
        getRegisterPage().inputPassword.sendKeys("Aweeee345./");
        
    }

    @And("user clicks on Sign Up button.")
    public void userClicksOnSignUpButton() {
        getRegisterPage().button_signUp.click();
        
        
    }

    @Then("The full name field should display a message as {string}")
    public void theFullNameFieldShouldDisplayAMessageAs(String expectedWarningMessage) {
        ReusableMethods.waitFor(3);
        assertEquals(expectedWarningMessage,getRegisterPage().input_fullName.getAttribute("validationMessage"));
        
    }

    @And("user leaves empty email field.")
    public void userLeavesEmptyEmailField() {
        getRegisterPage().input_email.clear();
        getRegisterPage().input_email.sendKeys("");
    }

    @Then("The email field should display a message as {string}")
    public void theEmailFieldShouldDisplayAMessageAs(String expectedWarningMessage) {
        assertEquals(expectedWarningMessage,getRegisterPage().input_email.getAttribute("validationMessage"));
        
    }

    @And("user leaves empty password field.")
    public void userLeavesEmptyPasswordField() {
        getRegisterPage().inputPassword.clear();
        getRegisterPage().inputPassword.sendKeys("");
        
    }

    @Then("Sign Up button should be disabled.")
    public void signUpButtonShouldBeDisabled() {
        assertTrue(!getRegisterPage().signUpButton.isEnabled());
    }
}
