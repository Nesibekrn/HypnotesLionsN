package stepDefinitions.UI_StepDef.calendar;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

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



    @And("Any option should be selectable in the Repeat Options section")
    public void anyOptionShouldBeSelectableInTheRepeatOptionsSection(DataTable dataTable) {


        List<String> menu = dataTable.asList();
        int index=getCalendarPage().repeatOptionSelection.size();
        for (int i = 1; i < index; i++) {
            getCalendarPage().repeatOptionDropdownButton.click();
           waitFor(1);
          // Assert.assertTrue(getCalendarPage().repeatOptionSelection.get(i).isSelected()) ;
            //String actualTitle=getCalendarPage().repeatOptionSelection.get(i).getAttribute("title");
           // getCalendarPage().repeatOptionSelection.get(i).click();
            getCalendarPage().repeatOptionSelection.get(i).click();
            String expectedTitle= dataTable.column(0).get(i);
            System.out.println("expectedTitle = " + expectedTitle);
            String actualTitle=getCalendarPage().repeatOptionsButton.getAttribute("title");
            System.out.println("actualTitle = " + actualTitle);

            //Assert.assertEquals(dataTable.column(0).get(i),getCalendarPage().repeatOptionSelection.get(i).getAttribute("title"));
            Assert.assertEquals("Expected Title is not matching",expectedTitle,actualTitle);

            Assert.assertTrue(getCalendarPage().repeatTimes.isDisplayed());
//            JS_utilities.mouseHoverJScript(getCalendarPage().repeatTimes);
//            Assert.assertTrue(getCalendarPage().increaseNumber.isDisplayed());
//            Assert.assertTrue(getCalendarPage().decreaseNumber.isDisplayed());

            actions.sendKeys(Keys.ARROW_DOWN).perform();




           //System.out.println(menu.get(i));
           // Assert.assertEquals("Daily",getCalendarPage().repeatOptionSelection.get(1).getText());

           //Assert.assertTrue(getCalendarPage().repeatOptionSelection.get(i).isEnabled());

        }






       // Assert.assertTrue(getCalendarPage().repeatOptionDropdownButton.isDisplayed());



    }




//    @And("A number should be selectable from the Repeat times dropdown menu")
//    public void aNumberShouldBeSelectableFromTheRepeatTimesDropdownMenu() {
//        getCalendarPage().repeatOptionsButton.click();
//       getCalendarPage().dailyButton.click();
//        Assert.assertTrue(getCalendarPage().repeatTimes.isDisplayed());
//        JS_utilities.mouseHoverJScript(getCalendarPage().repeatTimes);
//        Assert.assertTrue(getCalendarPage().increaseNumber.isDisplayed());
//        Assert.assertTrue(getCalendarPage().decreaseNumber.isDisplayed());
//
//
//
//    }


    @When("user clicks on daily options")
    public void userClicksOnDailyOptions() {
        getCalendarPage().repeatOptionsButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        getCalendarPage().daily.click();
    }

    @Then("user sees repeat times")
    public void userSeesRepeatTimes() {

    }

    @And("The repeat option should not appear when Does not repeat is selected")
    public void theRepeatOptionShouldNotAppearWhenDoesNotRepeatIsSelected() {

        getCalendarPage().doesNotRepeatButton.click();
        Assert.assertFalse(getCalendarPage().repeatTimes.isDisplayed());
    }

}
