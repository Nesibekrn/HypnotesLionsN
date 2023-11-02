package stepDefinitions.UI_StepDef.clients;

import enums.USER_INFO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;

public class US_042 extends CommonPage {
    @Given("user login as therapist")
    public void userLoginAsTherapist() {
   

    }

    @Given("the user verifies that Calendar button is clickable")
    public void theUserVerifiesThatCalendarButtonIsClickable() {
        Assert.assertTrue(getCalendarPage().calendarButon.isEnabled());

    }

    @And("the user clicks on Calendar button")
    public void theUserClicksOnCalendarButton() {
        getCalendarPage().calendarButon.click();
    }

    @Then("the user verifies Calendar page")
    public void theUserVerifiesCalendarPage() {
        Assert.assertEquals( "https://test.hypnotes.net/dashboard/calendar",driver.getCurrentUrl());
    }
}
