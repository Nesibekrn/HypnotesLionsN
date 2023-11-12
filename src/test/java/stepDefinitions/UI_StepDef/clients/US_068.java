package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_068 extends CommonPage {
    @Given("clicks to view details button")
    public void clicks_to_view_details_button() {
        getClientsPage().view_Details.click();
        ReusableMethods.waitFor(2);
    }
    @Given("click on the Presenting Issue section")
    public void click_on_the_presenting_issue_section() {
     getClientsPage().presintingIssue.click();
     ReusableMethods.waitFor(2);
    }
    @Given("Click on add new issue")
    public void click_on_add_new_issue() {
        getClientsPage().addNewIssue.click();
        ReusableMethods.waitFor(2);

    }

    @Then("sees add new issue page has oppened")
    public void sees_add_new_issue_page_has_oppened() {
        assertTrue(getClientsPage().addNewIssuePage.isDisplayed());
        ReusableMethods.waitFor(3);
    }
    @Then("Name of Chief is entered")
    public void name_of_chief_is_entered() {
        ReusableMethods.waitFor(3);
        getClientsPage().enterName.sendKeys("Angelina Jolie");
    }
    @Then("Brief Statement is entered")
    public void brief_statement_is_entered() {
        ReusableMethods.waitFor(3);
        getClientsPage().enterStatement.sendKeys("Agir travmatik");
    }
    @Then("Location is entered")
    public void location_is_entered() {
        ReusableMethods.waitFor(2);
        getClientsPage().enterLocatement.sendKeys("USA");
    }
    @Then("Character is entered")
    public void character_is_entered() {
        ReusableMethods.waitFor(2);
        getClientsPage().enterCharecter.sendKeys("psikopat");
    }
    @Then("Submit button is pressed")
    public void submit_button_is_pressed() {
        getClientsPage().submitAddNewIssue.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Receive the data added message")
    public void receive_the_data_added_message() {
        assertTrue((getClientsPage().addedMessage.isDisplayed()));
        ReusableMethods.waitFor(2);
    }





}
