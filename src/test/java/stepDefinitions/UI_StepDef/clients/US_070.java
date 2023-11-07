package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitFor;

public class US_070 extends CommonPage {

    @Given("the user click on the Clients page")
    public void the_user_click_on_the_clients_page() {
        getClientsPage().clientsButton.click();
        waitFor(2);

    }
    @Given("the user clicks on the sessions button")
    public void the_user_clicks_on_the_sessions_button() {
        getClientsPage().sessionsButton.click();
        waitFor(1);
    }
    @Given("the user clicks on the delete button")
    public void the_user_clicks_on_the_delete_button() {
        ReusableMethods.scrollAndClickWithJS(getClientsPage().deleteSessionButton);
        waitFor(2);

    }
    @Given("the user verifies delete Session message")
    public void the_user_verifies_delete_session_message() {
        Assert.assertTrue(getClientsPage().deletedMessage.isDisplayed());
        waitFor(1);

    }
    @Given("the user verifies yesNo buttons functionalities")
    public void the_user_verifies_yes_no_buttons_functionalities() {
        Assert.assertTrue(getClientsPage().yesNo_buttons.isEnabled());
        waitFor(1);

    }
    @Given("the user clicks on the yes button")
    public void the_user_clicks_on_the_yes_button() {
        getClientsPage().yesButton.click();
        waitFor(1);
    }
    @Given("the user verifies deleted popup message")
    public void the_user_verifies_deleted_popup_message() {
        Assert.assertTrue(getClientsPage().deletedPOPUPMessage.isDisplayed());
        waitFor(2);


    }


}
