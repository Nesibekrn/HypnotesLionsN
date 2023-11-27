package stepDefinitions.UI_StepDef.homePage;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

import java.util.List;

import static stepDefinitions.Hooks.driver;
import static utilities.JS_utilities.scrollAndClickWithJS;
import static utilities.JS_utilities.scrollToBottom;
import static utilities.ReusableMethods.waitFor;

public class US_010 extends CommonPage {

    @Given("the user navigates to the footer section")
    public void the_user_navigates_to_the_footer_section() throws InterruptedException {

        scrollToBottom();

        //scrollToWebElement(getHomePage().scrollElement);
       // waitFor(2);



    }

    @Then("user is able to view each titles")
    public void userIsAbleToViewEachTitles(DataTable titles) {

        List<String> title=titles.asList();
//        for(String e:title){
//           System.out.println(e);
//        }
//        System.out.println("***************************************");
        for(int i=1; i<=getHomePage().feature1.size()-1; i++){
//            System.out.println(getHomePage().feature1.get(i).getText());
//            System.out.println("***************************************");

            Assert.assertEquals(getHomePage().feature1.get(i).getText(),title.get(i));
        }
        waitFor(5);
    }

    @And("the user able to view these titles")
    public void theUserAbleToViewTheseTitles(DataTable titles) {

        List<String> title=titles.asList();
        for(String e:title){
            System.out.println(e);
        }
        System.out.println("***************************************");
        for(int i=1; i<=getHomePage().feature2.size()-1; i++) {
            System.out.println(getHomePage().feature2.get(i).getText());
            System.out.println("***************************************");

             Assert.assertEquals(getHomePage().feature2.get(i).getText(),title.get(i));
        }

        waitFor(5);
    }

    //calendar
    @When("the user clicks on the  Calendar title")
    public void the_user_clicks_on_the_calendar_title() {
        scrollAndClickWithJS(getHomePage().calendar);
      waitFor(5);
    }

    @Then("Calendar page is opened")
    public void calendarPageIsOpened() {
        String calendarUrl=driver.getCurrentUrl();
        Assert.assertEquals(calendarUrl,"https://test.hypnotes.net/features/therapy-appointment-scheduling");

    }

    //Services
    @When("the user clicks on the  Services title")
    public void the_user_clicks_on_the_services_title() throws InterruptedException {
        scrollAndClickWithJS(getHomePage().services);
        Thread.sleep(1000);
    }
    @Then("Services page is opened")
    public void services_page_is_opened() {
        String calendarUrl="https://test.hypnotes.net/features/customize-service";
        Assert.assertEquals(driver.getCurrentUrl(),calendarUrl);

    }


    //eSign and Document Storage
    @When("the user clicks on the  eSign and Document Storage title")
    public void the_user_clicks_on_the_e_sign_and_document_storage_title() throws InterruptedException {
        scrollAndClickWithJS(getHomePage().eSignDocumentStorage);
        Thread.sleep(1000);
    }
    @Then("eSign and Document Storage page is opened")
    public void e_sign_and_document_storage_page_is_opened() {
        String documentUrl="https://test.hypnotes.net/features/esign-documents-online";
        Assert.assertEquals(driver.getCurrentUrl(),documentUrl);
    }


    // Notifications & Reminders
    //There is a bug , it is navigating to register
    @When("the user clicks on the  Notifications & Reminders title")
    public void the_user_clicks_on_the_notifications_reminders_title() throws InterruptedException {
        scrollAndClickWithJS(getHomePage().NotificationsReminders);
        Thread.sleep(1000);
    }
    @Then("Notifications & Reminders page is opened")
    public void notifications_reminders_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/esign-documents-online";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }


    // Multiple Payment Service Options
    //There is a bug, it is navigating to invoice page
    @When("the user clicks on the  Multiple Payment Service Options title")
    public void the_user_clicks_on_the_multiple_payment_service_options_title() {
        scrollAndClickWithJS(getHomePage().MultiplePaymentServiceOptions);
        waitFor(5);
    }
    @Then("Multiple Payment Service Options page is opened")
    public void multiple_payment_service_options_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/billing-software-for-therapists";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }


    //Billing and Invoicing
    @When("the user clicks on the  Billing and Invoicing title")
    public void the_user_clicks_on_the_billing_and_invoicing_title() {
        scrollAndClickWithJS(getHomePage().BillingInvoicing);
        waitFor(5);
    }
    @Then("Billing and Invoicing page is opened")
    public void billing_and_invoicing_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/billing-software-for-therapists";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }


