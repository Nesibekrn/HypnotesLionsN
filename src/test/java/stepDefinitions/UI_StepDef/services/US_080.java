package stepDefinitions.UI_StepDef.services;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.Driver;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_080 extends CommonPage {

    @Given("User enters a valid email address")
    public void user_enters_a_valid_email_address(String email) {
        ReusableMethods.waitFor(5);
        getLoginPage().email_login.sendKeys(email);
        throw new io.cucumber.java.PendingException();
    }
    @Given("User enters a valid password")
    public void user_enters_a_valid_password(String password) {
            ReusableMethods.waitFor(5);
            getLoginPage().password_Login.sendKeys(password);
        throw new io.cucumber.java.PendingException();
    }
    @Given("User clicks the login")
    public void clicksTheLoginButton() {
        ReusableMethods.waitFor(5);
        getLoginPage().login_button.click();
    }
   /*@Given("Services button should be clickable")
    public void services_button_should_be_clickable() {
        Assert.assertTrue(getServicesPage().servicesPage.services_buton.isEnabled());
            ReusableMethods.waitFor(2);
        throw new io.cucumber.java.PendingException();
    }

    @Given("User clicks on the Services button")
    public void user_clicks_on_the_services_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Headers of Individual Sessions, Packages, Group Session should appear")
    public void headers_of_individual_sessions_packages_group_session_should_appear() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Individual Sessions should be seen as default page")
    public void individual_sessions_should_be_seen_as_default_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User clicks on the Individual Sessions button")
    public void user_clicks_on_the_individual_sessions_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("New Individual Sessions and Generate Scheduler URL buttons should be visible")
    public void new_individual_sessions_and_generate_scheduler_url_buttons_should_be_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("New Individual Sessions and Generate Scheduler URL buttons should be clickable")
    public void new_individual_sessions_and_generate_scheduler_url_buttons_should_be_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("If there is a previously created service, it should be listed")
    public void if_there_is_a_previously_created_service_it_should_be_listed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Table and card buttons should be clickable")
    public void table_and_card_buttons_should_be_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User clicks on the Packages button")
    public void user_clicks_on_the_packages_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("New Package and Generate Scheduler URL buttons should be visible")
    public void new_package_and_generate_scheduler_url_buttons_should_be_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("New Package and Generate Scheduler URL buttons should be clickable")
    public void new_package_and_generate_scheduler_url_buttons_should_be_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User clicks on the Group Session button")
    public void user_clicks_on_the_group_session_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("New Group Sessions and Generate Scheduler URL buttons should be visible")
    public void new_group_sessions_and_generate_scheduler_url_buttons_should_be_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("New Group Sessions and Generate Scheduler URL buttons should be clickable")
    public void new_group_sessions_and_generate_scheduler_url_buttons_should_be_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/
}