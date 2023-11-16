package stepDefinitions.UI_StepDef.calendar;

import enums.COLOR;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CalendarPage;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import static stepDefinitions.Hooks.driver;

public class US_086 extends CommonPage {
    @When("user should see the current day")
    public void userShouldSeeTheCurrentDay() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
        String currentDayLocal = currentDate.format(formatter);
        List<WebElement> dayElements = getCalendarPage().currentDayElements;
        boolean isCurrentDayDisplayed = dayElements.stream().map(WebElement::getText)
                .anyMatch(text -> text.equals(currentDayLocal));
        Assert.assertTrue("Current day is displayed on the calender.", isCurrentDayDisplayed);

    }


    @Then("the current day should be visible with a different colour")
    public void theCurrentDayShouldBeVisibleWithADifferentColour() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
        String currentDayLocal = currentDate.format(formatter);
        List<WebElement> dayElements = getCalendarPage().currentDayElements;
        boolean isCurrentDayDisplayed = dayElements.stream().map(WebElement::getText)
                .anyMatch(text -> text.equals(currentDayLocal));
        Assert.assertTrue("Current day is displayed on the calender.", isCurrentDayDisplayed);
        System.out.println(currentDayLocal);

        for (WebElement day : dayElements) {
            String dayText = day.getText();
            if (dayText.equals(currentDayLocal)) {
//                System.out.println(" Actual background-color" + day.getCssValue("background-color"));
//                String expectedColor = "rgba(255, 220, 40, 0.15)";
//
//                System.out.println("expectedColor = " + expectedColor);
                Assert.assertTrue(COLOR.TEXT_Yellow_BACKROUND.assertBackroundColorByBoolean(day));
                //Assert.assertEquals("Background color is not matched", expectedColor, day.getCssValue("background-color"));
                // ReusableMethods.assertBackgroundColor("rgba(255,220,40,.15))",day );


            }
        }

    }

    @When("user select any date")
    public void userSelectAnyDate() {
        Random random = new Random();
        int randomIndex = random.nextInt(getCalendarPage().currentDayElements.size());
        WebElement randomElement = getCalendarPage().currentDayElements.get(randomIndex);
        randomElement.click();
    }

    @Then("{string} page should be appeared")
    public void pageShouldBeAppeared(String expectedTitle) {

       // Assert.assertTrue("Expected title is not= " + expectedTitle, getCalendarPage().schedule_Appointment_title.isDisplayed);
        ReusableMethods.verifyElementDisplayed(getCalendarPage().registered_Services_radioBtn);
    }

    @And("{string} default should be appeared in the Select Service Type section")
    public void defaultShouldBeAppearedInTheSelectServiceTypeSection(String serviceType) {
//        WebElement registeredServicesRadioBtn = getCalendarPage().registered_Services_radioBtn;
//        Assert.assertTrue("Service type is not selected: " + serviceType, registeredServicesRadioBtn.isSelected());
        Assert.assertEquals(serviceType,getCalendarPage().registered_Services_radioBtn.getText());

    }
}

