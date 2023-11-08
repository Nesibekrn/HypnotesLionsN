package stepDefinitions.UI_StepDef.clients;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class US_070 extends CommonPage {
   List<String>headings=new ArrayList<>();
    String deletedSession;
    @And("the user click on the Clients page")
    public void theUserClickOnTheClientsPage() {
        getClientsPage().clientsButton.click();
        waitFor(2);

    }
    @And("the user clicks on the sessions button")
    public void theUserClicksOnTheSessionsButton() {
        getClientsPage().sessionButon.click();
        waitFor(1);
    }
    @And("the user delete all sessions")
    public void theUserDeleteAllSessions() {
        int index=getClientsPage().sessionHeadings.size();
        for (int i = 0; i <index ; i++) {
            ReusableMethods.scrollAndClickWithJS(getClientsPage().deleteSessionButton);
            waitFor(2);
            getClientsPage().yesButton.click();
            waitFor(1);


        }
    }
    @And("the user clicks on the add new session")
    public void theUserClicksOnTheAddNewSession() {
        getClientsPage().addNewSession.click();
        waitFor(1);
        getClientsPage().addNewSession.click();
        waitFor(1);
    }


    @And("the user clicks on the delete button for Session")
    public void theUserClicksOnTheDeleteButtonforSession() {
        deletedSession=getClientsPage().sessionHeadings.get(1).getText();
        ReusableMethods.scrollAndClickWithJS(getClientsPage().deleteSessionButton);
        waitFor(2);
    }
    @And("the user verifies delete Session message")
    public void theUserVerifiesDeleteSessionMessage() {
        Assert.assertTrue(getClientsPage().deletedMessage.isDisplayed());
        waitFor(1);

    }

    @And("the user verifies yesNo buttons functionalities")
    public void theUserVerifiesYesNoButtonsFunctionalities() {
        Assert.assertTrue(getClientsPage().yesNo_buttons.isEnabled());
        waitFor(1);
    }

    @And("the user clicks on the yes button")
    public void theUserClicksOnTheYesButton() {
        getClientsPage().yesButton.click();
        waitFor(1);
    }

    @And("the user verifies deleted popup message")
    public void theUserVerifiesDeletedPopupMessage() {
        Assert.assertTrue(getClientsPage().deletedPOPUPMessage.isDisplayed());
        waitFor(2);

    }
    @And("the user verifies deleted session is not visible")
    public void theUserVerifiesDeletedSessionIsNotVisible() {
        for (int i = 0; i <getClientsPage().sessionHeadings.size() ; i++) {
            headings.add(getClientsPage().sessionHeadings.get(i).getText());

        }
        System.out.println("headings = " + headings);
        System.out.println("deletedSession = " + deletedSession);

        Assert.assertTrue(!headings.contains(deletedSession));


    }




}
