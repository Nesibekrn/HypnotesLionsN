package stepDefinitions.UI_StepDef.clients;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;

public class US_053 extends CommonPage {

    @Then("user click the client form the side menu")
    public void user_click_the_client_form_the_side_menu() {
        ReusableMethods.waitFor(2);
        getClientsPage().clients_button.click();

    }

    @Then("user click add new button")
    public void userClickAddNewButton() {
        ReusableMethods.waitForClickability(getClientsPage().addNewClientButton, 1000);
        getClientsPage().addNewClientButton.click();
    }

    @Then("user click export button")
    public void user_click_export_button() {
        getClientsPage().importClientButton.click();
    }


    @Then("verify that add new client  page is visible")
    public void verify_that_add_new_client_page_is_visible() {
        ReusableMethods.waitFor(1);
        assertEquals("https://test.hypnotes.net/dashboard/add-client", driver.getCurrentUrl());
        ReusableMethods.waitFor(1);
        driver.navigate().back();

    }

    @Then("verify that clients  file should be downloaded")
    public void verify_that_clients_file_should_be_downloaded() {
        File downloadedFile = new File("C:\\Users\\serpi\\Java\\HypnotesLionsN\\target");
        assertTrue(downloadedFile.exists());
    }

    @Then("verify that refer a friend should be clickable and relevant page is visible")
    public void verify_that_refer_a_friend_should_be_clickable_and_relevant_page_is_visible() {

        ReusableMethods.waitFor(1);
        getClientsPage().referAFriendButton.click();
        ReusableMethods.waitFor(1);
        assertEquals("Get 100% referral bonus *", getClientsPage().referAFriendPageTitle.getText());

    }


    @Then("user click refer a friend button")
    public void user_click_refer_a_friend_button() {
        ReusableMethods.waitFor(1);
        getClientsPage().referAFriendButton.click();

    }

    @Then("user click the copy url button")
    public void userClickTheCopyUrlButton() {
        ReusableMethods.waitFor(1);
        getClientsPage().copiedReferenceURL.click();

    }

    @Then("user verify that payment url copied to clipboard message")
    public void userVerifyThatPaymentUrlCopiedToClipboardMessage() {
        ReusableMethods.waitForVisibility(getClientsPage().paymentURLMessage,2);
        assertTrue("Message is display", getClientsPage().paymentURLMessage.isDisplayed());
        System.out.println(getClientsPage().paymentURLMessage.getText());
    }

    @Then("user enter the valid email")
    public void userEnterTheValidEmail() {
        ReusableMethods.waitFor(1);
        getClientsPage().input_email.sendKeys(ConfigurationReader.getProperty("therapistEmail"));

    }

    @Then("user click the send invitation")
    public void userClickTheSendInvitation() {
        ReusableMethods.waitFor(1);
        getClientsPage().sendInvitationButton.click();
    }

    @Then("user verifies that  email sent message")
    public void userVerifiesThatEmailSentMessage() {
        ReusableMethods.waitFor(2);
        assertTrue(getClientsPage().emailSentMessage.isDisplayed());
    }

    @Then("user verifies that start meeting should be clickable")
    public void user_verifies_that_start_meeting_should_be_clickable() {
        ReusableMethods.waitForVisibility(getClientsPage().startMeetingButton,2);
        getClientsPage().startMeetingButton.click();
        ReusableMethods.switchToWindow(1);

    }

    @Then("user verifies that hypnotes meet should be visible")
    public void user_verifies_that_hypnotes_meet_should_be_visible() {
        ReusableMethods.waitFor(1);
        assertEquals("https://meet.hypnotes.net/", driver.getCurrentUrl());
    }

    @Then("user click the account activity and account activity button should be functional")
    public void userClickTheAccountActivityAndAccountActivityButtonShouldBeFunctional() {
        ReusableMethods.verifyElementEnabled(getClientsPage().accountActivityButton);
        getClientsPage().accountActivityButton.click();


    }

    @Then("user click mark as read button")
    public void userClickMarkAsReadButton() {
        getClientsPage().markAllRead.click();
        getClientsPage().confirmYesButton.click();

    }

    @Then("user click see all account activity")
    public void userClickSeeAllAccountActivity() {
        ReusableMethods.waitFor(1);
        getClientsPage().seeAllAccountActivity.click();


    }
    @Then("user verifies that relevant page should be visible")
    public void userVerifiesThatRelevantPageShouldBeVisible() {
       ReusableMethods.waitFor(2);
        assertEquals("https://test.hypnotes.net/dashboard/account-activity",driver.getCurrentUrl());
    }


    @Then("user click the account icon")
    public void userClickTheAccountIcon() {
        getClientsPage().accountIcon.click();

    }


    @Then("Verify that the content of the account-related page is displayed.")
    public void verifyThatTheContentOfTheAccountRelatedPageIsDisplayed(DataTable items) {
        getClientsPage().companyAndItemsAreVisible(items);


    }
}
