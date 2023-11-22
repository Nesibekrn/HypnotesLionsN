package stepDefinitions.UI_StepDef.calendar;

import enums.COLOR;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.util.Random;

import static stepDefinitions.Hooks.actions;
import static utilities.ReusableMethods.*;

public class US_086 extends CommonPage {

    @Given("the user clicks Calendar button")
    public void theUserClicksCalendarButton() {
        ReusableMethods.clickWithTimeOut(getCalendarPage().calender_Btn,3);
    }

    @When("user should see the current day")
    public void userShouldSeeTheCurrentDay1() {
        Assert.assertTrue(getCalendarPage().today.isDisplayed());
    }


    @Then("the current day should be visible with a different colour")
    public void theCurrentDayShouldBeVisibleWithADifferentColour() {
        Assert.assertTrue(COLOR.TEXT_Yellow_BACKROUND.assertBackroundColorByBoolean(getCalendarPage().today));
    }


    @When("user select any date")
    public void userSelectAnyDate() {
        Random random = new Random();
        int randomIndex = random.nextInt(getCalendarPage().calenderAllDays.size());
        System.out.println("randomIndex = " + randomIndex);
        WebElement randomElement = getCalendarPage().calenderAllDays.get(randomIndex);
        randomElement.click();
        waitFor(3);
    }

    @Then("{string} page should be appeared")
    public void pageShouldBeAppeared(String expectedTitle) {
        String actualTitle = getCalendarPage().schedule_Appointment_title.getText();
        waitForVisibility(getCalendarPage().schedule_Appointment_title, 3);
        Assert.assertEquals("Actual title is different", expectedTitle, actualTitle);
    }

    @And("Registered Services default should be appeared in the Select Service Type section")
    public void registeredServicesDefaultShouldBeAppearedInTheSelectServiceTypeSection() {
        Assert.assertTrue("Radio button should be selected by default", calendarPage.registered_Services_radioBtn.isSelected());
    }

    @When("user see the Service menu")
    public void userSeeTheServiceMenu() {
        verifyElementDisplayed(getCalendarPage().appointment_service_radioBtn);
    }

    @Then("user clicks on Service menu button")
    public void userClicksOnServiceMenuButton() {
        clickWithTimeOut(getCalendarPage().appointment_service_radioBtn, 3);
        waitFor(3);

    }

    @And("user should see the services")
    public void userShouldSeeTheServices() {
        ReusableMethods.verifyElementDisplayed(getCalendarPage().individualSession);
        ReusableMethods.verifyElementDisplayed(getCalendarPage().packageService);
        for (int i = 0; i < getCalendarPage().service_options.size(); i++) {
            getCalendarPage().service_options.get(i);
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            if (getCalendarPage().groupSessionService.isDisplayed()) {
                Assert.assertTrue("Group session service is not displayed", getCalendarPage().groupSessionService.isDisplayed());
                break;
            }
        }
        ReusableMethods.waitForVisibility(getCalendarPage().groupSessionService, 3);
        ReusableMethods.verifyElementDisplayed(getCalendarPage().groupSessionService);
    }

    @Then("user should see Location dropdown menu")
    public void userShouldSeeLocationDropdownMenu() {
        ReusableMethods.verifyElementDisplayed(getCalendarPage().locationDropdownMenu);
    }

    @And("location dropdown menu should be clickable")
    public void locationDropdownMenuShouldBeClickable() {
        ReusableMethods.verifyElementEnabled(getCalendarPage().locationDropdownMenu);
    }

    @Then("any location can be selected in the location drop down menu")
    public void anyLocationCanBeSelectedInTheLocationDropDownMenu() {
        String expectedOption = "Online";
        String actualAttributeValue = getCalendarPage().onlineLocation.getAttribute("title");
        Assert.assertEquals("Actual option is not Location", expectedOption, actualAttributeValue);
    }
}

