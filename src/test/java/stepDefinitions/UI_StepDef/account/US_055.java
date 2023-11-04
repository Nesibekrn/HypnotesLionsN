package stepDefinitions.UI_StepDef.account;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class US_055 extends CommonPage {

  //  @And("the user clicks Yes on the current timezone")
   // public void theUserClicksYesOnTheCurrentTimezone() {
    //    getAccountPage().timeZoneYes.click();
    //    waitFor(1);
   // }


    @Then("the user is able to view and click on the Add New Education button")
    public void theUserIsAbleToViewAndClickOnTheAddNewEducationButton() {
        Assert.assertTrue(getAccountPage().addNewEducation.isDisplayed());
        waitFor(1);
        Assert.assertTrue(getAccountPage().addNewEducation.isEnabled());
        waitFor(1);
        ReusableMethods.scrollAndClickWithJS(getAccountPage().addNewEducation);
        waitFor(1);

    }
    @When("the user clicks on the Add New Education button")
    public void theUserClicksOnTheAddNewEducationButton() {
        ReusableMethods.scrollAndClickWithJS( getAccountPage().addNewEducation);
        waitFor(1);
    }


    @Then("the user verifies that below titles are displayed")
    public void theUserVerifiesThatBelowTitlesAreDisplayed(DataTable Ffields) {
        List<String>fields=Ffields.asList();
        for (int i = 0; i <= fields.size() - 1; i++) {
            Assert.assertTrue(getAccountPage().titles.get(i).isDisplayed());
            waitFor(1);

        }
    }
    @Then("user verifies that Cancel buton is visible")
    public void userVerifiesThatCancelButonIsVisible() {
        Assert.assertTrue(getAccountPage().cancel_buton.isDisplayed());
        waitFor(1);
    }
    @Given("the user is able to fill values on the below fields")
    public void the_user_is_able_to_fill_values_on_the_below_fields(DataTable values) {
        List<String> formFields = values.asList();
        for (int i = 0; i <= formFields.size() - 1; i++) {
            getAccountPage().selections.get(i).sendKeys(formFields.get(i));
            waitFor(1);

        }
    }
    @Given("the user enter School name")
    public void theUserEnterSchoolName() {
        getAccountPage().schoolNameField.sendKeys("Camridge");
        waitFor(1);
    }

    @And("the user enter Department")
    public void theUserEnterDepartment() {
        getAccountPage().departmentField.sendKeys("SDET");
        waitFor(1);
    }

    @And("the user enter Start Date")
    public void theUserEnterStartDate() {
      getAccountPage().startDateField.sendKeys("11/03/2023");
        waitFor(1);

    }

    @And("the user enter End Date")
    public void theUserEnterEndDate() {
        getAccountPage().endDateField.sendKeys("11/23/2023");
        waitFor(1);

    }
    @And("the user enter Description")
    public void theUserEnterDescription() {
        getAccountPage().descriptionField.sendKeys("Excellent");
        waitFor(1);
    }

    @And("the user clicks on the save button")
    public void theUserClicksOnTheSaveButton() {
        getAccountPage().saveButon.click();
        waitFor(1);
    }

    @Then("the user verifies the added message")
    public void theUserVerifiesTheAddedMessage() {
        Assert.assertTrue(getAccountPage().addedPopUpMessage.isDisplayed());
        waitFor(2);
    }
    @Given("the user clicks on update buton")
    public void the_user_clicks_on_update_buton() {
        ReusableMethods.scrollAndClickWithJS(getAccountPage().editButon);
        waitFor(1);

    }
    @Given("the user update and clicks save buton")
    public void the_user_update_and_clicks_save_buton() {
        getAccountPage().descriptionField.clear();
        waitFor(1);
        getAccountPage().saveButon.click();
        waitFor(1);

    }
    @Then("the user verifies updated message is visible")
    public void the_user_verifies_updated_message_is_visible() {
        Assert.assertTrue(getAccountPage().updatedMessage.isDisplayed());
        waitFor(2);

    }
    @Then("the user clicks on delete buton")
    public void the_user_clicks_on_delete_buton() {
        ReusableMethods.scrollAndClickWithJS(getAccountPage().deleteButon);
        waitFor(1);

    }
    @Then("the user verifies delete message is visible")
    public void the_user_verifies_delete_message_is_visible() {
        Assert.assertTrue(getAccountPage().deletePopUpMessage.isDisplayed());
        waitFor(2);
    }
    @And("the user clicks OK button")
    public void theUserClicksOKButton() {
        getAccountPage().ok_buton.click();
        waitFor(1);
    }

    @Then("the user verifies that education is deleted")
    public void theUserVerifiesThatEducationIsDeleted() {
        Assert.assertTrue(getAccountPage().hasBeenDeletePopUp.isDisplayed());
        waitFor(2);

    }



}
