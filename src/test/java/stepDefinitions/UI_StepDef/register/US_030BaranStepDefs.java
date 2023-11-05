package stepDefinitions.UI_StepDef.register;

import com.github.javafaker.Faker;
import enums.LINKS;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;

public class US_030BaranStepDefs extends CommonPage {
    Faker faker = new Faker();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @Given("user goes to therapist register page B")
    public void user_goes_to_therapist_register_page_b() {
        driver.get(LINKS.THERAPIST_REGISTER_URL.getLink());
    }

    @When("user submits a valid name to the Full Name section B")
    public void user_submits_a_valid_name_to_the_full_name_section_b() {
        getRegisterPage().input_fullName.sendKeys(faker.name().fullName());
    }

    @When("user submits a valid email to the Email section B")
    public void user_submits_a_valid_email_to_the_email_section_b() {
        getRegisterPage().input_email.sendKeys(faker.internet().emailAddress());
    }

    @When("user submits a valid passowrd to the Password section B")
    public void user_submits_a_valid_passowrd_to_the_password_section_b() {
        getRegisterPage().input_password.sendKeys(faker.internet().password(8, 50, true, true, true));
    }

    @Then("user clicks on Sign Up button B")
    public void user_clicks_on_sign_up_button_b() {
        getRegisterPage().button_signUp.click();
    }

    @Then("user verifies {string} header is displayed B")
    public void user_verifies_header_is_displayed_b(String header) {
        wait.until(ExpectedConditions.visibilityOf(getRegisterPage().header_verifyEmail));
        assertEquals(header, getRegisterPage().header_verifyEmail.getText());
    }

    @But("user submits an invalid email to the Email section B")
    public void userSubmitsAnInvalidEmailToTheEmailSectionB() {
        getRegisterPage().input_email.sendKeys("john123gmail.com");
    }

    @And("user verifies a warning message contains {string} B")
    public void userVerifiesAWarningMessageContainsB(String message) {
        assertTrue(getRegisterPage().input_email.getAttribute("validationMessage").contains(message));
    }

    @When("user submits another invalid email to the Email section B")
    public void user_submits_another_invalid_email_to_the_email_section_b() {
        getRegisterPage().input_email.sendKeys("john123@gmail");
    }

    @Then("user verifies the pop-up message is {string} B")
    public void user_verifies_the_pop_up_message_is_b(String message) {
        ReusableMethods.waitForVisibility(getRegisterPage().popUp_validationError, 5);
        assertEquals("Pop-up message was not true", message, getRegisterPage().popUp_validationError.getText());
    }

}
