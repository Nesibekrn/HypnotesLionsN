package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import static stepDefinitions.Hooks.driver;

public class US_093 extends CommonPage {
    @And("user clicks Schedule an Appointment at the selected client")
    public void userClicksScheduleAnAppointmentAtTheSelectedClient() {
        getClientsPage().button_ScheduleAnAppointment.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getClientsPage().label_ScheduleAnAppointment.isDisplayed());
    }

    @When("user selects service at the Service section")
    public void userSelectsServiceAtTheServiceSection() {
        getClientsPage().dropDown_ScheduleAnAppointmentServiceSelect.click();
        ReusableMethods.waitFor(1);
        Random random = new Random();
        int randomSize = random.nextInt(getClientsPage().serviceList.size());
        getClientsPage().serviceList.get(randomSize).click();
    }

    @And("user selects Online at the Locations section")
    public void userSelectsOnlineAtTheLocationsSection() {
        getClientsPage().dropDown_ScheduleAnAppointmentLocationsSelect.click();
        ReusableMethods.waitFor(1);
        getClientsPage().dropDown_ScheduleAnAppointmentLocationsSelect.click();
    }

    @When("user selects tomorrows date at the calendar")
    public void user_selects_tomorrows_date_at_the_calendar() {
        ReusableMethods.scrollToElement(getClientsPage().button_cancel);
        LocalDate date = LocalDate.now();
        System.out.println("bugunun tarihi = "+date);
        LocalDate tomorrow=date.plus(Period.ofDays(1));
        System.out.println("Tomorrow = "+tomorrow);
        int limit = getClientsPage().list_Calendar.size();
        System.out.println("limit = " + limit);
        System.out.println("getClientsPage().list_Calendar.get(25).getCssValue(\"title\") = " + getClientsPage().list_Calendar.get(25).getAttribute("title"));
        for (int i = 0; i < limit; i++) {
            if (getClientsPage().list_Calendar.get(i).getAttribute("title").equals(tomorrow)) {
                getClientsPage().list_Calendar.get(i + 1).click();
            }
        }
        ReusableMethods.waitFor(3);
    }

    @When("user select available hours at the Available Hours section")
    public void user_select_available_hours_at_the_available_hours_section() {
        Random random = new Random();
        int hours = random.nextInt(getClientsPage().avaliableHours.size());
        getClientsPage().avaliableHours.get(hours).click();
        ReusableMethods.waitFor(2);
    }

    @When("user clicks Yes at the Confirm This Time? message")
    public void user_clicks_yes_at_the_confirm_this_time_message() {
        getClientsPage().confirmYesButton.click();
        ReusableMethods.waitFor(2);
    }

    @When("user clicks Click here to send the document")
    public void user_clicks_click_here_to_send_the_document() {
        getClientsPage().documentAdd.click();
        ReusableMethods.waitFor(2);
    }

    @When("user clicks Sent to Client button and can see Sent to Client message")
    public void user_clicks_sent_to_client_button_and_can_see_sent_to_client_message() {
        getClientsPage().button_sendToClient.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getClientsPage().message_sendDocument.isDisplayed());
    }

    @When("user clicks Next button and can see Confirm Meeting Details")
    public void user_clicks_next_button_and_can_see_confirm_meeting_details() {
        getClientsPage().button_Next.click();
        Assert.assertEquals("Confirm Meeting Details", getClientsPage().confirmMeetingDetails.getText());
    }

    @When("user can see Notify client checkbox is clicked")
    public void user_can_see_notify_client_checkbox_is_clicked() {
        Assert.assertTrue(getClientsPage().checkbox_NotifyClient.isSelected());
    }

    @When("user can see Send a confirmation email to the client. checkbox is clicked")
    public void user_can_see_send_a_confirmation_email_to_the_client_checkbox_is_clicked() {
        Assert.assertTrue(getClientsPage().checkbox_sendAConfirmationEmail.isSelected());
    }

    @When("user clicks Submit button")
    public void user_clicks_submit_button() {
        getClientsPage().button_submit.click();
        ReusableMethods.waitFor(2);
    }

    @When("user can see Meeting Details")
    public void user_can_see_meeting_details() {
        Assert.assertTrue(getClientsPage().addedMeetingDetails.isDisplayed());
        ReusableMethods.waitFor(2);
        Assert.assertEquals("Successfully created a meeting with", getClientsPage().addedMeetingSuccessfullyCreated.getText());
    }

    @When("user clicks Close button and user see clients page")
    public void user_clicks_close_button_and_user_see_clients_page() {
        getClientsPage().buttonClose.click();
        driver.navigate().refresh();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getClientsPage().button_upComingMeeting.isDisplayed());
    }

}
