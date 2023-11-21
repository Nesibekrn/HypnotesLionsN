package stepDefinitions.UI_StepDef.calendar;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_087 extends CommonPage {
    @When("user select any date")
    public void userSelectAnyDate() {
        getCalendarPage().anyDateButton.click();
    }

    @Then("Repeat Options dropdown menu should be appear")
    public void repeatOptionsDropdownMenuShouldBeAppear() {
        Assert.assertTrue(getCalendarPage().repeatOptionsButton.isDisplayed());

    }

    @Then("Repeat Options dropdown menu should be functional")
    public void repeatOptionsDropdownMenuShouldBeFunctional() {
        Assert.assertTrue(getCalendarPage().repeatOptionDropdownButton.isEnabled());
    }

    @Then("Various options should appear in the Repeat Options dropdown menu")
    public void variousOptionsShouldAppearInTheRepeatOptionsDropdownMenu() {
    }

    @And("Any option should be selectable in the Repeat Options section")
    public void anyOptionShouldBeSelectableInTheRepeatOptionsSection() {
        Assert.assertTrue(getCalendarPage().repeatOptionDropdownButton.isDisplayed());
    }

    @And("The repeat option should not appear when Does not repeat is selected")
    public void theRepeatOptionShouldNotAppearWhenDoesNotRepeatIsSelected() {
    }

    @And("Repeat times drop down menu should be visible when any of the Daily, Weekly, Biweekly, Monthly options are selected")
    public void repeatTimesDropDownMenuShouldBeVisibleWhenAnyOfTheDailyWeeklyBiweeklyMonthlyOptionsAreSelected() {
    }

    @And("A number should be selectable from the Repeat times dropdown menu")
    public void aNumberShouldBeSelectableFromTheRepeatTimesDropdownMenu() {
    }
}
