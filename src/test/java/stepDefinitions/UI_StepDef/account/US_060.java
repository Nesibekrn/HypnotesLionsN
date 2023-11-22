package stepDefinitions.UI_StepDef.account;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitFor;

public class US_060 extends CommonPage {
    @Then("the user can see the previously attached company information")
    public void the_user_can_see_the_previously_attached_company_information() {
        ReusableMethods.scrollToElement(getAccountPage().button_edit);
        Assert.assertTrue(getAccountPage().card_companyInformation.isDisplayed());
    }

    @When("the user clicks the Edit button")
    public void the_user_clicks_the_edit_button() {
        getAccountPage().button_edit.click();
    }

    @Then("the user can see {string} page")
    public void the_user_can_see_the_edit_your_company_information_page(String message) {
        ReusableMethods.waitForVisibility(getAccountPage().title_editYourCompany, 2);
        Assert.assertEquals(message, getAccountPage().title_editYourCompany.getText());
    }

    @When("the user edits {string}")
    public void the_user_edits(String companyName) {
        ReusableMethods.clearValue(getAccountPage().input_CompanyName);
        getAccountPage().input_CompanyName.sendKeys(companyName);
    }

    @When("the user edits {string} in the company address")
    public void the_user_edits_in_the_company_address(String companyAddress) {
        ReusableMethods.clearValue(getAccountPage().companyAddress);
        getAccountPage().input_CompanyAddress.sendKeys(companyAddress);
    }

    @When("the user edits {string} in the City State Zip")
    public void the_user_edits_in_the_company_address_in_the_City_State_Zip(String cityStateZip) {
        ReusableMethods.clearValue(getAccountPage().input_CityStateZip);
        getAccountPage().input_CityStateZip.sendKeys(cityStateZip);
        ReusableMethods.waitFor(2);
    }

    @When("the user updates image")
    public void the_user_updates_image() {
        String imagePath = System.getProperty("user.dir") + "/src/test/resources/Upload Images/uploadImage.png";
        getAccountPage().input_Image.sendKeys(imagePath);
    }

    @When("the user clicks save button")
    public void the_user_clicks_save_button() {
        getAccountPage().saveButton.click();
    }

    @Then("user can see {string}")
    public void user_can_see(String message) {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(getAccountPage().messageUpdated.isDisplayed());
    }

    @When("the user edits {string} in the country section")
    public void the_user_edits_in_the_country_section(String country) {
       // JS_utilities.clickElementByJS(getAccountPage().input_Country);
        getAccountPage().countryDD.click();
        Select ss=new Select(getAccountPage().contryDropDownl);
        ss.selectByVisibleText(country);
        waitFor(6);
    }

    @When("the user updates {string} in the company url section")
    public void the_user_updates_in_the_company_url_section(String companyURL) {
        ReusableMethods.clearValue(getAccountPage().input_CompanyURL);
        getAccountPage().input_CompanyURL.sendKeys(companyURL);
    }

    @When("the user edits {string} in the Company Phone Number section")
    public void the_user_edits_in_the_company_phone_number_section(String companyPhoneNumber) {
        ReusableMethods.clearValue(getAccountPage().input_CompanyPhone);
        getAccountPage().input_CompanyPhone.sendKeys(companyPhoneNumber);
    }

    @When("the user updates {string} in the Company email section")
    public void the_user_updates_in_the_company_email_section(String companyEmail) {
        ReusableMethods.clearValue(getAccountPage().input_CompanyEmail);
        getAccountPage().input_CompanyEmail.sendKeys(companyEmail);
        ReusableMethods.waitFor(3);
    }
}
