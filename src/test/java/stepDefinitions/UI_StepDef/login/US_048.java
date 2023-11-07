package stepDefinitions.UI_StepDef.login;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import static stepDefinitions.Hooks.driver;

import pages.CommonPage;
import utilities.ReusableMethods;

public class US_048 extends CommonPage {
    @Then("user should see Email-sms side bar on the therapist page")

    public void user_should_see_email_sms_side_bar_on_the_therapist_page() {
        ReusableMethods.waitForVisibility(getDashboardPage().email_smsLink_therapistDashboard,2);
        assertTrue(getDashboardPage().email_smsLink_therapistDashboard.isDisplayed());
        assertEquals("Email & SMS",getDashboardPage().email_smsLink_therapistDashboard.getText());

    }
    @Then("user verifies Email-sms link is clickable on the page")
    public void user_verifies_email_sms_link_is_clickable_on_the_page() {
        assertTrue(getDashboardPage().email_smsLink_therapistDashboard.isEnabled());

    }
    @When("user clicks on Email-sms links")
    public void user_clicks_on_email_sms_links() {
        ReusableMethods.waitForClickability(getDashboardPage().email_smsLink_therapistDashboard,3);
        getDashboardPage().email_smsLink_therapistDashboard.click();
        driver.navigate().refresh();

    }
    @Then("user should be able navigate relavent page")
    public void user_should_be_able_navigate_relavent_page() {
        ReusableMethods.waitForPageToLoad(10);
        assertEquals("https://test.hypnotes.net/dashboard/email-sms",driver.getCurrentUrl());
       // assertTrue(driver.getCurrentUrl().contains("dashboard/email-sms"));

    }
}
