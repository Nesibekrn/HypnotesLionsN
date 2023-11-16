package stepDefinitions.UI_StepDef.calendar;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static stepDefinitions.Hooks.driver;

public class US_086 extends CommonPage {
    @When("user should see the current day")
    public void userShouldSeeTheCurrentDay() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
        String currentDayLocal = currentDate.format(formatter);
        System.out.println("currentDayLocal = " + currentDayLocal);
        List<WebElement> dayElements = getCalendarPage().currentDayElements;
        boolean isCurrentDayDisplayed = dayElements.stream().map(WebElement::getText)
                .anyMatch(text -> text.equals(currentDayLocal));
        Assert.assertTrue("Current day is displayed on the calender.", isCurrentDayDisplayed);
    }
    @Then("the current day should be visible with a different colour")
    public void theCurrentDayShouldBeVisibleWithADifferentColour() {

    }


}
