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
import static utilities.ReusableMethods.waitFor;

public class US_069 extends CommonPage {





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
    public void theFollowingHeadingsShouldBeVisible(DataTable dataTable) throws InterruptedException {
        List<String> headings=dataTable.column(0);
        waitFor(1);

        Assert.assertEquals(headings.get(0),getClientsPage().dateButton.getText());
        waitFor(1);
        Assert.assertEquals(headings.get(1),getClientsPage().associatedIssues.getText());
        waitFor(1);
        Assert.assertEquals(headings.get(2),getClientsPage().keyPoint.getText());
        waitFor(1);
        Assert.assertEquals(headings.get(3),getClientsPage().afterThought.getText());
        waitFor(1);
        Assert.assertEquals(headings.get(4),getClientsPage().applicationsSuggestions.getText());
        waitFor(1);
        Assert.assertEquals(headings.get(5),getClientsPage().attachments.getText());
        waitFor(1);
        Assert.assertEquals(headings.get(6),getClientsPage().voiceNotes.getText());

        // Assert.assertTrue(getClientsPage().session1button.isDisplayed());
//        Assert.assertTrue(getClientsPage().associatedIssues.isDisplayed());
//       Assert.assertTrue(getClientsPage().keyPoint.isDisplayed());
//        Assert.assertTrue(getClientsPage().afterThought.isDisplayed());
//        Assert.assertTrue(getClientsPage().applicationsSuggestions.isDisplayed());
//         Assert.assertTrue(getClientsPage().attachments.isDisplayed());
//         Assert.assertTrue(getClientsPage().voiceNotes.isDisplayed());


         }
         }
