package stepDefinitions.UI_StepDef.calendar;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import java.util.List;
import java.util.Random;
import io.cucumber.java.en.*;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.actions;
import static utilities.ReusableMethods.waitFor;

public class US_087 extends CommonPage {
    @When("user select a date")
    public void userSelectADate() {
        waitFor(2);
        getCalendarPage().aDateButton.click();


    }

    @Then("Repeat Options dropdown menu should be appear")
    public void repeatOptionsDropdownMenuShouldBeAppear() {
        Assert.assertTrue(getCalendarPage().repeatOptionsButton.isDisplayed());

    }

    @Then("Repeat Options dropdown menu should be functional")
    public void repeatOptionsDropdownMenuShouldBeFunctional() {
        Assert.assertTrue(getCalendarPage().repeatOptionDropdownButton.isEnabled());
    }

    @And("user verifies {string} option is default")
    public void userVerifiesDoesNotRepeatOptionIsDefault(String option) {
        Assert.assertEquals(option, calendarPage.repeatOptionsButtonText.getAttribute("title"));
    }

    @And("Any option should be selectable in the Repeat Options section")
    public void anyOptionShouldBeSelectableInTheRepeatOptionsSection(DataTable dataTable) {
        List<String> menu = dataTable.column(0);

        getCalendarPage().repeatOptionsButton.click();
        waitFor(1);

        int index = getCalendarPage().repeatOptionSelection.size() - 1;
        for (int i = 0; i < index; i++) {
            getCalendarPage().repeatOptionSelection.get(i + 1).click();
            String expectedTitle = menu.get(i);
            System.out.println("expectedTitle = " + expectedTitle);
            String actualTitle = getCalendarPage().repeatOptionsButtonText.getAttribute("title");
            System.out.println("actualTitle = " + actualTitle);

            Assert.assertEquals("Expected Title is not matching", expectedTitle, actualTitle);

            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }
    }


    @When("user clicks on any options")
    public void userClicksOnAnyOptions() {
        getCalendarPage().repeatOptionsButton.click();
        Random random = new Random();
        int ind = random.nextInt(getCalendarPage().repeatOptionSelection.size() - 1);
        getCalendarPage().repeatOptionSelection.get(ind + 1).click();
    }

    @Then("user sees repeat times")
    public void userSeesRepeatTimes() {
        Assert.assertTrue(getCalendarPage().repeatTimes.get(0).isDisplayed());
        Assert.assertTrue(getCalendarPage().repeatTimes.get(0).isEnabled());


    }

    @And("A number should be selectable from the Repeat times dropdown menu")
    public void aNumberShouldBeSelectableFromTheRepeatTimesDropdownMenu() {
        getCalendarPage().repeatTimes.get(0).click();
        ReusableMethods.waitForVisibility(getCalendarPage().increaseNumber, 1);

        Assert.assertTrue(getCalendarPage().increaseNumber.isDisplayed());
        Assert.assertTrue(getCalendarPage().increaseNumber.isEnabled());

        Assert.assertTrue(getCalendarPage().decreaseNumber.isDisplayed());
        Assert.assertTrue(getCalendarPage().decreaseNumber.isEnabled());
    }

    @And("The repeat option should not appear when Does not repeat is selected")
    public void theRepeatOptionShouldNotAppearWhenDoesNotRepeatIsSelected() {
        getCalendarPage().repeatOptionsButton.click();

        getCalendarPage().doesNotRepeatButton.click();
        Assert.assertEquals(0,getCalendarPage().repeatTimes.size());
    }


}