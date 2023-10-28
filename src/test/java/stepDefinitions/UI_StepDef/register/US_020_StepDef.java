package stepDefinitions.UI_StepDef.register;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.*;
import static stepDefinitions.Hooks.driver;

public class US_020_StepDef extends CommonPage {
    Faker faker=new Faker();
    @Then("User lands on register page")
    public void userLandsOnRegisterPage() {
        assertEquals("User is not on the register page","https://test.hypnotes.net/register",driver.getCurrentUrl());
    }

    @And("{string} link should be visible and clikable.")
    public void linkShouldBeVisibleAndClikable(String expectedLinkName) {
        getRegisterPage().verifyIamAclientLink(expectedLinkName);

    }

    @Then("Client register page should be accessible.")
    public void clientRegisterPageShouldBeAccessible() {
        ReusableMethods.waitForPageToLoad(5);
        //assertEquals("https://test.hypnotes.net/register/client",driver.getCurrentUrl());
        assertTrue(getRegisterPage().registerAsAClientText.isDisplayed());
    }
String expectedName=faker.name().firstName();
String expectedSurname=faker.name().firstName();
    @When("user enters letters in name and surname inputboxes")
    public void userEntersLettersInNameAndSurnameInputboxes() {
        getRegisterPage().inputName.sendKeys(expectedName);
        getRegisterPage().inputSurname.sendKeys(expectedSurname);

    }

    @Then("name and surname fields functions as expected.")
    public void nameAndSurnameFieldsFunctionsAsExpected() {
        String actualName=getRegisterPage().inputName.getAttribute("value");
        String actualSurname=getRegisterPage().inputSurname.getAttribute("value");
        assertEquals(expectedName,actualName );
        assertEquals(expectedSurname,actualSurname);
    }

    @And("user enters invalid emails and gets proper warning message")
    public void userEntersInvalidEmailsAndGetsProperWarningMessage(DataTable table) {
        List<String> invalidEmails = table.column(0);
        List<String> expectedWarnigMessage = table.column(1);
        for (int i=0; i< invalidEmails.size(); i++){
            getRegisterPage().inputEmail.clear();
            ReusableMethods.waitFor(2);
       getRegisterPage().inputEmail.sendKeys(invalidEmails.get(i));
       getRegisterPage().inputPassword.sendKeys("Assdf2334.");
            getRegisterPage().signUpButton.click();
            String actualWarningMessage=getRegisterPage().inputEmail.getAttribute("validationMessage");
            assertEquals(expectedWarnigMessage.get(i),actualWarningMessage);
        }
    }

    @And("user enters invalid email as {string}")
    public void userEntersInvalidEmailAs(String invalidEmail) {
        getRegisterPage().inputEmail.clear();
        getRegisterPage().inputEmail.sendKeys(invalidEmail);
    }
}
