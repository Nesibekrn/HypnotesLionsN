package stepDefinitions.UI_StepDef.login;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US_062 extends CommonPage {
    Faker faker = new Faker();
    @When("user verifies the edit button is visible")
    public void userVerifiesTheEditButtonIsVisible() {
        Assert.assertTrue(getClientsPage().editButton.isDisplayed());

    }

    @Then("user verifies that the relevant page of edit button is disable")
    public void userVerifiesThatTheRelevantPageOfEditButtonIsDisable() {
        Assert.assertFalse(getClientsPage().middleNameEdit.isEnabled());

    }

    @And("user verify that show other fields button is not clicked")
    public void userVerifyThatShowOtherFieldsButtonIsNotClicked() {
        ReusableMethods.scrollToElement(getClientsPage().showOtherFieldsNonClickedEdit);
    }

    @Then("user clicks on the edit button")
    public void userClicksOnTheEditButton() {
        getClientsPage().editButton.click();
    }

    @And("user edit middle  name of the client")
    public void userEditMiddleNameOfTheClient() {
        ReusableMethods.waitFor(1);
        getClientsPage().middleNameEdit.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);      //aynı anda hem ctrl hem de a tuşlarına basarak metni seçiyoruz, backspace e basarak siliyoruz
        getClientsPage().middleNameEdit.sendKeys(Keys.chord(Keys.COMMAND,"a"),Keys.BACK_SPACE);
        ReusableMethods.waitFor(5);
        getClientsPage().middleNameEdit.sendKeys(faker.name().firstName());
        ReusableMethods.waitFor(5);
    }

    @Then("user verify that show other fields button is clicked")
    public void userVerifyThatShowOtherFieldsButtonIsClicked() {
        ReusableMethods.scrollToElement(getClientsPage().showOtherFieldsClickedEdit);

    }

    @And("user verify that after clicking show other fields button the relevant page is enable")
    public void userVerifyThatAfterClickingShowOtherFieldsButtonTheRelevantPageIsEnable() {
        ReusableMethods.scrollAndClickWithJS(getClientsPage().guardianEmailEdit);
    }

    @Then("user edit Guardian Email of the client")
    public void userEditGuardianEmailOfTheClient() {
        ReusableMethods.waitFor(2);
        getClientsPage().guardianEmailEdit.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);
        getClientsPage().guardianEmailEdit.sendKeys(Keys.chord(Keys.COMMAND,"a"),Keys.BACK_SPACE);//aynı anda hem ctrl hem de a tuşlarına basarak metni seçiyoruz, backspace e basarak siliyoruz
        ReusableMethods.waitFor(2);
        getClientsPage().guardianEmailEdit.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(2);
    }

    @And("user clicks on the save button after editing various information")
    public void userClicksOnTheSaveButtonAfterEditingVariousInformation() {
        getClientsPage().save_button.click();
    }


    @And("the user verifies that client info has been successfully updated popup message is visible")
    public void theUserVerifiesThatClientInfoHasBeenSuccessfullyUpdatedPopupMessageIsVisible() {
        ReusableMethods.waitForVisibility(getClientsPage().succesfullyUpdatedEdit,2);
    }
}
