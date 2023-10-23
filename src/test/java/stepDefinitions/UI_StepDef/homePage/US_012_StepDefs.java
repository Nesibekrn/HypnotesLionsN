package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_012_StepDefs extends CommonPage {
    @When("user clicks on Contact Us button")
    public void user_clicks_on_contact_us_button() {
       getHomePage().contactUsButton.click();
        ReusableMethods.waitFor(3);
    }
    @Then("user can see Contact Us page")
    public void user_can_see_contact_us_page() {
        Assert.assertEquals("https://test.hypnotes.net/contact-us",driver.getCurrentUrl());
    }
    @When("user types Full Name section {string}")
    public void user_types_full_name_section(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user types email section {string}")
    public void user_types_email_section(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user types Phone Number section {string}")
    public void user_types_phone_number_section(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user types Best Time section {string}")
    public void user_types_best_time_section(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user types Message section {string}")
    public void user_types_message_section(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks Send Message button")
    public void user_clicks_send_message_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user can see {string} message")
    public void user_can_see_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("user types subject section {string}")
    public void userTypesSubjectSection(String arg0) {
    }
}
