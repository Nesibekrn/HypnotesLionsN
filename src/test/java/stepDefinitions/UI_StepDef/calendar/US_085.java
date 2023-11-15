package stepDefinitions.UI_StepDef.calendar;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import manifold.ext.props.rt.api.var;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class US_085 extends CommonPage {

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
        List<String>menu=dataTable.asList();
        for (int i = 0; i < menu.size() ; i++) {
            Assert.assertTrue(getCalendarPage().scheduleMenu.get(i).isEnabled());
            waitFor(1);
        }

    }

    @And("the user clicks and verifies the month page")
    public void theUserClicksAndVerifiesTheMonthPage() {
        getCalendarPage().monthButton.click();
        waitFor(1);
        Assert.assertEquals("November 2023",getCalendarPage().monthPage.getText());
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
       ReusableMethods.clickWithTimeOut(getCalendarPage().scheduleButton,1);
       getCalendarPage().weekButton.click();
       waitFor(1);
    }
    @And("the user view  rows at the week page")
    public void theUserViewRowsAtTheWeekPage(DataTable dataTable) {
        List<String>expectedColumn=dataTable.row(0);
        List<WebElement>actualColumn=getCalendarPage().daysColumn;
        for (int i = 0; i <actualColumn.size() ; i++) {
            Assert.assertEquals(expectedColumn.get(i),actualColumn.get(i).getText());

        }

    }

    @And("the user clicks on the Three Days")
    public void theUserClicksOnTheThreeDays() {
    }

    @And("the user verifies related Three Days page")
    public void theUserVerifiesRelatedThreeDaysPage() {
    }

    @And("the user clicks on the Day")
    public void theUserClicksOnTheDay() {
    }

    @And("the user verifies related Day page")
    public void theUserVerifiesRelatedDayPage() {
    }



}





