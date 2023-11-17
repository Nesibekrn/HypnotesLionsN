package stepDefinitions.UI_StepDef.services;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static stepDefinitions.Hooks.commonPage;
import static utilities.ReusableMethods.waitFor;
import static utilities.ReusableMethods.waitForVisibility;

public class US_082 extends CommonPage {

    @Given("the user clicks on the  Services title on the left side menu")
    public void the_user_clicks_on_the_services_title_on_the_left_side_menu() {
        waitFor(3);
        getServicesPage().serviceButton.click();
        waitFor(3);

    }

    @Given("the user clicks on the Packages tab")
    public void the_user_clicks_on_the_packages_tab() {
        waitFor(3);
       // waitForVisibility(getServicesPage().PackagesButton,5);
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

    @Then("the below meetingType fields are displayed")
    public void the_below_meeting_type_fields_are_displayed(io.cucumber.datatable.DataTable dataTable) {
//Assert.assertEquals();
List<String> meetingType=dataTable.asList();
for(int i=0; i<=meetingType.size()-1; i++){
    Assert.assertEquals(getServicesPage().listMeeting.get(i).getText(),meetingType.get(i));

}

    }
    @Then("the user is able select Phone Counsultation")
    public void the_user_is_able_select_phone_counsultation() {


        getServicesPage().phoneConsultation.click();
        Assert.assertTrue(getServicesPage().phoneConsultation.getText().contains("Phone Consultation"));
    }


    @Then("the user enters a valid values on the price field")
    public void the_user_enters_a_valid_values_on_the_price_field() {
       getServicesPage().PriceUSD.sendKeys("5");
    }
    @Then("Show service price on the initial scheduler page button is activated")
    public void show_service_price_on_the_initial_scheduler_page_button_is_activated() {
        System.out.println(getServicesPage().switchButtonForShowService.getAttribute("aria-checked"));
      Assert.assertTrue(getServicesPage().switchButtonForShowService.getAttribute("aria-checked").contains("true"));
    }




    @Then("the user clicks on the Duration field")
    public void the_user_clicks_on_the_duration_field() {
       getServicesPage().InputDuration.click();
    }


    @Then("the user enters a positive value as {string} on  Duration field")
    public void the_user_enters_a_positive_value_as_on_duration_field(String value) {
        getServicesPage().InputDuration.sendKeys(value);
        System.out.println(getServicesPage().InputDuration.getAttribute("value"));
        Assert.assertTrue( getServicesPage().InputDuration.getAttribute("value").contains(value));
    }

    @Then("the user verifies Duration is functional")
    public void the_user_verifies_duration_is_functional() {
       Assert.assertTrue(getServicesPage().InputDuration.isEnabled());
    }


    @Then("the user is able to select {string} from dd")
    public void the_user_is_able_to_select_from_dd(String value) {
        getServicesPage().InputDuration.click();
       ReusableMethods.scrollAndClickWithJS(getServicesPage().ddValueOfDuration);
       waitFor(2);
        Assert.assertTrue(getServicesPage().InputDuration.getAttribute("value").contains(value));
    }

    @When("the user enters negative value as a {string}")
    public void the_user_enters_negative_value_as_a(String negativeValue) {
        getServicesPage().InputDuration.sendKeys(negativeValue);
        getServicesPage().InputDuration.sendKeys(Keys.TAB);
        waitFor(2);
    }
    @Then("the warning message {string} is displayed")
    public void the_warning_message_is_displayed(String expectedMessage) {
        waitFor(2);
       // System.out.println(getServicesPage().warningMessageForDuration.getText());
        Assert.assertEquals(getServicesPage().warningMessageForDuration.getText(),expectedMessage);waitFor(2);
    }
    @Then("the user enters a string value {string}")
    public void the_user_enters_a_string_value(String string) {
        getServicesPage().InputDuration.clear();
        getServicesPage().InputDuration.sendKeys(string);
        getServicesPage().InputDuration.sendKeys(Keys.TAB);
        waitFor(2);
    }


    @When("the user clicks on the Buffer Time Before Appointment \\(min) field")
    public void the_user_clicks_on_the_buffer_time_before_appointment_min_field() {
       getServicesPage().BufferTimeBeforeAppointment.click();
    }
    @Then("Buffer Time Before Appointment \\(min) field is enabled")
    public void buffer_time_before_appointment_min_field_is_enabled() {
       Assert.assertTrue(getServicesPage().BufferTimeBeforeAppointment.isEnabled());
    }
    @Then("the user is able to enter a valid value on Buffer Time Before Appointment \\(min) field")
    public void the_user_is_able_to_enter_a_valid_value_on_buffer_time_before_appointment_min_field() {
        getServicesPage().BufferTimeBeforeAppointment.sendKeys("45");
        getServicesPage().BufferTimeBeforeAppointment.sendKeys(Keys.TAB);
        Assert.assertTrue(getServicesPage().BufferTimeBeforeAppointment.getAttribute("value").contains("45"));
    }

    @When("the user clicks on the Buffer Time After Appointment \\(min) field")
    public void the_user_clicks_on_the_buffer_time_after_appointment_min_field() {
        getServicesPage().BufferTimeAftereAppointment.click();
    }
    @Then("Buffer Time After Appointment \\(min) field is enabled")
    public void buffer_time_after_appointment_min_field_is_enabled() {
        Assert.assertTrue(getServicesPage().BufferTimeAftereAppointment.isEnabled());
    }
    @Then("the user is able to enter a valid value on Buffer Time After Appointment \\(min) field")
    public void the_user_is_able_to_enter_a_valid_value_on_buffer_time_after_appointment_min_field() {
        getServicesPage().BufferTimeAftereAppointment.sendKeys("45");
        getServicesPage().BufferTimeAftereAppointment.sendKeys(Keys.TAB);
        Assert.assertTrue(getServicesPage().BufferTimeAftereAppointment.getAttribute("value").contains("45"));
    }

    @Then("The Advance Notice menu is enabled")
    public void the_advance_notice_menu_is_enabled() {
      Assert.assertTrue( getServicesPage().AdvanceNoticeService.isEnabled());
    }

    @Then("the user is able to increase or decrease the values")
    public void the_user_is_able_to_increase_or_decrease_the_values() {// Write code here that turns the phrase above into concrete actions

        getServicesPage().AdvanceNoticeService.sendKeys(Keys.BACK_SPACE);
        getServicesPage().AdvanceNoticeService.sendKeys("4");
        waitFor(3);
        getServicesPage(). upArrow.click();
        Assert.assertTrue(getServicesPage().AdvanceNoticeService.getAttribute("value").contains("5"));
        waitFor(2);
        getServicesPage(). downArrow.click();
        Assert.assertTrue(getServicesPage().AdvanceNoticeService.getAttribute("value").contains("4"));
    }

    @Then("Service Active button and Payment Required buttons are functional")
    public void service_active_button_and_payment_required_buttons_are_functional() {
        Assert.assertTrue(getServicesPage().switchButtonForPaymentReqiured.isEnabled());
        getServicesPage().switchButtonForPaymentReqiured.click();waitFor(5);
        Assert.assertTrue(getServicesPage().switchButtonForPaymentReqiured.getAttribute("aria-checked").contains("true"));
        Assert.assertTrue(getServicesPage().switchButtonForServiceActive.isEnabled());
        getServicesPage().switchButtonForServiceActive.click();waitFor(5);
        Assert.assertTrue(getServicesPage().switchButtonForServiceActive.getAttribute("aria-checked").contains("false"));

    }


    @Then("the user is able to select a document from Required Forms and eSign Documents field")
    public void the_user_is_able_to_select_a_document_from_required_forms_and_e_sign_documents_field() {
        boolean addedPdf=false;
        getServicesPage().RequiredFormsandeSignDocuments.click();
        waitFor(3);
ReusableMethods.scrollAndClickWithJS(getServicesPage().pdfFile);
waitFor(3);
Assert.assertEquals(addedPdf,getServicesPage().selectedPdfField.getAttribute("title").isEmpty());
    }

    @When("the user fills all mandatory fields with valid values")
    public void the_user_fills_all_mandatory_fields_with_valid_values(io.cucumber.datatable.DataTable validValues) {
        List<String> listValues=validValues.column(1);
        AtomicInteger index = new AtomicInteger(0);
        listValues.stream().forEach(t-> {
            getServicesPage().inputFieldsList.get(index.get()).sendKeys(t);
            index.getAndIncrement();
        });
    }
    @When("the user clicks on the Save button on add new package page")
    public void the_user_clicks_on_the_save_button_on_add_new_package_page() {
        getServicesPage().saveButton.click();
    }

    @Then("the Package has been added message is displayed")
    public void the_package_has_been_added_message_is_displayed() {
        Assert.assertTrue(getServicesPage().savePackageMessage.getText().contains("Package has been added"));
    }
    @Then("Added Packages should appear in the package table")
    public void added_packages_should_appear_in_the_package_table() {
Assert.assertTrue(getServicesPage().createdPackageInTable.getText().contains("steel1"));
    }


    @When("the user clicks to Cancel button")
    public void the_user_clicks_to_cancel_button() {
      getServicesPage().cancelButton.click();
    }
    @When("the Add New Package page is appeared")
    public void the_add_new_package_page_is_appeared() {
Assert.assertTrue(getServicesPage().returnAvailablePackage.getText().contains("Available"));
    }

    @Then("{string} message is displayed")
    public void message_is_displayed(String warningMessage) {
        System.out.println(getServicesPage().warningMessageForExistingName.getText());
        Assert.assertEquals(getServicesPage().warningMessageForExistingName.getText(),warningMessage);
    }

    @Then("Would you like this service to be provided online? menu is be checked")
    public void would_you_like_this_service_to_be_provided_online_menu_is_be_checked() {
        Assert.assertTrue(getServicesPage().checkBoxOfserviceProvide.isSelected());
//Assert.assertTrue(getServicesPage().Wouldyoulikethisservicetobeprovidedonline.isSelected());
    }


    @When("Total Sessions, Session Interval \\(Weeks) menus are functional")
    public void total_sessions_session_interval_weeks_menus_are_functional() {
       Assert.assertTrue( getServicesPage().totalSessions.isEnabled());
       Assert.assertTrue(getServicesPage().sessionInterval.isEnabled());
    }

    @Then("Numbers should be increased or decrased")
    public void numbers_should_be_increased_or_decrased() {
        //increase for total session
        getServicesPage().totalSessions.sendKeys("5");
        getServicesPage().upArrowTotalSession.click();
        Assert.assertTrue(getServicesPage().totalSessions.getAttribute("value").contains("6"));


//decrease for total session
        getServicesPage().totalSessions.sendKeys(Keys.BACK_SPACE);
        getServicesPage().totalSessions.sendKeys("10");
        getServicesPage().downArrowTotalSession.click();
        Assert.assertTrue(getServicesPage().totalSessions.getAttribute("value").contains("9"));


        //increase for session Interval
        getServicesPage().sessionInterval.sendKeys(Keys.BACK_SPACE);
        getServicesPage().sessionInterval.sendKeys("8");
        getServicesPage().upArrowSessionInterval.click();
        Assert.assertTrue(getServicesPage().sessionInterval.getAttribute("value").contains("9"));


//decrease for session interval
        getServicesPage().sessionInterval.sendKeys(Keys.BACK_SPACE);
        getServicesPage().sessionInterval.sendKeys("10");
        getServicesPage().downArrowSessionInterval.click();
        Assert.assertTrue(getServicesPage().sessionInterval.getAttribute("value").contains("9"));

    }



}
