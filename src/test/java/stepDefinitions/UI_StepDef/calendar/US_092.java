package stepDefinitions.UI_StepDef.calendar;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.actions;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;
import static utilities.ReusableMethods.waitForPageToLoad;

public class US_092 extends CommonPage {
    @When("user clicks on {int} more text on any date on the calendar")
    public void user_clicks_on_more_text_on_any_date_on_the_calendar(Integer int1) {
        driver.manage().window().maximize();
        getCalendarPage().createdAppointmentsListOnCalendar.get(0).click();

    }

    @When("user clicks on particular appointment")
    public void user_clicks_on_particular_appointment() {
        ReusableMethods.scrollAndClickWithJS(getCalendarPage().appointmentsListAfterOneClick.get(0));

        waitFor(2);

    }

    @Then("user should see {string} page")
    public void user_should_see_page(String expectedPageTitle) {
        assertEquals("Page title is not matched", expectedPageTitle, getCalendarPage().meetingDetailsText.getText());


    }

    String mainHandle;

    @When("user clicks on Google button on meeting details page")
    public void userClicksOnGoogleButtonOnMeetingDetailsPage() {
        getCalendarPage().googleBtnInMeetingDetails.click();
        mainHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

// Switch to the new window
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }


    }

    @Then("user verifies that google calendar page is displayed")
    public void userVerifiesThatGoogleCalendarPageIsDisplayed() {
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        String expectedUrl = "https://workspace.google.com/products/calendar/?hl=en-US";
        assertEquals(expectedUrl, driver.getCurrentUrl());
        driver.switchTo().window(mainHandle);
        waitFor(2);


    }

    @When("user clicks on Outlook button on meeting details page")
    public void userClicksOnOutlookButtonOnMeetingDetailsPage() {
        getCalendarPage().outlookBtnInMeetingDetails.click();
        mainHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

// Switch to the new window
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }
    }


    @Then("user verifies that outlook calendar page is opened")
    public void userVerifiesThatOutlookCalendarPageIsOpened() {
        String expectedTitle = "Outlook";
        assertEquals(expectedTitle, driver.getTitle());

        driver.switchTo().window(mainHandle);
    }
}
