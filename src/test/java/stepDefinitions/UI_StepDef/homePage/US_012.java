package stepDefinitions.UI_StepDef.homePage;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_012 extends CommonPage {
    Faker faker = new Faker();

    @When("user clicks on Contact Us button")
    public void user_clicks_on_contact_us_button() {
        getHomePage().contactUsButton.click();
        ReusableMethods.waitForVisibility(getHomePage().subject_input,2);
    }

    @Then("user can see Contact Us page")
    public void user_can_see_contact_us_page() {
        Assert.assertEquals("https://test.hypnotes.net/contact-us", driver.getCurrentUrl());
    }
    @When("user clicks Send Message button")
    public void user_clicks_send_message_button() {
     ReusableMethods.scrollAndClickWithJS(getHomePage().sendMessage_button);
     ReusableMethods.waitFor(1);
    }

    @Then("user can see Message sent successfully")
    public void user_can_see_message() {
        Assert.assertTrue(getHomePage().messageSentSuccessfully_message.isDisplayed());
    }
    @And("user types subject section subject")
    public void userTypesSubjectSectionSubject() {
        getHomePage().subject_input.sendKeys("Hypnotherapist Booking");
    }

    @When("user types Full Name section fullName")
    public void user_types_full_name_section_full_name() {
        getHomePage().fullName_input.sendKeys(faker.name().fullName());
    }

    @When("user types email section email")
    public void user_types_email_section_email() {
        getHomePage().email_input.sendKeys(faker.internet().emailAddress());
    }

    @When("user types Phone Number section phoneNumber")
    public void user_types_phone_number_section_phone_number() {
        getHomePage().phoneNumber_input.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @When("user types Message section message")
    public void user_types_message_section_message() {
        getHomePage().messagesContent_textarea.sendKeys(faker.lorem().paragraph());
    }
    @When("user types {string} at the Best Time section")
    public void user_types_at_the_best_time_section(String bestTime) {
        getHomePage().bestTimeDropDown(bestTime,getHomePage().bestTimeToReach_dropDown);
    }

}
