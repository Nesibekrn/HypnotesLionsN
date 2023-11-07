package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import stepDefinitions.Hooks;
import utilities.ReusableMethods;

public class US_074_StepDef extends CommonPage {
    @And("the user is on the Clients page")
    public void theUserIsOnTheClientsPage() {


    }

    @When("the user clicks on the View Details button")
    public void theUserClicksOnTheViewDetailsButton() {
        getClientsPage().viewDetailsButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("the user clicks on the Invoices button")
    public void theUserClicksOnTheInvoicesButton() {
    }

    @Then("a valid logo is uploaded to the Your Logo field")
    public void aValidLogoIsUploadedToTheYourLogoField() {
    }

    @And("a valid company name is entered in the Your Company field")
    public void aValidCompanyNameIsEnteredInTheYourCompanyField() {
    }

    @And("a valid name is entered in the Your Name field")
    public void aValidNameIsEnteredInTheYourNameField() {
    }

    @And("a valid address is entered in the Company's Address field")
    public void aValidAddressIsEnteredInTheCompanySAddressField() {
    }

    @And("valid information related to city, state, and zip code is entered in the City, State, Zip field")
    public void validInformationRelatedToCityStateAndZipCodeIsEnteredInTheCityStateZipField() {
    }

    @And("the user selects a country from the Country drop-down menu")
    public void theUserSelectsACountryFromTheCountryDropDownMenu() {
    }
}