    //Free Secure Telehealth Video Conferencing
    @When("the user clicks on the  Free Secure Telehealth Video Conferencing title")
    public void the_user_clicks_on_the_free_secure_telehealth_video_conferencing_title() {
        scrollAndClickWithJS(getHomePage().FreeSecureTelehealthVideoConferencing);
        waitFor(5);
    }
    @Then("Free Secure Telehealth Video Conferencing page is opened")
    public void free_secure_telehealth_video_conferencing_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/telehealth-video-conferencing";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }


    //Customize Your Scheduler & URL
 //   There is a bug it is navigating to register page
    @When("the user clicks on the  Customize Your Scheduler & URL title")
    public void the_user_clicks_on_the_customize_your_scheduler_url_title() {
        scrollAndClickWithJS(getHomePage().CustomizeYourSchedulerURL);
        waitFor(5);
    }
    @Then("Customize Your Scheduler & URL page is opened")
    public void customize_your_scheduler_url_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/telehealth-video-conferencing";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

//Custom Forms & Documents
//   There is a bug it is navigating to register page
    @When("the user clicks on the  Custom Forms & Documents title")
    public void the_user_clicks_on_the_custom_forms_documents_title() {
        scrollAndClickWithJS(getHomePage().CustomFormsDocuments);
        waitFor(5);
    }
    @Then("Custom Forms & Documents page is opened")
    public void custom_forms_documents_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/telehealth-video-conferencing";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }


    // Multiple Locations
    //   There is a bug it is navigating to register page
    @When("the user clicks on the  Multiple Locations title")
    public void the_user_clicks_on_the_multiple_locations_title() {
        scrollAndClickWithJS(getHomePage().MultipleLocations);
        waitFor(5);
    }
    @Then("Multiple Locations page is opened")
    public void multiple_locations_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/telehealth-video-conferencing";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }


    //Multiple Providers
    //   There is a bug it is navigating to register page
    @When("the user clicks on the  Multiple Providers title")
    public void the_user_clicks_on_the_multiple_providers_title() {
        scrollAndClickWithJS(getHomePage().MultipleProviders);
        waitFor(5);
    }
    @Then("Multiple Providers page is opened")
    public void multiple_providers_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/telehealth-video-conferencing";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }


    //Dashboard & Reporting

    @When("the user clicks on the  Dashboard & Reporting title")
    public void the_user_clicks_on_the_dashboard_reporting_title() {
        scrollAndClickWithJS(getHomePage().DashboardReporting);
        waitFor(5);
    }
    @Then("Dashboard & Reporting page is opened")
    public void dashboard_reporting_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/get-organized";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }


    //Client Portal
    @When("the user clicks on the  Client Portal title")
    public void the_user_clicks_on_the_client_portal_title() {
        scrollAndClickWithJS(getHomePage().ClientPortal);
        waitFor(5);
    }
    @Then("Client Portal page is opened")
    public void client_portal_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/client-patient-portal";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }


    //Biofeedback\/Emotion-Detection
    @When("the user clicks on the  BiofeedbackEmotion Detection title")
    public void the_user_clicks_on_the_biofeedback_emotion_detection_title() {
        scrollAndClickWithJS(getHomePage().BiofeedbackEmotionDetection);
        waitFor(5);
    }
    @Then("BiofeedbackEmotion Detection page is opened")
    public void biofeedback_emotion_detection_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/biofeedback-ai-emotion-recognition";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }




//Handwriting to Text Conversion

    @When("the user clicks on the  Handwriting to Text Conversion title")
    public void the_user_clicks_on_the_handwriting_to_text_conversion_title() {
        scrollAndClickWithJS(getHomePage().HandwritingtoTextConversion);
        waitFor(5);
    }
    @Then("Handwriting to Text Conversion page is opened")
    public void handwriting_to_text_conversion_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/textconversion";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }


    //3rd Party Integration
    // there is a bug, it is navigating to register page
    @When("the user clicks on the  3rd Party Integration title")
    public void the_user_clicks_on_the_3rd_party_integration_title() {
        scrollAndClickWithJS(getHomePage().thirdrdPartyIntegration);
        waitFor(5);
    }
    @Then("3rd Party Integration page is opened")
    public void rd_party_integration_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/textconversion";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    //Industry Required Client Notes
    //There is a bug , it is navigating to register page
    @When("the user clicks on the  Industry Required Client Notes title")
    public void the_user_clicks_on_the_industry_required_client_notes_title() {
        scrollAndClickWithJS(getHomePage().IndustryRequiredClientNotes);
        waitFor(5);
    }

    @Then("Industry Required Client Notes page is opened")
    public void industry_required_client_notes_page_is_opened() {
        String expectedUrl="https://test.hypnotes.net/features/textconversion";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }



}