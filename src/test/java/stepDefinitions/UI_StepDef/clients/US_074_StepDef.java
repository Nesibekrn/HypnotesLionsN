package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import stepDefinitions.Hooks;
import utilities.ReusableMethods;
import utilities.ReusableMethods;
import java.io.File;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class US_074_StepDef extends CommonPage {


    @Given("a Therapist User is logged")
    public void aTherapistUserIsLogged() {

    }

    @And("the user is on the Clients page")
    public void theUserIsOnTheClientsPage() {
        getClientsPage().clients_button.click();

        try {
            getClientsPage().cancelPopUpButton.click();
        } catch (Exception E){
            System.out.println("Cancel popup button");
        }
    }

    @When("the user clicks on the View Details button")
    public void theUserClicksOnTheViewDetailsButton() {
        getClientsPage().viewDetailsButton.click();
        ReusableMethods.waitFor(2);

    }

    @And("the user clicks on the Invoices button")
    public void theUserClicksOnTheInvoicesButton() {
        ReusableMethods.waitFor(3);

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

        ReusableMethods.waitFor(5);
    }

    @And("a valid company name is entered in the Your Company field")
    public void aValidCompanyNameIsEnteredInTheYourCompanyField() {
        assertTrue("Your Company input field should be enabled", getClientsPage().inputYourCompanyButton.isEnabled());

        String expectedCompanyName = "Therapist Company";
        getClientsPage().inputYourCompanyButton.clear();
        getClientsPage().inputYourCompanyButton.sendKeys(expectedCompanyName);

        String actualCompanyName = getClientsPage().inputYourCompanyButton.getAttribute("value");

        assertEquals("Expected company name and actual company name should be equal.", expectedCompanyName, actualCompanyName);
    }

    @And("a valid name is entered in the Your Name field")
    public void aValidNameIsEnteredInTheYourNameField() {
        assertTrue("Therapist name input should be enabled", getClientsPage().inputTherapistName.isEnabled());

        String expectedTherapistName = "Fikret Tekin";
        getClientsPage().inputTherapistName.clear();
        getClientsPage().inputTherapistName.sendKeys(expectedTherapistName);

        String actualTherapistName = getClientsPage().inputTherapistName.getAttribute("value");

        assertEquals("Expected Therapist name and Actual Therapist name should be equal.", expectedTherapistName, actualTherapistName);
    }

    @And("a valid address is entered in the Company's Address field")
    public void aValidAddressIsEnteredInTheCompanySAddressField() {
        assertTrue("Company address ", getClientsPage().inputCompanyAddress.isEnabled());

        String expectedCompanyAddress = "A street";
        getClientsPage().inputCompanyAddress.clear();
        getClientsPage().inputCompanyAddress.sendKeys(expectedCompanyAddress);

        String actualCompanyAddress = getClientsPage().inputCompanyAddress.getAttribute("value");

        assertEquals("Expected company address and actual company address should be equal.", expectedCompanyAddress, actualCompanyAddress);
    }

    @And("valid information related to city, state, and zip code is entered in the City, State, Zip field")
    public void validInformationRelatedToCityStateAndZipCodeIsEnteredInTheCityStateZipField() {
        assertTrue("City, State, ZIP code should be enabled", getClientsPage().inputCityStateZip.isEnabled());

        String expectedCityStateZip = "San Jose, California, 12345";
        getClientsPage().inputCityStateZip.clear();
        getClientsPage().inputCityStateZip.sendKeys(expectedCityStateZip);
        String actualCityStateZip = getClientsPage().inputCityStateZip.getAttribute("value");

        assertEquals("Expected City State Zip and actual City State Zip should be equal.", expectedCityStateZip, actualCityStateZip);
        ReusableMethods.waitFor(5);
    }

    @And("the user selects a country from the Country drop-down menu")
    public void theUserSelectsACountryFromTheCountryDropDownMenu() {

        getClientsPage().dropDownCountryWithoutSelect.click();

        Select select = new Select(getClientsPage().dropDownCountrySelect);
        ReusableMethods.waitFor(5);
        select.selectByVisibleText("Australia");
        ReusableMethods.waitFor(5);

        Assert.assertTrue(getClientsPage().selectCountry.getAttribute("value").contains("Australia"));
    }
}
