package stepDefinitions.UI_StepDef.services;

import com.github.javafaker.Faker;
import enums.COLOR;
import io.cucumber.java.en.*;
import org.junit.Assert;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.actions;
import static stepDefinitions.Hooks.driver;

public class US_081 extends CommonPage {
    Faker faker = new Faker();
    String prenom=faker.name().firstName();

    @When("user clicks on individual Sessions button, Add New Individual Sessions field should appear")
    public void user_clicks_on_individual_sessions_button_add_new_individual_sessions_field_should_appear() {
        getServicesPage().IndividualSession.click();
        getServicesPage().addNewIndividualSession.isDisplayed();

    }

    @When("user clicks on the Add New Individual Sessions")
    public void user_clicks_on_the_add_new_individual_sessions() {
        getServicesPage().addNewIndividualSession.click();

    }

    @Then("The Name field must be functional and a valid name should be able to enter")
    public void the_name_field_must_be_functional_and_a_valid_name_should_be_able_to_enter() {


        COLOR.BORDER_COLOR.assertBorderColor(getServicesPage().name);


        getServicesPage().name.sendKeys(prenom);
        ReusableMethods.waitFor(1);


    }

    @Then("The meeting type menu must be functional and any meeting type must be selected from the menu")
    public void the_meeting_type_menu_must_be_functional_and_any_meeting_type_must_be_selected_from_the_menu() {
        COLOR.BORDER_COLOR.assertBorderColor(getServicesPage().meetingType);
        getServicesPage().phoneConsultation.click();
        assert getServicesPage().phoneConsultation.isDisplayed();


    }

    @Then("Price must be functional and a valid name should be able to enter")
    public void price_must_be_functional_and_a_valid_name_should_be_able_to_enter() {
        COLOR.BORDER_COLOR.assertBorderColor(getServicesPage().priceColor);

        getServicesPage().PriceUSD.sendKeys("10");

    }

    @Then("When the price is entered, the Show service price on the initial scheduler page button must be active")
    public void when_the_price_is_entered_the_show_service_price_on_the_initial_scheduler_page_button_must_be_active() {
        COLOR.BUTTON_GREEN_BACKROUND.assertBackroundColor(getServicesPage().buttonGreen);

    }

    @Then("Any Duration in the Duration drop-down menu should be selectable")
    public void any_duration_in_the_duration_drop_down_menu_should_be_selectable() {
        COLOR.BORDER_COLOR.assertBorderColor(getServicesPage().duration);
        getServicesPage().duration45.click();


    }

    @Then("Buffer Time Before Appointment \\(min) field must be functional and the number value should be able to enter")
    public void buffer_time_before_appointment_min_field_must_be_functional_and_the_number_value_should_be_able_to_enter() {
        COLOR.BORDER_COLOR.assertBorderColor(getServicesPage().bufferTimebefore);
        actions.sendKeys(Keys.BACK_SPACE).sendKeys("15").build().perform();


    }

    @Then("Buffer Time After Appointment \\(min) field must be functional and the number value should be able to enter")
    public void buffer_time_after_appointment_min_field_must_be_functional_and_the_number_value_should_be_able_to_enter() {
        COLOR.BORDER_COLOR.assertBorderColor(getServicesPage().bufferTimeAfter);
        actions.sendKeys(Keys.BACK_SPACE).sendKeys("35").build().perform();
    }

    @Then("Advance Notice menu must be functional, cursors to the right of the menu must be functional")
    public void advance_notice_menu_must_be_functional_cursors_to_the_right_of_the_menu_must_be_functional() {
        COLOR.BORDER_COLOR.assertBorderColor(getServicesPage().advanceNotice);
        getServicesPage().advancenoticeUp.click();
        ReusableMethods.waitFor(1);
        Assert.assertEquals("1", getServicesPage().buffertime.getAttribute("aria-valuenow"));
    }

    @Then("Payment Required button must be functional")
    public void payment_required_button_must_be_functional() {
        getServicesPage().paimentrequiredButton.click();
        ReusableMethods.waitFor(1);
        COLOR.BORDER_COLOR.assertBackroundColor(getServicesPage().paimentrequiredButton);


    }

    @Then("Service Active button must be functional")
    public void service_active_button_must_be_functional() {
        ReusableMethods.waitFor(1);
        COLOR.BUTTON_GREEN_BACKROUND.assertBackroundColor(getServicesPage().servisActiveButton);

    }

    @Then("Would you like this service to be provided online? menu must be checked")
    public void would_you_like_this_service_to_be_provided_online_menu_must_be_checked() {

    }

    @Then("Various notes should be added to the Description section.")
    public void various_notes_should_be_added_to_the_description_section() {
        getServicesPage().description.sendKeys(faker.lorem().sentence());
        ReusableMethods.waitFor(1);

    }

    @Then("Various notes should be added to the Terms & Conditions section")
    public void various_notes_should_be_added_to_the_terms_conditions_section() {
        driver.switchTo().frame(0);
        getServicesPage().TermsConditions.sendKeys(faker.lorem().paragraph());
        ReusableMethods.waitFor(1);
        driver.switchTo().defaultContent();

    }

    @When("the Save button is clicked, an individual session should be created.")
    public void the_save_button_is_clicked_an_individual_session_should_be_created() {
        getServicesPage().saveButton.isEnabled();
        getServicesPage().saveButton.click();


    }

    @Then("when user clicks on the save button, {string} message should appear.")
    public void when_user_clicks_on_the_save_button_message_should_appear(String messages) {
        ReusableMethods.waitForVisibility(getServicesPage().messageSucces,10);
        assert getServicesPage().messageSucces.getText().contains(messages);


    }

    @Then("Individual Session should appear in the list")
    public void individual_session_should_appear_in_the_list() {
        List<WebElement> names= getServicesPage().namelist;
       for (WebElement w:names){
           if (w.getText().contains(prenom)){
               Assert.assertTrue(w.getText().contains(prenom));
           }
       }

    }


    @Then("Cancel button should be functional")
    public void cancel_button_should_be_functional() {
        ReusableMethods.waitForVisibility(getServicesPage().cancelButton,10);
        getServicesPage().cancelButton.isEnabled();

    }

    @When("the user clicks to Cancel, the Add New Individual Sessions page should appear")
    public void the_user_clicks_to_cancel_the_add_new_individual_sessions_page_should_appear() {
        getServicesPage().cancelButton.click();
        getServicesPage().addNewIndividualSession.isDisplayed();

    }

}
