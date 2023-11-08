package stepDefinitions.UI_StepDef.register;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ClientsPage;
import pages.CommonPage;

import java.util.List;

import static stepDefinitions.Hooks.driver;

public class US_069 extends CommonPage {
    @When("the user clicks on the View Details button")
    public void the_user_clicks_on_the_view_details_button() {
        getClientsPage().viewDetailsButton.click();
    }







    @When("the user clicks on the Sessions button")
    public void the_user_clicks_on_the_sessions_button() {
        getClientsPage().sessionsButton.click();




    }
    @Then("the Add new Sessions button should be visible")
    public void the_add_new_sessions_button_should_be_visible() {
        Assert.assertTrue(getClientsPage().addNewSessionButton.isDisplayed());

    }
    @Then("the user clicks the Add new session button")
    public void the_user_clicks_the_add_new_session_button() {
        getClientsPage().addNewSessionButton.click();

    }

    @Then("the following headings should be visible:")
    public void theFollowingHeadingsShouldBeVisible(DataTable dataTable) {
        List<String> headings=dataTable.column(0);

        Assert.assertEquals(getClientsPage().dateButton.getText(),headings.get(1));
        Assert.assertEquals(getClientsPage().associatedIssues.getText(),headings.get(1));
        Assert.assertEquals(getClientsPage().keyPoint.getText(),headings.get(2));
        Assert.assertEquals(getClientsPage().afterThought.getText(),headings.get(3));
        Assert.assertEquals(getClientsPage().applicationsSuggestions.getText(),headings.get(4));
        Assert.assertEquals(getClientsPage().attachments.getText(),headings.get(5));
        Assert.assertEquals(getClientsPage().voiceNotes.getText(),headings.get(6));

        // Assert.assertTrue(getClientsPage().session1button.isDisplayed());
//        Assert.assertTrue(getClientsPage().associatedIssues.isDisplayed());
//       Assert.assertTrue(getClientsPage().keyPoint.isDisplayed());
//        Assert.assertTrue(getClientsPage().afterThought.isDisplayed());
//        Assert.assertTrue(getClientsPage().applicationsSuggestions.isDisplayed());
//         Assert.assertTrue(getClientsPage().attachments.isDisplayed());
//         Assert.assertTrue(getClientsPage().voiceNotes.isDisplayed());


         }
         }
