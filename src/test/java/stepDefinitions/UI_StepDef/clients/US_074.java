package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import stepDefinitions.Hooks;
import utilities.JS_utilities;
import utilities.ReusableMethods;
import utilities.ReusableMethods;

import javax.swing.*;
import java.io.File;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;


public class US_074 extends CommonPage {

    Actions actions = new Actions(driver);

    @Given("a Therapist User is logged")
    public void aTherapistUserIsLogged() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue("URL was :", driver.getCurrentUrl().contains("dashboard"));
    }

    @And("the user is on the Clients page")
    public void theUserIsOnTheClientsPage() {
        Assert.assertTrue(getClientsPage().clients_button.isDisplayed());
        getClientsPage().clients_button.click();

        try {
            getClientsPage().cancelPopUpButton.click();
        } catch (Exception E){
            System.out.println("Cancel popup button does not need to use.");
        }
        Assert.assertTrue(driver.getCurrentUrl().contains("clients"));
    }

    @When("the user clicks on the View Details button")
    public void theUserClicksOnTheViewDetailsButton() {
        getClientsPage().viewDetailsButton.click();
        ReusableMethods.waitFor(2);

    }

    @And("the user clicks on the Invoices button")
    public void theUserClicksOnTheInvoicesButton() {

        ReusableMethods.waitForClickability(getClientsPage().invoicesButton, 5);
        Assert.assertTrue(getClientsPage().invoicesButton.isDisplayed());
        getClientsPage().invoicesButton.click();
    }

    @Then("a valid logo is uploaded to the Your Logo field")
    public void aValidLogoIsUploadedToTheYourLogoField() {

        if (getClientsPage().inputYourLogoButton != null) {
            System.out.println("File input element found.");
        } else {
            System.out.println("File input element not found.");
        }

        // Check the logoPath
        File file = new File("src/test/resources/Upload Images/therapistLogo.png");
        String logoPath = file.getAbsolutePath();
        System.out.println("Logo path: " + logoPath);

        getClientsPage().inputYourLogoButton.sendKeys(logoPath);

        ReusableMethods.verifyElementDisplayed(getClientsPage().inputYourLogoButton);
        assertTrue("Your Logo input field should be displayed", getClientsPage().inputYourLogoButton.isDisplayed());

        ReusableMethods.waitFor(3);
    }

    @And("a valid company name is entered in the Your Company field")
    public void aValidCompanyNameIsEnteredInTheYourCompanyField() {
        Assert.assertTrue("Your Company input field should be displayed", getClientsPage().inputYourCompanyButton.isDisplayed());

        getClientsPage().inputYourCompanyButton.clear();

        String expectedCompanyName = "Therapist Company";
        getClientsPage().inputYourCompanyButton.sendKeys(expectedCompanyName);

        String actualCompanyName = getClientsPage().inputYourCompanyButton.getAttribute("value");
        Assert.assertEquals("Expected company name and actual company name should be equal.", expectedCompanyName, actualCompanyName);

    }

    @And("a valid name is entered in the Your Name field")
    public void aValidNameIsEnteredInTheYourNameField() {
        Assert.assertTrue("Therapist name input should be displayed", getClientsPage().inputTherapistName.isDisplayed());

        getClientsPage().inputTherapistName.clear();
        String expectedTherapistName = "Fikret Tekin";
        getClientsPage().inputTherapistName.sendKeys(expectedTherapistName);

        String actualTherapistName = getClientsPage().inputTherapistName.getAttribute("value");
        Assert.assertEquals("Expected Therapist name and Actual Therapist name should be equal.", expectedTherapistName, actualTherapistName);
    }

    @And("a valid address is entered in the Company's Address field")
    public void aValidAddressIsEnteredInTheCompanySAddressField() {
        Assert.assertTrue("Company address should be displayed", getClientsPage().inputCompanyAddress.isDisplayed());

        getClientsPage().inputCompanyAddress.clear();
        String expectedCompanyAddress = "A street";
        getClientsPage().inputCompanyAddress.sendKeys(expectedCompanyAddress);

        String actualCompanyAddress = getClientsPage().inputCompanyAddress.getAttribute("value");
        Assert.assertEquals("Expected company address and actual company address should be equal.", expectedCompanyAddress, actualCompanyAddress);
    }

    @And("valid information related to city, state, and zip code is entered in the City, State, Zip field")
    public void validInformationRelatedToCityStateAndZipCodeIsEnteredInTheCityStateZipField() {
        Assert.assertTrue("City, State, ZIP code should be displayed", getClientsPage().inputCityStateZip.isEnabled());

        getClientsPage().inputCityStateZip.clear();
        String expectedCityStateZip = "San Jose, California, 12345";
        getClientsPage().inputCityStateZip.sendKeys(expectedCityStateZip);

        String actualCityStateZip = getClientsPage().inputCityStateZip.getAttribute("value");
        Assert.assertEquals("Expected City State Zip and actual City State Zip should be equal.", expectedCityStateZip, actualCityStateZip);

    }

    @And("the user selects a country from the Country drop-down menu")
    public void theUserSelectsACountryFromTheCountryDropDownMenu() {
         Assert.assertTrue("Expected City State Zip and actual City State Zip should be equal.", getClientsPage().dropDownCountrySelect.getAttribute("value").contains("Australia"));

        // Click the dropdown element to open the options
        getClientsPage().dropDownCountryWithoutSelect.click();

        ReusableMethods.waitFor(2);

        // Find the option element and select "Australia" using JavaScript
        String expectedCountry = "Australia";
        String script = "document.querySelector(\"select[class='invoice_select__WnoPF   false'] option[value='" + expectedCountry + "']\").selected = true;";
        ((JavascriptExecutor) driver).executeScript(script);

        ReusableMethods.waitFor(5);

        String actualSelectOption = getClientsPage().dropDownCountrySelect.getAttribute("value");

        Assert.assertEquals("Expected selected country: Australia", expectedCountry, actualSelectOption);

    }
}
