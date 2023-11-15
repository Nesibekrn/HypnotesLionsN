package stepDefinitions.UI_StepDef.services;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.CommonPage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static utilities.ReusableMethods.waitFor;
import static utilities.ReusableMethods.waitForVisibility;

public class US_082 extends CommonPage {

    @Given("the user clicks on the  Services title on the left side menu")
    public void the_user_clicks_on_the_services_title_on_the_left_side_menu() {
        getServicesPage().serviceButton.click();

    }

    @Given("the user clicks on the Packages tab")
    public void the_user_clicks_on_the_packages_tab() {
        waitFor(3);
        waitForVisibility(getServicesPage().PackagesButton,5);
       getServicesPage().PackagesButton.click();
    }

    @Given("Add New Package field is displayed")
    public void add_new_package_field_is_displayed() {
        Assert.assertTrue(getServicesPage().AddNewPackagesButton.isDisplayed());
    }

    @When("the user clicks on the Add New Package title")
    public void the_user_clicks_on_the_add_new_package_title() {
        getServicesPage().AddNewPackagesButton.click();
    }



    @Then("the user is able view relevant page")
    public void the_user_is_able_view_relevant_page() {
       Assert.assertTrue(getServicesPage().AddingNewPackageForm.getText().contains("Adding Package"));
    }


    @Then("the user is able to enter valid values on the Package Name field")
    public void the_user_is_able_to_enter_valid_values_on_the_package_name_field() {
    Assert.assertTrue(getServicesPage().InputPackageName.isEnabled());
        getServicesPage().InputPackageName.sendKeys("Deneme");
    Assert.assertTrue(getServicesPage().InputPackageName.getText().contains("Deneme"));
        waitFor(5);


    }
    @When("user enters a space on the Package Name field")
    public void user_enters_a_space_on_the_package_name_field() {
        getServicesPage().InputPackageName.sendKeys(Keys.SPACE);
    }
    @Then("A warning message should be displayed")
    public void a_warning_message_should_be_displayed(){
        Assert.assertTrue(getServicesPage().warningMessageForPackageName.isDisplayed());



    }


    @When("the user leaves the Package fields as empty")
    public void the_user_leaves_the_package_fields_as_empty() {
       getServicesPage().inputFieldsList.stream().forEach(t->{
           t.sendKeys(Keys.BACK_SPACE);
      waitFor(1);
       });
    }
    @When("the user clicks on the save button on the Add New package page")
    public void the_user_clicks_on_the_save_button_on_the_add_new_package_page() {
        getServicesPage().saveButton.click();
        waitFor(3);
    }
    @Then("below  warning messages are displayed under the relevant fields")
    public void below_warning_messages_are_displayed_under_the_relevant_fields(io.cucumber.datatable.DataTable dataTable) {
        List<String> errorList=dataTable.column(1);
        AtomicInteger index = new AtomicInteger(0);

        for(WebElement a:getServicesPage().warningMessageList){
            System.out.println(a.getText());
            waitFor(2);

        }
        errorList.stream().forEach(t->{

            Assert.assertEquals(t,getServicesPage().warningMessageList.get(index.get()).getText());
            index.getAndIncrement();
        });
    }


    @When("the user clicks on the Meeting Type")
    public void the_user_clicks_on_the_meeting_type() {
       getServicesPage().StandardOnlineOrInPerson.click();
    }

    @Then("the below fields are displayed.")
    public void the_below_fields_are_displayed(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user is able select Phone Counsultation")
    public void the_user_is_able_select_phone_counsultation() {
       getServicesPage().phoneConsultation.click();
    }

}
