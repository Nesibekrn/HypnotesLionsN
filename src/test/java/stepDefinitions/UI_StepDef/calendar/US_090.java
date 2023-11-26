package stepDefinitions.UI_StepDef.calendar;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class US_090 extends CommonPage {

    @Given("user selects a day from the calendar")
    public void user_selects_a_day_from_the_calendar() {
        getCalendarPage().nine_December_Button.click();
        waitFor(1);
    }

    @Then("user selects Select Service Type as Custom Service")
    public void user_selects_select_service_type_as_custom_service() {
        getCalendarPage().custom_Service_Button.click();
    }

    @And("user fills in the information")
    public void user_fills_in_the_information() {
        getCalendarPage().service_Name_Button.click();
        getCalendarPage().service_Name_Button.sendKeys("überKindSprechen");
        waitFor(1);

        getCalendarPage().price_GBP_Button.click();
        getCalendarPage().price_GBP_Button.sendKeys("10");
        waitFor(1);

        getCalendarPage().duration_Button.click();
        getCalendarPage().duration_Button.sendKeys("60");
        waitFor(1);

        getCalendarPage().service_Type_Button.click();
        getCalendarPage().service_Type_Button.sendKeys("Regular");
        waitFor(1);

        WebElement element = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.click().perform();


    }
}
