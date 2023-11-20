package stepDefinitions.UI_StepDef.calendar;

import enums.COLOR;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static utilities.ReusableMethods.*;

public class US_086 extends CommonPage {
    @When("user should see the current day0")
    public void userShouldSeeTheCurrentDay0() {
//        LocalDate currentDate = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
//        String currentDayLocal = currentDate.format(formatter);
//        List<WebElement> dayElements = getCalendarPage().currentDayElements;
//        boolean isCurrentDayDisplayed = dayElements.stream().map(WebElement::getText)
//                .anyMatch(text -> text.equals(currentDayLocal));
//        Assert.assertTrue("Current day is displayed on the calender.", isCurrentDayDisplayed);

//        List<WebElement> dayElements = getCalendarPage().calenderAllDays;

//        private Date parseDateFromAriaLabel(String ariaLabel){
//            try{
//                SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
//                return
//            }catch (ParseException e){
//                try {
//                    e.printStackTrace();
//                } catch (Exception ex) {
//                    throw new RuntimeException(ex);
//                }
//                return null;
//            }
//        }
//        for (WebElement dayElement:dayElements) {
//            String ariaLabelValue = dayElement.getAttribute("aria-label");
//

//        }

    }

    @When("user should see the current day")
    public void userShouldSeeTheCurrentDay1() {

        WebElement currentDay = getCurrentDay(getCalendarPage().calenderAllDays);
        Assert.assertTrue(currentDay.isDisplayed());

    }


    @Then("the current day should be visible with a different colour")
    public void theCurrentDayShouldBeVisibleWithADifferentColour() {
        WebElement currentDay = getCurrentDay(getCalendarPage().calenderAllDays);
        System.out.println("currentDay.getAttribute(\"aria-label\") = " + currentDay.getAttribute("aria-label"));
        Assert.assertEquals(COLOR.TEXT_Yellow_BACKROUND.getRGBA(),currentDay.getCssValue("background-color"));
    }

    @When("user select any date")
    public void userSelectAnyDate() {
        Random random = new Random();
        int randomIndex = random.nextInt(getCalendarPage().calenderAllDays.size());
        WebElement randomElement = getCalendarPage().calenderAllDays.get(randomIndex);
        randomElement.click();
    }

    @Then("{string} page should be appeared")
    public void pageShouldBeAppeared(String expectedTitle) {
       String actualTitle= getCalendarPage().schedule_Appointment_title.getText();
        System.out.println("actualTitle = " + actualTitle);
        waitForVisibility(getCalendarPage().schedule_Appointment_title,3);
       Assert.assertEquals("Actual title is different",expectedTitle,actualTitle);
    }
    @And("Registered Services default should be appeared in the Select Service Type section")
    public void registeredServicesDefaultShouldBeAppearedInTheSelectServiceTypeSection() {

        Assert.assertTrue("Radio button should be selected by default",calendarPage.registered_Services_radioBtn.isSelected());

    }

    @When("user see the Service menu")
    public void userSeeTheServiceMenu() {

        verifyElementDisplayed(getCalendarPage().appointment_service_radioBtn);
    }

    @Then("user clicks on Service menu button")
    public void userClicksOnServiceMenuButton() {
        clickWithTimeOut(getCalendarPage().appointment_service_radioBtn,3);
        waitFor(3);

    }

    @And("user should see the services")
    public void userShouldSeeTheServices() {
        List<WebElement> sessions = getCalendarPage().sessions;
        sessions.forEach(e-> System.out.println("e.getAttribute(\"innerText\") = " + e.getAttribute("innerText")));

    }
}

