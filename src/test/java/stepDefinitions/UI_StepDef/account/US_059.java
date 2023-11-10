package stepDefinitions.UI_StepDef.account;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.io.File;
import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class US_059 extends CommonPage {

    @Given("the user clicks on the account logo")
    public void the_user_clicks_on_the_account_logo() {
        getAccountPage().accountLogo.click();
        waitFor(3);
    }
    @Given("the user clicks on the profile")
    public void the_user_clicks_on_the_profile() {
        getAccountPage().profile.click();
        waitFor(3);
    }
    @Then("the user view and clicks on the your Company title")
    public void the_user_view_and_clicks_on_the_your_company_title() {
        Assert.assertTrue(getAccountPage().yourCompanyTitle.getText().contains("Your Company"));
        Assert.assertTrue(getAccountPage().yourCompanyTitle.isEnabled());
        waitFor(5);
        getAccountPage().yourCompanyTitle.click();
        waitFor(5);
    }


    @When("the user clicks on the your Company title")
    public void the_user_clicks_on_the_your_company_title() {
        getAccountPage().yourCompanyTitle.click();
    }

    @Then("the user is able to view and click on the Add New Company button")
    public void the_user_is_able_to_view_and_click_on_the_add_new_company_button() {
        System.out.println(getAccountPage().addNewCompany.getText());
        Assert.assertTrue(getAccountPage().addNewCompany.getText().contains("Add New Company"));
        Assert.assertTrue(getAccountPage().addNewCompany.isEnabled());
        waitFor(2);
        ReusableMethods.scrollAndClickWithJS( getAccountPage().addNewCompany);
        waitFor(2);

    }

    @When("the user clicks on the Add New Company button")
    public void the_user_clicks_on_the_add_new_company_button() {
        ReusableMethods.scrollAndClickWithJS( getAccountPage().addNewCompany);
        waitFor(3);
    }
    @Then("the below fields are displayed")
    public void the_below_fields_are_displayed(DataTable formFields) {
        List<String> ffields = formFields.asList();
        for (int i = 0; i <= ffields.size() - 1; i++) {
            System.out.println(getAccountPage().fields.get(i).getAttribute("placeholder"));
            Assert.assertEquals(getAccountPage().fields.get(i).getAttribute("placeholder"),ffields.get(i));

        }
    }

    @Then("your logo button is displayed")
    public void your_logo_button_is_displayed() {
        System.out.println(getAccountPage().yourLogo.getText());
        Assert.assertTrue(getAccountPage().yourLogo.getText().contains("Your Logo"));
    }
    @Then("Your Country dd filed is displayed")
    public void your_country_dd_filed_is_displayed() {
        System.out.println(getAccountPage().country.getAttribute("value"));
        Assert.assertTrue(getAccountPage().country.getAttribute("placeholder").contains("Company URL"));
    }


    @Given("the user adds a logo on the Your Logo button")
    public void the_user_adds_a_logo_on_the_your_logo_button() {
        File logoPath=new File("src/test/resources/Upload Images/logo.png");
        String path = logoPath.getAbsolutePath();
        getAccountPage().yourLogo2.sendKeys(path);

        waitFor(10);
    }
    @Then("a valid logo is displayed successfully")
    public void a_valid_logo_is_displayed_successfully() {
        Assert.assertTrue(getAccountPage().changeLogo.isDisplayed());

    }


    @Then("the user is able to enter values on the below fields")
    public void the_user_is_able_to_enter_values_on_the_below_fields(DataTable dataTable) {
        List<String> formFields = dataTable.asList();
        for (int i = 0; i <= formFields.size() - 1; i++) {
            Assert.assertTrue(getAccountPage().fields.get(i).isEnabled());
            getAccountPage().fields.get(i).sendKeys(formFields.get(i));


        }

    }

    @Then("the user is able to select a country from country drop down")
    public void the_user_is_able_to_select_a_country_from_country_drop_down() {
        getAccountPage().countryDD.click();
        Select ss=new Select(getAccountPage().contryDropDownl);
        ss.selectByVisibleText("Turkey");
        waitFor(6);
        System.out.println("*********************"+getAccountPage().selectedDDvalueforCountry.getAttribute("value"));

Assert.assertTrue(getAccountPage().selectedDDvalueforCountry.getAttribute("value").contains("Turkey"));
    }

}