package stepDefinitions.UI_StepDef.calendar;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class US_085 extends CommonPage {

    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5)) ;

    @Given("the user verifies schedule menu is functional")
    public void theUserVerifiesScheduleMenuIsFunctional() {
        Assert.assertTrue(getCalendarPage().scheduleButton.isEnabled());
        waitFor(1);
    }

    @And("the user clicks on the schedule menu")
    public void theUserClicksOnTheScheduleMenu() {
        getCalendarPage().scheduleButton.click();
        waitFor(1);
    }


    @And("the user verifies below menu is selectable")
    public void theUserVerifiesBelowMenuIsSelectable(DataTable dataTable) {
        List<String> menu = dataTable.asList();
        for (int i = 0; i < menu.size(); i++) {
            Assert.assertTrue(getCalendarPage().scheduleMenu.get(i).isEnabled());
            waitFor(1);
        }

    }

    @And("the user clicks and verifies the month page")
    public void theUserClicksAndVerifiesTheMonthPage() {
        getCalendarPage().monthButton.click();
        waitFor(1);
        Assert.assertEquals("November 2023", getCalendarPage().monthPage.getText());
        waitFor(1);
    }

    @And("the user verifies next month button is active")
    public void theUserVerifiesNextMonthButtonIsActive() {
        Assert.assertTrue(getCalendarPage().nextMonthButton.isEnabled());
        waitFor(1);

    }

    @And("the user clicks on the next button")
    public void theUserClicksOnTheNextButton() {
        getCalendarPage().nextMonthButton.click();
        waitFor(1);

    }

    @Then("the user verifies related month page")
    public void theUserVerifiesRelatedMonthPage() {
        Assert.assertTrue(getCalendarPage().nextMonthPage.getText().contains("December 2023"));
        waitFor(1);
    }


    @And("the user clicks on the Week")
    public void theUserClicksOnTheWeek() {
        getCalendarPage().scheduleButton.click();
        waitFor(1);
        getCalendarPage().weekButton.click();
        waitFor(1);
    }
    @And("the user view  rows at the week page")
    public void theUserViewRowsAtTheWeekPage() {
        Assert.assertTrue(getCalendarPage().weekView.isDisplayed());
        waitFor(4);

    }
        @And("the user clicks on the Three Days")
      public void theUserClicksOnTheThreeDays() {
        getCalendarPage().scheduleButton.click();
        waitFor(1);
        getCalendarPage().threeDaysButton.click();
        waitFor(1);

    }

      @And("the user verifies related Three Days page")
     public void theUserVerifiesRelatedThreeDaysPage() {
        Assert.assertTrue(getCalendarPage().threeDaysView.isDisplayed());
        waitFor(2);

    }

    @And("the user clicks on the Day")
    public void theUserClicksOnTheDay() {
      getCalendarPage().scheduleButton.click();
      waitFor(1);
        getCalendarPage().dayButton.click();
        waitFor(2);
    }


    @And("the user verifies related Day page")
    public void theUserVerifiesRelatedDayPage() {
    Assert.assertTrue(getCalendarPage().dayView.isDisplayed());
    waitFor(2);

    }

    @Given("the user verify that Schedule an Appointment button is clickable")
    public void theUserVerifyThatScheduleAnAppointmentButtonIsClickable() {
        Assert.assertTrue(getCalendarPage().scheduleAppointment_button.isEnabled());
        waitFor(1);

    }

    @And("the user clicks and verifies related page title is {string}")
    public void theUserClicksAndVerifiesRelatedPageTitleIs(String title1) {
        getCalendarPage().scheduleAppointment_button.click();
        waitFor(1);
        Assert.assertEquals(title1,getCalendarPage().scheduleTitle.getText());
        waitFor(1);
        getCalendarPage().closeButton.click();

    }
    @Given("the user verifies that Add New event button is clickable")
    public void the_user_verifies_that_add_new_event_button_is_clickable() {
        Assert.assertTrue(getCalendarPage().addNewEvent_button.isEnabled());
        waitFor(1);


    }
    @Given("the user clicks and verifies that related page title is {string}")
    public void the_user_clicks_and_verifies_that_related_page_title_is(String title2) {
       getCalendarPage().addNewEvent_button.click();
       waitFor(1);
       getCalendarPage().closeButton.click();

    }
    @Given("the user verifies that Block Time button is clickable")
    public void the_user_verifies_that_block_time_button_is_clickable() {


    }
    @And("the user clicks and verifies that page title is {string}")
    public void theUserClicksAndVerifiesThatPageTitleIs(String title3) {
    }
    @Given("the user verifies that Scheduling Setting button is clickable")
    public void the_user_verifies_that_scheduling_setting_button_is_clickable() {


    }
    @Given("the user clicks and verifies that related page is {string}")
    public void the_user_clicks_and_verifies_that_related_page_is(String url) {

    }



}